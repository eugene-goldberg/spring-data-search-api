package sample.data.jest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Component
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping(value = "/customer/", method = RequestMethod.GET)
    private ResponseEntity<List<Customer>> fetchAllCustomers() {
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : this.repository.findAll()) {
            System.out.println(customer);
            customers.add(customer);
        }
        System.out.println();

        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }
}
