package com.maq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maq.binding.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
