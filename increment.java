class counterManipulate{
    public int counter =0;

    public int increment(){
        counter++;
        return counter;
    }
    public int reset(){
        counter =0;
        return counter;
    }
    public int decrement() {
        counter--;
        return counter;
}
    public int getCounter() {
        return counter;
    }
}



public class increment {
    public static void main (String[] args){
        counterManipulate manipulate = new counterManipulate();
        manipulate.increment();
        manipulate.increment();
        manipulate.decrement();
        manipulate.increment();
        manipulate.reset();
        System.out.println(manipulate.getCounter());

    }
}



