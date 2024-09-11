package com.yiqing.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yiqing.common.utils.PageUtils;
import com.yiqing.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author yiqing
 * @email zhang.yiqing@hotmail.com
 * @date 2024-09-11 19:44:15
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

