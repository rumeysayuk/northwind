package javaProject.northwind.dataAccess.abstracts;

import javaProject.northwind.core.Utilities.results.Result;
import javaProject.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
