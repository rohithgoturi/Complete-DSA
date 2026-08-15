public class compliment {
    public static int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        
        for(char bit : binary.toCharArray()){
            sb.append(bit=='0'?'1':'0');
        }
        
        int ans = Integer.parseInt(sb.toString(), 2);
        
        return ans;
    }

    public static void main(String[] args) {
        int num = 5;
        int complement = findComplement(num);
        System.out.println("The complement of " + num + " is: " + complement);
    }
}
