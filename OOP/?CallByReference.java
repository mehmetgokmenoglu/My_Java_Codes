//Call By Reference
class MyObject {
    int value;
}

public class Main {
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.value = 10;

        modifyValue(obj);
        System.out.println("After modifyValue call: " + obj.value);
    }

    public static void modifyValue(MyObject o) {
        o.value = 20;
        System.out.println("AAAAAAAAAA: " + o.value);
    }
}
