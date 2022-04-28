package com.dcarlosweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcarlosweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
