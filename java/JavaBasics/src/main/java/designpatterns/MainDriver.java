package designpatterns;

import javax.swing.*;

public class MainDriver {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}
