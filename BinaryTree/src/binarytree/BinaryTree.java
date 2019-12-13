/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author asus
 */
public class BinaryTree<E> {
    private Node root;
    //KONSTRUKTOR
    public void NewData(char data){
        root = NewData(root,new Node(data));
    }
    //PROSES PEMBUATAN TREE
    private Node NewData(Node root, Node addNew){
        if (root == null){
            root = addNew; // membuat node dengan isi nilai awal yang di inputkan
            return root;
        }
        if (addNew.data < root.data){       //KONDISI KETIKA NILAI NODE LEBIH KECIL DARI ROOT,
            root.left = NewData(root.left, addNew); //MAKA AKAN BERADA DI CABANG SEBELAH KIRI
        }else{
            root.right = NewData(root.right, addNew); //KONDISI KETIKA NILAI NODE LEBIH BESAR DARI ROOT.
        }                                                 //MAKA AKAN BERADA DI CABANG SEBELAH KIRI
            return root;
    }

    //ALGORITMA TRAVELSAL INORDER
    private void inOrder(Node node){
        if (node != null){
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

    //ALGORITMA TRAVELSAL PREORDER
    private void PreOrder(Node node){
        if (node != null){
            System.out.print(node.data+" ");
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }

    //ALGORITMA TREVELSAL POSTORDER
    private void PostOrder(Node node){
        if (node != null){
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.data+" ");
        }
    }

    public void printInOrder(){
        System.out.println("InOrder : ");
        inOrder(root);
        System.out.println();
    }

    public void printPreOrder(){
        System.out.println("PreOrder : ");
        PreOrder(root);
        System.out.println();
    }

    public void printPostOrder(){
        System.out.println("PostOrder : ");
        PostOrder(root);
        System.out.println();
    }
    //ALGORITMA TRAVELSAL INORDER
    private void inOrderAscii(Node node){
        if (node != null){
            node.ascii = (int) node.data;
            inOrderAscii(node.left);
            System.out.print(node.ascii+" ");
            inOrderAscii(node.right);
        }
    }

    //ALGORITMA TRAVELSAL PREORDER
    private void PreOrderAscii(Node node){
        if (node != null){
            node.ascii = (int) node.data;
            System.out.print(node.ascii+" ");
            PreOrderAscii(node.left);
            PreOrderAscii(node.right);
        }
    }

    //ALGORITMA TREVELSAL POSTORDER
    private void PostOrderAscii(Node node){
        if (node != null){
            node.ascii = (int) node.data;
            PostOrderAscii(node.left);
            PostOrderAscii(node.right);
            System.out.print(node.ascii+" ");
        }
    }

    public void printInOrderAscii(){
        System.out.println("InOrder : ");
        inOrderAscii(root);
        System.out.println();
    }

    public void printPreOrderAscii(){
        System.out.println("PreOrder : ");
        PreOrderAscii(root);
        System.out.println();
    }

    public void printPostOrderAscii(){
        System.out.println("PostOrder : ");
        PostOrderAscii(root);
        System.out.println();
    }
}