package Trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public static List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List < Integer > res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }
    
    public static void main(String args[]) {
    	TreeNode a = new TreeNode(6);
    	TreeNode b = new TreeNode(7);
    	TreeNode c = new TreeNode(8);
    	a.left = b;
    	a.right = c;
    	List <Integer> d = inorderTraversal(a);
    	System.out.println(d);
    }
    
    
}
