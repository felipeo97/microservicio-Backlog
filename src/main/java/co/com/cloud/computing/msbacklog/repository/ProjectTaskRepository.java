package co.com.cloud.computing.msbacklog.repository;

import co.com.cloud.computing.msbacklog.entity.ProjectTaskEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ProjectTaskRepository extends CrudRepository<ProjectTaskEntity, Long> {

    ArrayList<ProjectTaskEntity>  findAllByProjectIdentifier(String projectIdentifier);
    //TODO:
    //ArrayList<ProjectTaskEntity> findByProjectIdentifierByStatus(String projectIdentifier, String status);
}
