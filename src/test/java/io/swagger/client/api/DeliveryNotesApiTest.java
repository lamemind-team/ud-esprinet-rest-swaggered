/*
 * Esprinet Customer Rest Services
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v2
 * Contact: dl-ws-integration@esprinet.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.GetDeliveryNoteOutput;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.SearchDeliveryNotesOutput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeliveryNotesApi
 */
@Ignore
public class DeliveryNotesApiTest {

    private final DeliveryNotesApi api = new DeliveryNotesApi();

    
    /**
     * Get a Delivery Note By Document Number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deliveryNoteGetTest() throws ApiException {
        String id = null;
        String xConsumerTransactionId = null;
        GetDeliveryNoteOutput response = api.deliveryNoteGet(id, xConsumerTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get a all the delivery notes by the inserted criterias
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deliveryNotesSearchGetTest() throws ApiException {
        String documentNumber = null;
        OffsetDateTime fromDate = null;
        OffsetDateTime toDate = null;
        String filter = null;
        Integer currentPage = null;
        String xConsumerTransactionId = null;
        SearchDeliveryNotesOutput response = api.deliveryNotesSearchGet(documentNumber, fromDate, toDate, filter, currentPage, xConsumerTransactionId);

        // TODO: test validations
    }
    
}
