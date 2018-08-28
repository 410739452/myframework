package com.pf.myframework;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pf.myframework.core.entity.Users;
import com.pf.myframework.core.entity.enums.AgeEnum;
import com.pf.myframework.core.mapper.UsersMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFrameworkApplicationTests {

	@Resource
	UsersMapper userMapper;

//	@Test
//	public void testSelect() {
//		System.out.println(("----- selectAll method test ------"));
//		List<Users> userList = userMapper.selectList(null);
//		Assert.assertEquals(5, userList.size());
//		userList.forEach(System.out::println);
//	}

//	@Test
//	public void testPage() {
//		System.err.println("----- baseMapper 自带分页 ------");
//		Page<Users> page = new Page<>(1, 3);
////		IPage<Users> userIPage = userMapper.selectPage(page,
////				new QueryWrapper<Users>().eq("age", 20).eq("name", "Jack"));
//		IPage<Users> userIPage = userMapper.selectPage(page, null);
//		Assert.assertSame(page, userIPage);
//		System.out.println("总条数 ------> " + userIPage.getTotal());
//		System.out.println("当前页数 ------> " + userIPage.getCurrent());
//		System.out.println("当前每页显示数 ------> " + userIPage.getSize());
//		print(userIPage.getRecords());
//	}

//	@Test
//	public void testLogicDeleteById() {
//		Assert.assertEquals(1, userMapper.deleteById(1L).intValue());
//	}

//	@Test
//	public void testLogicDeleteBatchIds() {
//		userMapper.deleteBatchIds(Arrays.asList(1, 2, 3));
//	}
//
//	@Test
//	public void testLogicDelete() {
//		userMapper.delete(new QueryWrapper<Users>().eq("age", 2));
//	}
	

	
//    @Test
//    public void insert() {
//        Users user = new Users();
//        user.setName("K神");
//        user.setAge(11);
//        user.setEmail("abc@mp.com");
//        user.setIsDelete(DeletedEnum.NO);
//        Assert.assertTrue(userMapper.insert(user) > 0);
//        // 成功直接拿会写的 ID
//        System.err.println("\n插入成功 ID 为：" + user.getId());
//    }


    @Test
    public void select() {
        Users user = userMapper.selectOne(new QueryWrapper<Users>().lambda().eq(Users::getId, 2));
        Assert.assertEquals("Jack", user.getName());
        Assert.assertTrue(AgeEnum.THREE == user.getAge());
    }	

	private <T> void print(List<T> list) {
		if (!CollectionUtils.isEmpty(list)) {
			list.forEach(System.out::println);
		}
	}
}
