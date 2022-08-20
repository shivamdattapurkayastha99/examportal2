package com.shivam.portal.exam.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.shivam.portal.exam.entity.User;
import com.shivam.portal.exam.repositery.UserRepositery;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

	private final UserRepositery userRepositery;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User findByUsername = userRepositery.findByUsername(username).get();

		if (findByUsername == null)
			throw new UsernameNotFoundException("No user found ||");

		return findByUsername;
	}

}
