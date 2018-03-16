package com.project4.web.mapperImpl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.project4.web.domain.BoardDTO;
import com.project4.web.mapper.BoardMapper;

public class BoardMapperImpl implements BoardMapper{

	@Override
	public void insertBoard(BoardDTO board) {
		/*SqlSession.insert(ns+"insertBoard", );*/
	}

	@Override
	public void updateBoard(BoardDTO board) {
		// TODO Auto-generated method stub
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
