class GFG {

    GFG() {
        System.out.println("1st argument constructor");
    }
    GFG(String a) {
        System.out.println("2nd argument constructor");
    }
    GFG(int a, int b) {
        System.out.println("3rd arguments constructor");
    }

    {
        System.out.println("Instance block");
    }
}
class GFGJava {
    public static void main(String[] args) {

        new GFG();
        new GFG("I like Java");
        new GFG(10, 20);
    }
}