package com.ean.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ean.common.utils.PageUtils;
import com.ean.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:38:40
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

