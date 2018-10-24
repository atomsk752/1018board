package org.atomsk.service;

import java.util.List;

import org.atomsk.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getList(BoardVO boardVO);

}
