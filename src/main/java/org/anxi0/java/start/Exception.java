package org.anxi0.java.start;

public class Exception {

    public static void main() throws OuterException {
        try {
            throw new FoolException();
        } catch (FoolException e) {
            System.err.println("Fool fool fool");
            // Don't forget to check usage of Exception depend on your purpose.
        }
    }


}

class FoolException extends java.lang.Exception {

}
class OuterException extends java.lang.Exception {}