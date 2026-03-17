package BTJavaBasic2;

public class Calculator {
    public int Sum (int number1 , int number2){
        int total = number1 + number2;
        return total;
    }

    public float Product (float floatNumber1, float floatNumber2){
        float product = floatNumber1 *floatNumber2;
        return product;
    }
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 100000;
        float floatNumber1 = 100.0023f;
        float floatNumber2 = 23.12f;
        Calculator calculator = new Calculator();
        System.out.println(number1 +" + "+ number2 + "= "+calculator.Sum(number1,number2));
        System.out.println(floatNumber1 +" * "+ floatNumber2 + "= "+calculator.Product(floatNumber1,floatNumber2));

    }
}
