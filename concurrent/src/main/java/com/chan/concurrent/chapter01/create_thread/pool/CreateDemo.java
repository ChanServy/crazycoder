package com.chan.concurrent.chapter01.create_thread.pool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class CreateDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new Runnable() {
            @Override
            public void run() {
                log.debug(Thread.currentThread().getName());
            }
        });
        Future<String> future = pool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        });
        String name = future.get();
        log.debug("异步任务的执行结果为：{}", name);
    }
}
