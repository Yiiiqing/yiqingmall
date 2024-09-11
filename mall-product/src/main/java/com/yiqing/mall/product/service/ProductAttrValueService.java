package com.yiqing.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yiqing.common.utils.PageUtils;
import com.yiqing.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author yiqing
 * @email zhang.yiqing@hotmail.com
 * @date 2024-09-11 18:02:56
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

