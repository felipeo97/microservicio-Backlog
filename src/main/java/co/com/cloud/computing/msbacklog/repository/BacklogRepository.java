package co.com.cloud.computing.msbacklog.repository;

import co.com.cloud.computing.msbacklog.entity.BacklogEntity;
import org.springframework.data.repository.CrudRepository;

public interface BacklogRepository extends CrudRepository<BacklogEntity, Long> {
}
