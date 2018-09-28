package com.vivaticket.repository.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivaticket.repository.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>  {
	
	

}
