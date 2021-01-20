import java.util.Arrays;

public class 合并两个有序数组 {
    /**
     * 方法一
     * @param A
     * @param m
     * @param B
     * @param n
     */
//    public void merge(int A[], int m, int B[], int n) {
//        for(int i=0;i<n;i++){
//            A[m+i]=B[i];
//        }
//        Arrays.sort(A);
//    }

    /**
     * 方法二
     * @param args
     */
//    public void merge(int A[], int m, int B[], int n){
//        // 当n为0时，不需要合并
//       if(n==0){return;}
//       // 当m为0时，并且n不为0，需要将B拷贝到A
//       else if(m==0){
//           for(int i=0;i<n;i++){
//               A[i] = B[i];
//           }
//           return;
//       }
//        // 当两个数组都为0，不做操作
//       if(m==0&&n==0) return;
//        // 分别记录A,B的最右边位置
//        int i=m-1;
//        int j =n-1;
//        // A,B合并后的数组的角标
//        int index = m+n-1;
//        // B数组数据取完为结束信号
//        while(j>=0){
//            // A数组还未取完
//            if(i>=0){
//                if(A[i]>B[j]){
//                    A[index] = A[i];
//                    i--;
//                }else{
//                    A[index]=B[j];
//                    j--;
//                }
//                // A数组已取完，将B逆序添加到A后
//            }else{
//                A[index]=B[j];
//                j--;
//            }
//            // 每次添加一个数进去，指针就向前移  从后往前添加
//            index --;
//
//        }
//    }

    /**
     * 方法三
     *  //args
     */

    public void merge(int A[], int m, int B[], int n){
        int i = m+n-1;
        while (m>0&&n>0){
            if(A[m-1]>=B[n-1]){
                A[i] =A[m-1];
                m--;
                i--;
            }else{
                A[i] = B[n-1];
                n--;
                i--;
            }
        }
        //若A数组为空 将B数组赋值到A数组
        while(n>0){
            A[i] = B[n-1];
            n--;
            i--;
        }
    }
    public static void main(String[] args) {
        合并两个有序数组 s = new 合并两个有序数组();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        s.merge(nums1, m, nums2, n);
        System.out.println(nums1[5]);
    }
}
