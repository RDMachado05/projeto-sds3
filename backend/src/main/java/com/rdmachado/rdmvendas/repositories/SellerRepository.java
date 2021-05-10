package com.rdmachado.rdmvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdmachado.rdmvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
