package com.home;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ComponentScan("home3.com")
public class MomController {
	@ResponseBody
	@RequestMapping("/sugar")
	public String givesuger() {
		
		
		return "u r sugar is there";
	}

}
