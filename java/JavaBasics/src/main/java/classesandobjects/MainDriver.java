package classesandobjects;

public class MainDriver {
    public static void main(String[] args){
        // [datatype] variableName = [value];
        Animal animal1 = new Animal("Kevin", 50); //instantiation
        //Animal animal2 = new Animal("Steve Jobs");
        //Animal animal3 = new Animal();   //as soon as I created my own constructor, the default constructor goes away

        System.out.println(animal1.heal(10));
        System.out.println(animal1.heal(20));
        System.out.println(animal1.heal(30));
    }
}
