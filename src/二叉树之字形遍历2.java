
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;


public class 二叉树之字形遍历2 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null) return result;
        //不为空添加根节点
        q.add(root);
        //统计该节点的子节点的奇偶数
        int cnt=0;
        while(!q.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<Integer>();

            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode t = q.poll();
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                if(cnt%2==0) temp.add(t.val);
                else temp.add(0,t.val);
            }
            result.add(temp);
            cnt++;
        }
        return result;
    }
}


