package com.geektcp.alpha.util.thread.fastjson;

/* Created by Haiyang on 2017/3/16. */

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyThread2 extends Thread {
    private String name;

    public MyThread2(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
//            log.info(name + "运行\t" + i);
//            ServerMonitor.addSendLogSucc();

            DeltaMonitor.addMonitorTable("test2");
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        }
    }


}
