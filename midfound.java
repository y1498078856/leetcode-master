package learncode;

/**
 * @Author yangxin8@asiainfo.com
 * @Date 2020/10/9 12:02
 * @Version 1.0
 */
public class midfound {
    public int upper_bound_ (int n, int v, int[] a) {
        // write code here
        if(v > a[n-1]) return n + 1;
        int lo = 0, right = n;
        while(lo < right){
            int mid = lo + (right - lo)/2;
            if (a[mid] < v){
                lo = mid + 1;
            }else right = mid;
        }
        return lo + 1;
    }
}
