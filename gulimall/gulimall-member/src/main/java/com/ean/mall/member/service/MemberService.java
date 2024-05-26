package com.ean.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ean.common.utils.PageUtils;
import com.ean.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:32:51
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

