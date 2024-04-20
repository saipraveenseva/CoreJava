/* I wish to build a hospital on my own.
    I have to take some permissions and follow certain standards to be authorised as a hospital
    So Hospital super class has to enforce some rules/standards for the people if they want to build a hospital
    To enforce such rules the super class has to make them abstract.
    It enforces the people to abide by the rules and override them and write their own functionality.
 */


abstract class Hospital{
    abstract void emergency();
    abstract void appointment();

}

class MyHospital extends Hospital{
    MyHospital(){

    }
    void emergency(){
        System.out.println("Emergency ward");
    }
    void appointment(){
        System.out.println("Take appointment");
    }
}

public class AbstractClassExample {

    Hospital h = new MyHospital();

}
