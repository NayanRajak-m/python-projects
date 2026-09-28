/**import java.util.Scanner;
Class area
{
    publlic stati Void main(String arg[])
        {
            scanner sc=New Scanner(system.in);
            System.out.println("Enter radius:")
            double r=sc nextDouble();
            double area=3.14*r*r;
            System.out.println("Area of circle="+area);    
        }
    
}**/

import java.util.Scanner;

class area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        double r = sc.nextDouble();

        double area = 3.14 * r * r;

        System.out.println("Area of circle = " + area);
    }
}/