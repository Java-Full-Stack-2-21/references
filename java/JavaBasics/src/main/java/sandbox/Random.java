package sandbox;

public class Random {
    int wholeNumber(int num){
        return (int) (Math.random() * (num + 1));
    }

    int wholeNumber(int min, int max){
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}
