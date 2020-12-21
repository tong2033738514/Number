public class 转动数组找目标 {

    public int search (int[] A, int target) {
        // write code here
        int l=0;
        int r = A.length-1;
        while(l<=r){
            int mid =l+(r-l)/2;
            if(A[mid]==target){
                return mid;
            }
            //左边有序
            if(A[mid]>=A[l]){
                if(A[mid]>target&&A[l]<=target){
                    r=mid-1;
                }else{
                    l = mid+1;
                }
            }else{
                //右边有序
                if(A[mid]<target&&A[r]>=target){
                    l=mid+1;
                }else{
                    r=mid-1;
                }

            }
        }
        return -1;
    }
}
