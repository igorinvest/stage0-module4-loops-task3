package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String s = Integer.toString(t);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int pos = Character.getNumericValue(s.charAt(i));
            if(pos >= 0) {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
