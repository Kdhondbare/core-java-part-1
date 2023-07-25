package inheritance;
//child class or derived class or Sub class
//extends -> Is a relationship
public class MahaindraThar extends Car {

    boolean is4x4;
    boolean hasSunroof;
    boolean isAutomatic;

    public MahaindraThar(boolean is4x4, boolean hasSunroof, boolean isAutomatic) {
        super("Mahaindra", "2021", 1200, false);
        this.is4x4 = is4x4;
        this.hasSunroof = hasSunroof;
        this.isAutomatic = isAutomatic;
    }

    public boolean isIs4x4() {
        return is4x4;
    }

    public void setIs4x4(boolean is4x4) {
        this.is4x4 = is4x4;
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
        return "MahaindraThar{" +
                "is4x4=" + is4x4 +
                ", hasSunroof=" + hasSunroof +
                ", isAutomatic=" + isAutomatic +
                ", brandName='" + brandName + '\'' +
                ", yearOfMan='" + yearOfMan + '\'' +
                ", cc=" + cc +
                ", isPetrol=" + isPetrol +
                '}';
    }
}
