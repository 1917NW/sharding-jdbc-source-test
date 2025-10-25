package com.lxy.shardingjdbcsourcetest.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (SUser)表实体类
 *
 * @author makejava
 * @since 2025-08-30 20:40:40
 */
@TableName("s_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SUser {

    
     @TableId(type = IdType.AUTO)
     private Integer id;

    
     private String userName;




}

