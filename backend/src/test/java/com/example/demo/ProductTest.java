package com.example.demo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import org.junit.Before;
import org.junit.Test;
import com.example.demo.repository.ProductRepo;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.ProductModel;


public class ProductTest extends HerokuExampleApplicationTest {
  
   @Autowired
   ProductRepo prodRepo;

   @Override
   @Before
   public void setUp() {
    ProductModel product= new ProductModel();
    product.setId(100L);
    product.setTitle("milanese");
    product.setPrice(100.00);
    product.setActive(true);
    product.setAisleId(1);
    product.setDepartmentId(1);
      super.setUp();
   }
  @Test
   public void getProducts() throws Exception {
      String uri = "/products";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
    int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);

   } 
    @Test
   public void updateProduct() throws Exception {
   ProductModel product = new ProductModel();
   prodRepo.findById(1L);
   product.setTitle("testing");
  

} 
  @Test
   public void deleteProduct() throws Exception {
        //test with product id
      /*String uri = "/products/{id}";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);*/
     

} 
 }