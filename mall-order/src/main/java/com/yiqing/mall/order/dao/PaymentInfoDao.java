package com.yiqing.mall.order.dao;

import com.yiqing.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author yiqing
 * @email zhang.yiqing@hotmail.com
 * @date 2024-09-11 19:44:15
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
