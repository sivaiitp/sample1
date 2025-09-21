public class StaticBlock {
    static{
        System.out.println("from static block");
    }
    public static void main(String[] args) {
        System.out.println("from main method");
    }
    static{
        System.out.println("from static block2 ");
    }
    static{
        System.out.println("from static block3 ");
    }
}
