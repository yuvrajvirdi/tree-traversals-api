package com.traversal.api;

public class TreeNode {
    private String dataElem;
    private TreeNode left, right;

    public TreeNode(String dataItem){
        dataElem = dataItem;
        left = null;
        right = null;
    }

    public String getData(){
        return dataElem;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    public void setData (String newDataElem){
		dataElem = newDataElem;
	}

	public void setLeft (TreeNode newLeft){
		left = newLeft;
	}

	public void setRight (TreeNode newRight){
		right = newRight;
	}
}