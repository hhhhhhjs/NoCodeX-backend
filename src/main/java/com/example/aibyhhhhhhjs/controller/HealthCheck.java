package com.example.aibyhhhhhhjs.controller;

import com.example.aibyhhhhhhjs.common.BaseResponse;
import com.example.aibyhhhhhhjs.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/health")
public class HealthCheck {
    @GetMapping("/")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok");
    }
}
