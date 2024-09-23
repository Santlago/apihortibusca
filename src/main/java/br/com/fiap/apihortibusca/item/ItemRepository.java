package br.com.fiap.apihortibusca.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByNameContainingIgnoreCase(String name);

    List<Item> findByCategory(Category category);

    @Query("SELECT i FROM Item i ORDER BY i.name ASC")
    List<Item> findAllOrderedByName();

    @Query("SELECT i FROM Item i ORDER BY i.price ASC")
    List<Item> findAllOrderedByPriceAsc();

    @Query("SELECT i FROM Item i ORDER BY i.price DESC")
    List<Item> findAllOrderedByPriceDesc();
}
