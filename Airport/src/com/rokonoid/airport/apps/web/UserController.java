package com.rokonoid.airport.apps.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.rokonoid.airport.apps.domain.User;

@Controller
@RequestMapping("/user/*")
public class UserController {

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public void create(User user) {
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(User user, BindingResult result, HttpSession session) {
		validate(user, result);

		if (result.hasErrors()) {
			return "user/create";
		}

		return "home/index";
	}

	private void validate(User user, BindingResult result) {
		if (user.getUserName() == null || "".equals(user.getUserName())) {
			result.rejectValue("userName", "required", "username is required");
		}
		if (user.getPassword() == null || "".equals(user.getPassword())) {
			result.rejectValue("password", "required", "password is required");
		}

		if (user.getConfirmPassword() == null
				|| "".equals(user.getConfirmPassword())) {
			result.rejectValue("confirmPassword", "required",
					"confirm password is required");
		}
		if (user.getFullName() == null || "".equals(user.getFullName())) {
			result.rejectValue("fullName", "required", "full name is required");
		}
		if (user.getPhoneNumber() == null || "".equals(user.getPhoneNumber())) {
			result.rejectValue("phoneNumber", "required",
					"phone number is required");
		}

		if (!user.getPassword().equals(user.getConfirmPassword())) {
			result.addError(new ObjectError("password mismatch",
					"password mismatch"));
		}

	}
}
