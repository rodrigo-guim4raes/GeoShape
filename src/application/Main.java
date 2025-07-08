package application;

import entity.Circle;
import entity.Rectangle;
import entity.Shape;
import enumerations.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int number = sc.nextInt();

        for (int i=1; i<=number; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r' || ch == 'R'){
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.println("Ray: ");
                double ray = sc.nextDouble();
                list.add(new Circle(color, ray));
            }
        }
        System.out.println("Shape Areas:");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}