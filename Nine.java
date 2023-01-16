public class Nine {
    public static void main(String[] args) {
        sayHello();
        sumOfTwoInt();
        sumOfTwoInti(5, 9);//data sore argument
        int sum1 = sumOfTwoIntij(90, 78);
        System.out.println(sum1);
        System.out.println(sumOfTwoIntij(45, 6));
    }

    static void sayHello() {
        System.out.println("say hello");
    }

    static void sumOfTwoInt() {
        int numOne = 4;
        int numTwo = 6;
        int sum = numOne + numTwo;
        System.out.println(sum);
    }

    static void sumOfTwoInti(int num1, int num2) { // parameter where the data are access
        int numOne = num1;
        int numTwo = num2;
        int sum = numOne + numTwo;
        System.out.println(sum);
    }

    static int sumOfTwoIntij(int num1, int num2) {
        int numOne = num1;
        int numTwo = num2;
        int sum = numOne + numTwo;
        return sum;
    }

}
