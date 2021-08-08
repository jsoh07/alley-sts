package kr.co.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.domain.Comm_Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/Web-INF/spring/root-context.xml")
@Log4j
public class Comm_BoardServiceTests {
	
	@Setter(onMethod_ = { @Autowired })
	private Comm_BoardService cbs;

//	@Test
//	public void testRegister() {
//		Comm_BoardVO cb = new Comm_BoardVO();
//		cb.setTitle("새로 작성하는 글 1106");
//		cb.setContent("새로 작성하는 내용 1106");
//		cb.setWriter("새로운 작성자 1106");
//
//		cbs.register(cb);
//		// 서비스 >> 매퍼 >> mybatis query 순으로 호출.
//		log.info("생성된 게시물 번호: " + cb.getBno());
//	}
	
	@Test
	public void testGetList2() {
		cbs.getList(new Comm_Criteria(2,10)).forEach(board -> log.info(board));
		// 매개변수로 전달할 cri 를 코드에서 직접 생성하여 전달하고,
		// getList 처리결과, boardVO 의 List 객체 리턴(일종의 객체배열)
		// 요소 하나씩을 board 변수에 대입하고 로그로 출력.
	}
}
