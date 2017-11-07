package com.itheima.crm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itheima.crm.domain.Customer;

/**  
 * ClassName:CustomerRepository <br/>  
 * Function:  <br/>  
 * Date:     Nov 5, 2017 7:49:22 PM <br/>       
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
  
