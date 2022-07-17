package Blatt11;

/*
EidI SoSe 2022
Übungsblatt 11
Aufgabe 3
*/

public class BinaryExpressionTreeMain {

    public static void main(String[] args) {
        BinaryExpressionTree tree = new BinaryExpressionTree(new String[]{"*", "+", "-", "pow", "5", "4", "2", "2", "3"});
        System.out.println(tree.evaluate());
    }

}
