import java.util.Scanner;
class q3{
    public static void main(String []args){
        int revenue, Q;
        int P = 2500;
    
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of number of pacenger: ");
            Q = in.nextInt();
            revenue = P * Q;
        System.out.println("The company will generate $"+revenue+" for the tour.");


    }
}