//Enum is predefined constants.
//e.g. Direction is an enum of predefined constants.

//enum is very similar to class
//enum can have fields, it can also have construction and methods.
//each enum constant is by default, public static final of type enum
//each enum constants is written in capital letters.
//enum is basically a class. but only difference is its objects are pre created at the time of enum loading

//static variables and blocks are initialized and executed when class is loaded into memory by classloader
public enum Direction {

    //set of enum constants. these are basically enum objects

    //public static final Direction NORTH = new Direction("North is hot."),
    NORTH("North is hot."),

    //public static final Direction SOUTH = new Direction("South has beautiful nature."),
    SOUTH("South has beautiful nature."),

    //public static final Direction EAST = new Direction("Sun rises in the east."),
    EAST("Sun rises in the east."),

    //public static final Direction WEST = new Direction("West i don't know much about."),
    WEST("West i don't know much about.");
    //all the four variables are enum and they are created when the class get loaded.
    //because all of them are static.

    //instance variable
    String msg;

    //constructor

    Direction(String msg) {
        this.msg = msg;
        System.out.println("Msg from constructor " + msg);
    }

    //getters and setters for msg

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
