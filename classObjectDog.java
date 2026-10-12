//class Dog{
//    String name;
//    String breed;
//    public void bark(String name, String breed){
//        this.name = name;
//        this.breed = breed;
//        System.out.printf("The name of the dog is %s, it is a %s and it barks bow bow", name,breed);
//    }
//}
//
//
//public class classObjectDog {
//    public static void main (String[] args){
//        Dog dog = new Dog();
//        dog.bark("Tippu", "German Sheppard" );
//    }
//}

//Another way starts here

class Dog{
    String name;
    String breed;
    public void bark(){
        System.out.printf("The name of the dog is %s, it is a %s and it barks bow bow", name,breed);
    }
}

public class classObjectDog {
    public static void main (String[] args){
        Dog dog = new Dog();
        dog.name = "Tippu";
        dog.breed = "German Sheppard";
        dog.bark();
    }
}