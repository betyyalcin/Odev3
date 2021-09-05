package inheritance;

public class Main {

    public static void main(String[] args) {

        User user= new User();
        user.name="Yunus Emre";

        Student student1= new Student();
        student1.setId(1);
        student1.setFirstName("Betül ");
        student1.setLastName(" Yalçın ");
        student1.setPrograming("JavaScript ");
        student1.setLevel("/ intermediate level");

        Instructor instructor1= new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("Engin ");
        instructor1.setLastName(" Demiroğ ");
        instructor1.setPrograming("C# , Java Script/React , C++ , Python , .... ");


        UserManager userManager = new UserManager();
        User [] users = {user};
        userManager.addMultiple(users);


        System.out.println(student1.getFirstName() + student1.getLastName());
        System.out.println(student1.getPrograming() + student1.getLevel());

        System.out.println(instructor1.getFirstName() + instructor1.getLastName());
        System.out.println(instructor1.getPrograming());
    }
}
