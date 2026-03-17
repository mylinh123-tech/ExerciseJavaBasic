package BTJavaBasic1;

import java.time.Year;

public class Student {

    // Static Variable
    static String StudentID ="2121013019";
    static String Name = "Nguyen Thi My Linh ";

    // Instance Variable
    Boolean Gender = false ;
    int age = 23;
    String Address = "Go Vap, Ho Chi Minh";


     public  void ClassInfo()

        {   // Local Variable
             String classID = "21000123";
             String className = "Java Basic";
             String Department = "Information Technology";
             System.out.println(classID +"; "+className+"; "+Department);
        }
     public void SetGender(boolean gender)
     {
         if (gender == true){
             System.out.println("Male");

         }else{
             System.out.println("Female");
         }
     }

    public static void main(String[] args) {
         int age = new Student().age;
         String Address =new Student().Address;
         boolean Gender = new Student().Gender;
         

         System.out.println(StudentID);
         System.out.println(Name);

//         System.out.println(Student.StudentID);
//        System.out.println(Student.Name);

        Student object = new Student();
        object.SetGender(Gender);
        System.out.println(age);
        System.out.println(Address);
        // Get Info of static variable from Information class

        System.out.println(Information.department);
        System.out.println(Information.year);
        System.out.println(Information.advisor);

    }
}

