package sorting;

import java.util.Comparator;

public class SortByFirstName implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        Integer result = o1.firstname.compareTo(o2.firstname);

        if(result == 0)
            return o1.age.compareTo(o2.age);

        return result;
    }
}
