package ru.java.teamProject.Notification_Service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationSenderServiceImpl implements NotificationSenderService{
    @Override
    public void sendEmail(String to, String subject, String body) {
        log.info(" Email -> {}\nSubject: {}\nBody: {}", to, subject, body);
        // реализовать JavaMailSender
    }
}