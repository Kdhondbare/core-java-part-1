package inheritance;
//child class or derived class or Sub class
//extends -> Is a relationship
public class TataSafari extends Car {

    boolean hasSunRoof;
    boolean isAutomatic;

   public TataSafari(boolean hasSunRoof, boolean isAutomatic){
       super("Tata","2023", 1500, true );
       this.hasSunRoof = hasSunRoof;
       this.isAutomatic = isAutomatic;
   }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    //toString represents object, this means it prints objects fields
    //if toString method is not overridden then it will print ClassName@Hashcode
    @Override
    public String toString() {
        return "TataSafari{" +
                "hasSunRoof=" + hasSunRoof +
                ", isAutomatic=" + isAutomatic +
                ", brandName='" + brandName + '\'' +
                ", yearOfMan='" + yearOfMan + '\'' +
                ", cc=" + cc +
                ", isPetrol=" + isPetrol +
                '}';
    }
}
