package Day7;

public class Driver_Inheritance {

    public static void main(String[] args) throws InterruptedException {

        EMI_Inheritance s1 = new EMI_Inheritance();
        s1.launchApp("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        String emi = s1.extractEmi("20000", "10", "120");
        System.out.println("EMMI is :" + emi);
        s1.tearDown();

        Bing_inheritance b1 = new Bing_inheritance();
        b1.launchApp("https://www.bing.com/");
        b1.Search("Corona");
        Thread.sleep(4000);
        b1.tearDown();

    }

}
