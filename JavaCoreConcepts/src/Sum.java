public class Sum {

    private static int a;

    public static void main(String[] args) {
//        a += 1;
        System.out.println(a);
        Integer num = 10;
        int num1 = num;
        int num2 = 10;
        System.out.println("Before update");
        System.out.println(num + " " + num2);
        change(num, num2);
        System.out.println("After update");
        System.out.println(num + " " +num2);
//        System.out.println(num1 + 5);
    }

    public static void change(Integer a1, int b) {
        a += 10;
        b += 10;
        System.out.println(a);
    }

    // Method overloading | Compile time polymorphism | Static polymorphism
    public String doSum(int a, int b) {
        return Integer.toString(a + b);
    }

    public int doSum(int a, int b, int c) {
        return a + b + c;
    }

}
