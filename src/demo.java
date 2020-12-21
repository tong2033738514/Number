import java.util.HashMap;

public class demo {

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,7,9,1,2,2,3};
        
        System.out.println(maxLength(arr));

    }
    /*public int maxLength (int[] arr) {
        // write code here
        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }*/
     public static int maxLength(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for (int start = 0, end = 0; end < arr.length; end++) {
            if (map.containsKey(arr[end])) {
                //重复了
                start = Math.max(start, map.get(arr[end]) + 1);
                //注意：这里一定要取最大的start，不然就错误了
                //为什么？ 因为重复数字的索引很可能比start小
            }
            max = Math.max(max, end - start + 1);
            map.put(arr[end], end);
        }
        return max;
    }
}