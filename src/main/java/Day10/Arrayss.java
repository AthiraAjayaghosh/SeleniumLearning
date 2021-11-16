package Day10;

public class Arrayss {
    public static void main(String[] args) {

        String[] sArray = new String[5];
        sArray[0]="India";
        sArray[1]="US";
        sArray[2]="China";
        sArray[3]="Russia";
        sArray[4]="France";
//        sArray[5]="France";


        System.out.println(sArray[1]);

//        for loop
        for(int i = 0 ;i < sArray.length;i++){
            System.out.println(sArray[i]);
        }


        //        for loop
        for(int i = 0 ;i < sArray.length;i++){
            if(sArray[i].equals("China"))
                System.out.println("China is present");
        }


        String[][][] mArray = new String[3][2][1];
        mArray[0][0][0]="US";
        mArray[0][1][0]="Canada";

        mArray[1][0][0]="India";
        mArray[1][1][0]="Russia";

        mArray[2][0][0]="Nepal";
        mArray[2][1][0]="China";

        System.out.println(mArray[0][1][0]);


    }

}
