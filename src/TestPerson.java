/*
Einführung in die Informatik SoSe 2022
Übungsblatt 06
*/
class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Heinz", 11, 22);
        String n1 = p.getName();
        ValuePair xy1 = p.getValuePair();//siehe ValuePair.java
        System.out.println("Name = " + n1);
        System.out.println("ValuePair vorher = "+ xy1.x + " " + xy1.y);
        System.out.println("----------------");
        n1 = "Hugo";
        String n2 = p.getName();
        System.out.println("Name = " + n2);
        xy1.x = 33;
        xy1.y = 44;
        ValuePair xy2 = p.getValuePair();  
        System.out.println("ValuePair nachher = "+ xy2.x + " " + xy2.y);
    }
}
