/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.About;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-04T16:16:25.467Z[GMT]")
@Validated
public interface AboutApi {

    @Operation(summary = "Get company information", description = "Returns decription of the company", tags={ "about" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = About.class))) })
    @RequestMapping(value = "/about",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<About> getAbout();


    @Operation(summary = "Update about page", description = "", security = {
        @SecurityRequirement(name = "recstore_auth", scopes = {
            "write:content"        })    }, tags={ "about" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Edited"),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized") })
    @RequestMapping(value = "/about",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<About> updateAbout(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody About body);

}

