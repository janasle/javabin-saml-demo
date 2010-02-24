package org.corporation.forsikring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForsikringsController {

    @RequestMapping(method = RequestMethod.GET, value = "/forsikring/login.do")
	public ModelAndView login() throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("login");
		return view;
	}

    @RequestMapping(method = RequestMethod.POST, value = "/forsikring/login.do")
	public ModelAndView validateCredentials(@RequestParam("username") String username, @RequestParam("password") String password) throws Exception {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		view.addObject("user", username);
		return view;
	}

}