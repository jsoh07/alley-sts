package kr.co.alley;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.domain.AuthVO;
import kr.co.domain.General_MemberVO;
import lombok.extern.log4j.Log4j;


@Controller
@Log4j
public class CommonController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	@Inject
	BCryptPasswordEncoder pwEncoder;
	
	@GetMapping("/customLogin")
	public void loginInput(String error, String logout, Model model) {
		if(error != null)
			model.addAttribute("error","계정을 확인해 주세요");
		if(logout != null)
			model.addAttribute("logout","로그아웃");
	}
	
	@GetMapping("/customLogout")
	public void logoutGet() {
		log.info("custom logout");
	}
	
	// 회원가입 페이지
	@GetMapping("/signup")
	public void memberRegister() {
		log.info("회원가입..");
	}
	
//	// 회원가입
//	@GetMapping("/signup")
//	public String signup(General_MemberVO vo, AuthVO auth) throws Exception{
//		
//		String inputPass = vo.getUserpw();
//		String pw = pwEncoder.encode(inputPass);
//		
//		vo.setUserpw(pw);
//		gms.signup(vo, auth);
//		
//		return 
//		
//	}

}
