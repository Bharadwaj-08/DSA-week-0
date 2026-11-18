
class MissingNumber {
public static void main(String[] args) {
int[] nums = {3, 0, 1};
int n = nums.length;
for (int i = 0; i <= n; i++) {
boolean found = false;
for (int j = 0; j < n; j++) {
if (nums[j] == i) {
found = true;
break;
}
}
if (found == false) {
System.out.println(i);
break;
}
}
}
}
