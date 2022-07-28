package co.com.cloud.computing.msbacklog.api;

import co.com.cloud.computing.msbacklog.model.InlineResponse200;
import co.com.cloud.computing.msbacklog.model.ProjectTask;
import co.com.cloud.computing.msbacklog.services.ProjectTaskServices;
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
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-23T04:04:15.496Z[GMT]")
@RestController
public class TaskApiController implements TaskApi {

    private static final Logger log = LoggerFactory.getLogger(TaskApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private ProjectTaskServices projectTaskServices;

    @org.springframework.beans.factory.annotation.Autowired
    public TaskApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> taskIdtaskProjectIdentifierPatch(@Parameter(in = ParameterIn.PATH,
            description = "Identificador de la tarea", required=true, schema=@Schema())
                                                                 @PathVariable("idtask") String idtask,
                                                                 @Parameter(in = ParameterIn.PATH,
                                                                         description = "Identificador del poryecto",
                                                                         required=true, schema=@Schema())
                                                                 @PathVariable("projectIdentifier")
                                                                 String projectIdentifier) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            projectTaskServices.taskIdTaskProjectIdentifierPatch(idtask,projectIdentifier);

            return new ResponseEntity<Void>(HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> taskProjectHoursProjectIdentifierGet(@Parameter(in = ParameterIn.PATH,
            description = "Identificador del poryecto", required=true, schema=@Schema())
                                                                                  @PathVariable("projectIdentifier")
                                                                                  String projectIdentifier) {
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {

            return projectTaskServices.taskProjectHoursProjectIdentifier(projectIdentifier);
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> taskProjectHoursProjectIdentifierStatusGet(
            @Parameter(in = ParameterIn.PATH, description = "Identificador del poryecto",
                    required=true, schema=@Schema()) @PathVariable("projectIdentifier") String projectIdentifier,
            @Parameter(in = ParameterIn.PATH, description = "Estado", required=true, schema=@Schema())
            @PathVariable("status") String status) {

        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {
            return projectTaskServices.taskProjectHoursProjectIdentifierStatus(projectIdentifier,status);
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ArrayList<ProjectTask>> taskProjectProjectIdentifierGet(@Parameter(in = ParameterIn.PATH,
            description = "Identificador del poryecto", required=true, schema=@Schema())
                                                                       @PathVariable("projectIdentifier")
                                                                       String projectIdentifier) {
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {
            return projectTaskServices.taskProjectProjectIdentifier(projectIdentifier);
        }

        return new ResponseEntity<ArrayList<ProjectTask>>(HttpStatus.NOT_IMPLEMENTED);
    }

}