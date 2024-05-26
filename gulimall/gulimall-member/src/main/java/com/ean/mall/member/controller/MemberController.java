package com.ean.mall.member.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.ean.mall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ean.mall.member.entity.MemberEntity;
import com.ean.mall.member.service.MemberService;
import com.ean.common.utils.PageUtils;
import com.ean.common.utils.R;

import javax.annotation.Resource;


/**
 * 会员
 *
 * @author Povlean
 * @email 1927079760@qq.com
 * @date 2024-05-25 16:32:51
 */
@RestController
@RequestMapping("member/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Resource
    private CouponFeignService couponFeignService;

    @GetMapping("/coupons")
    public R memberCoupons(){
        R list = couponFeignService.list(new HashMap<>());
        return R.ok(list);
    }
    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
