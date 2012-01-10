package com.iitdu.longunmen.apps.webs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iitdu.longunmen.apps.domain.User;

@Controller
@RequestMapping("/login/*")
public class LoginController {

	@RequestMapping(value = "go", method = RequestMethod.GET)
	public void go(User user) {
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(User user, BindingResult bindResult, Model model) {
		if (user.getUsername() == null || "".equals(user.getUsername())) {
			bindResult.rejectValue("username", "required",
					"Please enter user name");
		} else if (user.getPassword() == null || "".equals(user.getPassword())) {
			bindResult.rejectValue("password", "required",
					"Please enter password");
		}
		if (bindResult.hasErrors()) {
			return "login/go";
		}
		return "login/success";
	}
}
