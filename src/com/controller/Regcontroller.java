package com.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.dao.Regdao;
import com.vo.Regvo;

@Controller
public class Regcontroller {
	@Autowired
	Regdao d=new Regdao();
	
	
	@RequestMapping(value="load.html" , method=RequestMethod.GET)
	public ModelAndView load()
	{
		return new ModelAndView("sregistration","data",new Regvo());
	}
	
	
	
	@RequestMapping(value="save.html" , method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute Regvo vo)
	{
		
		d.insert(vo);
		return  new ModelAndView("search","data",new Regvo());
		
	}
	
	

	@RequestMapping(value="search.html" , method=RequestMethod.POST)
	public ModelAndView search(@ModelAttribute Regvo vo)
	{
		
		List ls=d.search(vo);
		return  new ModelAndView("searchData","data",ls);
		
	}
	
	
	
	@RequestMapping(value="delete.html" , method=RequestMethod.GET)
	public ModelAndView delete(@ModelAttribute Regvo vo,HttpServletRequest req)
	{
		int i=Integer.parseInt(req.getParameter("id1"));
		vo.setId(i);
		d.delete(vo);
	
		return  new ModelAndView("search","data",new Regvo());
		
	}
	
	@RequestMapping(value="editload.html" , method=RequestMethod.GET)
	public ModelAndView editload(@ModelAttribute Regvo vo,HttpServletRequest req)
	{
		int i=Integer.parseInt(req.getParameter("id2"));
		vo.setId(i);
		List ls=d.edit(vo);
	
		return  new ModelAndView("edit","data1",new Regvo()).addObject("data",ls);
		
	}
	
	@RequestMapping(value="edit.html" , method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute Regvo vo)
	{
		
		d.update(vo);
	
		return  new ModelAndView("edit","data1",new Regvo());
		
	}
}
