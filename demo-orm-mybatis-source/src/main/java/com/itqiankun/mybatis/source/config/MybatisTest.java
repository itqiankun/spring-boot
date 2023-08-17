package com.itqiankun.mybatis.source.config;

import com.alibaba.fastjson.JSONObject;
import com.itqiankun.mybatis.source.entity.User;
import com.itqiankun.mybatis.source.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

/**
 * @author: ma_qiankun
 * @date: 2023/8/10
 **/
@Component
public class MybatisTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		try {


//			testSelectByMapperMethodAllPath(session);
//			testSelectByMapper_selectUserById(session);
//			testSelectByMapper_selectUserByUser(session);
			testSelectByMapper_selectUserByUserLike(session);
//			testSelectByMapperAlias(session);
//			testSaveUser(session);


		} finally {
			session.close();
		}
		
		
		
		
		
		
		
	}

	private static void testSelectByMapperMethodAllPath(SqlSession session) {
		Object o = session.selectOne("com.itqiankun.mybatis.source.mapper.UserMapper.selectUserById", 1);
		System.out.println("我是第一次查询的"+o);
		System.out.println("-------------------------------我是分割线---------------------");
		Object z = session.selectOne("com.itqiankun.mybatis.source.mapper.UserMapper.selectUserById", 1);
		System.out.println("我是第二次查询的"+z);
	}

	private static void testSelectByMapper_selectUserById(SqlSession session) {
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.selectUserById(1);
		System.out.println(user);
	}

	private static void testSelectByMapper_selectUserByUser(SqlSession session) {
		UserMapper mapper = session.getMapper(UserMapper.class);
		User userArg = new User();
		userArg.setId(1L);
		userArg.setName("tom");
		userArg.setLit(10);
		User user = mapper.selectUserByUser(userArg);
		System.out.println(user);
	}

	private static void testSelectByMapper_selectUserByUserLike(SqlSession session) {
		UserMapper mapper = session.getMapper(UserMapper.class);
		User userArg = new User();
		userArg.setId(1L);
		userArg.setName("tom");
		userArg.setLit(10);
		List<User> users = mapper.selectUserByUserLike(userArg);
		System.out.println(JSONObject.toJSON(users));
	}

	private static void testSelectByMapperAlias(SqlSession session) {
		UserMapper mapper = session.getMapper(UserMapper.class);
		Integer integer = mapper.testResultTypeAlias();
		System.out.println(integer);
	}

	private static void testSaveUser(SqlSession session) {
		User user = new User();
		user.setAge(15);
		user.setName("achuan");
		int insert = session.insert("com.itqiankun.mybatis.source.mapper.UserMapper.addOneUser", user);
		session.commit();
		System.out.println(insert);
	}
}