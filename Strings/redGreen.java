public class redGreen {
    public static void main(String[] args) {
        String str = "RRGRRG";
        int countR = 0;
        int countG = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'R') countR++;
            else countG++;
        }

        if(countR > countG) System.out.println(countG);
        else System.out.println(countR);
    }
}
