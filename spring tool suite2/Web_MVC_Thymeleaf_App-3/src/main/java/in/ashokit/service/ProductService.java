package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.ProductEntity;
import in.ashokit.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
