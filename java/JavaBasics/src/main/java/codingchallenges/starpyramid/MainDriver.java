package codingchallenges.starpyramid;

public class MainDriver {
    public static void main(String[] args) {
        starTree(5);
    }

    static void starTree(int num){
        //outer for loop is the rows
        for(int i = 1; i <= num; i++){
            //inner for loop is the columns
            //The number of stars printed is dependent on what row we are on
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
