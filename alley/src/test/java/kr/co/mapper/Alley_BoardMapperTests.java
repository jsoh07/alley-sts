package kr.co.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.domain.Alley_BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/Web-INF/spring/root-context.xml")
@Log4j
public class Alley_BoardMapperTests {
	@Setter(onMethod_= @Autowired)
	private Alley_BoardMapper abm;
	
//	@Test
//	public void testGetList() {
//		abm.getList().forEach(board -> log.info(board));
//	}
	
	@Test
	public void testRead() {
		Alley_BoardVO ab = abm.view(10L);
		
		log.info(ab);
	}

}
