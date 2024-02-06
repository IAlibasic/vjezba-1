import java.util.Scanner;

public class  Circle extends Shape{

    double r;
    double Pi=3.14;

    public Circle (){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Kreiranje kruga");
        System.out.println( "Unesite vrijednost r");
        this.r=scanner.nextDouble();
        this.x=5.2;
        this.y=3.8;
        this.color="yellow";
        this.name="First Circle";
    }
    @Override
    public double Area(){
        return r*r*Pi;
    }
}
