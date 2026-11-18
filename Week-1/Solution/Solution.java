import java.util.Scanner;
class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
         System.out.println("Enter Size");
         n=sc.nextInt();
         int[] nums = new int[n];
         System.out.println("Enter target");
        int target=sc.nextInt();
        System.out.println("Enter numbers");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        } 
    }
}