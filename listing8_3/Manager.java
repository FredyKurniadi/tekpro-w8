package listing8_3;

public class Manager extends Employee{
    private Integer year;
    private Integer month;
    private Integer day;
    
    public Manager(String name, Integer salary, Integer year, Integer month, Integer day) {
        super(name, salary);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    
}
