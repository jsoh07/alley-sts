package kr.co.alley;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.domain.AuthVO;
import kr.co.domain.General_MemberVO;
import kr.co.service.General_MemberService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/member/*")
public class CommonController {

	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	@Inject
	BCryptPasswordEncoder pwEncoder;

	private General_MemberService gms;

	// 회원가입 이동
	@GetMapping("/signup")
	public void memberRegister() {
		log.info("회원가입..");
	}

	// 회원가입
	@PostMapping("/signup")
	public String signup(General_MemberVO vo, AuthVO auth) throws Exception {

		String inputPass = vo.getUserpw();
		String pw = pwEncoder.encode(inputPass);

		vo.setUserpw(pw);
		gms.signup(vo, auth);

		return "/member/customLogin";

	}
	
	// 로그인
	@GetMapping("/customLogin")
	public String loginInput(String error, String logout, Model model) {
		if (error != null) {
			model.addAttribute("error", "계정을 확인해 주세요");
		}
		if (logout != null) {
			model.addAttribute("logout", "로그아웃");
		}

		return "/member/customLogin";
	}
	
	// 로그아웃
	@GetMapping("/customLogout")
	public String logoutGet(HttpSession session) {
		session.invalidate();
		log.info("로그아웃");

		return "redirect:/";
	}

	// 아이디체크
	@ResponseBody
	@PostMapping("/CheckId")
	public int CheckId(General_MemberVO vo) throws Exception {
		int result = gms.CheckId(vo);
		return result;
	}
	
	// 이메일체크
	@ResponseBody
	@PostMapping("/CheckEmail")
	public int CheckEmail(General_MemberVO vo) throws Exception {
		int result = gms.CheckEmail(vo);
		return result;
	}
	
	// 전화번호체크
	@ResponseBody
	@PostMapping("/CheckPhone")
	public int CheckPhone(General_MemberVO vo) throws Exception {
		int result = gms.CheckPhone(vo);
		return result;
	}

}
