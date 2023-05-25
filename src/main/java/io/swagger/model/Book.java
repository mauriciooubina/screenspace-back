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
 * Book
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-25T13:49:06.606500-03:00[America/Argentina/Buenos_Aires]")


public class Book   {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("cinemaId")
  private Integer cinemaId = null;

  @JsonProperty("showID")
  private Integer showID = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("tickets")
  private Integer tickets = null;

  @JsonProperty("seats")
  @Valid
  private List<Integer> seats = new ArrayList<Integer>();

  public Book userId(Integer userId) {
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

  public Book cinemaId(Integer cinemaId) {
    this.cinemaId = cinemaId;
    return this;
  }

  /**
   * Get cinemaId
   * @return cinemaId
   **/
  @Schema(example = "11", required = true, description = "")
      @NotNull

    public Integer getCinemaId() {
    return cinemaId;
  }

  public void setCinemaId(Integer cinemaId) {
    this.cinemaId = cinemaId;
  }

  public Book showID(Integer showID) {
    this.showID = showID;
    return this;
  }

  /**
   * Get showID
   * @return showID
   **/
  @Schema(example = "11", required = true, description = "")
      @NotNull

    public Integer getShowID() {
    return showID;
  }

  public void setShowID(Integer showID) {
    this.showID = showID;
  }

  public Book date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(example = "14/5/2023", required = true, description = "")
      @NotNull

    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Book time(String time) {
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

  public Book tickets(Integer tickets) {
    this.tickets = tickets;
    return this;
  }

  /**
   * Get tickets
   * @return tickets
   **/
  @Schema(example = "2", required = true, description = "")
      @NotNull

    public Integer getTickets() {
    return tickets;
  }

  public void setTickets(Integer tickets) {
    this.tickets = tickets;
  }

  public Book seats(List<Integer> seats) {
    this.seats = seats;
    return this;
  }

  public Book addSeatsItem(Integer seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }

  /**
   * Get seats
   * @return seats
   **/
  @Schema(example = "[11,12]", required = true, description = "")
      @NotNull

    public List<Integer> getSeats() {
    return seats;
  }

  public void setSeats(List<Integer> seats) {
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
    Book book = (Book) o;
    return Objects.equals(this.userId, book.userId) &&
        Objects.equals(this.cinemaId, book.cinemaId) &&
        Objects.equals(this.showID, book.showID) &&
        Objects.equals(this.date, book.date) &&
        Objects.equals(this.time, book.time) &&
        Objects.equals(this.tickets, book.tickets) &&
        Objects.equals(this.seats, book.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, cinemaId, showID, date, time, tickets, seats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    cinemaId: ").append(toIndentedString(cinemaId)).append("\n");
    sb.append("    showID: ").append(toIndentedString(showID)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
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
