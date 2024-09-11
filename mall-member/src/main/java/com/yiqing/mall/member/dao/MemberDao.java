package com.yiqing.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yiqing.mall.member.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yiqing
 * @email zhang.yiqing@hotmail.com
 * @date 2024-09-11 19:36:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
