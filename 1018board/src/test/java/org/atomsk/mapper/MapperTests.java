package org.atomsk.mapper;

import org.atomsk.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MapperTests {
	
	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testInsert() {
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("test aaaaaaaaaaaaaa");
		boardVO.setContent("tttttttest content");
		boardVO.setWriter("rtest user");
		
		log.info(mapper.insert(boardVO));
		
		
		
	}

}
