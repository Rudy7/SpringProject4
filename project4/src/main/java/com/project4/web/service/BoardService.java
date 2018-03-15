package com.project4.web.service;

import java.util.List;
import com.project4.web.domain.BoardDTO;

public interface BoardService {
	public void addBoard(BoardDTO board);
	public void modifyBoard(BoardDTO board);
	public void removeBoard(BoardDTO board);
	public List<BoardDTO> list();
	public List<BoardDTO> findByName(BoardDTO board);
	public BoardDTO findById(BoardDTO board);
	public int count();
	
}
