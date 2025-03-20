public class MethodReturnTypes {

    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }

    public static void main(String[] args) {
        displayWelcomeMessage();

        int value1 = 20;
        int value2 = 30;
        double result = calculateAverage(value1, value2);

        System.out.println("The average is: " + result);
    }
}
