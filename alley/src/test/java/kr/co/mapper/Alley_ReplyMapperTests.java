package kr.co.mapper;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.domain.Alley_ReplyVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class Alley_ReplyMapperTests {

	private Long[] anoArr = { 1L, 2L, 3L, 4L, 5L };
// 실제 게시물의 번호 5개 할당.
	@Setter(onMethod_ = @Autowired)
	private Alley_ReplyMapper arm;

	@Test
	public void testCreate() {
// 게시물 1개당 2개의 덧글 자동 등록.
// 정수형을 스트림 형태로 전환. 범위 1~10.
		IntStream.rangeClosed(1, 10).forEach(i -> {
			Alley_ReplyVO vo = new Alley_ReplyVO();
			vo.setAno(anoArr[i % 5]); // 0~4
			vo.setReply("댓글 테스트" + i);
			vo.setReplyer("replyer" + i);
			arm.insert(vo);
		});
	}
}
