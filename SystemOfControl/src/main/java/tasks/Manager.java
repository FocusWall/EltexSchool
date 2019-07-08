package tasks;

public class Manager extends Employee
{
    private Sale[] sales;

    Manager()
    {
        super();
        sales = null;
    }

    Manager(Integer ID, String FIO, String PHONE)
    {
        super.ID = ID;
        super.FIO = FIO;
        super.PHONE = PHONE;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ";";
    }
}
