import java.util.Scanner;

class Cylinder{
    public double radius = 0;
    public double height = 0;
    public double area =  0;

    public void Area(){
        area = (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
        System.out.print("This is the area: "+area);
    }
}

class CylinderVol extends Cylinder{
    public double volume = 0;

    public void Volume(){
        volume = Math.PI*(radius*radius)*height;
        System.out.print("This is the volume: "+volume);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner r = new Scanner(System.in);
        CylinderVol Shape = new CylinderVol();

        while (true){
            System.out.print("Input radius of cylinder: ");
            Shape.radius = r.nextDouble();

            System.out.print("Input height of cylinder: ");
            Shape.height = r.nextDouble();

            if (Shape.radius <= 0 || Shape.height <= 0){
                System.out.println("Please Try Again");
                System.out.println();
                continue;
            }


            else{
                System.out.println();
                Shape.Area();
                System.out.println();
                Shape.Volume();
                break;
            }
    
        }
        r.close();
    }
}
