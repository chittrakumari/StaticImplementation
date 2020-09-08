//HOW CAN WE DECLARE STATIC VARIABLES

package DemoStatic;
public class staticVariableIntialization {
    //method 1

    static int no1;
    static {
        no1 = 10;
    }

    //method2
    static int no2 = 78;

    /*
    We should declare and intialize a sttic variable together otherwise if we intialize after declaring
    intialize them using Block Scope as done in method2.
     */
}
