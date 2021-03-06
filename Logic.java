package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        if (operation == 1){
            Add add = new Add(argumentOne, argumentTwo);
            mOut.print(add.toString());
        }
        if (operation == 2){
            Subtract sub = new Subtract(argumentOne, argumentTwo);

            mOut.print(sub.toString());
        }
        if (operation == 3){
            Multiply mult = new Multiply(argumentOne, argumentTwo);
            mOut.print(mult.toString());

        }
        if (operation == 4){
            Divide div = new Divide(argumentOne, argumentTwo);
                mOut.print(div.toString());

        }
    }
}
