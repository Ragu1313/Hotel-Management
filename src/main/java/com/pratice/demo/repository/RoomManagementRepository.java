package com.pratice.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.pratice.demo.entity.RoomManagement;

@Repository
public interface RoomManagementRepository extends JpaRepository<RoomManagement,Integer>
,CustomRoomManagementRepository
{
	Optional<RoomManagement> findFirstByRoomStatus(int roomStatus);
//	@Modifying
//	@Transactional
//	@Query("update room_management as u set u.flag=0 where u.available_date< CURRENT_TIMESTAMP")
//	void updateTable();
}
