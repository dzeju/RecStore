package io.swagger.api;

import io.swagger.model.PurOffer;
import io.swagger.model.PurOffers;
import io.swagger.service.PurOfferService;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-04T21:37:47.555Z[GMT]")
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PurchaseApiController implements PurchaseApi {

	@Autowired
	private PurOfferService purOfferService;
	
    private static final Logger log = LoggerFactory.getLogger(PurchaseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PurchaseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    
    @PostMapping("/puroffers")
    public ResponseEntity<PurOffer> addPurchase(
    		@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PurOffer body) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
        	return ResponseEntity.ok(purOfferService.addPurOffer(body));
        }
        return new ResponseEntity<PurOffer>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/puroffers/{id}")
    public ResponseEntity<PurOffer> deletePurchaseById(
    		@Parameter(in = ParameterIn.PATH, description = "Numeric ID of the offer to delete.", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<PurOffer>(objectMapper.readValue("{\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"name\" : \"Plastic grain\",\n  \"description\" : \"Plastic plastic\",\n  \"id\" : 0\n}", PurOffer.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<PurOffer>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        	return ResponseEntity.ok(purOfferService.deletePurOfferById(id));
        }

        return new ResponseEntity<PurOffer>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/puroffers/{id}")
    public ResponseEntity<PurOffer> editOptionByPath(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PurOffer body) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
        	return ResponseEntity.ok(purOfferService.updatePurOfferById(body, id));
        }
        return new ResponseEntity<PurOffer>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/puroffers/{id}")
    public ResponseEntity<PurOffer> getOptionByPath(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<PurOffer>(objectMapper.readValue("{\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"name\" : \"Plastic grain\",\n  \"description\" : \"Plastic plastic\",\n  \"id\" : 0\n}", PurOffer.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<PurOffer>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        	return ResponseEntity.ok(purOfferService.findPurOfferById(id));
        }

        return new ResponseEntity<PurOffer>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/puroffers")
    public ResponseEntity<PurOffers> getPurchaseOptions(@Parameter(in = ParameterIn.QUERY, description = "Offset list of offers" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "Limit list of offers" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<PurOffers>(objectMapper.readValue("[ {\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"name\" : \"Plastic grain\",\n  \"description\" : \"Plastic plastic\",\n  \"id\" : 0\n}, {\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"name\" : \"Plastic grain\",\n  \"description\" : \"Plastic plastic\",\n  \"id\" : 0\n} ]", PurOffers.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<PurOffers>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        	PurOffers puff2  = new PurOffers();
        	puff2.setPurOffers(purOfferService.findAllPurOffers());
//        	System.out.print(purOfferService.findAllPurOffers());
//        	System.out.print("\n-------------------------------------\n");
//        	System.out.print(puff2);
        	return ResponseEntity.ok(puff2);
        }

        return new ResponseEntity<PurOffers>(HttpStatus.NOT_IMPLEMENTED);
    }

}
