package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainDriver {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(55, "Kevin", "Smith"));
        users.add(new User(99, "Kevin", "Childs"));
        users.add(new User(40, "Kevin", "Keys"));



        Comparator<User> sortingByFirstName = new SortByFirstName();
        Collections.sort(users,sortingByFirstName);

        System.out.println(users);

    }
}
