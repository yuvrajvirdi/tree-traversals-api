package com.traversal.api;

public class Traversal {
    private final long id;
    private final String treeString;
    private final String preorder;
    private final String inorder;
    private final String postorder;

    public Traversal(long id, String treeString){
        this.id = id;
        this.treeString = treeString;
        this.preorder = (new BinaryTree(treeString)).makePreorder();
        this.inorder = (new BinaryTree(treeString)).makeInorder();
        this.postorder = (new BinaryTree(treeString)).makePostorder();
    }

    public long getId(){
        return id;
    }

    public String getTreeString(){
        return treeString;
    }

    public String getPreorder(){
        return preorder;
    }
    
    public String getInorder(){
        return inorder;
    }

    public String getPostorder(){
        return postorder;
    }
}
