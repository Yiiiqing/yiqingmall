package com.yiqing.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yiqing.common.utils.PageUtils;
import com.yiqing.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author yiqing
 * @email zhang.yiqing@hotmail.com
 * @date 2024-09-11 18:02:56
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

