package Trees;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
public static List<Integer> preorderTraversal(TreeNode m){
	List<Integer> res = new ArrayList<Integer>();
	helper (m, res);
	return res;
	
}

private static void helper(TreeNode m, List<Integer> res) {
	// TODO Auto-generated method stub
	if (m!=null) {
		res.add(m.val);
		if(m.left !=null) {
		helper(m.left, res);
	}
		if (m.right != null){
			helper (m.right,res);
		}
}
}
    public static void main(String args[]) {
    	TreeNode a = new TreeNode(6);
    	TreeNode b = new TreeNode(7);
    	TreeNode c = new TreeNode(8);
    	a.left = b;
    	a.right = c;
    	List <Integer> d = preorderTraversal(a);
    	System.out.println(d);
    }
}
