public class classMethodOverriding {
    public static void main(String[] args){
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        tiger.makesSound();
        lion.makesSound();

    }
}


class Wildanimal {
    void makesSound(){
        System.out.println("Makes a sound");
    }
}

class Tiger extends Wildanimal{
    @Override //not required but best practise
    void makesSound(){
        System.out.println("Makes a Grrrr");
    }
}

class Lion extends Wildanimal{
    @Override //not required but best practise
    void makesSound(){
        System.out.println("Makes a Roar");
    }
}