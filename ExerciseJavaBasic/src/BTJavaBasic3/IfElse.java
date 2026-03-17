package BTJavaBasic3;

public class IfElse {

    public void Login (){
        boolean isStudent = true;
        String username = "2121013019";
        String password = "Mylinh001";
        float score = 7.8f;
        if (isStudent != true){
            System.out.println("Don't have access permission ");
        }

        if (isStudent == true && username =="2121013019"&& password == "Mylinh001"){
            System.out.println("Login successfull, below is your learning result.");
            if( score >= 8) System.out.println("Excellent");
            else if (score >= 6.5 && score < 8) System.out.println("Good");
            else if  (score >= 5 && score < 6.5 ) System.out.println("Average");
            else System.out.println("Fail");
        }

        if (isStudent == true && (username !="2121013019" || password != "Mylinh001")){
            System.out.println("Username or Password incorrect");
        }

    }

    public void checkNumber ()
    {   int fixNumber = 100;
        int inputNumber = 99;
        if (inputNumber == fixNumber) System.out.println(inputNumber +" equals "+fixNumber);
        if (inputNumber > fixNumber) System.out.println(inputNumber +" greater than "+fixNumber);
        if (inputNumber < fixNumber) System.out.println(inputNumber +" less than "+fixNumber);



    }

    public static void main(String[] args) {
        IfElse object  = new IfElse();
        object.checkNumber();
        object.Login();

    }
}
