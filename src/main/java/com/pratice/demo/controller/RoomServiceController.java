package com.pratice.demo.controller;
import com.pratice.demo.entity.RoomService;
import com.pratice.demo.service.RoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Service")
public class RoomServiceController {

    @Autowired
    private RoomServices roomServices;
    @PutMapping("/add")
    public ResponseEntity<String> addService(@RequestBody RoomService roomService) {
        return roomServices.save(roomService);
    }

}
