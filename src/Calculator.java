
import java.util.ArrayList;
public class Calculator {
    private Variables variables;
    private ArrayList<Double> result;



    public Calculator(double a, double b, double c){
        this.variables = new Variables(a, b, c);
    }

    public double beregnDiskriminant(){
        return Math.pow(variables.getB(),2) - 4 * variables.getA() * variables.getC();
    }

    public ArrayList<Double> beregnRødder(){
        double root1 = 0;
        double root2 = 0;
        result = new ArrayList<>();
        if (beregnDiskriminant()> 0) {
            root1 = (-variables.getB() + Math.sqrt(beregnDiskriminant()))/ (2 * variables.getA());
            root2 = (-variables.getB() - Math.sqrt(beregnDiskriminant()))/ (2 * variables.getA());
            result.add(root1);
            result.add(root2);

        } else if (beregnDiskriminant() == 0) {
            root1 = (-variables.getB()/ (2 * variables.getA()));
            result.add(root1);

        }
        return result;
    }




}
