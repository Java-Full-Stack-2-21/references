package oop.encapsulation;

public class MainDriver {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getAge());
        user.setAge(30);

        System.out.println(user.getAge());
    }
}
