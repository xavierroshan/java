//
//public class classPolymorphism {
//    public static void main(String[] args){
//        DomesticAnimal animal1 = new Cow();
//        DomesticAnimal animal2 = new Goat();
//        animal1.makesSound();
//        animal2.makesSound();
//
//    }
//}
//
//
//class DomesticAnimal {
//    void makesSound(){
//        System.out.println("Makes a sound");
//    }
//}
//
//class Cow extends DomesticAnimal {
//    @Override //not required but best practise
//    void makesSound(){
//        System.out.println("Makes a Moow");
//    }
//}
//
//class Goat extends DomesticAnimal {
//    @Override //not required but best practise
//    void makesSound(){
//        System.out.println("Makes a Brrr");
//    }
//}


public class classPolymorphism {
    public static void main(String[] args){
        ManagerSal managerSal = new ManagerSal();
        InternSal internSal = new InternSal();
        EmployeeSal employeeSal = new EmployeeSal();
        employeeSal.calculatePayment("Roshan Xavier", 5000);
        managerSal.calculatePayment("Roshan Xavier", 5000);
        internSal.calculatePayment("Vincent Roshan", 5000);
        EmployeeSal employeeSal1 = new ManagerSal();
        employeeSal1.calculatePayment("Daniel Xavier", 10000);
        //employeeSal1.insurance();
        // this line doesnt work because insuarance is not in EmployeeSal and object can only refernce methods in EmploeeSal call
    }
}

class EmployeeSal{
    String name;
    double basepay;

    void calculatePayment(String name, double basepay){
        System.out.println("Salary of " + name + " is " + basepay);
    }

}

class ManagerSal extends EmployeeSal{
    @Override
    void calculatePayment (String name, double basepay){
        basepay +=2000;
        System.out.println("Salary of " + name + " is " + basepay);
    }
    void insurance(){
        System.out.println("My insurance is paid by the company");
    }

}

class InternSal extends EmployeeSal{
    @Override
    void calculatePayment(String name, double basepay){
        System.out.println("Salary of " + name + " is " + basepay*.5);

    }

}

