package org.corporation.forsikring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForsikringsController {

    @RequestMapping(value = "/home")
	public ModelAndView showHome() throws Exception {
		return new ModelAndView("home");
	}

}