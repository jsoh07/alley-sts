package kr.co.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.domain.Comm_BoardVO;
import kr.co.domain.Comm_Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/Web-INF/spring/root-context.xml")
@Log4j
public class Comm_BoardMapperTests {
	@Setter(onMethod_ = @Autowired)
	private Comm_BoardMapper cbm;

//	@Test
//	public void testGetList() {
//		cbm.getList().forEach(board -> log.info(board));
//		// 향상된 for : 배열과 배열 1개를 담을 변수
//		// 람다식 : -> 를 기준으로 좌항은 전달값, 우항은 처리
//		// 목록은 게시물 여러개(배열), 그중 1개를 board 에 담은 다음에
//		// 해당 내용을 로그로 출력. 배열 원소가 끝날때 까지 반복.
//		// 기술의 발달로 복잡한 코드가 간단해진 결과로 이해 바람.
//	}
	
//	@Test
//	public void testInsert() {
//		Comm_BoardVO cb = new Comm_BoardVO();
//		cb.setTitle("새로 작성하는 글0412");
//		cb.setContent("새로 작성하는 내용0412");
//		cb.setWriter("새로운 작성자0412");
//
//		cbm.insert(cb);
//		log.info(cb);
//	}
	
//	@Test
//	public void testInsertSelectKey() {
//		Comm_BoardVO cb = new Comm_BoardVO();
//		cb.setTitle("새로 작성하는 글SelectKey");
//		cb.setContent("새로 작성하는 내용SelectKey");
//		cb.setWriter("새로운 작성자SelectKey");
//
//		cbm.insertSelectKey(cb);
//		log.info(cb);
//	}
	
//	@Test
//	public void testRead() {
//		Comm_BoardVO cb = cbm.read(5L);
//		// L 은 bno 가 long 타입이라는 것을 알림.
//		
//		log.info(cb);
//	}
	
//	@Test
//	public void testDelete() {
//		log.info("delete cnt: " + cbm.delete(7L));
//	}
	
//	@Test
//	public void testUpdate() {
//		Comm_BoardVO cb = new Comm_BoardVO();
//		cb.setBno(5L);
//		cb.setTitle("수정된 제목2");
//		cb.setContent("수정된 내용2");
//		cb.setWriter("user002");
//		
//		int count = cbm.update(cb);
//		log.info("update cnt : " +count);
//	}
	
	@Test
	public void testPaging() {
		Comm_Criteria cri = new Comm_Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
		
		List<Comm_BoardVO> list
		= cbm.getListWithPaging(cri);
		list.forEach(board -> log.info(board.getBno()));
	}
}
