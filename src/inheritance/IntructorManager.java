package inheritance;

public class IntructorManager{
        public void add (Instructor instructor){
            System.out.println(instructor.getFirstName() + instructor.getLastName() + instructor.getPrograming() );
    }
    public void addMultiple (Instructor [] instructors) {
        for (Instructor instructor : instructors) {
            add (instructor);
        }
    }
}



