public class MScAIMLOverloading {
    private int value;

    public MScAIMLOverloading() {
        value = 0;
    }

    public MScAIMLOverloading(int val) {
        value = val;
    }

    public MScAIMLOverloading(double val) {
        value = (int) val;
    }

    public MScAIMLOverloading(int[] values) {
        if (values.length > 0) {
            value = values[0];
        } else {
            value = -1;
        }
    }

    public MScAIMLOverloading(int val, double val2) {
        value = (int) (val + val2);
    }

    public MScAIMLOverloading(int val1, int val2) {
        value = val1 * val2;
    }

    public MScAIMLOverloading(double val, int val2) {
        value = (int) (val + val2);
    }

    public void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        MScAIMLOverloading obj1 = new MScAIMLOverloading();
        obj1.printValue();

        MScAIMLOverloading obj2 = new MScAIMLOverloading(42);
        obj2.printValue();

        MScAIMLOverloading obj3 = new MScAIMLOverloading(3.5);
        obj3.printValue();

        MScAIMLOverloading obj5 = new MScAIMLOverloading(new int[]{5, 10});
        obj5.printValue();

        MScAIMLOverloading obj6 = new MScAIMLOverloading(7, 0.5);
        obj6.printValue();

        MScAIMLOverloading obj7 = new MScAIMLOverloading(2, 3);
        obj7.printValue();

        MScAIMLOverloading obj8 = new MScAIMLOverloading(2.5, 3);
        obj8.printValue();

        MScAIMLOverloading obj10 = new MScAIMLOverloading(2, 3, 4);
        obj10.printValue();
    }
}

   

   

      
   

   
   
        
