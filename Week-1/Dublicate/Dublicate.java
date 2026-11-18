
import java.util.*;
class Dublicate {
public static void main(String args[]) {
int nums[] = {1, 2, 3, 1};
int k = 3;
HashMap<Integer, Integer> map = new HashMap<>();
boolean found = false;
for (int i = 0; i < nums.length; i++) {
if (map.containsKey(nums[i])) {
if (i - map.get(nums[i]) <= k) {
found = true;
break;
}
}
map.put(nums[i], i);
}
System.out.println(found);
}
}
