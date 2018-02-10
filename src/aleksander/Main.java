package aleksander;

public class Main {

    public static void main(String[] args) {
        // getItem
        ArrayOfNumbers array = new ArrayOfNumbers(10);
        System.out.println("Get Item: " + array.getItem(0));

        // setItem
        array.setItem(0, 5);
        System.out.println("Set Item: " + array.getItem(0));

        // max
        System.out.println("Max: " + array.max());

        // equal
        System.out.println("Equal 0, 1: " + array.equal(0, 1));
        System.out.println("Equal 1, 2: " + array.equal(1, 2));

        // gcd
        array.setItem(1, 10);
        System.out.println("GCD: " + array.gcd(0, 1));

        // count
        System.out.println("Count: " + array.count());

        // sum
        System.out.println("Sum: " + array.sum());

        // average
        System.out.println("Average: " + array.average());

        // scalarMultiply
        array.scalarMultiply(10);
        System.out.println("Scalar Multiply: " + array.getItem(0));

        // addConstant
        array.addConstant(10);
        System.out.println("Scalar Constant: " + array.getItem(0));

//        TwoNumbers a = new TwoNumbers(12, 18);
//        TwoNumbers b = new TwoNumbers(17, 17);
//
//        System.out.println(a);
//        System.out.println(b);
//
//        a.addNumbers(5, 14);
//
//        System.out.println(a);
//
//        b.addObject(a);
//
//        System.out.println(a);
//        System.out.println(b);
//
//        TwoNumbers c = a.sum(b);
//
//        System.out.println(c);
    }
}
