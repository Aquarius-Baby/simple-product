package com.example.simple.util;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1, 1);
        ConcurrentHashMap a = new ConcurrentHashMap();
        a.put(1, 1);
        ExecutorService pool = Executors.newFixedThreadPool(2);
        while (true) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " is running");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }


}
