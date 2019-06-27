/** * * Copyright &copy; 2015-2020 <a href="https://github.com/gaowenhui/RocketSpringCloud">JeeSpring</a> All rights reserved.. */
package com.jeespring.modules.test.dao.onetomany;

import com.jeespring.common.persistence.InterfaceBaseDao;
import org.apache.ibatis.annotations.Mapper;
import com.jeespring.modules.test.entity.onetomany.TestDataMain;

/**
 * 订票DAO接口
 * @author gaowh
 * @version 2018-08-06
 */
@Mapper
public interface TestDataMainDao extends InterfaceBaseDao<TestDataMain> {
	
}