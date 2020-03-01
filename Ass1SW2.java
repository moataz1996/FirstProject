package ass1sw2;

import java.util.Scanner;

public class Ass1SW2 {
    public static void CircleArea()
    {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
    }
    public static void main(String[] args) {
        CircleArea();
    }
    
}
