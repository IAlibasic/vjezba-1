import java.util.Scanner;

public class Pdf1i2 {
    final static String measure=" cm ";
    //Zadatak 1:Sabiranje dva broja
    public static void main(String[] args){
        System.out.println(" Zadatak 1");
        int a=2, b=3;
        int sum=a+b;
        System.out.println("First Operand " + a + " Second Operand " + b);
        System.out.println("Sum: " + sum);

        //Zadatak 2:Povrsina pravougaonika dva broj
        System.out.println(" Zadatak 2");
        int res=a*b;
        String message = "Rectangle is " + a + measure + " * " + b + measure + " = " + res;
        System.out.println(message);

        //Zadatak 3:Provjeriti da li je a jednako b
        System.out.println(" Zadatak 3");
        boolean res1 = a==b;
        System.out.println(res1);
        int x=10, y=20;
        boolean res2= x<20&&x>10;
        System.out.println(res2);
        boolean res3= x<20||y>10;
        System.out.println(res3);

        /*Zadatak 4:Napraviti program koji ce na izlazu prikazati da li je vrednost promenljive koju je
        korisnik uneo parna*/

        Scanner scanner= new Scanner (System.in);
        System.out.println(" Zadatak 4");
        int p;
        System.out.println("Unesite jedan broj");
        p = scanner.nextInt();
        boolean modulo= p%2==0;
        if (modulo){
            System.out.println("Broj je paran");}
            else {
            System.out.println("Broj nije paran");}

    }
}
