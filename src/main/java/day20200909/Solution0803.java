package day20200909;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

       示例 1:

        输入: 123
        输出: 321
         示例 2:

        输入: -123
        输出: -321
        示例 3:

        输入: 120
        输出: 21

   */
public class Solution0803 {
    public  static   int reverse(int x) {
     int ans=0;
     while (x!=0) {
      int pop=x%10;
      if (ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && pop> 7)){
         return 0;
      }
      else if (ans<Integer.MIN_VALUE/10 ||(ans==Integer.MIN_VALUE/10 && pop<-8)){
          return 0;
      }
      else {
          ans = ans * 10 + pop;
          x /= 10;
      }
     }
     return ans;
    }


    public static void main(String[] args) {
        reverse(-2147483648);
        System.out.println(reverse(-2147483648));
        int x=-846384741;
        System.out.println(Integer.MIN_VALUE);
    }

}
