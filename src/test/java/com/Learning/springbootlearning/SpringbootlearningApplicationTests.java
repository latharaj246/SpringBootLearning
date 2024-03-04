package com.Learning.springbootlearning;

import com.latha.springweb.ProductrestapiApplication;
import com.latha.springweb.entites.Product;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductrestapiApplication.class)
class SpringbootlearningApplicationTests {
@Value("produtrestapi.services.url")
private String baseURL;
	@Test
	public void testGetProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseURL+"1" , Product.class);
       assertEquals("IPhone",product.getName());


	}

	@Test
	public void testCreateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("SamSung");
		product.setDescription("Awesome");
		product.setPrice(2000);
		Product newproduct = restTemplate.postForObject(baseURL ,product, Product.class);
		assertNotNull(newproduct.getId());
		assertEquals("SamSung",newproduct.getName());
	}


	@Test
	public void testUpdateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseURL+"1" , Product.class);
		product.setPrice(1400);
		 restTemplate.put(baseURL , product);
	}


}