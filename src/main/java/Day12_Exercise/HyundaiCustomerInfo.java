package Day12_Exercise;

import java.util.List;

public class HyundaiCustomerInfo {
    private String name;
    private String city;
    private String state;
    private String carModel;
    private List<String> phoneNumbers;

    public HyundaiCustomerInfo(String name,String city,String state,String carModel,List<String> phonenumbers){
        this.name=name;
        this.city=city;
        this.state=state;
        this.carModel=carModel;
        this.phoneNumbers=phonenumbers;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

}
