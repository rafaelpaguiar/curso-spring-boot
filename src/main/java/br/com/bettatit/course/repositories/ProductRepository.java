package br.com.bettatit.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bettatit.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
