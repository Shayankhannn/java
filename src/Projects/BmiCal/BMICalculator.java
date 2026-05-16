package Projects.BmiCal;

public class BMICalculator {
    public double calculateBmiImperial(double weightInPounds,double heightInInches){
        return weightInPounds / (heightInInches*heightInInches) * 703;
    }
    public double calculateBmiMetric(double weightInkilo,double heightInMeters){
        return weightInkilo  / (heightInMeters*heightInMeters);
    }
}
