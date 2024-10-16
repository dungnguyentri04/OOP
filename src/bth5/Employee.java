package bth5;

public class Employee {
    private Newspaper newspaper;
    private String name;

    public Employee(String name){
        this.name = name;
        newspaper = null;
    }

    public void displayInfo(){
        System.out.println(
                "Name : " + name +
                "Newspaper : " + newspaper.getName()
        );
    }

    public void outNewspaper(){
    }

    public void joinNewspaper(Newspaper newspaper1){}

    public void setName(String name) {
        this.name = name;
    }

    public Newspaper getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(Newspaper newspaper) {
        this.newspaper = newspaper;
    }

    public String getName() {
        return name;
    }

}
