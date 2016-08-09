import java.util.Base64;

/**
 * Created by LordwolF on 8/8/2016.
 */
public class App {
    public static void main(String[] args) {

        //cant cast from stirng to int have to use like toString
        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 25565;

        float floatValue = 7464.8f;
        float floatValue2 = (float)99.3;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;

        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue);


        //the following wont work as expected due to memory constraints of byte
        byteValue = (byte)128;
        System.out.println(byteValue);
        }

    }

