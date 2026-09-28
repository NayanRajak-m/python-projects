import java.util.Scanner;

class areas {
    public static void main(String[] args) {

        Scanner itachi = new Scanner(System.in);

        System.out.print("Enter radius:");
        double r = itachi.nextDouble();

        double area = 3.14 * r * r;

        System.out.println("Area of circle = " + area);
    }
}