// import java.util.*;

public class eleven {
    public static void main(String[] args) {
        // Myname("srinidhi");
        greaterNo(95, 67, 10);
    }
    // static void Myname(String name){
    // System.out.println("hello " + name);

    // }
    static void greaterNo(int num1, int num2, int num3) {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        if (num1 > num2 && num1 > num3) {
            System.out.println("greater no. " + num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("greater no. " + num2);
        } else {
            System.out.println("greater no. " + num3);
        }

    }
}
