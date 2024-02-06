import java.util.Scanner;

public class Pdf3 {
    final static String measure= " cm2 ";
    public static void main(String[] args) {

        //Zadatak 1: Preko klase napraviti podatke za person1
//        System.out.println(" Zadatak 1");
//        Scanner scanner= new Scanner (System.in);
//        System.out.println(" Kreiranje nove osobe ");
//     Person person1 = new Person();
//        System.out.println(" Unesite ime osobe ");
//        person1.name= scanner.nextLine();
//        System.out.println(" Unesite prezime osobe ");
//        person1.lastname= scanner.nextLine();
//        System.out.println(" Unesite godine osobe ");
//        person1.age= scanner.nextInt();

//        //Zadatak 2: Preko klase napraviti podatke za student1
//        System.out.println(" Zadatak 2");
//        Student student1 = new Student();
//        System.out.println(" Kreiranje novog studenta ");
//        System.out.println(" Unesite ime studenta ");
//        student1.name= scanner.nextLine();
//        student1.name= scanner.nextLine();
//        System.out.println(" Unesite prezime studenta ");
//        student1.lastname= scanner.nextLine();
//        System.out.println(" Unesite godine studenta ");
//        student1.age= scanner.nextInt();
//        System.out.println(" Unesite broj indexa od studenta ");
//        student1.IndexNumber= scanner.nextLine();

        //Zadatak 3: Kreirati klasu Kalkulator koja ima dva svosjtva operand 1 i operand 2,
        // te uraditi metode add, sub, mul, i div tipa double
//        Kalkulator arimetickiOperatori = new Kalkulator();
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println(" Unesite Opeerand 1");
//        arimetickiOperatori.operand1 = scanner2.nextDouble();
//        System.out.println(" Unesite Opeerand 2");
//        arimetickiOperatori.operand2 = scanner2.nextDouble();
//        double result = arimetickiOperatori.add();
//        System.out.println(" Operand 1 is: " + arimetickiOperatori.operand1 + " Operand 2 is: " + arimetickiOperatori.operand2);
//        System.out.println(" Zbir dva broja je: " + result);
//        System.out.println(" Razlika dva broja je: " + arimetickiOperatori.sub());
//        System.out.println(" Rezultat mnozenja je: " + arimetickiOperatori.mul());
//        System.out.println(" Rezultat dijeljenja je: " + arimetickiOperatori.div());

        //Zadatak 4: Napraviti u klasama dva heroja koji ce da se bore jedan protiv drugog
//        System.out.println("Zadatak 4");
//        Warrior warrior= new Warrior();
//        Paladin paladin= new Paladin();
//        System.out.println("Round 1");
//        warrior.firePrimaryWeapon();
//        paladin.ReceieveHit();
//        paladin.firePrimaryWeapon();
//        warrior.ReceieveHit();
//        warrior.showStats();
//        paladin.showStats();
//
//        System.out.println("Round 2");
//        warrior.fireSecondaryWeapon();
//        paladin.ReceieveHit();
//        paladin.fireSecondaryWeapon();
//        warrior.ReceieveHit();
//        warrior.showStats();
//        paladin.showStats();

        //Zadatak 5: Napraviti klasu Shape koja sadrzi neke od podataka o geometrijskim oblicima, te tri klase koje nasljedjuju ovu klasu
        Circle circle=new Circle();
        circle.ptintShape();
        System.out.println("Povrsina kruga je " + circle.Area() + measure);
        Square square=new Square();
        square.ptintShape();
        System.out.println(" Povrsina kvadrata je: " + square.Area() + measure);

    }
}