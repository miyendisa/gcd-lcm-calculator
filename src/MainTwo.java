import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne, numTwo, smallNum;
        int i = 1;

        System.out.print("Enter a number: ");
        numOne = scanner.nextInt();
        System.out.print("Enter a number: ");
        numTwo = scanner.nextInt();

        if (numOne < numTwo) {
            smallNum = numOne;
        } else {
            smallNum = numTwo;
        }
        while (smallNum >= 1) {
            if ((numOne % smallNum == 0) && (numTwo % smallNum == 0)) {
                System.out.println("Greatest Common Divisior: " + smallNum);
                break;
            }
            smallNum--;
        }
        while (i <= numOne * numTwo) {
            if ((i % numOne == 0) && (i % numTwo == 0)) {
                System.out.print("Least Common Multiple: " + i);
                break;
            }
            i++;
        }
    }
}
