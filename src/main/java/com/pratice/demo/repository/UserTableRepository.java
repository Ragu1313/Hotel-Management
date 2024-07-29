package com.pratice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pratice.demo.entity.UserTable;

public interface UserTableRepository extends JpaRepository<UserTable,Long>{

	
}
