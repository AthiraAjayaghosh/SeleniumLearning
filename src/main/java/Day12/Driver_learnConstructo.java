package Day12;

public class Driver_learnConstructo {


    public static void main(String[] args) {

        LearnConstrutor lconst = new LearnConstrutor();
//        lconst.setVal(10,60);
        System.out.println(lconst.sum());

        LearnConstrutor lconst1 = new LearnConstrutor(10, 40);
        System.out.println(lconst1.sum());



    }
}
