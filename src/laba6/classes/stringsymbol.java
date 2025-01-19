package laba6.classes;

public class stringsymbol {
    private char charField; // Символьное поле
    private String textField; // Текстовое поле

    // Метод для присваивания значения символьному полю
    public void setField(char value) {
        this.charField = value;
    }

    // Метод для присваивания значения текстовому полю
    public void setField(String value) {
        this.textField = value;
    }

    // Метод для обработки массива символов
    public void setField(char[] values) {
        if (values.length == 1) {
            // Если массив содержит один элемент, записываем его в символьное поле
            this.charField = values[0];
        } else {
            // Если массив содержит больше одного элемента, формируем строку и записываем в текстовое поле
            this.textField = new String(values);
        }
    }

    @Override
    public String toString() {
        return "CustomClass {" +
                "charField=" + charField +
                ", textField='" + textField + '\'' +
                '}';
    }
}
