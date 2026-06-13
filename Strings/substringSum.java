public class substringSum {
    public static void main(String[] args) {
        String str = "5643";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String sub = str.substring(i,j);
                int num = Integer.parseInt(sub);
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
