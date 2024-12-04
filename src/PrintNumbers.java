public class PrintNumbers {

    public static void main(String[] args) {


        printNumbers(8);
        System.out.println(sumofTwoNumbers(4,6));
    }

    private static void printNumbers(int num) {
        for (int i =1 ; i <=num;i++){
            System.out.println(i);
        }
    }
    private static int sumofTwoNumbers(int a, int num2){
        System.out.println("Adding two numbers");
        return a+num2;
    }
}
