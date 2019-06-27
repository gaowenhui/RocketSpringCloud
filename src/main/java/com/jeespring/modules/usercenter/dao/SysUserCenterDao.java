/** * * Copyright &copy; 2015-2020 <a href="https://github.com/gaowenhui/RocketSpringCloud">JeeSpring</a> All rights reserved.. */
package com.jeespring.modules.usercenter.dao;

import com.jeespring.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.jeespring.modules.usercenter.entity.SysUserCenter;

/**
 * 用户中心DAO接口
 * @author gaowh
 * @version 2017-12-12
 */
@Mapper
public interface SysUserCenterDao extends InterfaceBaseDao<SysUserCenter> {
	
}