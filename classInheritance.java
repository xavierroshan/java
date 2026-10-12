//public class classInheritance {
//    public static void main (String[] args){
//        Cat cat = new Cat();
//        cat.eat();
//        cat.bark();
//
//    }
//}
//
//
//class Animal{
//    void eat (){
//        System.out.println("Animal is eating");
//    }
//
//}
//
//class Cat extends Animal{
//    void eat(){
//        System.out.println("Cat is eating");
//    }
//    void bark(){
//        System.out.println("Cat is meowing");
//    }
//}

public class classInheritance {
    public static void main (String[] args){
        Manager manager = new Manager();
        Developer developer = new Developer();
        manager.name = "Roshan Xavier";
        developer.name = "Vincent Roshan";
        manager.work();
        manager.manage();
        developer.work();
        developer.develop();
    }
}

class Employee {
    String name;
    void work(){
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    void manage(){
        System.out.printf(name + " is managing people");
        System.out.println();
    }
}


class Developer extends Employee {
    void develop(){
        System.out.printf(name + " is developeling applicaion");
    }
}
