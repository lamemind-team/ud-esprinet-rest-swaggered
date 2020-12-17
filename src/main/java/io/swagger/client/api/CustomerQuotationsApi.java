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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.QuotationInputResponse;
import io.swagger.client.model.QuotationOutput;
import io.swagger.client.model.QuotationsInput;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerQuotationsApi {
    private ApiClient apiClient;

    public CustomerQuotationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerQuotationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for quotationGet
     * @param id The quotation id (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call quotationGetCall(Integer id, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/customerQuotations/{id}"
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
    private com.squareup.okhttp.Call quotationGetValidateBeforeCall(Integer id, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling quotationGet(Async)");
        }
        

        com.squareup.okhttp.Call call = quotationGetCall(id, xConsumerTransactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the quotation previously inserted by Id
     * 
     * @param id The quotation id (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return QuotationOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QuotationOutput quotationGet(Integer id, String xConsumerTransactionId) throws ApiException {
        ApiResponse<QuotationOutput> resp = quotationGetWithHttpInfo(id, xConsumerTransactionId);
        return resp.getData();
    }

    /**
     * Gets the quotation previously inserted by Id
     * 
     * @param id The quotation id (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return ApiResponse&lt;QuotationOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QuotationOutput> quotationGetWithHttpInfo(Integer id, String xConsumerTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = quotationGetValidateBeforeCall(id, xConsumerTransactionId, null, null);
        Type localVarReturnType = new TypeToken<QuotationOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the quotation previously inserted by Id (asynchronously)
     * 
     * @param id The quotation id (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call quotationGetAsync(Integer id, String xConsumerTransactionId, final ApiCallback<QuotationOutput> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = quotationGetValidateBeforeCall(id, xConsumerTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QuotationOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for quotationPost
     * @param quotation Input object (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call quotationPostCall(QuotationsInput quotation, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = quotation;

        // create path and map variables
        String localVarPath = "/customerQuotations";

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
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call quotationPostValidateBeforeCall(QuotationsInput quotation, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'quotation' is set
        if (quotation == null) {
            throw new ApiException("Missing the required parameter 'quotation' when calling quotationPost(Async)");
        }
        

        com.squareup.okhttp.Call call = quotationPostCall(quotation, xConsumerTransactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new quotation request containing the specified list of products into the Esprinet systems.
     * 
     * @param quotation Input object (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return QuotationInputResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QuotationInputResponse quotationPost(QuotationsInput quotation, String xConsumerTransactionId) throws ApiException {
        ApiResponse<QuotationInputResponse> resp = quotationPostWithHttpInfo(quotation, xConsumerTransactionId);
        return resp.getData();
    }

    /**
     * Creates a new quotation request containing the specified list of products into the Esprinet systems.
     * 
     * @param quotation Input object (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return ApiResponse&lt;QuotationInputResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QuotationInputResponse> quotationPostWithHttpInfo(QuotationsInput quotation, String xConsumerTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = quotationPostValidateBeforeCall(quotation, xConsumerTransactionId, null, null);
        Type localVarReturnType = new TypeToken<QuotationInputResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new quotation request containing the specified list of products into the Esprinet systems. (asynchronously)
     * 
     * @param quotation Input object (required)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call quotationPostAsync(QuotationsInput quotation, String xConsumerTransactionId, final ApiCallback<QuotationInputResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = quotationPostValidateBeforeCall(quotation, xConsumerTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QuotationInputResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}