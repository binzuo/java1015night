package yichang;

import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2016/10/15 0015.
 */
public class YiChang {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[6] = 123;
            System.out.println("需要检验的程序");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        }
        System.out.println("南无地藏菩萨摩诃萨");



    }


}

