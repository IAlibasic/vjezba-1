import java.util.Scanner;

public class Square extends Shape {
    double a;
    public Square (){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Kreiranje kvadrata");
        System.out.println( "Unesite vrijednost a");
        this.a=scanner.nextDouble();
        this.x=4.2;
        this.y=3.1;
        this.color="red";
        this.name="First square";
    }
    @Override
    public double Area(){
        return a*a;
    }

}
