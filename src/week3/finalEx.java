package week3;

public class finalEx {
        final int x = 10;
        final double PI = 3.14;
        final void hesaplama(int a, int b){
            int toplam =a+ b;

        }

        public static void main(String[] args) {
            finalEx myObj = new finalEx();
            //myObj.x = 50; // will generate an error: cannot assign a value to a final variable
            //myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
            System.out.println(myObj.x);
        }
    }


