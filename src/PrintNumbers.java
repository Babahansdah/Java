public class PrintNumbers {

    public static void main(String[] args) {


        printNumbers(8);
        System.out.println( sumOfTwoNumbers(4,6));
    }

    private static void printNumbers(int num) {
        for (int i =1 ; i <=num;i++){
            System.out.println(i);
        }
    }

    public static int sumOfTwoNumbers(int a , int b){
        return a+b;
    }
}
