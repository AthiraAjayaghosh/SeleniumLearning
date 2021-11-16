package Day15;

public class exceptionHand {

    public static void main(String[] args)  {

        ageCalc ag = new ageCalc();
        try {
            String y = null;
            System.out.print(y.length());
            int a ;
            int b =4;
            a = b/0;
            ag.AgeCalculation(2);
        }catch(ArithmeticException e){
            System.out.println("The Arithmatic exception is " + e.toString());

        }catch(NullPointerException e){
            System.out.println("The Null exception is " + e.toString());
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("The exception is " + e.toString());

        }finally{

            System.out.println("I am anways going to get executed");
        }
        System.out.println("End of program");
    }

}
