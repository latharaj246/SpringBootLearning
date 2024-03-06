package com.Learning.springbootlearning;

import com.latha.springweb.ProductrestapiApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductrestapiApplication.class)
class SpringbootlearningApplicationTests {

	@Autowired
	Job job;
	@Autowired
	JobLauncher launcher;
//
//@Value("produtrestapi.services.url")
//private String baseURL;
//	@Test
//	public void testGetProduct() {
//		RestTemplate restTemplate = new RestTemplate();
//		Product product = restTemplate.getForObject(baseURL+"1" , Product.class);
//       assertEquals("IPhone",product.getName());
//
//
//	}
//
//	@Test
//	public void testCreateProduct() {
//		RestTemplate restTemplate = new RestTemplate();
//		Product product = new Product();
//		product.setName("SamSung");
//		product.setDescription("Awesome");
//		product.setPrice(2000);
//		Product newproduct = restTemplate.postForObject(baseURL ,product, Product.class);
//		assertNotNull(newproduct.getId());
//		assertEquals("SamSung",newproduct.getName());
//	}
//
//
//	@Test
//	public void testUpdateProduct() {
//		RestTemplate restTemplate = new RestTemplate();
//		Product product = restTemplate.getForObject(baseURL+"1" , Product.class);
//		product.setPrice(1400);
//		 restTemplate.put(baseURL , product);
//	}

	@Test
	void testBatch() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		JobParameters jobParameters = new JobParametersBuilder().toJobParameters();
		launcher.run(job,jobParameters);
	}


}