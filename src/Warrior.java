import java.util.Scanner;

public class Warrior extends BaseHero {
    double rage;
    public Warrior(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Za kreiranje Warriora unesite pratece informacije ");
        System.out.println(" Health: (0-100)");
        this.health= scanner.nextDouble();
        System.out.println(" Mana: (0-100)");
        this.mana= scanner.nextDouble();
        System.out.println(" Rage: (0-100)");
        this.rage= scanner.nextDouble();
        System.out.println(" Kreirali ste Warriora ");
    }


    @Override
    public void AreaAffectedHit() {
    ReceieveHit();
        System.out.println(" Prostor u kojem se nalazite je napadnut ");
    }

    @Override
    public void firePrimaryWeapon() {
        this.rage +=10;
        this.mana -=15;
        System.out.println(" Warrior napada primarnim oruzjem ");
    }

    @Override
    public void fireSecondaryWeapon() {
        this.rage +=30;
        this.mana -=45;
        System.out.println(" Warrior napada sekundarnim oruzjem ");

    }

    @Override
    public void ReceieveHit() {
        this.health-=15;
        System.out.println(" Warrior prima udarac ");
        this.isDead=this.health<=0;
    }

    @Override
    public void showStats() {
        System.out.println("Stanje Warriora: " + " Health: " + this.health + " Mana: " + this.mana + " Is our Hero dead " + this.isDead);
    }
}
