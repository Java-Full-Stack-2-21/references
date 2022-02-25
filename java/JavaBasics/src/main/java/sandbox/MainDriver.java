package sandbox;

public class MainDriver {
    public static void main(String[] args) { //static scope
        int[] arr = {5, 4, 3, 2, 1};
        int[] arr2 = {6, 4, 3, 2, 1};
        int[] arr3 = {7, 4, 3, 2, 1};

        arr = sort(arr);
        arr2 = sort(arr2);
        arr3 = sort(arr3);

    }

    static int[] sort(int[] arr){ //instance scope

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){

                //if you have to swap two numbers in an array, this is usually how its done.
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }


}
