package br.com.bettatit.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bettatit.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
