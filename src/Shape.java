public class Shape {
    double x;
    double y;
    String color;
    String name;

    public double Area (){
        return 0;
    }
    public void ptintShape(){
        System.out.println( "Pozicija x: " + this.x);
        System.out.println( "Pozicija y: " + this.y);
        System.out.println( "Naziv: " + this.name);
        System.out.println( "Boja je " + this.color);
    }

}
