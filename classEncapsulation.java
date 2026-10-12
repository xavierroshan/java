
public class classEncapsulation {
    public static void main (String[] args){
        CIBCAccount account = new CIBCAccount();
        account.putName("Roshan Xavier");
        account.putAccountID("20917");
        account.putBalance(5000);
        System.out.println(account.getBalance());
        account.putAccountType("Checking");
        account.putMoney(2000);
        System.out.println(account.getBalance());
        account.takeMoney(1000);
        System.out.println(account.getName());
        System.out.println(account.getAccountID());
        System.out.println(account.getAccountType());
        System.out.println(account.getBalance());




    }
}

class CIBCAccount {
    private String name;
    private String accountId;
    private double balance;
    private String accountType;
    private double deposit;
    private double withdraw;

    public void putName(String name){
        this.name =name;
    }
    public String getName(){
        return this.name;
    }

    public void putAccountID(String accountId){
        this.accountId =accountId;
    }
    public String getAccountID(){
        return this.accountId;
    }

    public void putAccountType(String accountType){
        this.accountType =accountType;
    }
    public String getAccountType(){
        return this.accountType;
    }

    public void putBalance(double balance){
        this.balance =balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void putMoney(double deposit){
        this.balance = this.balance+deposit;
    }

    public void takeMoney(double withdraw){
        if (this.balance < withdraw) {
            throw new IllegalArgumentException("Your withdrawal amount should be less than the balance !");
        }
        else {
            this.balance = this.balance-withdraw;
        }
    }




}





//Level 3 — Inheritance
//11. Create Animal and Dog
//Problem
//
//Create:
//
//Animal
//  |
//          +--- Dog
//
//Animal should have:
//
//eat()
//
//Dog should have:
//
//bark()
//Answer
//class Animal {
//
//    void eat() {
//        System.out.println("Animal is eating");
//    }
//}
//
//class Dog extends Animal {
//
//    void bark() {
//        System.out.println("Dog is barking");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Dog dog = new Dog();
//
//        dog.eat();
//        dog.bark();
//    }
//}
//Output
//Animal is eating
//Dog is barking
//        Concept
//
//Inheritance
//
//class Dog extends Animal
//
//means:
//
//Dog inherits functionality from Animal.
//
//12. Employee inheritance
//Problem
//
//Create:
//
//Employee
//   |
//           +--- Manager
//   |
//           +--- Developer
//
//Employee has:
//
//name
//work()
//
//Manager and Developer should have their own behavior.
//
//Answer
//class Employee {
//
//    String name;
//
//    void work() {
//        System.out.println("Employee is working");
//    }
//}
//
//class Manager extends Employee {
//
//    void manageTeam() {
//        System.out.println(name + " is managing the team");
//    }
//}
//
//class Developer extends Employee {
//
//    void writeCode() {
//        System.out.println(name + " is writing code");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Manager manager = new Manager();
//
//        manager.name = "John";
//        manager.work();
//        manager.manageTeam();
//
//        Developer developer = new Developer();
//
//        developer.name = "Mary";
//        developer.work();
//        developer.writeCode();
//    }
//}
//13. Method overriding
//Problem
//
//Create an Animal class:
//
//makeSound()
//
//Create:
//
//Dog
//        Cat
//
//Each animal should implement makeSound() differently.
//
//Answer
//class Animal {
//
//    void makeSound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//
//    @Override
//    void makeSound() {
//        System.out.println("Woof");
//    }
//}
//
//class Cat extends Animal {
//
//    @Override
//    void makeSound() {
//        System.out.println("Meow");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Dog dog = new Dog();
//        dog.makeSound();
//
//        Cat cat = new Cat();
//        cat.makeSound();
//    }
//}
//Concept
//
//Method overriding
//
//Child classes replace the parent's implementation.
//
//        14. Polymorphism
//        Problem
//
//Use the previous Animal, Dog, and Cat classes.
//
//Create:
//
//Animal animal
//
//but store a Dog inside it.
//
//Answer
//class Animal {
//
//    void makeSound() {
//        System.out.println("Animal sound");
//    }
//}
//
//class Dog extends Animal {
//
//    @Override
//    void makeSound() {
//        System.out.println("Woof");
//    }
//}
//
//class Cat extends Animal {
//
//    @Override
//    void makeSound() {
//        System.out.println("Meow");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Animal animal1 = new Dog();
//        Animal animal2 = new Cat();
//
//        animal1.makeSound();
//        animal2.makeSound();
//    }
//}
//Output
//        Woof
//Meow
//
//This is extremely important.
//
//Animal animal1 = new Dog();
//
//means:
//
//Reference type       Actual object
//     ↓                    ↓
//Animal                Dog
//
//Java looks at the actual object when deciding which overridden method to execute.
//
//This is polymorphism.
//
//        Level 4 — Abstraction
//15. Abstract class
//Problem
//
//Create an abstract Shape class.
//
//It should have:
//
//calculateArea()
//
//Create:
//
//Circle
//        Rectangle
//
//Each should calculate its own area.
//
//Answer
//abstract class Shape {
//
//    abstract double calculateArea();
//}
//
//class Circle extends Shape {
//
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    double calculateArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Rectangle extends Shape {
//
//    double length;
//    double width;
//
//    Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    @Override
//    double calculateArea() {
//        return length * width;
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Shape circle = new Circle(5);
//
//        Shape rectangle = new Rectangle(10, 5);
//
//        System.out.println(circle.calculateArea());
//        System.out.println(rectangle.calculateArea());
//    }
//}
//Concept
//
//        Abstraction
//
//We say:
//
//Every Shape must know how to calculate its area.
//
//But we don't specify the implementation in Shape.
//
//        16. Interface
//        Problem
//
//Create an interface:
//
//Payment
//
//with:
//
//pay()
//
//Create:
//
//CreditCardPayment
//        PayPalPayment
//Answer
//interface Payment {
//
//    void pay(double amount);
//}
//
//class CreditCardPayment implements Payment {
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Paid $" + amount + " using Credit Card");
//    }
//}
//
//class PayPalPayment implements Payment {
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Paid $" + amount + " using PayPal");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Payment payment1 = new CreditCardPayment();
//
//        Payment payment2 = new PayPalPayment();
//
//        payment1.pay(100);
//        payment2.pay(200);
//    }
//}
//Concept
//
//Interface + Polymorphism
//
//Very common in Spring Boot.
//
//        Payment payment = new CreditCardPayment();
//
//Later you can change it to:
//
//Payment payment = new PayPalPayment();
//
//without changing the code that calls:
//
//        payment.pay();
//Level 5 — Composition
//17. Car has an Engine
//Problem
//
//Create:
//
//Car
// |
//         +--- Engine
//
//A Car should contain an Engine.
//
//Answer
//class Engine {
//
//    void start() {
//        System.out.println("Engine started");
//    }
//}
//
//class Car {
//
//    private Engine engine;
//
//    Car() {
//        engine = new Engine();
//    }
//
//    void startCar() {
//
//        engine.start();
//
//        System.out.println("Car started");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Car car = new Car();
//
//        car.startCar();
//    }
//}
//Output
//Engine started
//Car started
//Concept
//
//        Composition
//
//A Car has an Engine.
//
//        Compare:
//
//Dog IS-A Animal
//
//→ inheritance
//
//Car HAS-A Engine
//
//→ composition
//
//18. Product + Category
//        Problem
//
//Create:
//
//Category
//        Product
//
//A Product should have a Category.
//
//Example:
//
//Product:
//name = "iPhone"
//price = 999
//
//Category:
//name = "Electronics"
//Answer
//class Category {
//
//    String name;
//
//    Category(String name) {
//        this.name = name;
//    }
//}
//
//class Product {
//
//    String name;
//    double price;
//    Category category;
//
//    Product(String name, double price, Category category) {
//
//        this.name = name;
//        this.price = price;
//        this.category = category;
//    }
//
//    void printProduct() {
//
//        System.out.println("Product: " + name);
//        System.out.println("Price: $" + price);
//        System.out.println("Category: " + category.name);
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Category category = new Category("Electronics");
//
//        Product product =
//                new Product("iPhone", 999, category);
//
//        product.printProduct();
//    }
//}
//Concept
//
//This is a very common real-world OOP relationship:
//
//Product
//   |
//           +---- Category
//19. Repository Pattern
//
//This one is particularly useful for your Spring Boot learning.
//
//Problem
//
//Create:
//
//Customer
//        CustomerRepository
//CustomerService
//
//The service should retrieve a customer through the repository.
//
//        Answer
//class Customer {
//
//    int id;
//    String name;
//
//    Customer(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}
//
//Repository:
//
//interface CustomerRepository {
//
//    Customer findById(int id);
//}
//
//Implementation:
//
//class CustomerRepositoryImpl implements CustomerRepository {
//
//    @Override
//    public Customer findById(int id) {
//
//        return new Customer(id, "John");
//    }
//}
//
//Service:
//
//class CustomerService {
//
//    private CustomerRepository customerRepository;
//
//    CustomerService(CustomerRepository customerRepository) {
//
//        this.customerRepository = customerRepository;
//    }
//
//    Customer getCustomer(int id) {
//
//        return customerRepository.findById(id);
//    }
//}
//
//Main:
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        CustomerRepository repository =
//                new CustomerRepositoryImpl();
//
//        CustomerService service =
//                new CustomerService(repository);
//
//        Customer customer =
//                service.getCustomer(101);
//
//        System.out.println(customer.name);
//    }
//}
//Output
//        John
//Important OOP concepts
//
//You just used:
//
//Interface
//    ↓
//Implementation
//    ↓
//Dependency Injection
//    ↓
//Service
//
//This is very similar to what you'll see in Spring Boot.
//
//        20. Mini E-Commerce System
//
//This final exercise combines almost everything.
//
//Problem
//
//Build a simple shopping system.
//
//        Create:
//
//Product
//        ShoppingCart
//
//The cart should be able to:
//
//addProduct()
//calculateTotal()
//Answer
//class Product {
//
//    private String name;
//    private double price;
//
//    Product(String name, double price) {
//
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//}
//
//Shopping cart:
//
//        import java.util.ArrayList;
//import java.util.List;
//
//class ShoppingCart {
//
//    private List<Product> products;
//
//    ShoppingCart() {
//
//        products = new ArrayList<>();
//    }
//
//    void addProduct(Product product) {
//
//        products.add(product);
//    }
//
//    double calculateTotal() {
//
//        double total = 0;
//
//        for (Product product : products) {
//
//            total = total + product.getPrice();
//        }
//
//        return total;
//    }
//}
//
//Main:
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Product laptop =
//                new Product("Laptop", 1500);
//
//        Product mouse =
//                new Product("Mouse", 50);
//
//        Product keyboard =
//                new Product("Keyboard", 100);
//
//        ShoppingCart cart =
//                new ShoppingCart();
//
//        cart.addProduct(laptop);
//        cart.addProduct(mouse);
//        cart.addProduct(keyboard);
//
//        System.out.println(
//                "Total = $" + cart.calculateTotal()
//        );
//    }
//}
//Output
//        Total = $1650.0
//The 20 problems in learning order
//
//I recommend doing them in exactly this order:
//
//        #	Problem	Main OOP concept
//1	Car	Class/Object
//2	Student	Multiple objects
//3	Dog	Methods
//4	Bank Account	Object behavior
//5	Person	Constructor
//6	Bank Account	Encapsulation
//7	Employee	Getters/Setters
//8	Product	Validation
//9	Rectangle	Return values
//10	Calculator	Multiple methods
//11	Animal/Dog	Inheritance
//12	Employee/Manager	Inheritance
//13	Animal sounds	Method overriding
//14	Animal polymorphism	Polymorphism
//15	Shape	Abstract class
//16	Payment	Interface
//17	Car/Engine	Composition
//18	Product/Category	Has-A relationship
//19	Customer Repository	Interface + DI
//20	Shopping Cart	Multiple OOP concepts
//The big picture
//
//By the end, you should understand this:
//
//OOP
//                     |
//                             ┌────────────┼────────────┐
//                             ↓            ↓            ↓
//Classes       Objects      Methods
//        |
//                ├── Encapsulation
//        │       └── private + getters/setters
//        │
//                ├── Inheritance
//        │       └── extends
//                │
//                ├── Polymorphism
//        │       ├── overriding
//        │       └── interface references
//        │
//                ├── Abstraction
//        │       ├── abstract class
//        │       └── interface
//        │
//                └── Composition
//                └── HAS-A relationship
//
//For your Java/Spring Boot learning, problems 16, 17, 19 and 20 are especially important, because they start resembling the structure you'll encounter in real Spring applications.