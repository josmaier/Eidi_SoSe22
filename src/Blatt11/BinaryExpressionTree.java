package Blatt11;

/*
EidI SoSe 2022
Übungsblatt 11
Aufgabe 3
*/

import java.security.InvalidParameterException;
import java.util.NoSuchElementException;

public class BinaryExpressionTree {
    private StringNode root;

    public BinaryExpressionTree(String[] items) {
        if(items.length < 2)
            throw new NoSuchElementException();

        root = new StringNode(items[0]);
        insertNodes(root, items, 1);
        insertNodes(root, items, 2);
    }

    private void insertNodes(StringNode parent, String[] items, int index) {
        if(index < items.length) {
            StringNode node = new StringNode(items[index]);
            if(index % 2 == 1)
                parent.setLeftChild(node);
            else
                parent.setRightChild(node);

            // left child node
            insertNodes(node, items, 2 * index + 1);
            // right child node
            insertNodes(node, items, 2 * index + 2);

        }
    }

    // Post-Order Traversal
    public double traverse(StringNode node) {
        if(node == null)
            throw new NoSuchElementException();
        if(node.isLeaf())
        //if node is leave return value
            return Double.parseDouble(node.getItem());
        else {
            // if node is not leave, calculate value
            double left = traverse(node.getLeftChild());
            double right = traverse(node.getRightChild());
            //switch statement if the node is a operator
            switch(node.getItem()) {
                case "+":
                    return left + right;
                case "-":
                    return left - right;
                case "*":
                    return left * right;
                case "/":
                    return left / right;
                case "pow":
                    return Math.pow(left, right);
                default:
                    throw new InvalidParameterException();
            }
        }
    }
    
    public double evaluate(){
        return traverse(this.root);
    }

    public StringNode getRoot() {
        return this.root;
    }


}
