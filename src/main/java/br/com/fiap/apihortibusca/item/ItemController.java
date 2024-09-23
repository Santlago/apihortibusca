package br.com.fiap.apihortibusca.item;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;
    private final ItemRepository itemRepository;

    public ItemController(ItemService itemService, ItemRepository itemRepository) {
        this.itemService = itemService;
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public List<Item> findAll(@RequestParam(required = false) String order,
                              @RequestParam(required = false) String category) {
        if (category != null) {
            Category categoryEnum = Category.valueOf(category.toUpperCase());
            return itemService.findByCategory(categoryEnum);
        } else if ("name".equalsIgnoreCase(order)) {
            return itemService.findAllOrderedByName();
        } else if ("priceAsc".equalsIgnoreCase(order)) {
            return itemService.findAllOrderedByPriceAsc();
        } else if ("priceDesc".equalsIgnoreCase(order)) {
            return itemService.findAllOrderedByPriceDesc();
        }
        return itemService.findAll();
    }

    @PostMapping
    public ResponseEntity<Item> create (@RequestBody Item item, UriComponentsBuilder uriBuilder) {
        var varItem = itemService.create(item);
        var uri = uriBuilder
                .path("/items/{id}")
                .buildAndExpand(item.getId())
                .toUri();

        return ResponseEntity.created(uri).body(varItem);
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable Long id) {
        return itemService.findById(id);
    }

    @GetMapping("/search")
    public List<Item> findByName(@RequestParam String name) {
        return itemRepository.findByNameContainingIgnoreCase(name);
    }
}
