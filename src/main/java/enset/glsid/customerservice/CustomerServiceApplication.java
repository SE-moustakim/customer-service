package enset.glsid.customerservice;

import enset.glsid.customerservice.dao.CustomerRepository;
import enset.glsid.customerservice.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Autowired
	CustomerRepository customerRepository;
	private void initCustomers(){
		String[] customers = {"oussama", "salah", "zaki", "ilyass", "omar"};
		for(String name : customers){
			Customer customer = new Customer();
			customer.setName(name);
			customer.setEmail(name+"@gmail.com");
			customerRepository.save(customer);
		}
	}

	@Override
	public void run(String... args) throws Exception {
                           initCustomers();
	}
}
