package lt.sdacademy.fundamentals.enumerators;

import com.sun.corba.se.impl.encoding.BufferManagerWrite;

public enum EnumClassExample2 {
    AUDI (2,"audi",true),
    VW (2,"wolkswagen",false),
    TOTYOTA(1, "toyota", true),
    BMW (3, "beemer", false);

    private final int engineSize;
    private final String carName;
    private final boolean runAndDrive;

    EnumClassExample2(int engineSize, String carName, boolean runAndDrive){
        this.engineSize=engineSize;
        this.carName=carName;
        this.runAndDrive=runAndDrive;
    }
    public int getEngineSize() {return this.engineSize;}
    public String getCarName() {return carName;}
}

