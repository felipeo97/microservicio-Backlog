package co.com.cloud.computing.msbacklog.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BacklogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectIdentifier;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "", referencedColumnName = "id")
    private ProjectEntity projectEntity;

    @OneToMany
    private List<ProjectTaskEntity> projectTaskEntityList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

    public List<ProjectTaskEntity> getProjectTaskEntityList() {
        return projectTaskEntityList;
    }

    public void setProjectTaskEntityList(List<ProjectTaskEntity> projectTaskEntityList) {
        this.projectTaskEntityList = projectTaskEntityList;
    }
}
