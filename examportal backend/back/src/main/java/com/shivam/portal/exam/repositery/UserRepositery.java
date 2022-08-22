package com.shivam.portal.exam.repositery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.portal.exam.entity.User;

@Repository
public interface UserRepositery extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String username);
                                                    
	
	
}
