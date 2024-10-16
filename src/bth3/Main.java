package bth3;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Company company = new Company("ABC");
        Employee emp1 = new Employee("Nguyen Van A", 1990, Person.Gender.Male, new Date(120, 0, 15), "Manager", 1.5, 5000);
        company.addNewEmployee(emp1);
        company.showListEmployees();
    }
}
