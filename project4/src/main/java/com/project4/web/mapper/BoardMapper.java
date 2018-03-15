package com.project4.web.mapper;

import java.util.List;
import com.project4.web.domain.BoardDTO;

public interface BoardMapper {
	public void insertBoard(BoardDTO board);
	public void updateBoard(BoardDTO board);
	public void deleteBoard(BoardDTO board);
	public List<BoardDTO> selectAll();
	public List<BoardDTO> selecByName(BoardDTO board);
	public BoardDTO selectById(BoardDTO board);
	public int selectCount();
}
