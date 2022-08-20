package com.shivam.portal.exam.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.portal.exam.entity.Role;

@Repository
public interface RoleRepositery extends JpaRepository<Role, Long>{

}
