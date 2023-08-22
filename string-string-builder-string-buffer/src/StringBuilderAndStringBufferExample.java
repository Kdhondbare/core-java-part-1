public class StringBuilderAndStringBufferExample {

    public static void main(String[] args) {

        //StringBuilder is mutable class
        //StringBuilder isn't suitable for synchronization
        //that means there is no thread safety
        StringBuilder builder = new StringBuilder("Karan");

        System.out.println(builder);

        StringBuilder newBuilder = builder.append(" Dhondbare");

        System.out.println(newBuilder);
        System.out.println(builder == newBuilder);

        //StringBuffer is mutable class
        //StringBuffer is duitable for synchronization
        StringBuffer buffer = new StringBuffer("Karan");

        System.out.println(buffer);

        StringBuffer newBuffer = buffer.append(" Dhondbare");

        System.out.println(newBuffer);
        System.out.println(buffer == newBuffer);
    }
}
