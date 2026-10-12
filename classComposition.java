//public class classComposition {
//    public static void main (String[] args){
//        Car car = new Car();
//        car.startCar();
//
//    }
//}
//
//
//class Engine {
//    void start(){
//        System.out.println("Start the Engine");
//    }
//}
//
//class Car{
//    private Engine engine;
//
//    Car (){
//        engine = new Engine();
//    }
//
//    void startCar(){
//        engine.start();
//        System.out.println("Start the car");
//    }
//}


// Next one

public class classComposition {
    public static void main (String[] args){
        Library library = new Library();
        library.browseBooks();


    }
}

class Catalogue{
    void listBooks(){
        System.out.println("List of books in the catalogue");
    }
}

class Library {
    Catalogue catalogue;

    Library(){
        catalogue = new Catalogue();
    }

    void browseBooks(){
        catalogue.listBooks();
        System.out.println("Browse Library");
    }

}




