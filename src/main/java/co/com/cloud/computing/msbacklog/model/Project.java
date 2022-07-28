package co.com.cloud.computing.msbacklog.model;

import java.time.LocalDate;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Project
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-23T04:04:15.496Z[GMT]")


public class Project   {

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("projectName")
  private String projectName = null;

  @JsonProperty("projectIdentifier")
  private String projectIdentifier = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("backlog")
  private BigDecimal backlog = null;

  public Project id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = false, description = "")
  @Valid
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Project projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   **/
  @Schema(required = true, description = "")
  @NotNull
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public Project projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

  /**
   * Get projectIdentifier
   * @return projectIdentifier
   **/
  @Schema(required = true, description = "")
  @NotNull
  @Size(min=5,max=7)   public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Project startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Project endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   *
   * @return endDate
   **/
  @Schema(description = "")

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public Project backlog(BigDecimal backlog) {
    this.backlog = backlog;
    return this;
  }

  /**
   * Get backlog
   * @return backlog
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getBacklog() {
    return backlog;
  }

  public void setBacklog(BigDecimal backlog) {
    this.backlog = backlog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.projectName, project.projectName) &&
        Objects.equals(this.projectIdentifier, project.projectIdentifier) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.startDate, project.startDate) &&
        Objects.equals(this.endDate, project.endDate) &&
        Objects.equals(this.backlog, project.backlog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectName, projectIdentifier, description, startDate, endDate, backlog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    backlog: ").append(toIndentedString(backlog)).append("\n");
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
