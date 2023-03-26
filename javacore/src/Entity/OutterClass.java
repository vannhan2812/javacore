package Entity;

import another.ClassC;

public class OutterClass extends ClassC{

    private static String msg = "GeeksForGeeks";

    OutterClass(){
        a=8;
        System.out.println("outer class constructor"+a);
    }
    // Static nested class
    public static class NestedStaticClass {

        static {
            System.out.println("static block");
        }

        NestedStaticClass(){
            System.out.println("static constructor");
        }

        // Only static members of Outer class
        // is directly accessible in nested
        // static class
        public void printMessage()
        {

            // Try making 'message' a non-static
            // variable, there will be compiler error
            System.out.println(
                    "Message from nested static class: " + msg);
        }
    }

    // Non-static nested class -
    // also called Inner class
    public class InnerClass {

        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void display()
        {

            // Print statement whenever this method is
            // called
            System.out.println(
                    "Message from non-static nested class: "
                            + msg);
        }
    }
}
