import java.util.Scanner;

public class Paladin extends BaseHero{

    double rage;
    public Paladin(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Za kreiranje Paladina unesite pratece informacije ");
        System.out.println(" Health: (0-100)");
        this.health= scanner.nextDouble();
        System.out.println(" Mana: (0-100)");
        this.mana= scanner.nextDouble();
        System.out.println(" Rage: (0-100)");
        this.rage= scanner.nextDouble();
        System.out.println(" Kreirali ste Paladina ");
    }
    @Override
    public void AreaAffectedHit() {
        ReceieveHit();
        System.out.println(" Prostor u kojem se nalazite je napadnut ");
    }

    @Override
    public void firePrimaryWeapon() {
        this.rage +=20;
        this.mana -=15;
        System.out.println(" Paladin napada primarnim oruzjem ");
    }

    @Override
    public void fireSecondaryWeapon() {
        this.rage +=40;
        this.mana -=35;
        System.out.println(" Paladin napada sekundarnim oruzjem ");
    }

    @Override
    public void ReceieveHit() {
            this.health-=25;
        System.out.println(" Paladin prima udarac ");
            this.isDead=this.health<=0;
    }

    @Override
    public void showStats() {
                System.out.println("Stanje Paladina: " + " Health: " + this.health + " Mana: " + this.mana + " Is our Hero dead " + this.isDead);
            }
}
