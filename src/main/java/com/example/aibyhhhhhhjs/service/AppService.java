package com.example.aibyhhhhhhjs.service;

import com.example.aibyhhhhhhjs.model.dto.app.AppQueryRequest;
import com.example.aibyhhhhhhjs.model.entity.User;
import com.example.aibyhhhhhhjs.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.example.aibyhhhhhhjs.model.entity.App;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 *  服务层。
 *
 * @author hhhhhhjs
 */
public interface AppService extends IService<App> {
    /**
     * 获取应用封装类
     */
     AppVO getAppVO(App app);

     /**
     * 获取应用封装列表
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
      * 构造应用查询条件
      */
     QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

     /**
      * 通过对话生成应用代码
      * @param appId 应用 ID
      * @param message 提示词
      * @param loginUser 用户登陆
      * @return 应用代码流
      */

     Flux<String> chatToGenCode(Long appId, String message, User loginUser);



}
