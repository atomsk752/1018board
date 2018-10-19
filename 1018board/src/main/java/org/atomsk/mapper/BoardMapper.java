package org.atomsk.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.atomsk.domain.BoardVO;

public interface BoardMapper {


	@Insert("insert into tbl_board (title, content, writer)"+
			"values(#{title},#{content},#{writer})")
	public int insert(BoardVO boardVO);

	
}
