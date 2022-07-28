package co.com.cloud.computing.msbacklog.services;

import co.com.cloud.computing.msbacklog.entity.ProjectTaskEntity;
import co.com.cloud.computing.msbacklog.model.InlineResponse200;
import co.com.cloud.computing.msbacklog.repository.ProjectTaskRepository;
import co.com.cloud.computing.msbacklog.util.UtilTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProjectTaskServicesTest {

    @InjectMocks
    private ProjectTaskServices projectTaskServices = new ProjectTaskServices();
    @Mock
    private ProjectTaskRepository projectTaskRepository;

    private ArrayList<ProjectTaskEntity> projectTaskEntityArrayList;
    private UtilTest utilTest;

    @Before
    public void beforeTest() {
        projectTaskEntityArrayList = new ArrayList<>();
        utilTest = new UtilTest();
        projectTaskEntityArrayList.add(utilTest.getProjectTaskEntity());
    }

    @Test
    public void taskProjectHoursProjectIdentifierTest() {

        // Arrange
        Mockito.when(projectTaskRepository.findAllByProjectIdentifier("1")).thenReturn(projectTaskEntityArrayList);

        // Act
        ResponseEntity<InlineResponse200> response200ResponseEntity =
                projectTaskServices.taskProjectHoursProjectIdentifier("1");

        // Assert
        Assert.assertEquals(response200ResponseEntity.getStatusCodeValue(), 200);
    }
}
