package Day9;

public class Driver_Interface {
    public static void main(String[] args) {
// creating object with reference to class
        ImplementArithmatic arith = new ImplementArithmatic();
        System.out.println(arith.add(20,30));
        System.out.println(arith.subtract(30,20));
        System.out.println(arith.multiply(30,20));


        // creating object with reference to Interface
        ArithmaticInterface arith1 = new ImplementArithmatic();
        System.out.println(arith1.add(20,30));
        System.out.println(arith1.subtract(30,20));
//        cannot access
//        System.out.println(arith1.multiply(30,20));

        // creating object with reference to Interface
        ArithmaticInterface arith2 = new John_mplementInterface();
        System.out.println(arith2.add(20,30));
        System.out.println(arith2.subtract(30,20));
//        cannot access
//        System.out.println(arith2.Divide(30,20));





    }
}
