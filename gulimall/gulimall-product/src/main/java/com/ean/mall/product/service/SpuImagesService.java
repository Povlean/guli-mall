package com.ean.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ean.common.utils.PageUtils;
import com.ean.mall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:20:29
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

