package com.mycompany.app.board.service;

import java.util.List;

import com.mycompany.app.board.model.BoardVO;
import com.sun.javafx.collections.MappingChange.Map;

public interface BoardService {
	public List<BoardVO> getBoardList() throws Exception;
	
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	public BoardVO getBoardContent(int bid) throws Exception;

    public int updateBoard(BoardVO boardVO) throws Exception;

    public int deleteBoard(int bid) throws Exception;

}
