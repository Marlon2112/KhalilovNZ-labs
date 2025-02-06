package laba7.example1;

public class SuperClass {
    //закрытое текстовое поле
    private String str1;
    //конструктор с текстовым аргументом
    SuperClass(String strEx) {
        this.str1 = strEx;
    }
    SuperClass() {

    }
    //аннотация указываемя для того, чтобы показать, что далее мы собираемся переопределять метод
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name:" + this.getClass().getSimpleName() +
                " str1 =" + this.getStr1();
        return superClassNameAndFieldValue;
    }
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
