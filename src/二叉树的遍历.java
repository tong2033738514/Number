import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的遍历 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root!=null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                int size =queue.size();

                ArrayList<Integer> newLevel = new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode temp = queue.poll();
                    newLevel.add(temp.val);
                    if(temp.left!=null)
                        queue.offer(temp.left);
                    if(temp.right!=null)
                        queue.offer(temp.right);
                }
                result.add(newLevel);
            }
        }
        return result;
    }

}
