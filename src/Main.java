//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 2;

        double doubleOperandA = 1.10;
        double doubleOperandB = 2.20;
        double doubleSum = 3.30;
        double doubleProduct = 4.40;
        double doubleDifference = 5.50;
        double doubleQuotient = 6.60;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandB - intOperandA;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandB / intOperandA;
        intModulo = intOperandA % intOperandB;

        System.out.println("The Sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The Difference using ints of " + intOperandB + " " + intOperandA + " is " + intDifference);
        System.out.println("The Product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The Quotient using ints of " + intOperandB + " " + intOperandA + " is " + intQuotient);
        System.out.println("The Modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandB - doubleOperandA;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandB / doubleOperandA;

        System.out.println("The Sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        System.out.println("The Difference using doubles of " + doubleOperandB + " " + doubleOperandA + " is " + doubleDifference);
        System.out.println("The Product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The Quotient using doubles of " + doubleOperandB + " " + doubleOperandA + " is " + doubleQuotient);
    }
}