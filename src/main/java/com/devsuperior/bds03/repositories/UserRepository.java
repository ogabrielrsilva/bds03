package com.devsuperior.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bds03.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
<<<<<<< HEAD
	
	User findByEmail(String email);

=======

	User findByEmail(String email);
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
}
