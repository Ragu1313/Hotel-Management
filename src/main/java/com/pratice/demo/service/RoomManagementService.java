package com.pratice.demo.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.demo.entity.RoomManagement;
import com.pratice.demo.repository.RoomManagementRepository;
@Service
public class RoomManagementService {
	    
		@Autowired
		private RoomManagementRepository roomManagementrepository;
	    
	    
		public Optional<RoomManagement> getRoomByflag(int roomStatus){
			Optional<RoomManagement> roomManagement= roomManagementrepository.findFirstByRoomStatus(roomStatus);
			if(roomManagement.isPresent()) {
				return roomManagement;
			}
			else {
				return null;
			}
		}


		public void save(RoomManagement room) {
			roomManagementrepository.save(room);
		}
		 @Transactional
		public void checkout() {
			roomManagementrepository.updateTable();
		}

}
