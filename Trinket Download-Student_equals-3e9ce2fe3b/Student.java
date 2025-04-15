/*
 * Activity 4.9.7
 */ 
public class Student
{ 
  private String name = "";

  private int id; //Step 6a

  private int schoolYear; // Step 6b

  // Constructor
  Student(String inputName, int idNumber, int studentGrade) //Step 6c
  {
    name = inputName;
    id = idNumber; //Step 6c
    schoolYear = studentGrade; //Step 6c
  }

  public String toString() {  //Step 6d
    return "Student Name: " + name + "\nStudent ID: " + id + "\nStudent Grade: " + schoolYear; //Step 6d
  }

  public boolean equals(Student s1) { //Step 6e
    return this.id == s1.id;  //Step 6e
  }

}