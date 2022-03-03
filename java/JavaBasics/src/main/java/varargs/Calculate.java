package varargs;

public class Calculate {

    public Calculate(int ...x){

    }


    public int add(int x, int y){
        return x + y;
    }

    public int add(int x, int y, int z){
        return x + y + z;
    }

    public int add(int x, int y, int z, int a){
        return x + y + z + a;
    }

    /*
    * What is var args?
    *   stands for variable argument length
    *   - variable that can take a variable length
    *
    * NOTE: varargs needs to be the last argument in your parameter list
    * */
    public int varArgsAdd(String y, Integer ...x){
        int sum = 0;
        for(int val = 0; val < x.length; val++){
            sum = sum + x[val];
        }
        return sum;
    }
}
