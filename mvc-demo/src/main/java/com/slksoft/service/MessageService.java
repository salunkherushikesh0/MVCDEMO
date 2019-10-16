package com.slksoft.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.slksoft.dao.MessageDao;
import com.slksoft.entity.Message;

public class MessageService {

	SqlSessionFactory factory;

	public void init() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	public void addNewMessage(Message msg) {
		try (SqlSession session = factory.openSession(true)) {
			MessageDao dao = session.getMapper(MessageDao.class);
			dao.newMessage(msg);
		}

	}

}
