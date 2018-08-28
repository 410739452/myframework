package com.pf.myframework.core;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pf.myframework.core.entity.Users;
import com.pf.myframework.core.entity.enums.AgeEnum;
import com.pf.myframework.core.mapper.UsersMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisMetaObjectHandlerTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(MybatisMetaObjectHandlerTest.class);

	@Resource
	UsersMapper userMapper;

	@Test
	public void test() {
		Users user = new Users("Tom", AgeEnum.ONE, "tom@qq.com");
		user.setId(6L);
		userMapper.insert(user);
		LOGGER.info("query user:{}", userMapper.selectById(user.getId()));
		
		Users beforeUser = userMapper.selectById(1L);
		LOGGER.info("before user:{}", beforeUser);
		
		beforeUser.setAge(AgeEnum.TWO);
		userMapper.updateById(beforeUser);
		LOGGER.info("query user:{}", userMapper.selectById(1L));
	}
}
