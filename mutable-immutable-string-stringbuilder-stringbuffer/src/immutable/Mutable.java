package immutable;

public class Mutable extends Immutable {

    private int realValue; //4 then 8

    public Mutable(int value) {
        super(value);

        realValue = value;
    }

    public int getRealValue() {
        return realValue;
    }

    public void setRealValue(int realValue) {
        this.realValue = realValue;
    }

    public static void main(String[] args) {
        Mutable obj = new Mutable(4);
        Immutable immObj = obj;//upcasting
        System.out.println(immObj.getValue());
        obj.setRealValue(8);
        System.out.println(immObj.getValue());
    }
}
