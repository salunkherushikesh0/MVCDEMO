package com.slksoft.entity;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Message {
	private Integer id;
	private String 	msgFrom;//msg_from
	private String 	msgTo;//msg_to
	private String cc;
	private String subject; 
	private String msgBody;//msg_body
	private Date sentAt;//sent_at
}
