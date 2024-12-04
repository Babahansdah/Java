public class PrintNumbers {

    public static void main(String[] args) {


        printNumbers(8);
        System.out.println(sumofTwoNumbers(4,6,90));
    }

    private static void printNumbers(int num) {
        for (int i =1 ; i <=num;i++){
            System.out.println(i);
        }
    }
    private static int sumofTwoNumbers(int num1, int num2, int num3){
        System.out.println("Adding two numbers");
        return num1+num2+num3;
    }
}
