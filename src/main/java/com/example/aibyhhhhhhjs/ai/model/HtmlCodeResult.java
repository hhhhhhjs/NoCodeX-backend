package com.example.aibyhhhhhhjs.ai.model;

import lombok.Data;
import dev.langchain4j.model.output.structured.Description;
/**
 * HTML 代码结果
 */

// 使用description 注解，方便 langchain4j 更加理解我们的 java 代码结构
@Description("生成 HTML 代码文件的结果")
@Data
public class HtmlCodeResult {
    /**
     * HTML 代码
     */
    @Description("HTML 代码")
    private String htmlCode;
    /**
     * 描述
     */
    @Description("生成代码的描述")
    private String description;
}
