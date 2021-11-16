package Day12_Exercise;

import java.util.*;

public class CustomerDetails {
    public static void main(String[] args) {

        List<String> phoneNumer = new ArrayList<String>();
        phoneNumer.add("988678677");
        phoneNumer.add("988678293");
        HyundaiCustomerInfo custInfo1 = new HyundaiCustomerInfo("Rajesh","Bangalore","karanataka","i10",phoneNumer);

        HyundaiCustomerInfo custInfo2 = new HyundaiCustomerInfo("John","Kochi","Kerala","i20",new ArrayList<String>(Arrays.asList("988678765","2386482764")));

        HyundaiCustomerInfo custInfo3 = new HyundaiCustomerInfo("Jim","chennai","Tamil Nadu","Creata",new ArrayList<String>(Arrays.asList("296592","77167326")));;
        custInfo3.setCity("Madurai");

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
        System.out.println(customerMap.get(customerName).getCity());
        System.out.println(customerMap.get(customerName).getPhoneNumbers());






    }
}
