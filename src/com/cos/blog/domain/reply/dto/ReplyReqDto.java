package com.cos.blog.domain.reply.dto;

import lombok.Data;

@Data
public class ReplyReqDto {
	private int id;
	private int userId;
	private int boardId;
	private String content;
	private String username;
}
