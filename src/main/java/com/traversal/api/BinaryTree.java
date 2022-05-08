package com.traversal.api;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(String elems){
        String[] nodeArr = elems.split("-");
        if (nodeArr.length == 0) root = null;
        this.root = makeBinaryTree(nodeArr, root, 0, nodeArr.length);
    }

    public TreeNode makeBinaryTree(String[] arr, TreeNode node, int i, int n){
        if (i < n){
            TreeNode temp = new TreeNode(arr[i]);
            node = temp;
            node.setLeft(makeBinaryTree(arr, node.getLeft(), 2*i+1, n));
            node.setRight(makeBinaryTree(arr, node.getRight(), 2*i+2, n));
        }
        return node;
    }

    public String makePreorder(){
        List<String> list = new ArrayList<>();
        preorderTraversal(list, this.root);
        String preorder = list.stream()
            .map(n -> String.valueOf(n))
            .collect(Collectors.joining("-"));
        return preorder;
    }

    private void preorderTraversal(List<String> list, TreeNode rootNode){
        if (rootNode!=null){
            list.add(rootNode.getData());
            preorderTraversal(list, rootNode.getLeft());
            preorderTraversal(list, rootNode.getRight());
        }
    }

    public String makeInorder(){
        List<String> list = new ArrayList<>();
        inorderTraversal(list, this.root);
        String inorder = list.stream()
            .map(n -> String.valueOf(n))
            .collect(Collectors.joining("-"));
        return inorder;
    }

    private void inorderTraversal(List<String> list, TreeNode rootNode){
        if (rootNode.getLeft()!=null) inorderTraversal(list, rootNode.getLeft());
        list.add(rootNode.getData());
        if (rootNode.getRight()!=null) inorderTraversal(list, rootNode.getRight());
    }

    public String makePostorder(){
        List<String> list = new ArrayList<>();
        postorderTraversal(list, this.root);
        String postorder = list.stream()
            .map(n -> String.valueOf(n))
            .collect(Collectors.joining("-"));
        return postorder;
    }

    private void postorderTraversal(List<String> list, TreeNode rootNode){
        if (rootNode==null) return;
        postorderTraversal(list, rootNode.getLeft());
        postorderTraversal(list, rootNode.getRight());
        list.add(rootNode.getData());
    }
}
