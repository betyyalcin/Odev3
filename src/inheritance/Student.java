package inheritance;

public class Student extends User{

    private int id;
    private String FirstName;
    private String LastName;
    private String programing;
    private String level;

    public Student(){

    }
    public Student(int id, String FirstName, String LastName, String programing) {
        super();
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.programing = programing;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPrograming() {
        return programing;
    }

    public void setPrograming(String programing) {
        this.programing = programing;
    }
    public String getLevel () {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
