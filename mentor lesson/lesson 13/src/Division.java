public class Division {

    public double divideNumbers(double a, double b) throws DivisionByZeroException{
        double res = a/b;
        if (b==0){
            throw new DivisionByZeroException("0-a bolme emeliyyati etmek olmaz");
        }
        return res;
    }
}
