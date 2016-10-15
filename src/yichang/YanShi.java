package yichang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2016/10/15 0015.
 */
public class YanShi {
    public static void main(String[]args){
        try{
            FileInputStream fileInputStream=new FileInputStream("a.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
