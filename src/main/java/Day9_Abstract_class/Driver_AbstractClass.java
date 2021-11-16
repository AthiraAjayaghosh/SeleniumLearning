package Day9_Abstract_class;

import Day9_Abstract_class.AbstractClass;

public class Driver_AbstractClass {
    public static void main(String[] args) {
// creating object with reference to class
        ImplementAbstractclass arith = new ImplementAbstractclass();
        System.out.println(arith.add(20,30));
        System.out.println(arith.subtract(30,20));
        System.out.println(arith.multiply(30,20));


        // creating object with reference to Abstract class
        AbstractClass arith1 = new ImplementAbstractclass();
        System.out.println(arith1.add(20,30));
        System.out.println(arith1.subtract(30,20));
//        cannot access
//        System.out.println(arith1.multiply(30,20));

    }
}
