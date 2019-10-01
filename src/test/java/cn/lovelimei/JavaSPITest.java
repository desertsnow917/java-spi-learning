package cn.lovelimei;

import org.junit.Test;

import java.util.ServiceLoader;

/**
 * Created by DesertSnow on 2019/10/1 22:39.
 */
public class JavaSPITest {
    /**
     * Java SPI
     * Hello, I am Optimus Prime.
     * Hello, I am Bumblebee.
     */
    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}