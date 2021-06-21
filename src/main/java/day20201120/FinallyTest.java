package day20201120;

public class FinallyTest {
    public static  int test(){
             int i=1;
            System.out.println("00000000000000");
        try {
            System.out.println("try====");
            return 1;
        }
        catch (Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("finally====");
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("返回的值:"+test()+"---"+test());
    }

}
