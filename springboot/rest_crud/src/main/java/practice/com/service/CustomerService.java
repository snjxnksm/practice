package practice.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import practice.com.entity.Customer;
import practice.com.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
    @Autowired    //
    CustomerRepository repository;    //

    // 顧客全件取得
    public List<Customer> findAll() {    //
        return repository.findAll();
    }

    // 顧客一件取得
    public Customer findOne(Integer id) {    //
        return repository.findOne(id);
    }

    // 顧客一件作成
    public Customer create(Customer customer) {    //
        return repository.save(customer);
    }

    // 顧客一件更新
    public Customer update(Customer customer) {    //
        return repository.save(customer);
    }

    // 顧客一件削除
    public void delete(Integer id) {    //
        repository.delete(id);
    }
}
