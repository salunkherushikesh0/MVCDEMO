package com.slksoft.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import com.slksoft.entity.Message;

public interface MessageDao {

	@Insert("insert into message(msg_from,msg_to,cc,subject,msg_body,sent_at) values (#{msgFrom},#{msgTo},#{cc},#{subject},#{msgBody},#{sentAt})")
	@Results({
		@Result(column="msg_from",property="msgFrom"),
		@Result(column="msg_to",property="msgTo"),
		@Result(column="msg_body",property="msgBody"),
		@Result(column="sent_at",property="sentAt"),
	})
	//@Options(useGeneratedKeys = true,keyProperty = "id")
	public void newMessage(Message msg);

}
