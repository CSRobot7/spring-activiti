package com.ruoyi.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.entity.SysUserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户表 数据层
 * 
 * @author ruoyi
 */
@Mapper
public interface SysUserMapperV2 extends BaseMapper<SysUserPo> {
}
