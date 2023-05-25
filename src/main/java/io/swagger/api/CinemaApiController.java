package io.swagger.api;

import io.swagger.model.Cinema;
import io.swagger.model.Movie;
import io.swagger.model.MovieTheater;
import io.swagger.model.Show;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-25T13:49:06.606500-03:00[America/Argentina/Buenos_Aires]")
@RestController
public class CinemaApiController implements CinemaApi {

    private static final Logger log = LoggerFactory.getLogger(CinemaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CinemaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Cinema> cinemaCinemaIdDelete(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cinema>(objectMapper.readValue("{\n  \"country\" : \"Argentina\",\n  \"adressNumber\" : 2199,\n  \"city\" : \"Buenos Aires\",\n  \"latitude\" : \"-34.56035662306871\",\n  \"name\" : \"Hoyts Belgrano\",\n  \"adress\" : \"Vuelta de Obligado\",\n  \"location\" : \"CABA\",\n  \"company\" : \"Multiplex\",\n  \"id\" : 11,\n  \"neighborhood\" : \"Belgrano\",\n  \"longitude\" : \"-58.456428699264194\"\n}", Cinema.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cinema>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cinema>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cinema> cinemaCinemaIdGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cinema>(objectMapper.readValue("{\n  \"country\" : \"Argentina\",\n  \"adressNumber\" : 2199,\n  \"city\" : \"Buenos Aires\",\n  \"latitude\" : \"-34.56035662306871\",\n  \"name\" : \"Hoyts Belgrano\",\n  \"adress\" : \"Vuelta de Obligado\",\n  \"location\" : \"CABA\",\n  \"company\" : \"Multiplex\",\n  \"id\" : 11,\n  \"neighborhood\" : \"Belgrano\",\n  \"longitude\" : \"-58.456428699264194\"\n}", Cinema.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cinema>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cinema>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<MovieTheater>> cinemaCinemaIdMovieTheaterGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<MovieTheater>>(objectMapper.readValue("[ {\n  \"temporalyClosed\" : false,\n  \"cinemaID\" : 1,\n  \"columns\" : 8,\n  \"price\" : 500,\n  \"name\" : \"Sala 01 Multiplex Belgrano\",\n  \"id\" : 11,\n  \"rows\" : 8\n}, {\n  \"temporalyClosed\" : false,\n  \"cinemaID\" : 1,\n  \"columns\" : 8,\n  \"price\" : 500,\n  \"name\" : \"Sala 01 Multiplex Belgrano\",\n  \"id\" : 11,\n  \"rows\" : 8\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<MovieTheater>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<MovieTheater>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MovieTheater> cinemaCinemaIdMovieTheaterPost(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MovieTheater>(objectMapper.readValue("{\n  \"temporalyClosed\" : false,\n  \"cinemaID\" : 1,\n  \"columns\" : 8,\n  \"price\" : 500,\n  \"name\" : \"Sala 01 Multiplex Belgrano\",\n  \"id\" : 11,\n  \"rows\" : 8\n}", MovieTheater.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MovieTheater>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MovieTheater>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MovieTheater> cinemaCinemaIdMovieTheaterTheaterIdDelete(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MovieTheater>(objectMapper.readValue("{\n  \"temporalyClosed\" : false,\n  \"cinemaID\" : 1,\n  \"columns\" : 8,\n  \"price\" : 500,\n  \"name\" : \"Sala 01 Multiplex Belgrano\",\n  \"id\" : 11,\n  \"rows\" : 8\n}", MovieTheater.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MovieTheater>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MovieTheater>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MovieTheater> cinemaCinemaIdMovieTheaterTheaterIdGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MovieTheater>(objectMapper.readValue("{\n  \"temporalyClosed\" : false,\n  \"cinemaID\" : 1,\n  \"columns\" : 8,\n  \"price\" : 500,\n  \"name\" : \"Sala 01 Multiplex Belgrano\",\n  \"id\" : 11,\n  \"rows\" : 8\n}", MovieTheater.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MovieTheater>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MovieTheater>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MovieTheater> cinemaCinemaIdMovieTheaterTheaterIdPut(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MovieTheater>(objectMapper.readValue("{\n  \"temporalyClosed\" : false,\n  \"cinemaID\" : 1,\n  \"columns\" : 8,\n  \"price\" : 500,\n  \"name\" : \"Sala 01 Multiplex Belgrano\",\n  \"id\" : 11,\n  \"rows\" : 8\n}", MovieTheater.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MovieTheater>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MovieTheater>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Show>> cinemaCinemaIdMovieTheaterTheaterIdShowsGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Show>>(objectMapper.readValue("[ {\n  \"date\" : \"14/05/2023\",\n  \"cinemaID\" : 5,\n  \"theaterId\" : 6,\n  \"movieId\" : 1,\n  \"id\" : 11,\n  \"time\" : \"19:30\",\n  \"seats\" : [ \"seats\", \"seats\" ]\n}, {\n  \"date\" : \"14/05/2023\",\n  \"cinemaID\" : 5,\n  \"theaterId\" : 6,\n  \"movieId\" : 1,\n  \"id\" : 11,\n  \"time\" : \"19:30\",\n  \"seats\" : [ \"seats\", \"seats\" ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Show>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Show>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Show>> cinemaCinemaIdMovieTheaterTheaterIdShowsPost(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Show body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Show>>(objectMapper.readValue("[ {\n  \"date\" : \"14/05/2023\",\n  \"cinemaID\" : 5,\n  \"theaterId\" : 6,\n  \"movieId\" : 1,\n  \"id\" : 11,\n  \"time\" : \"19:30\",\n  \"seats\" : [ \"seats\", \"seats\" ]\n}, {\n  \"date\" : \"14/05/2023\",\n  \"cinemaID\" : 5,\n  \"theaterId\" : 6,\n  \"movieId\" : 1,\n  \"id\" : 11,\n  \"time\" : \"19:30\",\n  \"seats\" : [ \"seats\", \"seats\" ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Show>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Show>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Show> cinemaCinemaIdMovieTheaterTheaterIdShowsShowIdDelete(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the show of a movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("showId") Integer showId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Show>(objectMapper.readValue("{\n  \"date\" : \"14/05/2023\",\n  \"cinemaID\" : 5,\n  \"theaterId\" : 6,\n  \"movieId\" : 1,\n  \"id\" : 11,\n  \"time\" : \"19:30\",\n  \"seats\" : [ \"seats\", \"seats\" ]\n}", Show.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Show>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Show>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Show> cinemaCinemaIdMovieTheaterTheaterIdShowsShowIdGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the show of a movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("showId") Integer showId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Show>(objectMapper.readValue("{\n  \"date\" : \"14/05/2023\",\n  \"cinemaID\" : 5,\n  \"theaterId\" : 6,\n  \"movieId\" : 1,\n  \"id\" : 11,\n  \"time\" : \"19:30\",\n  \"seats\" : [ \"seats\", \"seats\" ]\n}", Show.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Show>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Show>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Movie>> cinemaCinemaIdMovieTheaterTheaterIdShowsShowIdMoviesGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("showId") Integer showId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Movie>>(objectMapper.readValue("[ {\n  \"img\" : \"url\",\n  \"gender\" : \"Drama\",\n  \"rating\" : 7,\n  \"id\" : 11,\n  \"synopsis\" : \"Adonis Creed está prosperando en su carrera y en su vida familiar.\",\n  \"title\" : \"Creed III\"\n}, {\n  \"img\" : \"url\",\n  \"gender\" : \"Drama\",\n  \"rating\" : 7,\n  \"id\" : 11,\n  \"synopsis\" : \"Adonis Creed está prosperando en su carrera y en su vida familiar.\",\n  \"title\" : \"Creed III\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Movie>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Movie>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Movie> cinemaCinemaIdMovieTheaterTheaterIdShowsShowIdMoviesMovieIdGet(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("movieId") Integer movieId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater shows to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("showId") Integer showId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Movie>(objectMapper.readValue("{\n  \"img\" : \"url\",\n  \"gender\" : \"Drama\",\n  \"rating\" : 7,\n  \"id\" : 11,\n  \"synopsis\" : \"Adonis Creed está prosperando en su carrera y en su vida familiar.\",\n  \"title\" : \"Creed III\"\n}", Movie.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Movie>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Movie>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Show> cinemaCinemaIdMovieTheaterTheaterIdShowsShowIdPut(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("theaterId") Integer theaterId,@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the show of a movie theater to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("showId") Integer showId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Show>(objectMapper.readValue("{\n  \"date\" : \"14/05/2023\",\n  \"cinemaID\" : 5,\n  \"theaterId\" : 6,\n  \"movieId\" : 1,\n  \"id\" : 11,\n  \"time\" : \"19:30\",\n  \"seats\" : [ \"seats\", \"seats\" ]\n}", Show.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Show>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Show>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cinema> cinemaCinemaIdPut(@Min(1)@Parameter(in = ParameterIn.PATH, description = "The ID of the cinema to return.", required=true, schema=@Schema(allowableValues={  }, minimum="1"
)) @PathVariable("cinemaId") Integer cinemaId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cinema>(objectMapper.readValue("{\n  \"country\" : \"Argentina\",\n  \"adressNumber\" : 2199,\n  \"city\" : \"Buenos Aires\",\n  \"latitude\" : \"-34.56035662306871\",\n  \"name\" : \"Hoyts Belgrano\",\n  \"adress\" : \"Vuelta de Obligado\",\n  \"location\" : \"CABA\",\n  \"company\" : \"Multiplex\",\n  \"id\" : 11,\n  \"neighborhood\" : \"Belgrano\",\n  \"longitude\" : \"-58.456428699264194\"\n}", Cinema.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cinema>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cinema>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Cinema>> cinemaGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Cinema>>(objectMapper.readValue("[ {\n  \"country\" : \"Argentina\",\n  \"adressNumber\" : 2199,\n  \"city\" : \"Buenos Aires\",\n  \"latitude\" : \"-34.56035662306871\",\n  \"name\" : \"Hoyts Belgrano\",\n  \"adress\" : \"Vuelta de Obligado\",\n  \"location\" : \"CABA\",\n  \"company\" : \"Multiplex\",\n  \"id\" : 11,\n  \"neighborhood\" : \"Belgrano\",\n  \"longitude\" : \"-58.456428699264194\"\n}, {\n  \"country\" : \"Argentina\",\n  \"adressNumber\" : 2199,\n  \"city\" : \"Buenos Aires\",\n  \"latitude\" : \"-34.56035662306871\",\n  \"name\" : \"Hoyts Belgrano\",\n  \"adress\" : \"Vuelta de Obligado\",\n  \"location\" : \"CABA\",\n  \"company\" : \"Multiplex\",\n  \"id\" : 11,\n  \"neighborhood\" : \"Belgrano\",\n  \"longitude\" : \"-58.456428699264194\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Cinema>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Cinema>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cinema> cinemaPost() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cinema>(objectMapper.readValue("{\n  \"country\" : \"Argentina\",\n  \"adressNumber\" : 2199,\n  \"city\" : \"Buenos Aires\",\n  \"latitude\" : \"-34.56035662306871\",\n  \"name\" : \"Hoyts Belgrano\",\n  \"adress\" : \"Vuelta de Obligado\",\n  \"location\" : \"CABA\",\n  \"company\" : \"Multiplex\",\n  \"id\" : 11,\n  \"neighborhood\" : \"Belgrano\",\n  \"longitude\" : \"-58.456428699264194\"\n}", Cinema.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cinema>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cinema>(HttpStatus.NOT_IMPLEMENTED);
    }

}
