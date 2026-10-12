public class javaVarargs {
    public static void main(String[] args){
        System.out.println(add(1,2,3,4,5));
        System.out.println(concat("roshan", " ", "xavier"));
    }
    static int add(int... numbers) {
        int sum = 0;

        for (int number:numbers){
            sum += number;
        }
        return sum;

    }

    static String concat(String... name) {
        String full_name = "";

        for (String str:name){
            full_name += str;
        }
        return full_name;

    }
}
