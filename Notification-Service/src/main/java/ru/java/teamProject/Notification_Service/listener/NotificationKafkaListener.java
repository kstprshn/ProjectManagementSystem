package ru.java.teamProject.Notification_Service.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.java.teamProject.Notification_Service.dto.DeadlineApproachingEvent;
import ru.java.teamProject.Notification_Service.dto.UserAssignedToTaskEvent;
import ru.java.teamProject.Notification_Service.service.NotificationSenderService;

import java.time.LocalDateTime;


@Component
@RequiredArgsConstructor
@Slf4j
public class NotificationKafkaListener {
    private final NotificationSenderService notificationSenderService;

    @KafkaListener(topics = "task-deadlines", groupId = "notifier")
    public void handleDeadlineReminder(DeadlineApproachingEvent event) {
        for (String email : event.getRecipientEmails()) {
            String subject = "Deadline is coming soon";
            String body = "The task '" + event.getTaskName() + "' expires: " + event.getDeadline();
            notificationSenderService.sendEmail(email, subject, body);
        }
    }

    @KafkaListener(topics = "user-notifications", groupId = "notifier")
    public void handleUserAssigned(UserAssignedToTaskEvent event) {
        String subject = "You are assigned to a task";
        String body = "You have been added to the task: " + event.getTaskName();
        notificationSenderService.sendEmail(event.getAssignedUserEmail(), subject, body);
    }

}