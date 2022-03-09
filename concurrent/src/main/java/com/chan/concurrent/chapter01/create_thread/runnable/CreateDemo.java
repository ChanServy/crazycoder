package com.chan.concurrent.chapter01.create_thread.runnable;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.debug("当前线程：{}", Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName());
            }
        }, "T").start();//开启一个线程

        log.debug("当前线程：{}", Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}
