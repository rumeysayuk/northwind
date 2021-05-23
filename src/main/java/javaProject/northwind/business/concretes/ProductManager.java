package javaProject.northwind.business.concretes;

import javaProject.northwind.business.abstracts.ProductService;
import javaProject.northwind.core.Utilities.results.DataResult;
import javaProject.northwind.core.Utilities.results.Result;
import javaProject.northwind.core.Utilities.results.SuccessDataResult;
import javaProject.northwind.core.Utilities.results.SuccessResult;
import javaProject.northwind.dataAccess.abstracts.ProductDao;
import javaProject.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }

    @Override
    public Result delete(Product product) {
        this.productDao.delete(product);
        return new SuccessResult("Ürün silindi");
    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
    }
}
