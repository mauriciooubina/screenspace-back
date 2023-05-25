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
 * Review
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-25T13:49:06.606500-03:00[America/Argentina/Buenos_Aires]")


public class Review   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("movieID")
  private Integer movieID = null;

  @JsonProperty("rating")
  private BigDecimal rating = null;

  @JsonProperty("opinion")
  private String opinion = null;

  public Review id(Integer id) {
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

  public Review userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Review movieID(Integer movieID) {
    this.movieID = movieID;
    return this;
  }

  /**
   * Get movieID
   * @return movieID
   **/
  @Schema(example = "3", required = true, description = "")
      @NotNull

    public Integer getMovieID() {
    return movieID;
  }

  public void setMovieID(Integer movieID) {
    this.movieID = movieID;
  }

  public Review rating(BigDecimal rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
   **/
  @Schema(example = "7", required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getRating() {
    return rating;
  }

  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }

  public Review opinion(String opinion) {
    this.opinion = opinion;
    return this;
  }

  /**
   * Get opinion
   * @return opinion
   **/
  @Schema(example = "Muy buena la pelicula pero larga", required = true, description = "")
      @NotNull

    public String getOpinion() {
    return opinion;
  }

  public void setOpinion(String opinion) {
    this.opinion = opinion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Review review = (Review) o;
    return Objects.equals(this.id, review.id) &&
        Objects.equals(this.userId, review.userId) &&
        Objects.equals(this.movieID, review.movieID) &&
        Objects.equals(this.rating, review.rating) &&
        Objects.equals(this.opinion, review.opinion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, movieID, rating, opinion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Review {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    movieID: ").append(toIndentedString(movieID)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    opinion: ").append(toIndentedString(opinion)).append("\n");
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
