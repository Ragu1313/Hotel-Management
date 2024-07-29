package com.pratice.demo.controller;

import java.sql.Date;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pratice.demo.entity.RoomManagement;
import com.pratice.demo.entity.UserTable;
import com.pratice.demo.service.RoomManagementService;
import com.pratice.demo.service.UserTableService;

@Controller
public class Homecontroller {
	@Autowired
	private UserTableService usertableservice ;
	@Autowired
	private RoomManagementService roomManagementService; 
    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }
    @RequestMapping("/update")
    public ModelAndView update() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("home");
    	roomManagementService.checkout();
    	return mv;
    }
    @PostMapping("/addmember")
    public ModelAndView signup(@RequestParam("itime") String itime,@RequestParam("otime")String  otime,UserTable userTable) {
    	ModelAndView mv = new ModelAndView();
    	roomManagementService.checkout();
    	Optional<RoomManagement> room1 = roomManagementService.getRoomByflag(0);
    	if(room1.isPresent()) {
    		RoomManagement room = room1.get();
    		mv.addObject("uid",room.getRoomno());
	    	LocalTime itime1 = LocalTime.parse(itime);
	    	LocalTime otime1 = LocalTime.parse(otime);
	    	userTable.setIntime(itime1);
	    	userTable.setOuttime(otime1);
	    	userTable.setRoomno(room.getRoomno());
	    	usertableservice.createUser(userTable);
	    	Date odate = userTable.getOutdate();
	    	room.setAvailableDate(odate);
	    	room.setRoomStatus(1);
	    	roomManagementService.save(room);
	    	mv.setViewName("Thankyoupage");
    	}else {
    		mv.setViewName("Sorry");
    	}
    	return mv;
    }
}
