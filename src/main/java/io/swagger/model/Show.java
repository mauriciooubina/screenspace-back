package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Show
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-25T13:49:06.606500-03:00[America/Argentina/Buenos_Aires]")


public class Show   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("cinemaID")
  private Integer cinemaID = null;

  @JsonProperty("theaterId")
  private Integer theaterId = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("movieId")
  private Integer movieId = null;

  @JsonProperty("seats")
  @Valid
  private List<String> seats = new ArrayList<String>();

  public Show id(Integer id) {
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

  public Show cinemaID(Integer cinemaID) {
    this.cinemaID = cinemaID;
    return this;
  }

  /**
   * Get cinemaID
   * @return cinemaID
   **/
  @Schema(example = "5", required = true, description = "")
      @NotNull

    public Integer getCinemaID() {
    return cinemaID;
  }

  public void setCinemaID(Integer cinemaID) {
    this.cinemaID = cinemaID;
  }

  public Show theaterId(Integer theaterId) {
    this.theaterId = theaterId;
    return this;
  }

  /**
   * Get theaterId
   * @return theaterId
   **/
  @Schema(example = "6", required = true, description = "")
      @NotNull

    public Integer getTheaterId() {
    return theaterId;
  }

  public void setTheaterId(Integer theaterId) {
    this.theaterId = theaterId;
  }

  public Show date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(example = "14/05/2023", required = true, description = "")
      @NotNull

    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Show time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @Schema(example = "19:30", required = true, description = "")
      @NotNull

    public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Show movieId(Integer movieId) {
    this.movieId = movieId;
    return this;
  }

  /**
   * Get movieId
   * @return movieId
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Integer getMovieId() {
    return movieId;
  }

  public void setMovieId(Integer movieId) {
    this.movieId = movieId;
  }

  public Show seats(List<String> seats) {
    this.seats = seats;
    return this;
  }

  public Show addSeatsItem(String seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }

  /**
   * Get seats
   * @return seats
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getSeats() {
    return seats;
  }

  public void setSeats(List<String> seats) {
    this.seats = seats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Show show = (Show) o;
    return Objects.equals(this.id, show.id) &&
        Objects.equals(this.cinemaID, show.cinemaID) &&
        Objects.equals(this.theaterId, show.theaterId) &&
        Objects.equals(this.date, show.date) &&
        Objects.equals(this.time, show.time) &&
        Objects.equals(this.movieId, show.movieId) &&
        Objects.equals(this.seats, show.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cinemaID, theaterId, date, time, movieId, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Show {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cinemaID: ").append(toIndentedString(cinemaID)).append("\n");
    sb.append("    theaterId: ").append(toIndentedString(theaterId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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
