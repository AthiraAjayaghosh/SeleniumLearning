package Day8;

public class encapsulation {

    private int age =10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String validateAge(){
        if(age > 18){
            return "Major";
        }else{
            return "Minor";
        }
    }

    public String getAgeStatus(){
        String status= validateAge_NewLogic();
        return status;
    }

    private String validateAge_NewLogic(){
        if(age > 20){
            return "Major";
        }else{
            return "Minor";
        }
    }
}
