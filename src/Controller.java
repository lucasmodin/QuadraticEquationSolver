import java.util.ArrayList;
public class Controller {
    private Calculator calculator;

    public Controller(double a, double b, double c){
        this.calculator = new Calculator(a, b, c);
    }

    public double beregnDiskriminant(){
        return calculator.beregnDiskriminant();
    }
    public ArrayList<Double> beregnRødder(){
        return calculator.beregnRødder();
    }




}
