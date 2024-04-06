package com.in;

import java.sql.Date;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hello {
	@Autowired
    LoginRepo repo;
	
@RequestMapping("/hello1")
public String hello1() {
	System.out.println("In hello1");
	return "about";
}
@RequestMapping("/index")
public String index() {
	return "index";
}
@RequestMapping("/about")
public String about() {
	return "about";
}
@RequestMapping("/services")
public String service() {
	return "service";
}
@RequestMapping("/hello2")
public ModelAndView hello2(@RequestParam("name") String myname) {
	ModelAndView mv = new ModelAndView("home");
	mv.addObject("name",myname);
//	mv.setViewName("home");
	return mv;
}
@RequestMapping("/first")
public String first() {
	return "home";
}
@RequestMapping("/contact")
public String login() {
	return "contact";
}
@RequestMapping("/addmember")
public ModelAndView addmember( Hotel hotel) {
	ModelAndView mv = new ModelAndView();
	int flag=0;
	LocalDate currentDate = LocalDate.now();
	Date givenDateString = hotel.getDate();
	Date date = java.sql.Date.valueOf(currentDate);
	int comparisonResult = givenDateString.compareTo(date);
    if(comparisonResult>0){
        flag = 1;
    } 
    if(flag==1) {
	repo.save(hotel);
	mv.addObject("id",hotel.getRoomno());
	mv.setViewName("successful");
	return mv;
    }
    else {
      mv.setViewName("fail");
      return mv;
    }   
}
}