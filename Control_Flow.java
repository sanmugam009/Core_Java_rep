import java.util.*;

public class Control_Flow{
    public static void main(String[] args){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();
        System.out.println("Enter another number: ");
        y = sc.nextInt();

        //if-else statement to compare the two numbers
        if(x > y){
            System.out.println("The first number is greater than the second number.");
        }
        else if(x < y){
            System.out.println("The first number is less than the second number.");
        }
        else{
            System.out.println("The first number is equal to the second number.");
        }

        //switch statement to determine the day of the week based on a number input
        int day;
        System.out.println("Enter a number between 1 and 7 to determine the day of the week: ");
        day = sc.nextInt();
        switch(day){        
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        //for loop to print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10: ");
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }   
        //while loop to print numbers from 10 to 1

        System.out.println("\nNumbers from 10 to 1: ");
        int j = 10;
        while(j >= 1){
            System.out.print(j + " ");
            j--;
        }   
        //do-while loop to print numbers from 1 to 5
        System.out.println("\nNumbers from 1 to 5: ");
        int k = 1;
        do{
            System.out.print(k + " ");
            k++;
        } while(k <= 5);     
    }
}