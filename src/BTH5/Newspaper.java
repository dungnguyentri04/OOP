package BTH5;

import java.util.ArrayList;
import java.util.List;

public class Newspaper {
    private String name;
    private List<Staff> staffList;
    private List<Journalist> journalists;
    private int numberOfPost;

    public Newspaper(String name){
        this.name=name;
        numberOfPost=0;
        staffList=new ArrayList<>();
    }

    public void addStaff(Staff staff){
        staffList.add(staff);
        staff.setNewspaper(this);
    }

    public void removeStaff(Staff staff){
        staffList.remove(staff);
        staff.setNewspaper(null);
    }

    public void displayStaff(){
        for (Staff staff:staffList){
            staff.displayInfo();
        }
    }

    public void addJournalist(Journalist journalist){
        journalists.add(journalist);
        journalist.setNewspaper(this);
    }

    public void removeJournalist(Journalist journalist){
        journalists.remove(journalist);
        journalist.setNewspaper(null);
    }

    public void displayJournalist(){
        for (Journalist journalist:journalists){
            journalist.displayInfo();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public void setNumberOfPost(int numberOfPost) {
        this.numberOfPost = numberOfPost;
    }
}
