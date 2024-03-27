package org.xproce.demoadvanced.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.demoadvanced.dao.entities.Command;
import org.xproce.demoadvanced.dao.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
