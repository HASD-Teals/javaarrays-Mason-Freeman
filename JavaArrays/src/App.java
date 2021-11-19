import java.util.*;
public class App {

    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    int[] keyAge = new int [] {0,5,10,13,15,16,18,21,30,40,50,55,65,70,100};
    String[] keyEvent = new String [] {"Birth","Kindergarten","Preteen","Teen","Driving","Sweet16","High School Graduation","Adult-All States", "Thirties","Forties","Fifties","Early Retirement","Retirement","Federal Retirement", "Centurian"};
    System.out.println("What is the birth year");
    int birthy = 0;
    birthy=input.nextInt();
    events(keyAge, keyEvent, birthy);
    }
    public static void events(int []Array1, String[] array, int birthy) {
        for(int i=0; i<Array1.length; i++) {
            System.out.print(Array1[i]+birthy);
            System.out.print(": ");
            System.out.println(array[i]);

        }
    }
}
