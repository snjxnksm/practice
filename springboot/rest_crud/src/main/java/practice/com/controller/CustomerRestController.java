package practice.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import practice.com.entity.Customer;
import practice.com.service.CustomerService;

@RestController
@RequestMapping("api/customer")
public class CustomerRestController {
    @Autowired    //
    CustomerService service;    //

    // 顧客全件取得
    @RequestMapping(method=RequestMethod.GET)    //
    public List<Customer> getCustomer() {
        return service.findAll();
    }

    // 顧客一件取得
    @RequestMapping(method=RequestMethod.GET, value="{id}")    //
    public Customer getCustomer(@PathVariable Integer id) {
        return service.findOne(id);
    }

    // 顧客一件作成
    @RequestMapping(method=RequestMethod.POST)    //
    @ResponseStatus(HttpStatus.CREATED)    //
    public Customer postCustomer(@RequestBody Customer customer) {
        return service.create(customer);
    }

    // 顧客一件更新
    @RequestMapping(method=RequestMethod.PUT, value="{id}")    //
    public Customer putCustomer(@PathVariable Integer id,
                                @RequestBody Customer customer) {
        customer.setId(id);
        return service.update(customer);
    }

    // 顧客一件削除
    @RequestMapping(method=RequestMethod.DELETE, value="{id}")    //
    @ResponseStatus(HttpStatus.NO_CONTENT)    //
    public void deleteCustomer(@PathVariable Integer id) {
        service.delete(id);
    }

}
