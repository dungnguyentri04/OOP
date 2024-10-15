package BTH3;

import java.util.Date;

public class Employee extends Person{
    private Date dateJoin;
    private String position;
    private double salaryLevel;
    private double basicSalary;

    public Employee(String name, int yearOfBirth, Gender gender,Date dateJoin,String position,double salaryLevel,double basicSalary) {
        super(name, yearOfBirth, gender);
        this.basicSalary=basicSalary;
        this.dateJoin=dateJoin;
        this.salaryLevel=salaryLevel;
        this.position=position;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(
                "Date Join : " + dateJoin + "\n" +
                "Income : " + getIncome() + "\n" +
                "Position : " + position + "\n"
        );
    }

    public double getIncome(){
        return salaryLevel*basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setSalaryLevel(double salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public void setDateJoin(Date dateJoin){
        this.dateJoin=dateJoin;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
