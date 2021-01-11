package com.cos.blog.service;

import java.util.List;

import com.cos.blog.domain.reply.ReplyDao;
import com.cos.blog.domain.reply.dto.ReplyReqDto;
import com.cos.blog.domain.reply.dto.SaveReqDto;

public class ReplyService {
	private ReplyDao replyDao;

	public ReplyService() {
		replyDao = new ReplyDao();
	}

	public int 댓글쓰기(SaveReqDto dto) {
		return replyDao.save(dto);
	}
	public ReplyReqDto 댓글찾기(int id) {
		return replyDao.findById(id);
	}
	
	public List<ReplyReqDto> 글목록보기(int boardId){
		return replyDao.findAll(boardId);
	}
}
