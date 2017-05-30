package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller_ {

	@RequestMapping("/_0")
	public String greeting(@RequestParam(value = "param_", required = false, defaultValue = "value") String param,
			Model model) {
		model.addAttribute("param_", param);
		return "demo";
	}
}
