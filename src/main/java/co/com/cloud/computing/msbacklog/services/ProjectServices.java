package co.com.cloud.computing.msbacklog.services;

import co.com.cloud.computing.msbacklog.entity.BacklogEntity;
import co.com.cloud.computing.msbacklog.entity.ProjectEntity;
import co.com.cloud.computing.msbacklog.model.Project;
import co.com.cloud.computing.msbacklog.repository.BacklogRepository;
import co.com.cloud.computing.msbacklog.repository.ProjectRepository;
import co.com.cloud.computing.msbacklog.util.ConvertRequestBodyToEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectServices {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ConvertRequestBodyToEntity convertToEntity;

    public ResponseEntity<List<Project>> getProjects(){

        Iterable<ProjectEntity> projectEntity = projectRepository.findAll();
        List<Project> projectList = new ArrayList<>();

        for (ProjectEntity iterator: projectEntity) {
            projectList.add(convertToEntity.convertProjectEntityToProject(iterator));
        }

        return new ResponseEntity<>(projectList, HttpStatus.OK);
    }

    public ResponseEntity<Project> projectSave(Project project){

        Optional<BacklogEntity> backlogEntity =
                backlogRepository.findById(Long.valueOf(String.valueOf(project.getBacklog())));
        ProjectEntity projectEntity = convertToEntity.convertProjectToEntity(project, backlogEntity.get());
        ProjectEntity projectEntityResponse =  projectRepository.save(projectEntity);
        Project projectResponse = convertToEntity.convertProjectEntityToProject(projectEntityResponse);

        return new ResponseEntity<>(projectResponse, HttpStatus.CREATED);
    }

}
