package co.com.cloud.computing.msbacklog.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-23T04:04:15.496Z[GMT]")


public class InlineResponse200   {
  @JsonProperty("totalHours")
  private double totalHours = 0;

  public InlineResponse200 totalHours(double totalHours) {
    this.totalHours = totalHours;
    return this;
  }

  /**
   * Get totalHours
   * @return totalHours
   **/
  @Schema(description = "")
  
    public double getTotalHours() {
    return totalHours;
  }

  public void setTotalHours(double totalHours) {
    this.totalHours = totalHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.totalHours, inlineResponse200.totalHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    totalHours: ").append(toIndentedString(totalHours)).append("\n");
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
