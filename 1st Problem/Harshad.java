public class HarshadCheck {

public static int harshadNumber(int x) {
    int sum = 0;
    int temp = x;

    // Calculate sum of digits
    while (temp > 0) {
        sum += temp % 10;
        temp /= 10;
    }

    // Check Harshad condition
    if (x % sum == 0) {
        return sum;
    } else {
        return -1;
    }
}

public static void main(String[] args) {
    int x1 = 18;
    int x2 = 23;

    System.out.println(harshadNumber(x1)); // Output: 9
    System.out.println(harshadNumber(x2)); // Output: -1
}
}
