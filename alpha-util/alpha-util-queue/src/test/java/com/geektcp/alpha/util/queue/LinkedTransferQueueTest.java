package com.geektcp.alpha.util.queue;

import org.junit.Test;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedTransferQueue;

/**
 * Created by TangHaiyang on 2019/8/25.
 */
public class LinkedTransferQueueTest {

    private static LinkedTransferQueue<String> queue = new LinkedTransferQueue<>();

    @Test
    public void addAndPoll(){
        queue.add("aaaa");
        String element = queue.poll();
        System.out.println(element);
    }
}