package models;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HelloController {

	@RequestMapping("/create")
	public String bookingForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		List genders= Arrays.asList("male","female","unsure");
		model.addAttribute("genders", genders);
		return "/create_user";
	}
	@RequestMapping("/admin_panel")
	public String submitForm(@ModelAttribute("user") User user)
	{
		return "/admin_panel";
	}
}
