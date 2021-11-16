package Day7;

public class John extends Base_Arithmetic {

    //sum 2 numbers
    int addNum(int a, int b){
        return super.addNum(a,b) +5;
    }

    //    power
    double powerOfNumber(double a,double b){
        return  Math.pow(a, b);
    }

}
