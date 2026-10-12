import java.util.*;
import static java.util.Map.entry;
import java.util.EnumSet;


public class dataStructures {
    public static void main (String[] args){
        //List
        List<String> names = new ArrayList<>();
        names.add("Roshan");
        System.out.println("Getting the value at index 0 of the listed named names: " + names.get(0));

        List<Integer> whole = new ArrayList<>();
        whole.add(0);
        System.out.println("Getting the value at index 0 of the listed named names: " + whole.get(0));
        whole.add(1);
        System.out.println("printing the list named whole: " + whole);
        whole.add(1);
        System.out.println("printing the list named whole after adding: " + whole);
        whole.remove(0);
        System.out.println("printing the list named whole after removing: " + whole);

        List<Integer> wholeNum = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9)); //mutable
        List<Integer> biggerNum = new ArrayList<>();
        for (Integer num:wholeNum){
            if (num > 5) {
                biggerNum.add(num);
            }

        }
        System.out.println("The number gerater than 5 in the list are: " + biggerNum);

        //Deque
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i=0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println("printing the stack: " + stack);

        for (int i=0; i < 5; i++) {
            stack.pop();
        }

        System.out.println("printing the stack: " + stack);

        for (int i=0; i < 5; i++) {
            stack.addLast(i);
        }
        System.out.println("printing the stack: " + stack);

        System.out.println("++++++++++++++++++++++++++++");

        for (int i=0; i < 5; i++) {
            stack.addFirst(i);
        }

        stack.removeFirst();
        System.out.println("printing the stack: " + stack);
        stack.removeLast();
        System.out.println("printing the stack: " + stack);

        //HashMap
        Map<String, Integer> score = new HashMap<>();
        score.put("Roshan", 95);
        System.out.println("printing the score of Roshan: " + score.get("Roshan"));
        System.out.println("printing the scores: " + score);



        Map<String, Integer> marks = Map.ofEntries(
                entry("roshan", 100),
                entry("deepa", 95),
                entry("vincent",80)
        );
        System.out.println(marks);
        System.out.println(wholeNum);

        for (Integer mark:marks.values()){
            System.out.print(mark + " ");
            System.out.println();
        }

        for (String mark:marks.keySet()){
            System.out.print(mark + " ");
            System.out.println();
        }

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry);
        }

        marks.entrySet().forEach(System.out::println);

        marks.forEach((key, value) -> {
            System.out.println(key + " " + value );
        });

        //HashSet
        Set <String> cities = new HashSet<>();
        cities.add("Ottawa");
        cities.add("Toronto");
        cities.add("Vancouver");
        System.out.println("Added following cities in the itenerrary: " + cities);
        cities.remove("Ottawa");
        System.out.println("updated the travel plan; only visiting following cities: " + cities);

        List<Integer> dup = List.of(1,2,3,4,5,7,8); //immutable
        Set<Integer> dedup = new HashSet<>(dup);
        System.out.println("The unique set of the numbers is " + dedup);

        List <String> emails = List.of("a@x.com", "b@x.com", "a@x.com", "c@x.com", "b@x.com");
        Set <String> seen = new HashSet<>();
        Set <String> dupes = new HashSet<>();
        for (String email:emails) {
            if(!seen.add(email)){
                dupes.add(email);
            }
        }
        System.out.println("These are the duplicate emails: " +dupes);
        System.out.println("These are the unique emails: " +seen);

        //TreeSet
        //TreeSet <Integer> nums = new TreeSet<>();
        TreeSet<Integer> nums = new TreeSet<>(List.of(1,5,6,7,10,8));
        System.out.println("The treeset is: " +nums);
        System.out.println("First number is: " + nums.first());
        System.out.println("Last number is: " + nums.last());
        System.out.println("Lower number is: " + nums.lower(4));
        System.out.println("Higher number is: " + nums.higher(11));
        System.out.println("floor: " + nums.floor(11));
        System.out.println("ceiling: " + nums.ceiling(11));



    }
}
