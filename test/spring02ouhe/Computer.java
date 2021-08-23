package spring02ouhe;

import org.junit.Test;

public class Computer implements Usb{
    //电脑有USB传输
    @Test
    public void usbData(){
        System.out.println("电脑有usb传输");
    }
}
