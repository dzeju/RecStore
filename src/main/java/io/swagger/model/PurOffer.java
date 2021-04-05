package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PurOffer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-04T21:37:47.555Z[GMT]")

@Entity
@Table(name = "puroffers")
@JacksonXmlRootElement(localName = "PurOffer")
@JsonRootName("PurOffer")
public class PurOffer   {
	
  @Id
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

//  @OneToMany(targetEntity=PurOffer.class, fetch=FetchType.EAGER)
  @JsonProperty("photoUrls")
  private String photoUrls = null;

  public PurOffer id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "0", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PurOffer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Plastic grain", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PurOffer description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(example = "Plastic plastic", description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PurOffer photoUrls(String photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

//  public PurOffer addPhotoUrlsItem(String photoUrlsItem) {
//    if (this.photoUrls == null) {
//      this.photoUrls = new ArrayList<String>();
//    }
//    this.photoUrls.add(photoUrlsItem);
//    return this;
//  }

  /**
   * Get photoUrls
   * @return photoUrls
   **/
  @Schema(description = "")
  
    public String getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(String photoUrls) {
    this.photoUrls = photoUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurOffer purOffer = (PurOffer) o;
    return Objects.equals(this.id, purOffer.id) &&
        Objects.equals(this.name, purOffer.name) &&
        Objects.equals(this.description, purOffer.description) &&
        Objects.equals(this.photoUrls, purOffer.photoUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, photoUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
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
