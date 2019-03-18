package Trees;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
public List<Integer> postOrderTraversal(TreeNode root){
	List<Integer> res = new ArrayList<Integer>();
	helper(root, res);
	return res;
}

private void helper(TreeNode root, List<Integer> res) {
	// TODO Auto-generated method stub
	if (root!=null) {
		if(root.left!=null) {
			helper(root.left, res);}
		if(root.right !=null) {
			helper(root.right, res);
		}
		res.add(root.val);
		}
	}


public static void main(String args[]) {
	TreeNode a = new TreeNode(6);
	TreeNode b = new TreeNode(7);
	TreeNode c = new TreeNode(8);
	a.left = b;
	a.right = c;
	PostOrderTraversal node = new PostOrderTraversal();
	List <Integer> d = node.postOrderTraversal(a);
	System.out.println(d);
}
}
