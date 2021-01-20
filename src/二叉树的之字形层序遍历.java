import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的之字形层序遍历 {
      public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
      }
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        if(root==null) return new ArrayList();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        //判断节点的子节点的奇偶性
        int count =1;
        while (!queue.isEmpty()){
            int n = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            //奇数 即单个子节点 直接添加
            if(count%2==1){
                res.add(list);
                count++;
            //偶数 及子节点为偶数 考虑顺序 列表反转
            }else{
                Collections.reverse(list);
                res.add(list);
                count++;
            }
        }
        return res;
    }
}



