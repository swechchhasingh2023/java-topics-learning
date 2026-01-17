// Model Attribute at method level
package com.swechchha.springmvcboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.swechchha.springmvcboot.model.Alien;

@Controller
public class HomeController{
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliensss..");
	}
	@RequestMapping("/")
	public String Home() {
		return "index";
	}
	
	//maodel map
	@RequestMapping("add")
	public String add(@RequestParam ("num1") int i, @RequestParam ("num2") int j, ModelMap m) {
		int num3 = i+j;
		m.addAttribute("num3", num3);
		return "result";
	}
	
	// without using model attribute
	@RequestMapping("addAlien")
	public String addAlien(Alien a) {
		return "result";
	}


// Model Attribute at Parameter level
//package com.swechchha.springmvcboot;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.swechchha.springmvcboot.model.Alien;
//
//@Controller
//public class HomeController{
//	@RequestMapping("/")
//	public String Home() {
//		return "index";
//	}
//	
//	//maodel map
//	@RequestMapping("add")
//	public String add(@RequestParam ("num1") int i, @RequestParam ("num2") int j, ModelMap m) {
//		int num3 = i+j;
//		m.addAttribute("num3", num3);
//		return "result";
//	}
//	
//	// without using model attribute
//	@RequestMapping("addAlien")
//	public String addAlien(Alien a) {
//		return "result";
//	}
	
	// we can assign different values here
//	@RequestMapping("addAlien")
//	public String addAlien(@ModelAttribute("a1") Alien a, Model m) {
//	
//		m.addAttribute("alien", a);
//		return "result";
//	}
	
//	@RequestMapping("addAlien")
//	public String addAlien(@ModelAttribute Alien a, Model m) {
//	
//		m.addAttribute("alien", a);
//		return "result";
//	}
}


// Need Of Model Attribute
//package com.swechchha.springmvcboot;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.swechchha.springmvcboot.model.Alien;
//
//@Controller
//public class HomeController{
//	@RequestMapping("/")
//	public String Home() {
//		return "index";
//	}
//	
//	//maodel map
//	@RequestMapping("add")
//	public String add(@RequestParam ("num1") int i, @RequestParam ("num2") int j, ModelMap m) {
//		int num3 = i+j;
//		m.addAttribute("num3", num3);
//		return "result";
//	}
//	
//	@RequestMapping("addAlien")
//	public String addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, Model m) {
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
//		m.addAttribute("alien", a);
//		return "result";
//	}
//}


// Model and Model Map
//package com.swechchha.springmvcboot;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class HomeController{
//	@RequestMapping("/")
//	public String Home() {
//		return "index";
//	}
//	
//	//maodel map
//	@RequestMapping("add")
//	public String add(@RequestParam ("num1") int i, @RequestParam ("num2") int j, ModelMap m) {
//		int num3 = i+j;
//		m.addAttribute("num3", num3);
//		return "result";
//	}
	
//	@RequestMapping("add")
//	public String add(@RequestParam ("num1") int i, @RequestParam ("num2") int j, Model m) {
//		int num3 = i+j;
//		m.addAttribute("num3", num3);
//		return "result";
//	}
//}

// suffix and prefix
//package com.swechchha.springmvcboot;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HomeController{
//	@RequestMapping("/")
//	public String home() {
//		return "index";
//	}
//	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int i,@RequestParam ("num2") int j) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		int num3 = i+j;
//		mv.addObject("num3", num3);
//		return mv;
//	}
//}


// Spring MVC request ModelAndView

//package com.swechchha.springmvcboot;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class HomeController{
//	@RequestMapping("/")
//	public String home() {
//		return "index.jsp";
//	}
//	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int i,@RequestParam ("num2") int j) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result.jsp");
//		int num3 = i+j;
//		mv.addObject("num3", num3);
//		return mv;
//	}
//}

// Spring MVC request Param
//package com.swechchha.springmvcboot;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import jakarta.servlet.http.HttpSession;
//@Controller
//public class HomeController{
//	@RequestMapping("/")
//	public String home() {
//		System.out.println("Welcome to home page");
//		return "index.jsp";
//	}
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session) {
//		int num3 = i+j;
//		session.setAttribute("num3", num3);
//		return "result.jsp";
//	}
//}



//package com.swechchha.springmvcboot;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;
//
//
//@Controller
//public class HomeController {
//	@RequestMapping("/")
//	public String home() {	
//		return "index.jsp";
//	}
////	public void home() {
////		System.out.println("Home page requested");		
////	}
//	
//	@RequestMapping("add")
//	public String add(HttpServletRequest req) {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int num3 =i+j;
//		HttpSession session =req.getSession();
//		session.setAttribute("num3", num3);
//		return "result.jsp";
//	}
//	
//
//}
