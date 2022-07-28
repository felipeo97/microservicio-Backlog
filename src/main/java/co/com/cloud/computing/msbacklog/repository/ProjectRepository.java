package co.com.cloud.computing.msbacklog.repository;

import co.com.cloud.computing.msbacklog.entity.ProjectEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long> {
}
