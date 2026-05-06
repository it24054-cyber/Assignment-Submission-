import java.util.Scanner;

class MathCalc {

    int number;

    void check() {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }

        if (number % sum == 0) {
            System.out.println("It is a Harshad number");
        } else {
            System.out.println("It is Not a Harshad number");
        }
    }
}

public class Harshad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        MathCalc h = new MathCalc(); 
        h.number = n;
        h.check();                 

        sc.close();
    }
}
