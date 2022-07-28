package co.com.cloud.computing.msbacklog.api;


import co.com.cloud.computing.msbacklog.model.Project;
import co.com.cloud.computing.msbacklog.services.ProjectServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-23T04:04:15.496Z[GMT]")
@RestController
public class ProjectApiController implements ProjectApi {

    private static final Logger log = LoggerFactory.getLogger(ProjectApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private ProjectServices projectServices;

    @org.springframework.beans.factory.annotation.Autowired
    public ProjectApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Project>> projectGet() {
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {

            return projectServices.getProjects();
        }

        return new ResponseEntity<List<Project>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Project> projectPost(@Parameter(in = ParameterIn.DEFAULT,
            description = "Cuerpo de la petición Project", required=true, schema=@Schema())
                                               @Valid @RequestBody Project body) {
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {

            return projectServices.projectSave(body);
        }

        return new ResponseEntity<Project>(HttpStatus.NOT_IMPLEMENTED);
    }

}
