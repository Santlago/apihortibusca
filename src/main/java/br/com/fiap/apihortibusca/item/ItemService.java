package br.com.fiap.apihortibusca.item;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public Item create(Item item) {
        return itemRepository.save(item);
    }

    public Item findById(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public List<Item> findAllOrderedByName() {
        return itemRepository.findAllOrderedByName();
    }

    public List<Item> findAllOrderedByPriceAsc() {
        return itemRepository.findAllOrderedByPriceAsc();
    }

    public List<Item> findAllOrderedByPriceDesc() {
        return itemRepository.findAllOrderedByPriceDesc();
    }

    public List<Item> findByCategory(Category category) {
        return itemRepository.findByCategory(category);
    }
}
