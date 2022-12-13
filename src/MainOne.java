import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne, numberTwo, smallNumber;
        int i,j;
        System.out.print("Enter a number: ");
        numberOne = scanner.nextInt();
        System.out.print("Enter a number: ");
        numberTwo = scanner.nextInt();

        if (numberOne < numberTwo) {
            smallNumber = numberOne;
        } else {
            smallNumber = numberTwo;
        }
        for (i = smallNumber; i >= 1; i--) {
            if ((numberOne % i == 0) && (numberTwo % i == 0)) {
                System.out.println("Greatest Common Divisior: " + i);
                break;
            }
        }
        for (j = 1; j <=numberOne*numberTwo; j++) {
            if ((j % numberOne == 0) && (j % numberTwo == 0)) {
                System.out.println("Least Common Multiple: "+j);
                break;
            }
        }
    }
}
