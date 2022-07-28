//package io.swagger.api;
package co.com.cloud.computing.msbacklog.api;

import co.com.cloud.computing.msbacklog.entity.BacklogEntity;
import co.com.cloud.computing.msbacklog.model.Backlog;
import co.com.cloud.computing.msbacklog.services.BacklogServices;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-23T04:04:15.496Z[GMT]")
@RestController
public class BacklogsApiController implements BacklogsApi {

    private static final Logger log = LoggerFactory.getLogger(BacklogsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private BacklogServices backlogServices;

   @Autowired
    public BacklogsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Backlog> backlogsPost(@Parameter(in = ParameterIn.DEFAULT,
            description = "Cuerpo de la petición Backlogs", required=true, schema=@Schema())
                                                @Valid @RequestBody Backlog body) {
        String accept = request.getHeader("Accept");
        BacklogEntity backlogEntity;
        if (accept != null && accept.contains("application/json")) {
            return backlogServices.servicesBacklog(body);
        }

        return new ResponseEntity<Backlog>(HttpStatus.NOT_IMPLEMENTED);
    }
}