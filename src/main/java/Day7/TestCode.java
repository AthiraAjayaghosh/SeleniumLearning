package Day7;

public class TestCode {
    public static void main(String[] args) {

        Jim jim = new Jim();
        System.out.println("Sum of numbers: " + jim.addNum(10,20));
        System.out.println("Subtraction of numbers:" + jim.subNum(20,20));
        System.out.println("Division of numbers: " + jim.divNum(20,20));


        John john = new John();
        System.out.println("Sum of numbers: " + john.addNum(10,20));
        System.out.println("Subtraction of numbers:" + john.subNum(20,20));
        System.out.println("Power of numbers: " + john.powerOfNumber(3,2));
    }

}
