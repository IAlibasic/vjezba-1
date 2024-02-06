public class Kalkulator {
    double operand1;
    double operand2;
    double add(){
        System.out.println(" Sabiranje dva broja ");
      return operand1+operand2;
    }
    double sub(){
        System.out.println(" Oduzimanje dva broja ");
        return operand1-operand2;
    }
    double mul() {
        System.out.println(" Mnozenje dva broja ");
        return operand1 * operand2;
    }
    double div() {
        System.out.println(" Dijeljenje dva broja ");
        return operand1 / operand2;
    }
}
