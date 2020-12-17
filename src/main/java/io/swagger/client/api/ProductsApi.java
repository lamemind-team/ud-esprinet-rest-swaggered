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


import io.swagger.client.model.ProductAvailabilityByCodeOutput;
import io.swagger.client.model.ProductPricingByCodeOutput;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsApi {
    private ApiClient apiClient;

    public ProductsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for productsAvailabilityGet
     * @param esprinetProductCode The esprinet product code (optional)
     * @param customerProductCode The customer product code (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsAvailabilityGetCall(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/availability";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (esprinetProductCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("esprinetProductCode", esprinetProductCode));
        if (customerProductCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("customerProductCode", customerProductCode));

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
    private com.squareup.okhttp.Call productsAvailabilityGetValidateBeforeCall(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = productsAvailabilityGetCall(esprinetProductCode, customerProductCode, xConsumerTransactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Product Availability Info by the Esprinet or Customer product code
     * 
     * @param esprinetProductCode The esprinet product code (optional)
     * @param customerProductCode The customer product code (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return ProductAvailabilityByCodeOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductAvailabilityByCodeOutput productsAvailabilityGet(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId) throws ApiException {
        ApiResponse<ProductAvailabilityByCodeOutput> resp = productsAvailabilityGetWithHttpInfo(esprinetProductCode, customerProductCode, xConsumerTransactionId);
        return resp.getData();
    }

    /**
     * Get a Product Availability Info by the Esprinet or Customer product code
     * 
     * @param esprinetProductCode The esprinet product code (optional)
     * @param customerProductCode The customer product code (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return ApiResponse&lt;ProductAvailabilityByCodeOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductAvailabilityByCodeOutput> productsAvailabilityGetWithHttpInfo(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = productsAvailabilityGetValidateBeforeCall(esprinetProductCode, customerProductCode, xConsumerTransactionId, null, null);
        Type localVarReturnType = new TypeToken<ProductAvailabilityByCodeOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Product Availability Info by the Esprinet or Customer product code (asynchronously)
     * 
     * @param esprinetProductCode The esprinet product code (optional)
     * @param customerProductCode The customer product code (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsAvailabilityGetAsync(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId, final ApiCallback<ProductAvailabilityByCodeOutput> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsAvailabilityGetValidateBeforeCall(esprinetProductCode, customerProductCode, xConsumerTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductAvailabilityByCodeOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for productsPricingGet
     * @param esprinetProductCode The esprinet product code (optional)
     * @param customerProductCode The customer product code (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call productsPricingGetCall(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/products/pricing";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (esprinetProductCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("esprinetProductCode", esprinetProductCode));
        if (customerProductCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("customerProductCode", customerProductCode));

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
    private com.squareup.okhttp.Call productsPricingGetValidateBeforeCall(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = productsPricingGetCall(esprinetProductCode, customerProductCode, xConsumerTransactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a Product Pricing Info by the Esprinet or Customer product code
     * 
     * @param esprinetProductCode The esprinet product code (optional)
     * @param customerProductCode The customer product code (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return ProductPricingByCodeOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProductPricingByCodeOutput productsPricingGet(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId) throws ApiException {
        ApiResponse<ProductPricingByCodeOutput> resp = productsPricingGetWithHttpInfo(esprinetProductCode, customerProductCode, xConsumerTransactionId);
        return resp.getData();
    }

    /**
     * Get a Product Pricing Info by the Esprinet or Customer product code
     * 
     * @param esprinetProductCode The esprinet product code (optional)
     * @param customerProductCode The customer product code (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @return ApiResponse&lt;ProductPricingByCodeOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProductPricingByCodeOutput> productsPricingGetWithHttpInfo(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = productsPricingGetValidateBeforeCall(esprinetProductCode, customerProductCode, xConsumerTransactionId, null, null);
        Type localVarReturnType = new TypeToken<ProductPricingByCodeOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Product Pricing Info by the Esprinet or Customer product code (asynchronously)
     * 
     * @param esprinetProductCode The esprinet product code (optional)
     * @param customerProductCode The customer product code (optional)
     * @param xConsumerTransactionId Identifies the transaction at the consumer/client side (Optional). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call productsPricingGetAsync(String esprinetProductCode, String customerProductCode, String xConsumerTransactionId, final ApiCallback<ProductPricingByCodeOutput> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = productsPricingGetValidateBeforeCall(esprinetProductCode, customerProductCode, xConsumerTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProductPricingByCodeOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
