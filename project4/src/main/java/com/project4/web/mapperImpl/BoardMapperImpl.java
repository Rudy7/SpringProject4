package com.project4.web.mapperImpl;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project4.web.domain.BoardDTO;
import com.project4.web.domain.MemberDTO;
import com.project4.web.mapper.BoardMapper;

@Repository
public class BoardMapperImpl implements BoardMapper{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired SqlSessionTemplate sqlSession;
	@Autowired BoardDTO board;
	String ns = "com.project4.web.mapperImpl.BoardMapperImpl.";
	
	@Override
	public void insertBoard(BoardDTO board) {
		logger.info("보더매퍼 임플입니다. 제목은 {}" , board.getTitle());
		logger.info("보더매퍼 임플입니다. 내용은 {}" , board.getContent());
		logger.info("보더매퍼 임플입니다. 아이디는 {}" , board.getUserid()); //aa
		sqlSession.insert(ns+"insertBoard", board);
	}

	@Override
	public void updateBoard(BoardDTO board) {
		// TODO Auto-generated method stub//d
	}

	@Override
	public void deleteBoard(BoardDTO board) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<BoardDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> selecByName(BoardDTO board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO selectById(BoardDTO board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
