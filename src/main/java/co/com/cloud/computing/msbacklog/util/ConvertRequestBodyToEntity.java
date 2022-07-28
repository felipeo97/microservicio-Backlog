package co.com.cloud.computing.msbacklog.util;

import co.com.cloud.computing.msbacklog.entity.BacklogEntity;
import co.com.cloud.computing.msbacklog.entity.ProjectEntity;
import co.com.cloud.computing.msbacklog.entity.ProjectTaskEntity;
import co.com.cloud.computing.msbacklog.model.Backlog;
import co.com.cloud.computing.msbacklog.model.Project;
import co.com.cloud.computing.msbacklog.model.ProjectTask;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.ParseException;

@Component
public class ConvertRequestBodyToEntity {


    public BacklogEntity convertBacklogToEntity(Backlog backlog) throws ParseException {
        BacklogEntity backlogEntity = new BacklogEntity();
        backlogEntity.setProjectEntity(new ProjectEntity());
        backlogEntity.setProjectIdentifier(backlog.getProjectIdentifier());
        backlogEntity.setProjectTaskEntityList(backlogEntity.getProjectTaskEntityList());

        return backlogEntity;
    }

    public ProjectEntity convertProjectToEntity(Project project, BacklogEntity backlogEntity){

        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setProjectName(project.getProjectName());
        projectEntity.setProjectIdentifier(project.getProjectIdentifier());
        projectEntity.setDescription(project.getDescription());
        projectEntity.setStarDate(project.getStartDate());
        projectEntity.setEndDate(project.getEndDate());
        projectEntity.setBacklogEntity(backlogEntity);

        return projectEntity;
    }

    public Project convertProjectEntityToProject(ProjectEntity projectEntity){
        Project project = new Project();

        project.setId(projectEntity.getId());
        project.setProjectName(projectEntity.getProjectName());
        project.setProjectIdentifier(projectEntity.getProjectIdentifier());
        project.setDescription(projectEntity.getDescription());
        project.setStartDate(projectEntity.getStarDate());
        project.setEndDate(projectEntity.getEndDate());
        project.setBacklog(BigDecimal.valueOf(projectEntity.getBacklogEntity().getId()));

        return project;
    }

    public ProjectTask convertProjectTaskEntityToProjectTask(ProjectTaskEntity projectTaskEntity) {
        ProjectTask projectTask = new ProjectTask();

        projectTask.setId(projectTaskEntity.getId());
        projectTask.setName(projectTaskEntity.getName());
        projectTask.setAccpetanceCriteria(projectTaskEntity.getAcceptanceCriteria());
        projectTask.setStatus(ProjectTask.StatusEnum.fromValue(projectTaskEntity.getStatus()));
        projectTask.setPriority(projectTaskEntity.getPriority());
        projectTask.setHours(projectTaskEntity.getHours());
        projectTask.setStartDate(projectTaskEntity.getStarDate());
        projectTask.setEndDate(projectTaskEntity.getEndDate());
        projectTask.setProjectIdentifier(projectTaskEntity.getProjectIdentifier());
        projectTask.setBacklog(projectTaskEntity.getBacklogEntity().getId());

        return projectTask;
    }
}
