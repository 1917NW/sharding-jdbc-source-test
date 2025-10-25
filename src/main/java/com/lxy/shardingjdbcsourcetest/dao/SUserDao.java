package com.lxy.shardingjdbcsourcetest.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxy.shardingjdbcsourcetest.entity.SUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * (SUser)表数据库访问层
 *
 * @author makejava
 * @since 2025-08-30 20:40:38
 */
@Mapper
public interface SUserDao extends BaseMapper<SUser> {

}

