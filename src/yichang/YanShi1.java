package yichang;

/**
 * Created by Administrator on 2016/10/15 0015.
 */
public class YanShi1 {
    public void methodName(int x)throws
            ArrayIndexOutOfBoundsException,ArithmeticException{
        System.out.println(x);
        if (x==0){
            System.out.println("没有异常");
        }
        else if (x==1){
            int[]a=new int[3];
            a[3]=5;

        }else if (x==2){
            int i=0;
            int j=5/i;

        }
    }

    public static void main(String[] args) {
        YanShi1 yanShi1=new YanShi1();
        try {

        yanShi1.methodName(0);
        }catch (Exception e){
            System.out.println(e);
        }
        try{
            yanShi1.methodName(1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            yanShi1.methodName(2);

        }catch (ArithmeticException e){
            System.out.println(e);
        }

    }

}
