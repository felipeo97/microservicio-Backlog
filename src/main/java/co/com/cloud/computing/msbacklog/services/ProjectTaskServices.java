package co.com.cloud.computing.msbacklog.services;

import co.com.cloud.computing.msbacklog.entity.ProjectEntity;
import co.com.cloud.computing.msbacklog.entity.ProjectTaskEntity;
import co.com.cloud.computing.msbacklog.model.InlineResponse200;
import co.com.cloud.computing.msbacklog.model.ProjectTask;
import co.com.cloud.computing.msbacklog.repository.ProjectTaskRepository;
import co.com.cloud.computing.msbacklog.util.ConvertRequestBodyToEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProjectTaskServices {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    @Autowired
    private ConvertRequestBodyToEntity convertToEntity;

    public void taskIdTaskProjectIdentifierPatch(String idTask, String projectIdentifier){

        Optional<ProjectTaskEntity> projectTaskEntity;
        projectTaskEntity = projectTaskRepository.findById(Long.valueOf(idTask));
        projectTaskEntity.get().setStatus("Deleted");

        projectTaskRepository.save(projectTaskEntity.get());
    }

    public ResponseEntity<InlineResponse200> taskProjectHoursProjectIdentifier(String projectIdentifier){

        InlineResponse200 inlineResponse200 = new InlineResponse200();

        ArrayList<ProjectTaskEntity> projectTaskEntityArrayList =
                projectTaskRepository.findAllByProjectIdentifier(projectIdentifier);

        for (ProjectTaskEntity iterator: projectTaskEntityArrayList) {
            inlineResponse200.setTotalHours(inlineResponse200.getTotalHours() + iterator.getHours());
        }

        return new ResponseEntity<>(inlineResponse200,HttpStatus.OK);
    }

    public ResponseEntity<InlineResponse200> taskProjectHoursProjectIdentifierStatus(
            String projectIdentifier, String status){

        InlineResponse200 inlineResponse200 = new InlineResponse200();
        //TODO: Revisar Query

        /*
        ArrayList<ProjectTaskEntity> projectTaskEntityArrayList =
                projectTaskRepository.findByProjectIdentifierByStatus(projectIdentifier,status);

        for (ProjectTaskEntity iterator: projectTaskEntityArrayList) {
            inlineResponse200.setTotalHours(inlineResponse200.getTotalHours() + iterator.getHours());
        }
        */

        return new ResponseEntity<>(inlineResponse200, HttpStatus.OK);
    }

    public ResponseEntity<ArrayList<ProjectTask>> taskProjectProjectIdentifier(String projectIdentifier){
        ArrayList<ProjectTask>  projectTaskArrayList = new ArrayList<>();

        ArrayList<ProjectTaskEntity> projectTaskEntityArrayList =
                projectTaskRepository.findAllByProjectIdentifier(projectIdentifier);

        for(ProjectTaskEntity iterator: projectTaskEntityArrayList){
            projectTaskArrayList.add(convertToEntity.convertProjectTaskEntityToProjectTask(iterator));
        }

        return new ResponseEntity<>(projectTaskArrayList, HttpStatus.OK);
    }
}
