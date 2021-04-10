package io.swagger.api;

import io.swagger.model.Offer;
import io.swagger.model.Offers;
import io.swagger.model.PurInfo;
import io.swagger.service.OfferService;

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
public class OffersApiController implements OffersApi {
	
	@Autowired
	private OfferService offerService;

    private static final Logger log = LoggerFactory.getLogger(OffersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OffersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @PostMapping("/offers")
    public ResponseEntity<Offer> addOffer(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Offer body) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
        	return ResponseEntity.ok(offerService.addOffer(body));
        }
        return new ResponseEntity<Offer>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/offers/{id}")
    public ResponseEntity<Offer> deleteOfferById(@Parameter(in = ParameterIn.PATH, description = "Numeric ID of the offer to delete.", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Offer>(objectMapper.readValue("{\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"name\" : \"Plastic\",\n  \"description\" : \"Plastic plastic\",\n  \"id\" : 0\n}", Offer.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Offer>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        	return ResponseEntity.ok(offerService.deleteOfferById(id));
        }

        return new ResponseEntity<Offer>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @GetMapping("/offers/info")
    public ResponseEntity<PurInfo> getBuyingInfo() {
        String accept = request.getHeader("Accept");
        if (accept != null) {
//            try {
//                return new ResponseEntity<PurInfo>(objectMapper.readValue("{\n  \"content\" : \"Give us ur money!\"\n}", PurInfo.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<PurInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        	return ResponseEntity.ok(offerService.getPurInfo());
        }

        return new ResponseEntity<PurInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/offers/{id}")
    public ResponseEntity<Offer> getOfferByPath(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Offer>(objectMapper.readValue("{\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"name\" : \"Plastic\",\n  \"description\" : \"Plastic plastic\",\n  \"id\" : 0\n}", Offer.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Offer>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        	return ResponseEntity.ok(offerService.findOfferById(id));
        }

        return new ResponseEntity<Offer>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @GetMapping("/offers")
    public ResponseEntity<Offers> getOffers(@Parameter(in = ParameterIn.QUERY, description = "Offset list of offers" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "Limit list of offers" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Offers>(objectMapper.readValue("[ {\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"name\" : \"Plastic\",\n  \"description\" : \"Plastic plastic\",\n  \"id\" : 0\n}, {\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\n  \"name\" : \"Plastic\",\n  \"description\" : \"Plastic plastic\",\n  \"id\" : 0\n} ]", Offers.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Offers>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        	Offers oof = new Offers();
        	oof.setOffers(offerService.findAllOffers());
        	return ResponseEntity.ok(oof);
        }

        return new ResponseEntity<Offers>(HttpStatus.NOT_IMPLEMENTED);
    }
    
    @PostMapping("/offers/info")
    public ResponseEntity<PurInfo> updateBuyingInfo(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PurInfo body) {
        String accept = request.getHeader("Accept");
        return ResponseEntity.ok(offerService.setPurInfo(body));
    }
    
    @PostMapping("/offers/{id}")
    public ResponseEntity<Offer> updateOfferByPath(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Offer body) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
        	return ResponseEntity.ok(offerService.updateOfferById(body, id));
        }
        return new ResponseEntity<Offer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
