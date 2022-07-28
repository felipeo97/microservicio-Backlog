package co.com.cloud.computing.msbacklog.entity;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.LocalDate;

@Entity
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;
    private String projectIdentifier;
    private String description;
    private @Valid LocalDate starDate;
    private LocalDate endDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "backlogEntity", referencedColumnName = "id")
    private BacklogEntity backlogEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public @Valid LocalDate getStarDate() {
        return starDate;
    }

    public void setStarDate(@Valid LocalDate starDate) {
        this.starDate = starDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BacklogEntity getBacklogEntity() {
        return backlogEntity;
    }

    public void setBacklogEntity(BacklogEntity backlogEntity) {
        this.backlogEntity = backlogEntity;
    }
}
