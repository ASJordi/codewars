package easy;

public class CalculateBMI {

    public static String bmi(double weight, double height) {

        double bmi = weight / (height * height);

        return bmi <= 18.5 ? "Underweight" :
                bmi <= 25 ? "Normal" :
                        bmi <= 30 ? "Overweight" :
                                "Obese";

    }

}
