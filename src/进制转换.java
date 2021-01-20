public class 进制转换 {
    /**
     * 进制转换
     * @param M int整型 给定整数
     * @param N int整型 转换到的进制
     * @return string字符串
     */
    public static String solve(int M, int N) {
        // write code here
        boolean nagative = false;
        //负数处理
        if(M<0){
            nagative = true;
            M = -M;
        }
        StringBuilder sb = new StringBuilder();
        while (M>0){
            int k = M%N;
            //大于10进制的处理
            if(k>=10){
                sb.append((char)(k-10+'A'));
            }else{
                sb.append(k);
            }
            M = M/N;
        }
        //负数添加“-”
        if(nagative){
            sb.append("-");
        }
        //字符反转
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int M = 125;
        int N = 16;
        System.out.println(solve(M,N));

    }
}
