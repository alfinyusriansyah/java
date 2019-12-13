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
public class Node {
    Node left, right;
    char data;
    int ascii;

    public Node(char data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}