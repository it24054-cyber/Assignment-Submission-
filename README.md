task#1: public class HarshadCheck {
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
harshad problem :

import java.util.Scanner;

public class HarshadNumbers {

// Function to check Harshad number
static boolean isHarshad(int num) {
    int sum = 0, temp = num;

    while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
    }

    return num % sum == 0;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = 5; // number of test cases

    while (t-- > 0) {
        int m = sc.nextInt(); // lower bound
        int n = sc.nextInt(); // upper bound

        int maxLen = 0;
        int currentLen = 0;

        for (int i = m; i <= n; i++) {
            if (isHarshad(i)) {
                currentLen++;
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
            } else {
                currentLen = 0; // reset if not Harshad
            }
        }

        System.out.println(maxLen);
    }

    sc.close();
}
}
