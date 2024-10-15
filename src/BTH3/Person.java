package BTH3;

public class Person {
    public enum Gender {Male,Female}

    private int id;
    private String name;
    private final int yearOfBirth;
    private Gender gender;
    private static int count=0;


    public Person(String name,int yearOfBirth,Gender gender){
        this.name=name;
        this.yearOfBirth=yearOfBirth;
        this.id = ++count;

        //check gender
//        if (gender.equals("Male")||gender.equals("Female")) {
//            this.gender=gender;
//        }
//        else throw new  IllegalArgumentException("Wrong");

        this.gender=gender;
    }

    public void display(){
        System.out.println(
                "Id : " + this.id + "\n" +
                "Name : " + this.name + "\n" +
                "Year : " + this.yearOfBirth + "\n" +
                "Gender : " + this.gender + "\n"
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
