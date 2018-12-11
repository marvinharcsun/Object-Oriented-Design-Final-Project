package com.example.demo;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import org.junit.Before;
import org.junit.Test;
import com.example.demo.repository.OrderAnalyRepo;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.OrderAnaylisis;


public class OrderAnaylsisTest extends HerokuExampleApplicationTest {
  
   @Autowired
   OrderAnalyRepo orderRepo;

   @Override
   @Before
   public void setUp() {
  OrderAnaylisis order = new OrderAnaylisis();
 order.setId(10);
 order.setUID(1);
 order.setEvalSet("prior");
 order.setOrderNum(10);
 order.setOrderDow(1);
 order.setOrderHour(10);
 order.setDaysSincePrior(3);
  super.setUp();
   }
  @Test
   public void getOrderAnalysis() throws Exception {
      String uri = "/order_details";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
    int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);

   } 
    @Test
   public void updateOrderAnalysis() throws Exception {
   	OrderAnaylisis analy = new OrderAnaylisis();
   	 analy.setOrderNum(5);

} 
  @Test
   public void deleteOrderAnaly() throws Exception {
        //test with product id
    /*
      String uri = "/order_metadata/{id}";
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
      int status = mvcResult.getResponse().getStatus();
      assertEquals(200, status);
     
*/
} 
 }