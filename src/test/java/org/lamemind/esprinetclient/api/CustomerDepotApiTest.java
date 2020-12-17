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


package org.lamemind.esprinetclient.api;

import org.lamemind.esprinetclient.invoker.ApiException;
import org.lamemind.esprinetclient.model.CustomerDepotDeliveryNoteOutput;
import org.lamemind.esprinetclient.model.CustomerDepotDeliveryNotesOutput;
import org.lamemind.esprinetclient.model.CustomerDepotOrderInput;
import org.lamemind.esprinetclient.model.CustomerDepotOrderInsertOutput;
import org.lamemind.esprinetclient.model.CustomerDepotOrderOutput;
import org.lamemind.esprinetclient.model.CustomerDepotOrdersOutput;
import org.lamemind.esprinetclient.model.CustomerDepotProductOutput;
import org.lamemind.esprinetclient.model.CustomerDepotProductsOutput;
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerDepotApi
 */
@Ignore
public class CustomerDepotApiTest {

    private final CustomerDepotApi api = new CustomerDepotApi();

    
    /**
     * Get the customer depot delivery note by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerDepotDeliveryNotesGetByIdTest() throws ApiException {
        String id = null;
        String xConsumerTransactionId = null;
        CustomerDepotDeliveryNoteOutput response = api.customerDepotDeliveryNotesGetById(id, xConsumerTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get all delivery notes of the customer depot
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerDepotDeliveryNotesSearchTest() throws ApiException {
        OffsetDateTime fromDate = null;
        OffsetDateTime toDate = null;
        String filter = null;
        Integer currentPage = null;
        String xConsumerTransactionId = null;
        CustomerDepotDeliveryNotesOutput response = api.customerDepotDeliveryNotesSearch(fromDate, toDate, filter, currentPage, xConsumerTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get the customer depot order by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerDepotOrdersGetByIdTest() throws ApiException {
        String id = null;
        String xConsumerTransactionId = null;
        CustomerDepotOrderOutput response = api.customerDepotOrdersGetById(id, xConsumerTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get all orders of the customer depot.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerDepotOrdersSearchTest() throws ApiException {
        String customerOrderId = null;
        OffsetDateTime fromDate = null;
        OffsetDateTime toDate = null;
        String filter = null;
        Integer currentPage = null;
        String xConsumerTransactionId = null;
        CustomerDepotOrdersOutput response = api.customerDepotOrdersSearch(customerOrderId, fromDate, toDate, filter, currentPage, xConsumerTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get the product of the customer with the given product Id stored in the Esprinet depot
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerDepotProductsGetByIdTest() throws ApiException {
        String id = null;
        String xConsumerTransactionId = null;
        CustomerDepotProductOutput response = api.customerDepotProductsGetById(id, xConsumerTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get all products of the customer stored in the Esprinet depot
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerDepotProductsGetByPageTest() throws ApiException {
        Integer currentPage = null;
        String xConsumerTransactionId = null;
        CustomerDepotProductsOutput response = api.customerDepotProductsGetByPage(currentPage, xConsumerTransactionId);

        // TODO: test validations
    }
    
    /**
     * Get the product of the customer with the given customer or esprinet product Id stored in the Esprinet depot
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerDepotProductsSearchTest() throws ApiException {
        String esprinetProductCode = null;
        String customerProductCode = null;
        String xConsumerTransactionId = null;
        CustomerDepotProductOutput response = api.customerDepotProductsSearch(esprinetProductCode, customerProductCode, xConsumerTransactionId);

        // TODO: test validations
    }
    
    /**
     * Creates a new order containing the specified list of products into the Esprinet systems.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ordersPostTest() throws ApiException {
        CustomerDepotOrderInput orderInput = null;
        String xConsumerTransactionId = null;
        CustomerDepotOrderInsertOutput response = api.ordersPost(orderInput, xConsumerTransactionId);

        // TODO: test validations
    }
    
}
