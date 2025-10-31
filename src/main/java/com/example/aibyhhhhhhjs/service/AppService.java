package com.example.aibyhhhhhhjs.service;

import com.example.aibyhhhhhhjs.model.dto.app.AppQueryRequest;
import com.example.aibyhhhhhhjs.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.example.aibyhhhhhhjs.model.entity.App;

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

}
