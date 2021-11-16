package Day12;

public class LearnConstrutor {
    public int a;
    public int b;

    public LearnConstrutor(){
        this.a = 10;
        this.b=30;
    }

    public LearnConstrutor(int a, int b){
        this.a = a;
        this.b=b;
    }

    public void setVal(int a , int b){
        this.a=a;
        this.b=b;
    }

    public int sum(){
        return a + b;
    }

}
