import java.util.ArrayList;
public class Customer {
    private String customerName;
    private String phoneNumber;
    private String address;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
class FoodItem
{
    String itemName;
    double price;}

class Restaurant
{
    String restaurantName;
    ArrayList<FoodItem> menu;}
class Order
{
    Customer customer;
    ArrayList<FoodItem> items;
    int quantity;
    double totalamount;
    String paymentStatus;

}
class DeliveryPartner
{
    String name;
    String phoneNumber;}
interface  Payment
{
    abstract void pay();}
class UPIPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Food Payment done, through UPI");
    }
}
class CardPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Food Payment done,through Card");
    }

}

class WalletPayment implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("Food Payment done,through wallet");
    }

}

