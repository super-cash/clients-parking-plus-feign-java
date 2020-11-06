package cash.super_.platform.client.parkingplus.api;

import cash.super_.platform.client.parkingplus.invoker.ApiClient;
import cash.super_.platform.client.parkingplus.model.PagamentoCartaoDebitoRequest;
import cash.super_.platform.client.parkingplus.model.RetornoCreditarCartao;
import cash.super_.platform.client.parkingplus.model.RetornoErro;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServicoPagamentoCartaoDebito2Api
 */
public class ServicoPagamentoCartaoDebito2ApiTest {

    private ServicoPagamentoCartaoDebito2Api api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ServicoPagamentoCartaoDebito2Api.class);
    }

    
    /**
     * Tenta efetuar a recarda de um cardão de débito WPS
     *
     * 
     */
    @Test
    public void creditarCartaoUsingPOSTTest() {
        String apiKey = null;
        PagamentoCartaoDebitoRequest request = null;
        Long apiKeyId = null;
        // RetornoCreditarCartao response = api.creditarCartaoUsingPOST(apiKey, request, apiKeyId);

        // TODO: test validations
    }

    /**
     * Tenta efetuar a recarda de um cardão de débito WPS
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void creditarCartaoUsingPOSTTestQueryMap() {
        PagamentoCartaoDebitoRequest request = null;
        ServicoPagamentoCartaoDebito2Api.CreditarCartaoUsingPOSTQueryParams queryParams = new ServicoPagamentoCartaoDebito2Api.CreditarCartaoUsingPOSTQueryParams()
            .apiKey(null)
            .apiKeyId(null);
        // RetornoCreditarCartao response = api.creditarCartaoUsingPOST(request, queryParams);

    // TODO: test validations
    }
    
}
