package Day11_Exercise;

import java.util.*;

public class CustomerDetails {
    public static void main(String[] args) {

        HyundaiCustomerInfo custInfo1 = new HyundaiCustomerInfo();
        custInfo1.setName("Rajesh");
        custInfo1.setCity("Bangalore");
        custInfo1.setState("Karanataka");
        custInfo1.setCarModel("i10");
        ArrayList<String> phoneNumer = new ArrayList<String>();
        phoneNumer.add("988678677");
        phoneNumer.add("988678293");
        custInfo1.setPhoneNumbers(phoneNumer);

        HyundaiCustomerInfo custInfo2 = new HyundaiCustomerInfo();
        custInfo2.setName("John");
        custInfo2.setCity("Kochi");
        custInfo2.setState("Kerala");
        custInfo2.setCarModel("i20");
        custInfo2.setPhoneNumbers(new ArrayList<String>(Arrays.asList("988678765","2386482764")));

        HyundaiCustomerInfo custInfo3 = new HyundaiCustomerInfo();
        custInfo3.setName("Jim");
        custInfo3.setCity("Chennai");
        custInfo3.setState("Tamil Nadu");
        custInfo3.setCarModel("Creta");
        custInfo3.setPhoneNumbers(new ArrayList<String>(Arrays.asList("98867876564","123132386482764")));

        Map<String, HyundaiCustomerInfo> customerMap = new HashMap<String, HyundaiCustomerInfo>();
        customerMap.put("Rajesh",custInfo1);
        customerMap.put("John",custInfo2);
        customerMap.put("Jim",custInfo3);


//        Retirieve Info
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the customer name");

        String customerName = myObj.nextLine();


        System.out.println(customerMap.get(customerName).getCarModel());
        System.out.println(customerMap.get(customerName).getState());

        System.out.println(customerMap.get(customerName).getPhoneNumbers());






    }
}
