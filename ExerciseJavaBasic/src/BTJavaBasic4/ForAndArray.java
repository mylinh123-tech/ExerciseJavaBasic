package BTJavaBasic4;

public class ForAndArray {
    public static void main(String[] args) {
        int inputNumber = 50;
        int totalEvenNumber = 0;

        System.out.print("Even number: ");
        // Dung vong lap for de in so chan
        for (int i = 0; i < inputNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                totalEvenNumber = totalEvenNumber + 1;
            }
        }
        System.out.println();

        //Khai bao mang chua so chan , size = tong so chu so chan, sau do gan so chan vao mang
        System.out.print("Array list: ");
        int[] arrayNumber = new int[totalEvenNumber];
        int index = 0;
        for (int i = 0; i < inputNumber; i++) {
            if (i % 2 == 0) {
                arrayNumber[index] = i;
                System.out.print(i + " ");
                index = index +1;

            }
        }


            }
        }






//        ArrayList <Integer> numberArray = new ArrayList<>();
//        System.out.print("Even number: ");
//        // Dung vong lap for de in so chan va them so chan vao ArrayList
//        for (int i = 0; i < inputNumber; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//                numberArray.add(i);
//
//            }
//        }
//        System.out.println();
//        System.out.print("Array list: ");
//
//        // Duyet cac phan tu trong Arraylist roi in ra tung phan tu
//        for (int index : numberArray){
//            System.out.print(index + " ");
//        }




