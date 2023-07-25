package inheritance;

import java.util.Arrays;

//Parent class or base class or super class
//extends/inheritance -> Is a relationship - TataSafari is a car
//composition -> has a relationship - TataSafari has a wheel
/*
Inheritance reduces duplicate code and basic properties of similar classes can be extracted in common class
that we call as a base class. All similar classes will extend/inherit base class.
 */
public class Car {
    String brandName;
    String yearOfMan;
    int cc;
    boolean isPetrol;



    public Car() {

    }

    public Car(String brandName, String yearOfMan, int cc, boolean isPetrol){
        this.brandName = brandName;
        this.yearOfMan = yearOfMan;
        this.cc = cc;
        this.isPetrol = isPetrol;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getYearOfMan() {
        return yearOfMan;
    }

    public void setYearOfMan(String yearOfMan) {
        this.yearOfMan = yearOfMan;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isPetrol() {
        return isPetrol;
    }

    public void setPetrol(boolean petrol) {
        isPetrol = petrol;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", yearOfMan='" + yearOfMan + '\'' +
                ", cc=" + cc +
                ", isPetrol=" + isPetrol +
                '}';
    }
}

