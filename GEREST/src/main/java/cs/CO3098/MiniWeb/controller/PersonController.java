package cs.CO3098.MiniWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cs.CO3098.MiniWeb.domain.Person;
import cs.CO3098.MiniWeb.service.PersonService;

@Controller
@RequestMapping(value = {"/person"})
public class PersonController {
	
	
	@Autowired 
	PersonService as;
	
	@RequestMapping(value = {"/listAll"}) public ModelAndView listAll(Model model){
	System.out.println(as.findAllPeople());
	return new ModelAndView("listAll","accounts",as.findAllPeople()); }
	
	@RequestMapping(value = {"/listAllJson"})
	public @ResponseBody Object listAllJson(Model model){
	Object o=as.findAllPeople();
	return o; }
	
	@RequestMapping(value = "/create") public ModelAndView create(){
	return new ModelAndView("create"); }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST) public ModelAndView save(Person a){
	as.save(a);
	return new ModelAndView("redirect:listAll");
	}
	
	@RequestMapping(value = "/edit/{id}")
	public ModelAndView edit(@PathVariable Integer id){
	return new ModelAndView("edit","account",as.findByKey(id)); }
	
	@RequestMapping(value = "/delete/{id}")
	public ModelAndView delete(@PathVariable Integer id){
	as.deleteByKey(id);
	return new ModelAndView("redirect:../listAll"); }
	
	@RequestMapping(value = "/update",method = RequestMethod.POST) public ModelAndView update(Person acc){
	as.save(acc);
	return new ModelAndView("redirect:listAll"); }
	
	

}
