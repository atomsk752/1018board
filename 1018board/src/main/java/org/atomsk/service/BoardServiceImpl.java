package org.atomsk.service;

import java.util.List;

import org.atomsk.domain.BoardVO;
import org.atomsk.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;

	@Override
	public List<BoardVO> getList(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return mapper.getList(boardVO);
	}

}
