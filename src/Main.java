public class Main {
    public static void main(String[] args) {
        int i = 0;
        int i2 = 10;
        int i3 = 20;
        String s = "String";
        String s1 = "String";
        String s2 = "other String";
//       Arithmetic
        int result;
        result = i + i2;
        System.out.println("Result: " + i + " + " + i2 + " = " + result);
        i++;
        result = i3 - i2;
        System.out.println("Result: " + i3 + " - " + i2 + " = " + result);
        i++;
        result = i * i2;
        System.out.println("Result: " + i + " * " + i2 + " = " + result);
        i++;
        result = i3 % i;
        System.out.println("Result: " + i3 + " % " + i + " = " + result);
        result = i / i3;
        System.out.println("Result: " + i + " / " + i3 + " = " + result);
        i++;
        System.out.println("i++: " + i++);
        System.out.println("++i: " + i++);
        System.out.println("--i: " + --i);
        i += -3;
        System.out.println(i);
    }
}
