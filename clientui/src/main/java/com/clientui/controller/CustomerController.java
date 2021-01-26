package com.clientui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientui.beans.CustomerBean;
import com.clientui.proxies.MicroServiceCustomerProxies;

@RestController
@Controller
public class CustomerController {
	
	@Autowired
	private MicroServiceCustomerProxies mscp;


		@PostMapping(value = "/Customers")
		public void add(@RequestBody CustomerBean c) {
			mscp.save(c);
		}

		@GetMapping(value = "/Customers")
		public List<CustomerBean> getAll() {
			return mscp.findAll();
		}

		@GetMapping(value = "/Customers/{id}")
		public CustomerBean findById(@PathVariable long id) {
			return mscp.findOne(id);
		}

		@DeleteMapping(value = "/Customers/{id}")
		public void delete(@PathVariable long id) {
			mscp.delete(id);
		}

}
