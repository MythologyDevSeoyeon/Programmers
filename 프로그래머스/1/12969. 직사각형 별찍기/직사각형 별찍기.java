import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int j = 1; j<= b; j++){
            for(int i = 1; i <= a; i++){
            sb.append("*");
            }
            sb.append("\n");
        }

        String star = sb.toString();
        System.out.println(star);
    }
}