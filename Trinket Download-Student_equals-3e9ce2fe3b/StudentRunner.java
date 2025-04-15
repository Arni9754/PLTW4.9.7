/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName"); 
    Student t = new Student("Testname");
    Student r = new Student("New Name");

    // Below two statements are equivalent 
    System.out.println(s.equals(t)); 
    System.out.println(s.equals(r)); 
  } 
} 