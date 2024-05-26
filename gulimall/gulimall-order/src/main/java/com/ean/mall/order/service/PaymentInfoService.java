package com.ean.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ean.common.utils.PageUtils;
import com.ean.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:38:39
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

