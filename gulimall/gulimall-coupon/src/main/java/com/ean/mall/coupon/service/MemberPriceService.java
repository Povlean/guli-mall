package com.ean.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ean.common.utils.PageUtils;
import com.ean.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:24:30
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

