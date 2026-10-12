import java.math.BigDecimal;
import java.util.Scanner;





class counterManipulate{
    public int counter =0;

    public int increment(int counter){
        counter++;
        return counter;
    }
    public int reset(int counter){
        counter =0;
        return counter;
    }
    public int decrement(int counter) {
        counter--;
        return counter;
}
}



public class counter {
    public static void main (String[] args){
        counterManipulate manipulate = new counterManipulate();
        manipulate.increment(counter);
        manipulate.increment();
        System.out.println();


    }
}



