package codingchallenges.sorting;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {23,36,12,14,3,22,8,46,31,27};
        int[] numbers = bubbleSort(nums);

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        //enhanced for loop
        for(int number : numbers){
            System.out.print(number + " ");
        }
    }

    public static int[] bubbleSort(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length - 1; j++){

                //if you have to swap two numbers in an array, this is usually how its done.
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}
