package springfanshe;

import org.junit.Test;
import spring02ouhe.Usb;

import java.util.Date;

public class FanSheTest {
    //反射用来干嘛 答：创建对象的 ----使用反射如何创建对象 3种
    //之前如何创建对象 答：new对象----> 会造成耦合
    @Test
    public  void test01(){
        //古老创建对象
        Date date= new Date();
        System.out.println("date = " + date);

        //新兴的反射创建
        //1.找到类的出处 并创建对象  不常用
       /* try {
            Date date1 = date.getClass().newInstance();
            System.out.println("date1 = " + date1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
*/




                //2.以文本形式找到出处，很常用
              /*  try {
                    Class<Date> aClass = (Class<Date>) Class.forName("java.util.Date");
                    System.out.println("aClass = " + aClass.newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }*/

       //路径  =包名.类名
        String[] aa={"spring02ouhe.Computer","spring02ouhe.Mp4","spring02ouhe.MyTv"};
        for(String a:aa) {
            Class<Usb> aClass = null;
            try {
                aClass = (Class<Usb>) Class.forName(a);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                aClass.newInstance().usbData();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }



        //3.直接.class
       Class c= Date.class;
        try {
            Date o = (Date) c.newInstance();
            System.out.println("o = " + o);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
