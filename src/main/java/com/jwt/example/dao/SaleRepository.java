package com.jwt.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.example.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale,Long> {

}
