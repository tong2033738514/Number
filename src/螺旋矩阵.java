import java.util.ArrayList;

public class 螺旋矩阵 {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(matrix.length==0) return res;

        int top =0;
        //行数  最底行
        int bottom = matrix.length-1;
        int left =0;
        //列数  最右列
        int right = matrix[0].length-1;
        while(true){
            //顶层  从左到右
            for(int i=left;i<=right;i++) res.add(matrix[top][i]);
            top++;
            //截至条件
            if(left>right||top>bottom) break;
            //右面 从上到下
            for(int i = top;i<=bottom;i++) res.add(matrix[i][right]);
            right--;
            if(left>right||top>bottom) break;
            //底层 从右往左
            for(int i=right;i>=left;i--) res.add(matrix[bottom][i]);
            bottom--;
            if(left>right||top>bottom) break;
            //左面 从下往上
            for(int i=bottom;i>=top;i--) res.add(matrix[i][left]);
            left++;
            if(left>right||top>bottom) break;

        }
        return res;

    }
}
