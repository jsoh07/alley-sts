package kr.co.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mapper.TimeMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

// 현재 클래스는 테스트를 위한 클래스.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/Web-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {

	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	// @Setter : setter 메소드 자동 생성.
	// @Autowired : 생성된 객체 자동 연결.

	// 점검 삼아서 구동해볼 메소드라고 알려줌.
//	@Test
//	public void testGetTime() {
//		log.info(timeMapper.getTime());
//	}
	
	@Test
	public void testGetTime2() {
		log.info("xml 이용 : " + timeMapper.getTime2());
	}
}
