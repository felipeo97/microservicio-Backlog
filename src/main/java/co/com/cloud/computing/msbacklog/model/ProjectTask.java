package co.com.cloud.computing.msbacklog.model;

import java.time.LocalDate;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectTask
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-23T04:04:15.496Z[GMT]")


public class ProjectTask   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("summary")
  private String summary = null;

  @JsonProperty("accpetanceCriteria")
  private String accpetanceCriteria = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    NOT_STARED("Not Stared"),
    
    IN_PROGRESS("In Progress"),
    
    COMPLETED("Completed"),
    
    DELETED("Deleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("hours")
  private Object hours = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  @JsonProperty("projectIdentifier")
  private String projectIdentifier = null;

  @JsonProperty("backlog")
  private Long backlog = null;

  public ProjectTask id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProjectTask name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectTask summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
   **/
  @Schema(required = true, description = "")
  @NotNull
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public ProjectTask accpetanceCriteria(String accpetanceCriteria) {
    this.accpetanceCriteria = accpetanceCriteria;
    return this;
  }

  /**
   * Get accpetanceCriteria
   * @return accpetanceCriteria
   **/
  @Schema(description = "")
  public String getAccpetanceCriteria() {
    return accpetanceCriteria;
  }

  public void setAccpetanceCriteria(String accpetanceCriteria) {
    this.accpetanceCriteria = accpetanceCriteria;
  }

  public ProjectTask status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(example = "In Progress", required = true, description = "")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ProjectTask priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * minimum: 1
   * maximum: 5
   * @return priority
   **/
  @Schema(required = true, description = "")
  @NotNull
  @Min(1) @Max(5)   public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ProjectTask hours(Object hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * @return hours
   **/
  @Schema(required = true, description = "")
  @NotNull
  public Object getHours() {
    return hours;
  }

  public void setHours(Object hours) {
    this.hours = hours;
  }

  public ProjectTask startDate(LocalDate startDate) {
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

  public ProjectTask endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   **/
  @Schema(description = "")
  @Valid
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public ProjectTask projectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
    return this;
  }

  /**
   * Get projectIdentifier
   * @return projectIdentifier
   **/
  @Schema(required = true, description = "")
  @NotNull
  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public ProjectTask backlog(Long backlog) {
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
  public Long getBacklog() {
    return backlog;
  }

  public void setBacklog(Long backlog) {
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
    ProjectTask projectTask = (ProjectTask) o;
    return Objects.equals(this.id, projectTask.id) &&
        Objects.equals(this.name, projectTask.name) &&
        Objects.equals(this.summary, projectTask.summary) &&
        Objects.equals(this.accpetanceCriteria, projectTask.accpetanceCriteria) &&
        Objects.equals(this.status, projectTask.status) &&
        Objects.equals(this.priority, projectTask.priority) &&
        Objects.equals(this.hours, projectTask.hours) &&
        Objects.equals(this.startDate, projectTask.startDate) &&
        Objects.equals(this.endDate, projectTask.endDate) &&
        Objects.equals(this.projectIdentifier, projectTask.projectIdentifier) &&
        Objects.equals(this.backlog, projectTask.backlog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, summary, accpetanceCriteria, status, priority, hours, startDate, endDate, projectIdentifier, backlog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectTask {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    accpetanceCriteria: ").append(toIndentedString(accpetanceCriteria)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    projectIdentifier: ").append(toIndentedString(projectIdentifier)).append("\n");
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
