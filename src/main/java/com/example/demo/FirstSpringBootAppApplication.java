package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.Produit2Repository;
//import com.example.dao.ProduitRepository;
import com.example.entities.Produit;


@SpringBootApplication
public class FirstSpringBootAppApplication{
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootAppApplication.class, args);
		Produit2Repository produitRepository = context.getBean(Produit2Repository.class);
		produitRepository.save(new Produit("Laptop Dell", 35000, 50));
		produitRepository.save(new Produit("Laptop HP", 15000, 20));
		produitRepository.save(new Produit("Laptop Asus", 55000, 15));
		produitRepository.save(new Produit("Imprimante Laser", 60000, 25));
		produitRepository.save(new Produit("Velo", 50000, 50));
		
		produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));
	}

}
