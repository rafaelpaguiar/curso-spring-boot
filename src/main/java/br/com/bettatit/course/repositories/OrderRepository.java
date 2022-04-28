package br.com.bettatit.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bettatit.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
