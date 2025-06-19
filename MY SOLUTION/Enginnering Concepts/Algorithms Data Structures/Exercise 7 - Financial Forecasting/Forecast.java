public class Forecast {

    double initialValue;
    double rate;
    int years;

    public Forecast(double initialValue, double rate, int years) {
        this.initialValue = initialValue;
        this.rate = rate;
        this.years = years;
    }

    public double calculateFutureValue(int years){
        if(years==0){
            return initialValue;
        }
        return calculateFutureValue(years-1)*(1+rate);
    }
}
