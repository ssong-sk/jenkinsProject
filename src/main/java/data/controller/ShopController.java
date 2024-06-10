package data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {
	
	@GetMapping("/")
    public String start() {
		
		return "redirect:shop/list";
	}
	
	
	@GetMapping("/shop/list")
	public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		
		mview.setViewName("gitshop/shoplist");
		
		return mview;
	}
}
