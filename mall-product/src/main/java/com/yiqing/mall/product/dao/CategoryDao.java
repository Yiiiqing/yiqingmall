package com.yiqing.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yiqing.mall.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yiqing
 * @email zhang.yiqing@hotmail.com
 * @date 2024-09-11 18:02:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
