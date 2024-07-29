package com.pratice.demo.service;
import com.pratice.demo.entity.RoomService;
import com.pratice.demo.entity.UserTable;
import com.pratice.demo.repository.RoomServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RoomServices{
    @Autowired
    RoomServiceRepository roomServiceRepository;
    @Autowired
    UserTableService userTableService;

    public ResponseEntity<String> save(RoomService roomService) {
        roomServiceRepository.save(roomService);
//        UserTable userTable = userTableService.getUserTable(roomService.getUserId());
//        Double amount = userTable.getRemainingAmount()+roomService.getServicePrice();
//        userTable.setRemainingAmount(amount);
        return new ResponseEntity<>("Updated", HttpStatus.OK);
    }
}
