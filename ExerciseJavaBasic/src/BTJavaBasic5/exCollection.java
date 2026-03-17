package BTJavaBasic5;

import BTJavaBasic1.Information;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class exCollection {
    Map<String, Object> hashMap = new HashMap<>();

   public void StudentInfo()
   {
       hashMap.put("studentID", "2121013019");
       hashMap.put("studentName", "Nguyen Thi My Linh");
       hashMap.put("classID","21DTH1" );
   }

    public static void main(String[] args) {
        int inputNumber = 50;
        ArrayList <Integer> arrayList = new  ArrayList<>();
        System.out.print("Even numberss: ");
        for (int i = 0; i < inputNumber; i ++){
            if (i%2 == 0){
                System.out.print(i + " ");
                arrayList.add(i);
            }
        }
        System.out.println();
        System.out.print("Array list of Even numbers: ");
        for (int index : arrayList){
            System.out.print(index+" ");
        }
        System.out.println();

        System.out.println("=======================================");
        exCollection student = new exCollection();
        student.StudentInfo();

        for (Map.Entry<String, Object> entry : student.hashMap.entrySet()){
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }

    }
}
