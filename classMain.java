public class classMain {
    public static void main (String[] args){
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);
        Customer customer = service.getCustomer("123");
        System.out.println(customer.name);

    }
}


class Customer{
    String id;
    String name;

    Customer(String id, String name){
        this.id = id;
        this.name = name;
    }
}

interface CustomerRepository{
    Customer findby(String id);
}

class CustomerRepositoryImpl implements  CustomerRepository{
    @Override
    public Customer findby(String id){
        return new Customer("123", "Roshan Xavier");
    }

}

class CustomerService{
    private CustomerRepository customerRepository;
    CustomerService(CustomerRepository customerRepository){
        this.customerRepository =customerRepository;
    }
    Customer getCustomer(String id){
        return customerRepository.findby(id);
    }
}





