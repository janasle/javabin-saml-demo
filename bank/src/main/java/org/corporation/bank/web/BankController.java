package org.corporation.bank.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {

    @RequestMapping(value = "/home")
	public ModelAndView showNettbank() throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("nettbank");
        view.addObject("user", "username");
		return view;
	}
	
}
