public class Main {
    static int average;

    public static int average(int[] value, int minimum, int maximum) {
        int i = 0;
        int inputNumber = 0;
        int validNumber = 0;
        int sum = 0;

        while ((value[i] != -999) && (inputNumber < 100)) {
            inputNumber++;
            if ((value[i] >= minimum) && (value[i] <= maximum)) {
                validNumber++;
                sum = sum + value[i];
            } else continue;
            i++;
        }

        if (validNumber > 0)
            average = sum / validNumber;
        else
            average = -999;

        return average;
    }

    public static void main(String[] args) {

    }

}