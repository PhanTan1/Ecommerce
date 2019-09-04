package be.bt.repository;

import be.bt.model.OrderProduct;
import be.bt.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
