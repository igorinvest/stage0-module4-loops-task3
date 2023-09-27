package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            String numberToSum = "";
            for (int j = 1; j <= i; j++) {
                numberToSum = numberToSum + String.valueOf(9);
                //System.out.println(numberToSum);
            }
            //System.out.println(Integer.parseInt(numberToSum));
            sum = sum + Integer.parseInt(numberToSum);
        }
        System.out.println(sum);
    }
}
