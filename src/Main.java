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

        //    Побітові операції
        boolean check = true;
        boolean check2 = false;
        if (i2 == 10 && i == 2) {
            System.out.println("&:" + i2);
        } else if (check == true && check2 == true) {
            System.out.println("&&:" + check);
        } else if (check == true || check2 == false) {
            System.out.println("||:" + check);
        }
        if (i2 == 10) {
            System.out.println("is Ok");
        } else {
            System.out.println("Not");
        }
        System.out.println("");
    }
}
