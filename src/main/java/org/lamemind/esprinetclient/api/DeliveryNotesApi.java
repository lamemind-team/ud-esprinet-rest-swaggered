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

import org.lamemind.esprinetclient.invoker.ApiCallback;
import org.lamemind.esprinetclient.invoker.ApiClient;
import org.lamemind.esprinetclient.invoker.ApiException;
import org.lamemind.esprinetclient.invoker.ApiResponse;
import org.lamemind.esprinetclient.invoker.Configuration;
import org.lamemind.esprinetclient.invoker.Pair;
import org.lamemind.esprinetclient.invoker.ProgressRequestBody;
import org.lamemind.esprinetclient.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.lamemind.esprinetclient.model.GetDeliveryNoteOutput;
import org.threeten.bp.OffsetDateTime;
import org.lamemind.esprinetclient.model.SearchDeliveryNotesOutput;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeliveryNotesApi {
    private ApiClient apiClient;

    public DeliveryNotesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeliveryNotesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deliveryNoteGet
     * @param id The delivery note document number (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deliveryNoteGetCall(String id, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deliveryNotes/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xConsumerTransactionId != null)
        localVarHeaderParams.put("X-ConsumerTransactionId", apiClient.parameterToString(xConsumerTransactionId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deliveryNoteGetValidateBeforeCall(String id, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deliveryNoteGet(Async)");
        }
        

        com.squareup.okhttp.Call call = deliveryNoteGetCall(id, xConsumerTransactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Delivery Note By Document Number
     * 
     * @param id The delivery note document number (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return GetDeliveryNoteOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetDeliveryNoteOutput deliveryNoteGet(String id, String xConsumerTransactionId) throws ApiException {
        ApiResponse<GetDeliveryNoteOutput> resp = deliveryNoteGetWithHttpInfo(id, xConsumerTransactionId);
        return resp.getData();
    }

    /**
     * Get a Delivery Note By Document Number
     * 
     * @param id The delivery note document number (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return ApiResponse&lt;GetDeliveryNoteOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetDeliveryNoteOutput> deliveryNoteGetWithHttpInfo(String id, String xConsumerTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = deliveryNoteGetValidateBeforeCall(id, xConsumerTransactionId, null, null);
        Type localVarReturnType = new TypeToken<GetDeliveryNoteOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Delivery Note By Document Number (asynchronously)
     * 
     * @param id The delivery note document number (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deliveryNoteGetAsync(String id, String xConsumerTransactionId, final ApiCallback<GetDeliveryNoteOutput> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deliveryNoteGetValidateBeforeCall(id, xConsumerTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetDeliveryNoteOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deliveryNotesSearchGet
     * @param documentNumber The delivery note document number (optional)
     * @param fromDate delivery notes date from (optional)
     * @param toDate delivery notes date to (optional)
     * @param filter Filter search by status (optional)
     * @param currentPage current Page to be display. This optional parameter if valorized must be equal or greater than 1 (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deliveryNotesSearchGetCall(String documentNumber, OffsetDateTime fromDate, OffsetDateTime toDate, String filter, Integer currentPage, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deliveryNotes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (documentNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("documentNumber", documentNumber));
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (currentPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currentPage", currentPage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xConsumerTransactionId != null)
        localVarHeaderParams.put("X-ConsumerTransactionId", apiClient.parameterToString(xConsumerTransactionId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deliveryNotesSearchGetValidateBeforeCall(String documentNumber, OffsetDateTime fromDate, OffsetDateTime toDate, String filter, Integer currentPage, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = deliveryNotesSearchGetCall(documentNumber, fromDate, toDate, filter, currentPage, xConsumerTransactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a all the delivery notes by the inserted criterias
     * 
     * @param documentNumber The delivery note document number (optional)
     * @param fromDate delivery notes date from (optional)
     * @param toDate delivery notes date to (optional)
     * @param filter Filter search by status (optional)
     * @param currentPage current Page to be display. This optional parameter if valorized must be equal or greater than 1 (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return SearchDeliveryNotesOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchDeliveryNotesOutput deliveryNotesSearchGet(String documentNumber, OffsetDateTime fromDate, OffsetDateTime toDate, String filter, Integer currentPage, String xConsumerTransactionId) throws ApiException {
        ApiResponse<SearchDeliveryNotesOutput> resp = deliveryNotesSearchGetWithHttpInfo(documentNumber, fromDate, toDate, filter, currentPage, xConsumerTransactionId);
        return resp.getData();
    }

    /**
     * Get a all the delivery notes by the inserted criterias
     * 
     * @param documentNumber The delivery note document number (optional)
     * @param fromDate delivery notes date from (optional)
     * @param toDate delivery notes date to (optional)
     * @param filter Filter search by status (optional)
     * @param currentPage current Page to be display. This optional parameter if valorized must be equal or greater than 1 (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return ApiResponse&lt;SearchDeliveryNotesOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchDeliveryNotesOutput> deliveryNotesSearchGetWithHttpInfo(String documentNumber, OffsetDateTime fromDate, OffsetDateTime toDate, String filter, Integer currentPage, String xConsumerTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = deliveryNotesSearchGetValidateBeforeCall(documentNumber, fromDate, toDate, filter, currentPage, xConsumerTransactionId, null, null);
        Type localVarReturnType = new TypeToken<SearchDeliveryNotesOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a all the delivery notes by the inserted criterias (asynchronously)
     * 
     * @param documentNumber The delivery note document number (optional)
     * @param fromDate delivery notes date from (optional)
     * @param toDate delivery notes date to (optional)
     * @param filter Filter search by status (optional)
     * @param currentPage current Page to be display. This optional parameter if valorized must be equal or greater than 1 (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deliveryNotesSearchGetAsync(String documentNumber, OffsetDateTime fromDate, OffsetDateTime toDate, String filter, Integer currentPage, String xConsumerTransactionId, final ApiCallback<SearchDeliveryNotesOutput> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deliveryNotesSearchGetValidateBeforeCall(documentNumber, fromDate, toDate, filter, currentPage, xConsumerTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchDeliveryNotesOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
