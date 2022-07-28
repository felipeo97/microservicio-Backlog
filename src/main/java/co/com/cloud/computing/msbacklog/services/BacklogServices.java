package co.com.cloud.computing.msbacklog.services;

import co.com.cloud.computing.msbacklog.entity.BacklogEntity;
import co.com.cloud.computing.msbacklog.model.Backlog;
import co.com.cloud.computing.msbacklog.repository.BacklogRepository;
import co.com.cloud.computing.msbacklog.util.ConvertRequestBodyToEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class BacklogServices {

    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ConvertRequestBodyToEntity convertToEntity;

    public ResponseEntity<Backlog> servicesBacklog(Backlog backlog){
        try {

            BacklogEntity backlogEntity = convertToEntity.convertBacklogToEntity(backlog);
            //TODO: esta guardando todo Null en el Project
            backlogRepository.save(backlogEntity);

            return new ResponseEntity<>(backlog, HttpStatus.CREATED);

        } catch (ParseException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
