package kr.co.alley;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:src/main/webapp/Web-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j
@WebAppConfiguration // controller 테스트를 위한 클래스 라고 알림.
public class Comm_BoardControllerTests {
	
	@Setter(onMethod_ = @Autowired)
	private WebApplicationContext ctx;
	// 웹으로 프로그램을 테스트하기 위한 객체이다.
	private MockMvc mockMvc;
	// mvc 모델 모형 객체이다.

	@Before // 테스트 실행 전에 먼저 실행하라고 알린다.
	public void Setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();

	}
	
//	@Test
//	public void testList() throws Exception {
//		log.info(
//				mockMvc.perform(MockMvcRequestBuilders
//						.get("/commboard/list"))
//				.andReturn()
//				.getModelAndView()
//				.getModelMap());// 보기 편하게 하기 위해서 줄바꿈.
//		/*
//		 * /board/list 요청에 대한 처리를 get 방식으로 하고, 
//		 * 그 결과를 andReturn() 으로 받아서,
//		 * getModelAndView() 를 통해 model 로 전환 후,
//		 * 결과를 getModelMap() 으로 jsp 페이지로 출력한다.
//		 * 
//		 */
//	}
	
//	@Test
//	public void testRegister() throws Exception {
//		String result = mockMvc
//				.perform(MockMvcRequestBuilders.post("/commboard/register")
//						.param("title", "테스트 새글 제목1:15")
//						.param("content", "테스트 새글 내용1:15")
//						.param("writer", "user1:15"))
//				.andReturn().getModelAndView().getViewName();
//		// 포스트 요청으로 /board/register 발생되면,
//		// 파라미터로 제목, 내용, 작성자를 전달하고,
//		// 그 결과를 받아서 전달할 수 있는 mav 형태로 바꾸고,
//		// 그 객체의 이름을 표시.
//		
//		log.info(result);
//	}
	
//	@Test
//	public void testGet() throws Exception {
//		log.info(
//				mockMvc.perform(
//						MockMvcRequestBuilders.get("/commboard/get")
//						.param("bno", "3"))
//					.andReturn().getModelAndView().getModelMap());
//		// 3번 게시물 내용 읽기.
//	}
	
//	@Test
//	public void testModify() throws Exception {
//		String result
//		= mockMvc.perform(
//				MockMvcRequestBuilders.post("/commboard/modify")
//				.param("bno", "1")
//				.param("title", "수정된 테스트 새글 제목")
//				.param("content", "수정된 테스트 새글 내용")
//				.param("writer", "user"))
//		.andReturn().getModelAndView().getViewName();
//		
//		log.info(result);			
//	}
	
//	@Test
//	public void testRemove() throws Exception {
//		String result
//		= mockMvc.perform(
//				MockMvcRequestBuilders.post("/commboard/remove")
//				.param("bno", "9"))
//				.andReturn().getModelAndView().getViewName();
//		// 9번 게시물 삭제 점검.
//		log.info(result);		
//	}
	
//	@Test
//	public void testList2() throws Exception {
//		log.info(
//				mockMvc.perform(MockMvcRequestBuilders.get("/commboard/list")
//				.param("pageNum", "2")
//				.param("amount", "10"))	
//				.andReturn()
//				.getModelAndView()
//				.getModelMap());
//		 
//	}
	
	@Test
	public void testList3() throws Exception{
		log.info(
				mockMvc.perform(MockMvcRequestBuilders.get("/commboard/list")
				.param("pageNum", "2")
				.param("amount", "10")
				.param("type", "TW")
				.param("keyword", "테스트"))
				.andReturn()
				.getModelAndView()
				.getModelMap());
	
	}
}
