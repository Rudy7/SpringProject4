package com.project4.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.project4.web.domain.BoardDTO;

@Component
public interface BoardService {
	public void addBoard(BoardDTO board);
	public void modifyBoard(BoardDTO board);
	public void removeBoard(BoardDTO board);
	public List<BoardDTO> list();
	public List<BoardDTO> findByName(BoardDTO board);
	public BoardDTO findById(BoardDTO board);
	public int count();
	
}
