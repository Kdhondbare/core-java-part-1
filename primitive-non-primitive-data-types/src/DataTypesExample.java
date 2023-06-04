public class DataTypesExample {

    public static void main(String[] args) {
        System.out.println("This is my initial commit.");

        // Data Types ---> Single line comment

    /*
    Data Types
       1. Primitive - There are 8 primitive data types
           Type and Size (1 Byte = 8 bit)
           1. byte - 1 Byte - > 8 bit - > -2^7 to +(2^7 - 1)
           2. short - 2 B - > 16 bit - > -2^15 to +(2^15 - 1)
           3. char - 2 B - > 16 bit - > -2^15 to +(2^15 - 1)
           4. int - 4 B - > 32 bit - > -2^31 to +(2^31 - 1)
           5. float - 4 B - > 32 bit - > -2^31 to +(2^31 - 1)
           6. long - 8 B - > 64 bit - > -2^63 to +(2^63 - 1)
           7. double - 8 B - > 64 bit - > -2^63 to +(2^63 - 1)
           8. boolean - 1 bit - > 8 bit - > -2^7 to +(2^7 - 1)

       2. Non-Primitive
           class , arrays
     */

        byte byteData = 123;
        short shortData = 21000;
        char charData = 'A';
        int intData = 238200;
        float floatData = 32.3300f;
        long longData = 1111115885662L;
        double doubleData = 21.2222364458;
        boolean booleanData = true;


        System.out.println("Byte : "+byteData);
        System.out.println("Byte Max: "+Byte.MAX_VALUE);
        System.out.println("Byte Min: "+Byte.MIN_VALUE);

        System.out.println();
        System.out.println("Short : "+ shortData);
        System.out.println("Short Max: "+Short.MAX_VALUE);
        System.out.println("Short Min: "+Short.MIN_VALUE);

        System.out.println();
        System.out.println("Char : "+charData);
        System.out.println("Char Max: "+ Character.MAX_VALUE);
        System.out.println("Char Min: "+ Character.MIN_VALUE);

        System.out.println();
        System.out.println("Int : "+intData);
        System.out.println("Int Max: "+ Integer.MAX_VALUE);
        System.out.println("Int Min: "+ Integer.MIN_VALUE);

        System.out.println();
        System.out.println("Float : "+floatData);
        System.out.println("Float Max: "+ Float.MAX_VALUE);
        System.out.println("Float Min: "+Float.MIN_VALUE);

        System.out.println();
        System.out.println("Long : "+longData);
        System.out.println("Long Max: "+Long.MAX_VALUE);
        System.out.println("Long Min: "+Long.MIN_VALUE);

        System.out.println();
        System.out.println("Double : "+doubleData);
        System.out.println("Double Max: "+Double.MAX_VALUE);
        System.out.println("Double Min: "+Double.MIN_VALUE);

        System.out.println();
        System.out.println("Boolean : "+booleanData);
    }



}
