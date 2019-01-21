/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #7
 * Write a program that reads in two integers between 0 and 4294967295, 
 * stores them in int variables, and computes and displays their unsigned sum, 
 * difference, product, quotient, and remainder. 
 * Do not convert them to long values..
 */
package java_ex7_unsignedintegers;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Java_Ex7_UnsignedIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int int1 = scan.nextInt();
        System.out.print("Enter the Second integer: ");
        int int2 = scan.nextInt();
        
        int sum = int1 + int2; // Sum of unsigned integers
        System.out.print("Sum: ");
        System.out.println(Integer.toUnsignedString(sum));
        int diff = int1 - int2; // Substraction of two unsigned integers
        System.out.print("Difference: ");
        System.out.println(Integer.toUnsignedString(diff));
        int product = int1 * int2; // Product of unsigned integers
        System.out.print("Product: ");
        System.out.println(Integer.toUnsignedString(product));
        System.out.print("Quotient: ");
        System.out.println(Integer.toUnsignedString(Integer.divideUnsigned(int1, int2)));
        System.out.print("Remainder: ");
        System.out.println(Integer.toUnsignedString(Integer.remainderUnsigned(int1, int2)));
    }
    
}
