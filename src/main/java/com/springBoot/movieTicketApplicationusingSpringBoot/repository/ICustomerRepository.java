package com.springBoot.movieTicketApplicationusingSpringBoot.repository;

import java.util.List;

import com.springBoot.movieTicketApplicationusingSpringBoot.Entity.Customer;
import com.springBoot.movieTicketApplicationusingSpringBoot.exception.CustomerNotFoundException;


public interface ICustomerRepository {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer viewCustomer(int custid) throws CustomerNotFoundException;
	public List<Customer> viewAllCustomers(int movieid);
	public List<Customer> viewCustomerList(int showid);
	//public List<Customer> viewCustomerList(int theatreid);

}
