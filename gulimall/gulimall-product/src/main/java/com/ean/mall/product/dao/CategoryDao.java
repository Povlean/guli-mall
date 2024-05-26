package com.ean.mall.product.dao;

import com.ean.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:20:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
