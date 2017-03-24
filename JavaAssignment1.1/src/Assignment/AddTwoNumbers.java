package Assignment;

public class AddTwoNumbers {

    public static void main(String args[]) {

        System.out.println(" Sum of 110 add 200 is : " + add(110, 200));
        System.out.println(" Sum of 0 and 0 is : " + add(0, 0));
        System.out.println(" Sum of -10 and +10 is : " + add(-10, 10));
        System.out.println(" Sum of -10 + 200 is : " + add(-10, 200));
        System.out.println(" Sum of 0 + 200 is : " + add(0, 200));

    }

    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return add(sum, carry);
    }

    public static int addIterative(int a, int b) {
        while (b != 0) {
            int carry = (a & b);

            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

}
