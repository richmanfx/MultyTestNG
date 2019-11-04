package ru.r5am.tests;

import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MultiThreading {

    private static final Logger log = LogManager.getLogger();

    @Test
    public void firstMethod() throws InterruptedException {
        log.info("Firs method");
        longJob(1);
    }

    @Test
    public void secondMethod() throws InterruptedException {
        log.info("Second method");
        longJob(2);
    }

    @Test
    public void thirdMethod() throws InterruptedException {
        log.info("Third method");
        longJob(3);
    }

    /**
     * Долго выполняющаяся задача
     * @param jobNumber Номер задачи
     */
    private void longJob(int jobNumber) throws InterruptedException {

        for(int i = 0; i < 10; i++) {
            Thread.sleep(300);
            log.info("{}", jobNumber);
        }

    }

}
