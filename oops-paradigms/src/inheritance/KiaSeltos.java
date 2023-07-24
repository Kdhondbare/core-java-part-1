package inheritance;
//child class or derived class or Sub class
public class KiaSeltos extends Car {

    int numOfAirBags;
    boolean hasSunroof;
    boolean isAutomatic;

    public KiaSeltos(int numOfAirBags, boolean hasSunroof, boolean isAutomatic) {
        super("Kia", "2022", 1000, true);
       this.numOfAirBags = numOfAirBags;
        this.hasSunroof = hasSunroof;
        this.isAutomatic = isAutomatic;
    }

    public int getNumOfAirBags() {
        return numOfAirBags;
    }

    public void setNumOfAirBags(int numOfAirBags) {
        this.numOfAirBags = numOfAirBags;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public String toString() {
        return "KiaSeltos{" +
                "numOfAirBags=" + numOfAirBags +
                ", hasSunroof=" + hasSunroof +
                ", isAutomatic=" + isAutomatic +
                ", brandName='" + brandName + '\'' +
                ", yearOfMan='" + yearOfMan + '\'' +
                ", cc=" + cc +
                ", isPetrol=" + isPetrol +
                '}';
    }
}
