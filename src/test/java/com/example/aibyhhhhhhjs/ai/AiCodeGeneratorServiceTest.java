package com.example.aibyhhhhhhjs.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.aibyhhhhhhjs.ai.model.MultiFileCodeResult;
import com.example.aibyhhhhhhjs.ai.model.HtmlCodeResult;



@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("做一个简单的零代码平台的博客，不超过20行");
        Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult result = aiCodeGeneratorService.generateMultiFileCode("做一个简单的零代码平台的博客留言板，不超过20行");
        Assertions.assertNotNull(result);
    }
}