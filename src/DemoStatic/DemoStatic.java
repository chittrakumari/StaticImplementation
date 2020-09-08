package DemoStatic;

public class DemoStatic {

    //STATIC BLOCK 1
    static {
        System.out.println("static block demo 1");
    }

    /*
    We will see that static block executes first iirespective of any method available.
     */
    public static void main(String[] args){
        System.out.println("main method");
    }

    //STATIC BLOCK 2
    static {
        System.out.println("static block demo 2");
    }
}
