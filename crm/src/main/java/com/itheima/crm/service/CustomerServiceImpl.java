package com.itheima.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.crm.dao.CustomerRepository;
import com.itheima.crm.domain.Customer;

/**  
 * ClassName:CustomerServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     Nov 5, 2017 7:47:01 PM <br/>       
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{
     @Autowired
    private CustomerRepository customerRepository;
    
    @Override
    public List<Customer> findAll() {
          
       
        return customerRepository.findAll();
    }

}
  
