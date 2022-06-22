/*
Einführung in die Informatik SoSe 2022
Übungsblatt 06
*/

class ValuePair {
    int x;
    int y;
    public ValuePair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Anstatt die Value Pairs gleich zu setzen, ein neues Objekt erzeugen
    //und dann die Werte setzen. Das Value Pair kann hierfür einfach übergeben werden
    //jedoch ensteht keinerlei verbindung zum anderen Objekt
    public ValuePair(ValuePair v){
        this.x = v.x;
        this.y = v.y;
    }


}
