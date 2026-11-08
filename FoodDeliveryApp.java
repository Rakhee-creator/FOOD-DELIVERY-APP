import java.util.ArrayList;
public class FoodDeliveryApp {
        public static void main(String[] args) {
            Customer rakhee=new Customer();
            rakhee.setCustomerName("Rakhee");
            rakhee.setAddress("Nikoo Homes");
            rakhee.setPhoneNumber("8888888");
            //this is FoodItem class
            FoodItem dosa=new FoodItem();
            dosa.itemName="Dosa";
            dosa.price=200;
            FoodItem vegpulav=new FoodItem();
            vegpulav.itemName="Veg-Pulav";
            vegpulav.price=300;
            //This is restaurant class
            Restaurant sukhsagarpureveg = new Restaurant();
            sukhsagarpureveg.restaurantName="SukhSagar";
            sukhsagarpureveg.menu = new ArrayList<>();
            sukhsagarpureveg.menu.add(dosa);
            sukhsagarpureveg.menu.add(vegpulav);

            System.out.println("RestaurantName:" +sukhsagarpureveg.restaurantName );
            System.out.println ("SukhSagar Pure Veg-Menu:");
            for(FoodItem f : sukhsagarpureveg.menu)

            {
                System.out.println(
                        f.itemName + " - Rs " + f.price);
            }
            System.out.println("Customer Name:"+ rakhee.getCustomerName() +" ,"+"ordered"+" "+ dosa.itemName+" "+"From,"+" "+sukhsagarpureveg.restaurantName);
            System.out.println("Delivery Address:"+ rakhee.getAddress());
//New customer
            Customer taylor=new Customer();
            taylor.setCustomerName("Taylor");
            taylor.setAddress("Salt lake,Stree 2.");
            taylor.setPhoneNumber ("7777777");
            FoodItem pizza = new FoodItem();
            FoodItem burger= new FoodItem();
            pizza.itemName="pizza";
             pizza.price=500;
            burger.itemName="Burger";
            burger.price=500;
            Restaurant subway = new Restaurant();
            subway.restaurantName="Subway";
            subway.menu = new ArrayList<>();
            subway.menu.add(pizza);
            subway.menu.add(burger);
            System.out.println("RestaurantName:" +subway.restaurantName );
            System.out.println ("Subway-Menu:");
            for(FoodItem i : subway.menu)
            {
                System.out.println(
                        i.itemName + " - Rs " + i.price);
            }
            Order order =new Order();
            order.quantity=2;
            order.items = new ArrayList<>();
            System.out.println ("Order from Taylor:");
            order.items.add(pizza);
            order.items.add(pizza);
            double total = 0;
            for(FoodItem f : order.items)
            {
                total += f.price;
            }
            order.totalamount = total;

            for(FoodItem f : order.items)
            {
                System.out.println(
                        f.itemName + " - Rs " + f.price);
            }
            order.paymentStatus="Paid";
            DeliveryPartner partner =new DeliveryPartner();
            partner.name="Ian";
            partner.phoneNumber="1111111";
            System.out.println("Customer Name:"+ taylor.getCustomerName() +" ,"+"ordered"+" "+ pizza.itemName+" "+"From,"+" "+subway.restaurantName);
            System.out.println("Total Price-:" + order.totalamount+"," +"Payment Status:" +order.paymentStatus);
            Payment pays=new CardPayment();
            pays.pay();
            System.out.println("Delivery Address:"+ taylor.getAddress()+" "+ "Delivery Partner:"+partner.name+","+"Phone Number:"+partner.phoneNumber);

        }}

