public class Y extends X {

    int x;

    Y(String name, int val) {
        super(name);
        this.x = val;
    }

    public static void main(String[] args) {
        Y obj = new Y("Tom", 10);
        System.out.println(obj.parentName + " " + obj.x);
    }

}
