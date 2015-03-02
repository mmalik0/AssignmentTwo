import java.util.Arrays;
import java.util.Scanner;

public class AssignmentTwo {
	public static void main(String[] args) {
        String numb1, numb2, numb3, numb4,numb5;
        int med, middle;
        Double num1, num2, num3, num4, num5, sum, average, max1, min;
        int int1, int2, int3, int4, int5;
        int x = 0 ;


        System.out.println("Welcome!");
        System.out.println("Please enter five values "); //prompt user to  number
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter Value # " + (x + 1) );
        numb1 = keyboard.next();//Value 1
        System.out.println("Enter Value # " + (x + 2) );
        numb2 = keyboard.next();//Value 2
        System.out.println("Enter Value # " + (x + 3) );
        numb3 = keyboard.next();//Value 3
        System.out.println("Enter Value # " + (x + 4) );
        numb4 = keyboard.next();//Value 4
        System.out.println("Enter Value # " + (x + 5) );
        numb5 = keyboard.next();//Value 5

        num1 = Double.parseDouble(numb1); //double value
        int1 = num1.intValue(); //change from double to integer for sorting
        num2 = Double.parseDouble(numb2);
        int2 = num2.intValue();
        num3 = Double.parseDouble(numb3);
        int3 = num3.intValue();
        num4 = Double.parseDouble(numb4);
        int4 = num4.intValue();
        num5 = Double.parseDouble(numb5);
        int5 = num5.intValue(); //

        sum = num1+num2+num3+num4+num5; //formula for the sum
        System.out.println("The sum of the five numbers is " + sum); //display the sum

        average = (num1+num2+num3+num4+num5)/5; //formula for the average
        System.out.println("The average of the five numbers is " + average); // display the average

        max1 = Math.max(Math.max(num3, Math.max(num1, num4)), Math.max(num2, num5)); //formula for the maximum
        System.out.println("The maximum of the five numbers is " + max1); //display the max

        min = Math.min(Math.min(num1, Math.min(num2, num3)), Math.min(num4, num5)); //formula for the minimum
        System.out.println("The minimum of the five numbers is " + min); //Display the minimum

        int set[] = {int1, int2, int3, int4, int5};//setup the set
        Arrays.sort(set); //reorder it
        middle = set.length/2;//find the middle number
        med = set[middle + 0];//find the median
        System.out.println("The median of the five number is " + med); //display the median
        
        keyboard.close();
}

}