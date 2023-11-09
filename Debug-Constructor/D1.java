public class MyClass {
    private int value;

    public MyClass(int val) {
        value = val;
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        MyClass obj = null; 
        obj.printValue();   
    }
}

