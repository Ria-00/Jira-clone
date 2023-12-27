package org.ncu.Jiro.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.ncu.Jiro.entity.admin;
import org.ncu.Jiro.entity.project;
import org.ncu.Jiro.entity.user;
import org.ncu.Jiro.service.adminserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class Admincontroller {

	@Autowired
	adminserviceImp ser;

	@ModelAttribute("admin")
	public admin getAdmin() {
		return new admin();
	}

	@ModelAttribute("project")
	public project getProject() {
		return new project();
	}

	@ModelAttribute("user")
	public user getUser() {
		return new user();
	}

	@RequestMapping("/xhome")
	public String xhome() {
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		return "home-admin";
	}

	@RequestMapping("/login")
	public String loginAdmin() {
		return "login-admin";
	}

	@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
	public String loginAdminProcess(@Valid @ModelAttribute("admin") admin u, BindingResult br, HttpServletRequest req,Model model) {
		if (br.hasErrors()) {
			System.out.println("error");
			System.out.println(br.getAllErrors());
			return "login-admin";
		} else {
			admin a = ser.getRecord(u.getAid());
			if (a.getPass().equals(u.getPass())) {
				HttpSession s = req.getSession();
				s.setAttribute("name", a.getName());
				s.setAttribute("user", a.getAid());
//				model.addAttribute("name", a.getName().toUpperCase());
				return "home-admin";
			} else {
				model.addAttribute("error", "Incorrect Password!!");
				return "login-admin";
			}

		}

	}

	@RequestMapping("/updateadmin")
	public String updateAdmin() {
		return "update-admin";
	}

	@RequestMapping("/updateadminprocess")
	public String updateAdminProcess(@Valid@ModelAttribute("admin") admin u, BindingResult br,HttpServletRequest req, Model model) {
		if (br.hasErrors()) {
			return "update-admin";
		} else {
			HttpSession s = req.getSession(false);
			int id = (Integer) s.getAttribute("user");
			int res = ser.updateAdminRecord(id, u);
			if (res > 0) {
				model.addAttribute("user", u);
				return "confirm";
			} else {
				model.addAttribute("err", "Error Updating Record");
				return "error";
			}
		}
		
	}

	@RequestMapping("/viewprojects")
	public String viewProjects(Model model) {
		List<project> p = ser.fetchAllRecords();
		if (p != null) {
			model.addAttribute("list", p);
			return "view-project";
		} else {
			model.addAttribute("err", "Empty List");
			return "error";
		}

	}

	@RequestMapping("/deleteproject")
	public String deleteProject(int id, Model model) {
		int i = ser.deleteRecord(id);
		if (i > 0) {
			model.addAttribute("yes", "Successfully Deleted");
			return "confirm";
		} else {
			model.addAttribute("err", "Couldn't delete Record");
			return "error";
		}
	}

	@RequestMapping("/updateproject")
	public String updateProject(int id, HttpServletRequest req, Model model) {
		HttpSession ses = req.getSession(false);
		ses.setAttribute("pid", id);
		model.addAttribute("pid", id);
		return "update-project";
	}

	@RequestMapping("/updateprojectprocess")
	public String updateProjectProcess(@Valid@ModelAttribute("project") project p,BindingResult br, HttpServletRequest req, Model model) {
		if (br.hasErrors()) {
			return "update-project";
		} else {
			HttpSession s = req.getSession(false);
			int id = (Integer) s.getAttribute("pid");
			int res = ser.updateRecord(id, p);
			if (res > 0) {
				model.addAttribute("nam", id);
				model.addAttribute("project", p);
				return "view-pro";
			} else {
				model.addAttribute("err", "Error Updating Record");
				return "error";
			}
		}
		
	}

	@RequestMapping("/insertproject")
	public String insertProject() {
		return "insert-project";
	}

	@RequestMapping("/insertprojectprocess")
	public String insertProjectProcess(@Valid@ModelAttribute("project") project p, BindingResult br,HttpServletRequest req, Model model) {
		if (br.hasErrors()) {
			return "insert-project";
		} else {
			int res = ser.insertRecord(p);
			if (res > 0) {
				model.addAttribute("yes", "Successfully Inserted");
				return "confirm";
			} else {
				model.addAttribute("err", "Error Updating Record");
				return "error";
			}
		}
		
	}

	@RequestMapping("/manageassigne")
	public String manageAssigne(int id, HttpServletRequest req, Model model) {
		List<user> p = ser.getAssigne(id);
		HttpSession ses = req.getSession(false);
		ses.setAttribute("cpid", id);
		if (p != null) {
			model.addAttribute("list", p);
			return "view-assigne";
		} else {
			model.addAttribute("err", "Empty List");
			return "error";
		}
	}

	@RequestMapping("/deleteassigne")
	public String deleteAssigne(int id, Model model) {
		int i = ser.deleteAssigneRec(id);
		if (i > 0) {
			model.addAttribute("yes", "Successfully Deleted");
			return "confirm";
		} else {
			model.addAttribute("err", "Couldn't delete Record");
			return "error";
		}
	}

	@RequestMapping("/insertassigne")
	public String insertAssigne() {
		return "insert-assigne";
	}

	@RequestMapping("/insertassigneprocess")
	public String insertAssigneProcess(@Valid @ModelAttribute("user") user u, BindingResult br, HttpServletRequest req,
			Model model) {
		if (br.hasErrors()) {
			return "insert-assigne";
		} else {
			HttpSession ses = req.getSession(false);
			int id = (Integer) ses.getAttribute("cpid");
			int i = ser.insertAssigneRec(id, u.getUid());
			if (i > 0) {
				model.addAttribute("yes", "Successfully Inserted");
				return "confirm";
			} else {
				model.addAttribute("err", "Error Inserting Record");
				return "error";
			}
		}

	}

	@RequestMapping("/logout")
	public String logOut(HttpServletRequest req) {
		HttpSession ses = req.getSession(false);
		ses.invalidate();
		return "redirect:/";

	}

}
