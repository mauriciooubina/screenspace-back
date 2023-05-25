package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cinema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-25T13:49:06.606500-03:00[America/Argentina/Buenos_Aires]")


public class Cinema   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("adress")
  private String adress = null;

  @JsonProperty("adressNumber")
  private BigDecimal adressNumber = null;

  @JsonProperty("neighborhood")
  private String neighborhood = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("company")
  private String company = null;

  public Cinema id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "11", required = true, description = "")
      @NotNull

    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Cinema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Hoyts Belgrano", required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cinema adress(String adress) {
    this.adress = adress;
    return this;
  }

  /**
   * Get adress
   * @return adress
   **/
  @Schema(example = "Vuelta de Obligado", required = true, description = "")
      @NotNull

    public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public Cinema adressNumber(BigDecimal adressNumber) {
    this.adressNumber = adressNumber;
    return this;
  }

  /**
   * Get adressNumber
   * @return adressNumber
   **/
  @Schema(example = "2199", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getAdressNumber() {
    return adressNumber;
  }

  public void setAdressNumber(BigDecimal adressNumber) {
    this.adressNumber = adressNumber;
  }

  public Cinema neighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

  /**
   * Get neighborhood
   * @return neighborhood
   **/
  @Schema(example = "Belgrano", required = true, description = "")
      @NotNull

    public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public Cinema location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(example = "CABA", required = true, description = "")
      @NotNull

    public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Cinema city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   **/
  @Schema(example = "Buenos Aires", required = true, description = "")
      @NotNull

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Cinema country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(example = "Argentina", required = true, description = "")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Cinema latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   **/
  @Schema(example = "-34.56035662306871", required = true, description = "")
      @NotNull

    public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Cinema longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   **/
  @Schema(example = "-58.456428699264194", required = true, description = "")
      @NotNull

    public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Cinema company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
   **/
  @Schema(example = "Multiplex", required = true, description = "")
      @NotNull

    public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cinema cinema = (Cinema) o;
    return Objects.equals(this.id, cinema.id) &&
        Objects.equals(this.name, cinema.name) &&
        Objects.equals(this.adress, cinema.adress) &&
        Objects.equals(this.adressNumber, cinema.adressNumber) &&
        Objects.equals(this.neighborhood, cinema.neighborhood) &&
        Objects.equals(this.location, cinema.location) &&
        Objects.equals(this.city, cinema.city) &&
        Objects.equals(this.country, cinema.country) &&
        Objects.equals(this.latitude, cinema.latitude) &&
        Objects.equals(this.longitude, cinema.longitude) &&
        Objects.equals(this.company, cinema.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, adress, adressNumber, neighborhood, location, city, country, latitude, longitude, company);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cinema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    adress: ").append(toIndentedString(adress)).append("\n");
    sb.append("    adressNumber: ").append(toIndentedString(adressNumber)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
