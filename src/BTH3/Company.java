package BTH3;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Company {
    private String name;
    private LocalDate dateCreate;
    private Employee[] employees;
    private int numberOfCompany;

    public Company(String name){
        this.name=name;
        dateCreate= LocalDate.now();
        employees=new Employee[10];
        numberOfCompany=0;
    }

    public void addNewEmployee(Employee e){
        if (numberOfCompany<10){
            employees[numberOfCompany]=e;
            numberOfCompany++;
        }
        else info();
    }

    public void info(){
        System.out.println("Max Employee");
    }

    public void showListEmployees(){
        for (int i=1;i<=numberOfCompany;i++){
            System.out.println("Employee "+i+" : ");
            employees[i-1].display();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }



}
