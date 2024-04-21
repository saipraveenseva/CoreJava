class Phone
{               // This is a basic phone class, not a physical entity
    void call(){
        System.out.println("Call functionality");
    }

    void SMS(){
        System.out.println("SMS functionality");
    }
}

interface Camera{       // We are implementing Camera interface into the Phone
    void Capture();
    void Record();
}

interface Musicplayer{  //We are implementing musicplayer interface into the Phone
    void play();
    void pause();
    void stop();
}

class smartPhone extends Phone implements Camera,Musicplayer{ // By implementing both camera and music player interfaces and some additional traits of a smart device, we are making it a smartphone.
    public void Capture(){
        System.out.println("Capture");
    }
    public void Record(){
        System.out.println("Record");
    }

    public void play(){
        System.out.println("Play");
    }
    public void pause(){
        System.out.println("Pause");
    }
    public void stop(){
        System.out.println("Pause");
    }

    void videoCall() // This is an additional functionality of a smartphone(part of smartphone class) other than camera and music player interface
    {
        System.out.println("Video calling");
    }
}


public class InterfacesExample {
    public static void main(String[] args) {
        smartPhone sp = new smartPhone();

        sp.call();
        sp.SMS();

        sp.Capture();
        sp.Record();

        sp.play();
        sp.pause();
        sp.stop();      // An object of a smart phone can access all the methods of superclass and interfaces.

        Phone p=new smartPhone();    // Creating a reference to the superclass and pointing it to  subclass object
        p.call();
        p.SMS();        // I can only call these two becoz we are using reference of a phone.

        Camera c=new smartPhone();      // Creating reference to Camera and pointing it to sp since we cannot create objects for an interface.
        c.Capture();
        c.Record();         //I can only call these two becoz we are using reference of a Camera.

        Musicplayer m=new smartPhone();   // Creating reference to Musicplayer and pointing it to sp since we cannot create objects for an interface.
        m.play();
        m.pause();
        m.stop();           //I can only call these two becoz we are using reference of a Musicplayer.
    }



}
