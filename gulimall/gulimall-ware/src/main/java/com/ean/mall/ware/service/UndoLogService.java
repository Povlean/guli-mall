package com.ean.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ean.common.utils.PageUtils;
import com.ean.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:44:27
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

