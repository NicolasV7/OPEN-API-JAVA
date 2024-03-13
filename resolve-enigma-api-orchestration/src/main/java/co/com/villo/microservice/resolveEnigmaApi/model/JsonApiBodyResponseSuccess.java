package co.com.villo.microservice.resolveEnigmaApi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;


@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-02-27T20:55:05.287811100-05:00[America/Bogota]")
public class JsonApiBodyResponseSuccess   {
  @JsonProperty("data")
  @Valid
  private List<GetEnigmaStepResponse> data = new ArrayList<GetEnigmaStepResponse>();

  public JsonApiBodyResponseSuccess data(List<GetEnigmaStepResponse> data) {
    this.data = data;
    return this;
  }

  public JsonApiBodyResponseSuccess addDataItem(GetEnigmaStepResponse dataItem) {
    this.data.add(dataItem);
    return this;
  }

  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Valid
  public List<GetEnigmaStepResponse> getData() {
    return data;
  }

  public void setData(List<GetEnigmaStepResponse> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonApiBodyResponseSuccess jsonApiBodyResponseSuccess = (JsonApiBodyResponseSuccess) o;
    return Objects.equals(this.data, jsonApiBodyResponseSuccess.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonApiBodyResponseSuccess {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
