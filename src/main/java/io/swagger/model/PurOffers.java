package io.swagger.model;

import java.util.Objects;
import io.swagger.model.PurOffer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PurOffers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-04T21:37:47.555Z[GMT]")

@JsonRootName("PurOffers")
@JacksonXmlRootElement(localName = "PurOffers")
public class PurOffers extends ArrayList<PurOffer> implements Serializable  {

  private static final long serialVersionUID = 1L;
	
  	@JsonProperty("PurOffer")
	@JacksonXmlProperty(localName = "PurOffer")
	@JacksonXmlElementWrapper(useWrapping = false)
	protected List<PurOffer> purOffers = null;
	
  	@JsonValue	
	public List<PurOffer> getPurOffers() {
		return purOffers;
	}
	
	public void setPurOffers(List<PurOffer> purOffers) {
		this.purOffers = purOffers;
	}
	
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurOffers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
