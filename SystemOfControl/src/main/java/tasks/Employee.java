package tasks;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Employee implements CSV
{
    Integer ID;
    String FIO, PHONE;

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String toString()
    {
        return this.ID + ";" + this.FIO + ";" + this.PHONE;
    }

    public String toCSV()
    {
        return this.ID + ";" + this.FIO + ";" + this.PHONE;
    }

    public void fromCSV(String str)
    {
        String[] arr = str.split(";");
        this.ID = Integer.valueOf(arr[0]);
        this.FIO = arr[1];
        this.PHONE = arr[2];
    }

    Employee()
    {
        this.ID = 0;
        this.FIO = null;
        this.PHONE = null;
    }

    Employee(Integer ID, String FIO, String PHONE)
    {
        this.ID = ID;
        this.FIO = FIO;
        this.PHONE = PHONE;
    }
}
