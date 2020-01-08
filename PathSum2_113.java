package medium;

import java.util.ArrayList;
import java.util.List;

public class PathSum2_113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<List<Integer>> finalResult= new ArrayList<>();
	        helper(root, sum, new ArrayList<Integer>(), 0, finalResult);
	        return finalResult;
	    }
	    
	    public void helper(TreeNode root, int sum, List<Integer> res, int curSum, List<List<Integer>> finalResult){
	        if(root!=null){
	            res.add(root.val);
	            curSum+= root.val;
	        }else
	            return;
	        if(root.left==null && root.right==null && curSum==sum){
	            finalResult.add(res);
	            return;
	        }
	        helper(root.left, sum, new ArrayList<Integer>(res), curSum, finalResult);
	        helper(root.right, sum, new ArrayList<Integer>(res), curSum, finalResult);
	        return;
	    }
}
