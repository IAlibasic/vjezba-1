public abstract class BaseHero {

    double health, mana;
    boolean isDead;

    public abstract void AreaAffectedHit();
    public abstract void firePrimaryWeapon();
    public abstract void fireSecondaryWeapon();
    public abstract void ReceieveHit();
    public abstract void showStats();
}
