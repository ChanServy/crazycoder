package com.chan.concurrent.chapter01.create_thread.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateDemo {
    public static final int MAX_TURN = 5;

    public static void main(String[] args) {
        DemoThread thread = new DemoThread("测试线程");
        thread.start();//开启一个线程
        for (int i = 0; i < MAX_TURN; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + 2222);
        }
    }

    static class DemoThread extends Thread {

        public DemoThread() {
        }

        public DemoThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < MAX_TURN; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + 1111);
            }
        }
    }
}
