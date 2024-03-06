package com.Learning.springbootlearning;

import com.latha.springweb.ProductrestapiApplication;
import com.latha.springweb.entites.Product;
import com.latha.springweb.repos.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest(classes = ProductrestapiApplication.class)
@WebMvcTest
public class ProductRestControllerMvcTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductRepository repository;

    @Test
    public void testFindAll() throws Exception {
        Product product = new Product();
        product.setId("1");
        product.setName("MacBook");
        product.setDescription("wow");
        product.setPrice(3000);

        List<Product> products = Arrays.asList(product);
        when(repository.findAll()).thenReturn(products);

        mockMvc.perform(get("/productapi/products").contextPath("/productapi"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id':1,name:'Mac','description':'its Aswsome','price':100"));
    }
}
