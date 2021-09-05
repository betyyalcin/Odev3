package inheritance;

public class Instructor {
    private int id;
    private String FirstName;
    private String LastName;
    private String Programing;

   public Instructor (){

    }
    public Instructor(int id, String firstName, String lastName, String programing) {
        this.id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Programing = programing;
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
        return Programing;
    }

    public void setPrograming(String programing) {
        Programing = programing;
    }

}

