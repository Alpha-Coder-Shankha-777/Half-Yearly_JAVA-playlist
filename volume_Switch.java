
import java.util.Scanner;
class volume_Switch {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Press 1 to calculate the volume of Cube.\n Press 2 to calculate the volume of Cuboid. \n Press 3 to calculate the volume of Sphere");
        
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: System.out.println("Enter the side of Cube: ");
            int s = sc.nextInt();
            int cube = s * s * s;
            System.out.println("The volume of cube is: "+cube);

            break;

            case 2: System.out.println("Enter the length, breadth, height of cuboid: ");
            int l = sc.nextInt();
            int b = sc.nextInt();
            int h = sc.nextInt();
            int cuboid = l * b * h;
            System.out.println("The volume of cuboid is: "+cuboid);

            break;

            case 3: System.out.println("Enter the radius of sphere");
            double r = sc.nextDouble();
            double sphere = 4.0/3.0 * 3.14 * r * r;
            System.out.println("The volume of sphere is: "+sphere);
            
            break;
            
            default:

            System.out.println("Wrong Choice!!");
            
            sc.close();


        }
    }
}