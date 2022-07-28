package co.com.cloud.computing.msbacklog.util;

import co.com.cloud.computing.msbacklog.entity.BacklogEntity;
import co.com.cloud.computing.msbacklog.entity.ProjectTaskEntity;
import co.com.cloud.computing.msbacklog.model.ProjectTask;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilTest {

    public ProjectTaskEntity getProjectTaskEntity(){
        ProjectTaskEntity projectTask = new ProjectTaskEntity();
        LocalDate localDate = LocalDate.now();

        projectTask.setId(Long.valueOf(2));
        projectTask.setName("Prueba Cloud");
        projectTask.setAcceptanceCriteria("");
        projectTask.setStatus("Deleted");
        projectTask.setPriority(1);
        projectTask.setHours(4.4);
        projectTask.setStarDate(localDate);
        projectTask.setEndDate(localDate);
        projectTask.setProjectIdentifier("Cloud");
        projectTask.setBacklogEntity(new BacklogEntity());

        return projectTask;
    }

}
