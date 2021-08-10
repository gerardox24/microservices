package com.baufest.store.product;

import com.baufest.store.product.entity.Category;
import com.baufest.store.product.entity.Product;
import com.baufest.store.product.repository.ProductRepository;
import com.baufest.store.product.service.ProductService;
import com.baufest.store.product.service.ProductServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;

@SpringBootTest
public class ProductServiceMockTest {
    @Mock
    private ProductRepository productRepository;

    private ProductService productService;

    @BeforeEach
    private void setup() {
        MockitoAnnotations.initMocks(this);
        productService = new ProductServiceImpl(productRepository);
        Product computer = Product.builder()
                .id(1L)
                .name("computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("5"))
                .price(Double.parseDouble("12.5"))
                .status("Created")
                .createAt(new Date())
                .build();

        Mockito.when(productRepository.findById(1L))
                .thenReturn(Optional.of(computer));

        Mockito.when(productRepository.save(computer))
                .thenReturn(computer);
    }

    @Test
    public void whenValidGetID_thenReturnProduct() {
        Product product = productService.getProduct(1L);
        Assertions.assertThat(product.getName()).isEqualTo("computer");
    }

    @Test
    public void whenValidUpdateStock_thenReturnNewStock() {
        Product product = productService.updateStock(1L, Double.parseDouble("8"));
        Assertions.assertThat(product.getStock()).isEqualTo(13);
    }
}
