package com.chan.concurrent.chapter01.create_thread.callable;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

@Slf4j
public class CreateDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                TimeUnit.SECONDS.sleep(2);
                return Thread.currentThread().getName();
            }
        });
        new Thread(task, "T").start();//开启一个线程
        //主线程阻塞，同步等待task执行完毕返回的结果，返回结果之后才会继续向下执行
        log.debug("当前线程名称为：{}", Thread.currentThread().getName());
        String result = task.get();
        log.debug("当前线程名称为：{}", Thread.currentThread().getName());
        log.debug("线程名称为：{}", result);
    }
}
