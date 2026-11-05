package startup.vn.sampleservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import startup.vn.sampleservice.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
