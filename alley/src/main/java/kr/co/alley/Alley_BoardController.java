package kr.co.alley;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.service.Alley_BoardService;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/alleyboard/*")
@AllArgsConstructor
public class Alley_BoardController {
	
	@Setter(onMethod_= @Autowired)
	private Alley_BoardService abs;
	
	@GetMapping("/main")
	public void mainPageGET(Model model) {
		log.info("메인페이지");
		model.addAttribute("store1", abs.best1());
		model.addAttribute("store2", abs.best2());
		model.addAttribute("store3", abs.best3());
		model.addAttribute("store4", abs.best4());
		
	}
	
	@GetMapping("/view")
	public void alleyView(@RequestParam("ano") Long ano, Model model) {
		
		model.addAttribute("store",abs.view(ano));
	}
	
	
	
}
