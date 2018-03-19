package com.project4.web.serviceImpl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project4.web.domain.BoardDTO;
import com.project4.web.domain.CommonDTO;
import com.project4.web.domain.MemberDTO;
import com.project4.web.mapper.BoardMapper;
import com.project4.web.mapperImpl.MemberMapperImpl;
import com.project4.web.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired BoardMapper mapper;
	@Autowired BoardDTO board;
	@Autowired MemberDTO member;
	@Autowired CommonDTO common;
	
	@Override
	public void addBoard(BoardDTO board) {
		logger.info("보더서비스 임플입니다. 제목은 {}" , board.getTitle());
		logger.info("보더서비스 임플입니다. 내용은 {}" , board.getContent());
		logger.info("보더서비스 임플입니다. 아이디는 {}" , board.getUserid());
		mapper.insertBoard(board);
	}

	@Override
	public void modifyBoard(BoardDTO board) {
		// TODO Auto-generated method stub
	}

	@Override
	public void removeBoard(BoardDTO board) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<BoardDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> findByName(BoardDTO board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO findById(BoardDTO board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
