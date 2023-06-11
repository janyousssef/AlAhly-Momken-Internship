package MVC.CRUD.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import models.EmpDao;
import models.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmpDao dao;

	@RequestMapping("/employee_form")
	public String showform(Model m) {
		m.addAttribute("command", new Employee());
		return "employee_form";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@Valid @ModelAttribute("emp") Employee emp, BindingResult br, Model m) {
		ModelAndView mav;
		if (!br.hasErrors()) {
			dao.saveEmployee(emp);
			mav=new ModelAndView("view_employees");
			return mav;
		} else {
			System.out.println("test");
			m.addAttribute("command", new Employee());
			mav=new ModelAndView("employee_form");
			return mav;
		}
	}

	@RequestMapping("/view_employees")
	public String viewemp(Model m) {
		List<Employee> list = dao.getAllEmployees();
		m.addAttribute("mylist", list);
		return "view_employees";
	}

	@RequestMapping(value = "edit_employee/{id}")
	public String edit(@PathVariable int id, Model m) {
		Employee emp = dao.getEmployee(id);
		m.addAttribute("command", emp);
		return "/employee_editform";
	}

	@RequestMapping(value = "/edit_employee", method = RequestMethod.POST)
	public String editsave(@Valid @ModelAttribute("emp") Employee emp, BindingResult br, Model m) {
		if (!br.hasErrors()) {
			dao.updateEmployee(emp);
			return "redirect:/view_employees";
		} else {
			m.addAttribute("errorMessages", br.getAllErrors());
			return "redirect:/error.jsp";
		}
	}

	@RequestMapping(value = "/delete_employee/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		dao.deleteEmployeeById(id);
		return "redirect:/view_employees";
	}
}
