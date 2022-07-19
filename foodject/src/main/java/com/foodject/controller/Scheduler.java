package com.foodject.controller;

import java.util.Random;

import com.foodject.vo.Msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	@Autowired
	private SimpMessageSendingOperations messagingTemplate;

	
    @Scheduled(cron = "*/15 * * * * *")
    public void cronJobDailyUpdate() {
    	
    	System.out.println("----------- Scheduler ------------");
    	Msg msg = new Msg();
    	Random r = new Random();
    	int data = r.nextInt(100);
    	int data2 = r.nextInt(100);
    	msg.setContent1("Server Message1:"+data);
    	msg.setContent2("Server Message2:"+data2);
    	messagingTemplate.convertAndSend("/send/serversend", msg);
    }

    @Scheduled(cron = "1 0 0 1,8,15,22 * *")
    public void cronJobWeeklyUpdate(){

    }


}