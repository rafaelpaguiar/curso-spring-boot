package br.com.bettatit.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bettatit.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
