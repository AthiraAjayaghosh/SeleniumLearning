package Day2;

public class BasicMath2 {

    public static void main(String[] args) {

        CommonMaths maths = new CommonMaths();

        int sum = maths.add(10, 20);
        System.out.println("Sum of numbers:" + sum);

        int multi = maths.mul(10, 20);
        System.out.println("Sum of numbers:" + multi);

        int diff = maths.sub(10, 20);
        System.out.println("Sum of numbers:" + diff);

    }
}
