package kr.co.service;

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
public class Alley_BoardServiceTests {
	
	@Setter(onMethod_= @Autowired)
	private Alley_BoardService abs;
	
	@Test
	public void testRead() {
		Alley_BoardVO ab = abs.view(9L);
		log.info(ab);
	}

}
