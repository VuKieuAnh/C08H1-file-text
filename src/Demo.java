import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try {
            a();
            System.out.println("A");
        }
        catch (Exception e){
            System.out.println("E");
        }
        finally {
            System.out.println("F");
        }
        System.out.println("D");
    }
    public static void a(){
//        try {
            System.out.println("try");
            throw new RuntimeException("shsgd");

//        }
//        finally {
//            System.out.println("F1");
//            return -1;
//        }
    }
    public static int m1() throws IOException{
        return 1;
    }
}
