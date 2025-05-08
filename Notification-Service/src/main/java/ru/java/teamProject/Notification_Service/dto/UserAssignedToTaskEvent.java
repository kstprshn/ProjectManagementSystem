package ru.java.teamProject.Notification_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAssignedToTaskEvent {
    private Long taskId;
    private String taskName;
    private String assignedUserEmail;
}