package com.example.aibyhhhhhhjs.ai;
import dev.langchain4j.service.SystemMessage;
import com.example.aibyhhhhhhjs.ai.model.MultiFileCodeResult;
import com.example.aibyhhhhhhjs.ai.model.HtmlCodeResult;



public interface AiCodeGeneratorService {
    /**
     * 生成代码
     *
     * @param userMessage 用户提示词
     * @return AI 生成的回复
     */

    // 传递 prompt 提示词给大模型
    // 生成单文件代码
    @SystemMessage(fromResource = "prompt/codegen-html-system-prompt.txt")
    HtmlCodeResult generateHtmlCode(String userMessage);

    /**
     * 生成 多文件 代码
     *
     * @param userMessage 用户提示词
     * @return AI 生成的 HTML 代码
     */

    @SystemMessage(fromResource = "prompt/codegen-multi-file-system-prompt.txt")
     MultiFileCodeResult generateMultiFileCode(String userMessage);
}

