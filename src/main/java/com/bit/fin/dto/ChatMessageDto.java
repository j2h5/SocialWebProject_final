package com.bit.fin.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Alias("publicChat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageDto {
	
	private String senderName;
	private String class_name;
	private String message;
	private Timestamp public_date;
	private String status;
	private int class_num;
}
