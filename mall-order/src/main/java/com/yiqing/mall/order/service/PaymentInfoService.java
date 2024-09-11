package com.yiqing.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yiqing.common.utils.PageUtils;
import com.yiqing.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author yiqing
 * @email zhang.yiqing@hotmail.com
 * @date 2024-09-11 19:44:15
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

