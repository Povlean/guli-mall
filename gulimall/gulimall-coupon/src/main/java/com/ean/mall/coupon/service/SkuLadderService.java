package com.ean.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ean.common.utils.PageUtils;
import com.ean.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:24:29
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

