package ru.java.teamProject.Notification_Service.service;

public interface NotificationSenderService {
    void sendEmail(String to, String subject, String body);
}
