package com.chan.concurrent.chapter01.stack_area_of_thread;

import java.util.concurrent.TimeUnit;

public class StackAreaDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前线程名称：" + Thread.currentThread().getName());
        System.out.println("当前线程ID：" + Thread.currentThread().getId());
        System.out.println("当前线程状态：" + Thread.currentThread().getState());
        System.out.println("当前线程优先级：" + Thread.currentThread().getPriority());
        int a = 1, b = 1;
        int c = a / b;
        System.out.println(c);
        anotherMethod();
        TimeUnit.SECONDS.sleep(10000);
    }

    private static void anotherMethod() {
        int a = 1, b = 1;
        int c = a / b;
        System.out.println(c);
        anotherMethod2();
    }

    private static void anotherMethod2() {
        int a = 1, b = 1;
        int c = a / b;
        System.out.println(c);
    }
}
