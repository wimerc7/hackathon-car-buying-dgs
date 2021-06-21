package com.capitalone.auto.hackathoncarbuyingdgs.repository;

import com.capitalone.auto.hackathoncarbuyingdgs.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
