package co.com.cloud.computing.msbacklog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Backlog
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-23T04:04:15.496Z[GMT]")


public class Backlog   {

  @JsonProperty("projectIdentifier")
  private String projectIdentifier;

  @JsonProperty("project")
  private String project;

  @JsonProperty("projectTask")
  @Valid
  private List<ProjectTask> projectTask = new ArrayList<ProjectTask>();

  public Backlog projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

  /**
   * Get projectIdentifier
   * @return projectIdentifier
   **/
  @Schema(example = "Enigma", required = true, description = "")
  @NotNull
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public Backlog project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   **/
  @Schema(example = "Enigma", required = true, description = "")
  @NotNull
  public Object getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public Backlog projectTask(List<ProjectTask> projectTask) {
    this.projectTask = projectTask;
    return this;
  }

  public Backlog addProjectTaskItem(ProjectTask projectTaskItem) {
    this.projectTask.add(projectTaskItem);
    return this;
  }

  /**
   * Get projectTask
   * @return projectTask
   **/
  @Schema(required = true, description = "")
  @NotNull
  @Valid
  public List<ProjectTask> getProjectTask() {
    return projectTask;
  }

  public void setProjectTask(List<ProjectTask> projectTask) {
    this.projectTask = projectTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Backlog backlog = (Backlog) o;
    return
        Objects.equals(this.projectIdentifier, backlog.projectIdentifier) &&
        Objects.equals(this.project, backlog.project) &&
        Objects.equals(this.projectTask, backlog.projectTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIdentifier, project, projectTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Backlog {\n");

    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectTask: ").append(toIndentedString(projectTask)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}