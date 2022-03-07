package collections;



import java.util.*;
import java.util.function.Consumer;

public class MainDriver {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 12;
        arr[3] = 72;
        arr[4] = 56;
        //arr[5] = 10;  this one would throw an ArrayIndexOutOfBounds



        /*
        * Lists maintains order and can have duplicate values (indexable)
        * */
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(72);
        list.add(56);
        list.add(10);

        list.remove(1);

        System.out.println(list.get(0)); //.get([INDEX]) is how we get a value at an index

        Collections.sort(list);

        for(Integer val : list){
            System.out.print(val + ", ");
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }

        System.out.println();



        //sets cannot have duplicate values and unordered (not indexable)
        Set<String> items = new TreeSet<>();

        items.add("Olivier");
        items.add("Kevin");
        items.add("Kevin");
        items.add("James"); //how we add items to a set


        System.out.println(items.contains("Olivie")); //check if something exists in a set

        //items.remove("James"); //remove item from set

        for (String item : items){
            System.out.print(item + ", ");
        }
        System.out.println();


        //QUEUE first in first out data structure
        Queue<String> queue = new LinkedList<>();

        queue.add("Joel");
        queue.add("Ariel");
        queue.add("Brandon");

        for (String item : queue){
            System.out.print(item + ", ");
        }
        System.out.println();

        System.out.println(queue.peek()); //peek returns the value of the first in line
        System.out.println(queue.peek()); //poll returns the value of first in line AND removes it from the queue


        Map<Integer, User> maps = new HashMap<>();
        User user1 = new User(1,"Kevin", "Childs");
        User user2 = new User(2, "Steve", "Jobs");

        maps.put(1, user1); //how to add something to our maps object
        maps.put(2, user2);

        System.out.println(maps.get(2));// retrieve value given key

        System.out.println(maps.containsKey(2));


        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer item : list){
            System.out.println(item);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        list.forEach(item -> {
            System.out.println(item);
        });


    }
}
