package Day15;

public class ageCalc {

    public void AgeCalculation(int age) throws Exception {

        if(age<4){
            throw new Exception("Oh my god he is a kid");

        }else if(age > 4 && age <=18){
            System.out.println("He is a Minor");

        }else {
            System.out.println("He is a Major");
        }

    }
}
