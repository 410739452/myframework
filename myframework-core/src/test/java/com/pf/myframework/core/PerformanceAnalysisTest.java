package com.pf.myframework.core;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pf.myframework.core.mapper.UsersMapper;

/**
 * <p>
 * 性能分析插件测试
 * </p> 
 *
 * @author PF
 * @since 2018年8月26日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PerformanceAnalysisTest {
	
	@Resource
	UsersMapper userMapper;
	
    @Test
    public void test(){
        userMapper.selectList(new QueryWrapper<>());
    }

}
