package laba6;

import laba6.classes.stringsymbol;

public class example1 {
    public static void main(String[] args) {
        stringsymbol obj = new stringsymbol();
        obj.setField('A');
        System.out.println(obj);

        obj.setField("Hello");
        System.out.println(obj);

        obj.setField(new char[]{'B'});
        System.out.println(obj);

        obj.setField(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println(obj);
    }
}
