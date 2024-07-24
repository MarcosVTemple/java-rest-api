package com.temple.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temple.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
