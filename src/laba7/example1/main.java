package laba7.example1;

public class main {
    public static void main(String[] args) {
        SuperClass SuperclassObject = new SuperClass("передал в конструктор суперкласса");
        String className = SuperclassObject.toString();
        System.out.println(className);

        SubClass SubclassObject1 = new SubClass("передал в конструктор подкласса");
        String subclassName = SubclassObject1.toString();
        System.out.println(subclassName);

        SubClass SubclassObject2 = new SubClass("передал в конструктор подкласса", "где два параметра");
        String subclass2Name = SubclassObject2.toString();
        System.out.println(subclass2Name);
    }
}
