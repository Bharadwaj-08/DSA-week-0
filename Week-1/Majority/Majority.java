
import java.util.*;
class Majority {
public static void main(String args[]) {
int nums[] = {3, 2, 3};
int n = nums.length;
ArrayList<Integer> list = new ArrayList<>();
for (int i = 0; i < n; i++) {
int count = 0;
if (list.contains(nums[i]))
continue;
for (int j = 0; j < n; j++) {
if (nums[i] == nums[j]) 
count++;
}
if (count > n / 3) {
list.add(nums[i]);
}
}
System.out.println(list);
}
}
