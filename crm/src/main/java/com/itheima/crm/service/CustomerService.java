package com.itheima.crm.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.itheima.crm.domain.Customer;

/**  
 * ClassName:CustomerService <br/>  
 * Function:  <br/>  
 * Date:     Nov 5, 2017 7:42:11 PM <br/>       
 */
public interface CustomerService {
        @GET
        @Path("/customer")
        @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
        public List<Customer> findAll();
}
  
