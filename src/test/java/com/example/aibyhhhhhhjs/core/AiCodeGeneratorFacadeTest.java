package com.example.aibyhhhhhhjs.core;

import com.example.aibyhhhhhhjs.model.enums.CodeGenTypeEnum;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeGeneratorFacadeTest {
    @Resource
    private AiCodeGeneratorFacade aiCodeGeneratorFacade;

    @Test
    void generateAndSaveCode() {
        File file = aiCodeGeneratorFacade.generateAndSaveCode("任务记录网站", CodeGenTypeEnum.MULTI_FILE,1L);
        Assertions.assertNotNull(file);
    }

    @Test
    void testGenerateAndSaveCode() {
    }

    @Test
    void testGenerateAndSaveCode1() {
    }

    @Test
    void
    generateAndSaveCodeStream() {
        Flux<String> codeStream = aiCodeGeneratorFacade.generateAndSaveCodeStream("电商网站登陆页", CodeGenTypeEnum.MULTI_FILE, 1L);
        // 阻塞等待所有数据收集完成
        List<String> result = codeStream.collectList().block();
        // 验证结果
        Assertions.assertNotNull(result);
        String completeContent = String.join("", result);
        Assertions.assertNotNull(completeContent);
    }

    @Test
    void testGenerateAndSaveCode2() {
    }

    @Test
    void testGenerateAndSaveCodeStream() {
    }

    @Test
    void testGenerateAndSaveCode3() {
    }

    @Test
    void testGenerateAndSaveCodeStream1() {
    }
}