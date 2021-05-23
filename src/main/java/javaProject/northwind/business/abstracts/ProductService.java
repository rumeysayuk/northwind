package javaProject.northwind.business.abstracts;

import javaProject.northwind.core.Utilities.results.DataResult;
import javaProject.northwind.core.Utilities.results.Result;
import javaProject.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    Result add(Product product);
    Result delete(Product product);

    DataResult<List<Product>> getAll();


}
