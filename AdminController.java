package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Staff.Staff;
import com.example.demo.Staff.StaffService;

@Controller
public class AdminController 
{

	@Autowired
	AdminService as;
	
	@Autowired
	StaffService sd;
	
	@RequestMapping("/")
	public String one()
	{
		return "index";
		
	}
	
	
	@PostMapping("/savedata")
	public String getdata(@ModelAttribute("at") Admin at)
	{
		as.registerdata(at);
		return "redirect:/welcome";
	}
	
	
	@RequestMapping("/welcome")
	public String two(ModelMap m)
	{
		List<Admin> ap=as.getallinfo();
		
		m.addAttribute("k",ap);
		return "welcome";
		
	}
	
	
	@GetMapping("/del/{id}")
	public String deldata(@PathVariable int id)
	{
		as.deld(id);
		return "redirect:/welcome";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editdata(@PathVariable int id,ModelMap m)
	{
	
		Admin s=as.getSingleInfo(id);
		m.addAttribute("s", s);
		return "edit";
		
	}
	
	
	@RequestMapping("/update")
	public String update(@ModelAttribute("a2") Admin a2)
	{
		as.updatedata(a2);
		return "redirect:/welcome";
		
	}
	
	/* Staff Process Start*/
	
	@RequestMapping("/staffregister")
	public String p()
	{
		return "staffregister";
		
	}
	
	@PostMapping("/staffreg")
	public String getdata1(@ModelAttribute("s2") Staff s2)
	{
		sd.registerdata(s2);
		return "redirect:/staffdisplay";
	}
	
	
	@RequestMapping("/staffdisplay")
	public String display(ModelMap m)
	{
		List<Staff> ap=sd.getallinfo();
		m.addAttribute("k", ap);
		return "staffdisplay";
		
	}
	
	
	@GetMapping("/del1/{id}")
	public String deldata2(@PathVariable int id)
	{
		sd.deld1(id);
		return "redirect:/staffdisplay";
		
	}
	
	
	@GetMapping("/edit1/{id}")
	public String editdata2(@PathVariable int id,ModelMap m)
	{
		Staff s=sd.getSingleInfo(id);
		m.addAttribute("s", s);
		return "editstaff";
		
	}
	
	
	@RequestMapping("/up")
	public String updatestaff(@ModelAttribute("s2") Staff s2)
	{
		sd.updatedata2(s2);
		return "redirect:/staffdisplay";
		
	}
}

