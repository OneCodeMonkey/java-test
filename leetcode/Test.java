import java.util.*;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0, retP = 0;
        int[] ret = new int[m + n];
        while (p1 != m && p2 != n) {
            if (nums1[p1] < nums2[p2]) {
                ret[retP] = nums1[p1];
                p1++;
            } else {
                ret[retP] = nums2[p2];
                p2++;
            }
            retP++;
        }
        if (p1 != m) {  // 数组1有尾部
            while(p1 != m) {
                ret[retP] = nums1[p1];
                retP++;
                p1++;
            }
        }
        if (p2 != n) {  // 数组2有尾部
            while(p2 != n) {
                ret[retP] = nums2[p2];
                retP++;
                p2++;
            }
        }

        System.arraycopy(ret, 0, nums1, 0, m + n);
    }
}