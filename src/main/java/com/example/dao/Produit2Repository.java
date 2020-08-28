package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Produit;
@Repository
public interface Produit2Repository extends JpaRepository<Produit, Long> {

}
