package kr.co.alley;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.service.Alley_BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/alleyboard/*")
@AllArgsConstructor
public class Alley_BoardController {
	
	private Alley_BoardService abs;
	
	@GetMapping("/get")
	public void get(@RequestParam("ano") Long ano, Model model) {
		
		log.info("/get");
		model.addAttribute("ab", abs.get(ano));
	}
	
}
