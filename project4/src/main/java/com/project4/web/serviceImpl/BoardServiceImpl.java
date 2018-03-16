package com.project4.web.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.project4.web.domain.BoardDTO;
import com.project4.web.mapper.BoardMapper;
import com.project4.web.service.BoardService;

public class BoardServiceImpl implements BoardService{
	@Autowired BoardMapper mapper;
	
	@Override
	public void addBoard(BoardDTO board) {
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
