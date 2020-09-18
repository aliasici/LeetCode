package Exceptions;

public class TryCatchMulti {
    public static void main(String[] args) { // PARENT AND CHILD REALTIONSHIP
        int[] arr = {10, 20};


        try {
            System.out.println(arr[20]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception is handled");


        } catch (ClassCastException e) {
            System.out.println("Class cast exception");


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound");

        }
        try{
            Thread.sleep(4000);
        }catch (Exception e){

        }

    }
}
