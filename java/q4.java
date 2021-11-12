import java.util.Scanner;
class q4{
    public static void main(String[]args){
        int x, y, q;
        int Travel, Cost;   
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of gallon: ");
        x = in.nextInt();
        System.out.printf("Enter the number of miles per gallon: ");
        y = in.nextInt();
        System.out.printf("Enter the Price of Gallons: ");
        q= in.nextInt();
        Travel = y * x;
        Cost = ((250/y) * q);
        System.out.println("The Car can Travel with gas "+y+"milles");
        System.out.printf("The cost of travelling 250 miles with the car is:"+Cost);
    }
}