import java.util.Scanner;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=0,y=0;
        int[] res=new int[m+n];
        for(int i=0;i<m+n-1;)
        {
        if(nums1[x]==0||nums2[y]==0)
        {
            continue;
        
            if(nums1[x]<nums2[y])
                res[i++]=nums1[x++];
            else if(nums1[x]>nums2[y])
                res[i++]=nums2[y++];
            else if(nums1[x]==nums2[y])
                res[i++]=nums1[x++];
                res[i++]=nums2[y++];

        }
        }
        System.out.print(Arrays.toString(res));

        

        
    }
}