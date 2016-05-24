package practice.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import practice.com.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
