package io.swagger.model;

import java.util.Objects;
import io.swagger.model.Offer;

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
 * Offers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-04T21:37:47.555Z[GMT]")

@JsonRootName("Offers")
@JacksonXmlRootElement(localName = "Offers")
public class Offers extends ArrayList<Offer> implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Offer")
	@JacksonXmlProperty(localName = "Offer")
	@JacksonXmlElementWrapper(useWrapping = false)
	protected List<Offer> offers = null;
	
	@JsonValue
	public List<Offer> getOffers() {
		return offers;
	}
	
	public void setOffers(List<Offer> offers) {
		this.offers = offers;
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
    sb.append("class Offers {\n");
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
