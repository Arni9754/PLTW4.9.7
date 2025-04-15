/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName", 5, 10); 
    Student t = new Student("Testname", 5, 6);
    Student r = new Student("New Name", 4, 3);

    // Below two statements are equivalent 
    System.out.println(s.equals(t));
    System.out.println(s.equals(r));
  } 
} 