import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 两数之和 {
    /**
     * 暴力破解
     * @param numbers
     * @param target
     * @return
     */
//    public static int[] twoSum(int[] numbers, int target) {
//        // write code here
//        int length = numbers.length;
//        for(int i=0;i<length;i++){
//            for(int j=i+1;j<length;j++){
//                if(numbers[i]+numbers[j]==target){
//                    return new int[]{i+1,j+1};
//                }
//            }
//        }
//        return null;
//    }

    /**
     *
     * 方法二 map时间换空间
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int temp = target-numbers[i];
            //map中是否包含改值 保证索引不重复
            if(map.containsKey(temp)&&map.get(temp)!=i){
                return new int[]{map.get(temp)+1,i+1};  //初始化一维数组存储索引
            }else map.put(numbers[i],i);  //不包含该值 将其存入map中
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ints = twoSum(arr, target);
        for(int i=0;i<ints.length;i++){
            System.out.print(ints[i] + " ");
        }

    }
}
