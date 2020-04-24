  
package utspbonomer4;

public class CourseDemo {

    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Ri", "Jung Hyeok", "AG0108");
       
       TextBook myTextBook = new TextBook("Aku Berdiri disini Untukmu", "Carrin Fuu", "Falcon");
       
       Course myCourse = new Course("Self Motivation", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
    
}
