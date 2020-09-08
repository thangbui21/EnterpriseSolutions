package enterprise.solutions.repository;


import enterprise.solutions.models.Product;

import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

// Một lớp giao diện extends MongoRepository: CURD: Sử dụng các phương thức có sẵn của Mongo
// save(), findOne(), findById(), findAll(), count(), delete(), deleteById()
// Được tự động load trong ProductController
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByProductName(String productName); // Trả về tất cả các sản phẩm có input=productName
}
