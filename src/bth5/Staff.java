package bth5;

public class Staff extends Employee{
    private String role;
    public Staff(String name, String role) {
        super(name);
        this.role = role;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(
                "Role : " + role
        );
    }

    @Override
    public void outNewspaper(){
        this.getNewspaper().removeStaff(this);
    }

    @Override
    public void joinNewspaper(Newspaper newspaper){
        newspaper.addStaff(this);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
