package com.ean.mall.order.dao;

import com.ean.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:38:40
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
