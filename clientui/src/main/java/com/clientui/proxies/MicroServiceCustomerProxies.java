package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.CustomerBean;


@FeignClient(name = "microservice-customer", url = "localhost:9093/")
public interface MicroServiceCustomerProxies {
	@GetMapping(value = "/customers")
	public List<CustomerBean> findAll();

	@GetMapping(value = "/customers/{cId}")
	public CustomerBean findOne(@PathVariable("cId") Long id);

	@PostMapping(value = "/customers")
	public CustomerBean save(@RequestBody CustomerBean c);

	@DeleteMapping(value = "/customers/{cId}")
	public void delete(@PathVariable("cId") Long id);

}
