/*
static keyword is used to represent metadata.

static members are created inside method area and are available once the method is loaded.
we cannot use this and super inside a static method. becoz they point to a object. No object is needed for static members
    -if we have data related to a class we use static variables
    -if the data needs some processing and computations, we use static methods
    -if we have a bunch of data(lot of methods/members) and can be grouped together, we can write a static nested class

 */


class HondaCity{
    static long price=1000000; // static variables are shared by all the objects of the class.
    String color; // If I create two objects h1 and h2, each can have their own color but the static variable price is same for both

     static double onRoadPrice(String city){ // I need some computations to be done to get the onroad price of the vehicle, so I use static method.
        switch(city){                        // Same as static variables they are shared by all the members of the class. No need to create object.
            case "Delhi":
                return price+price*0.1;
            case "Mumbai":
                return price+price*0.09;

            default: return price;
        }
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();

        h1.color="red";
        h2.color="silver";

        System.out.println("color: "+h1.color);
        System.out.println("Ex-showroom price: "+h1.price);
        System.out.println("Ex-showroom price: "+HondaCity.price); // SInce these are static variables, no need of creating objects. This gives the same result as h1.price. Just use the class name.

        System.out.println("color: "+h2.color);
        System.out.println("Ex-showroom price: "+h2.price);

        System.out.println("On-road price: "+HondaCity.onRoadPrice("Delhi"));

        System.out.println("On-road price: "+HondaCity.onRoadPrice("Mumbai"));


    }
}
