package cash.super_.platform.client.parkingplus.api;

import cash.super_.platform.client.parkingplus.invoker.ApiClient;
import cash.super_.platform.client.parkingplus.model.PagamentoCredenciadoRequest;
import cash.super_.platform.client.parkingplus.model.RetornoErro;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServicoCargaCreditoCredenciado2Api
 */
public class ServicoCargaCreditoCredenciado2ApiTest {

    private ServicoCargaCreditoCredenciado2Api api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ServicoCargaCreditoCredenciado2Api.class);
    }

    
    /**
     * Tenta efetuar a recarda de um cardão de crédito WPS
     *
     * 
     */
    @Test
    public void carregarCredenciadoUsingPOSTTest() {
        String apiKey = null;
        PagamentoCredenciadoRequest request = null;
        Long apiKeyId = null;
        // PagamentoCredenciadoRequest response = api.carregarCredenciadoUsingPOST(apiKey, request, apiKeyId);

        // TODO: test validations
    }

    /**
     * Tenta efetuar a recarda de um cardão de crédito WPS
     *
     * 
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void carregarCredenciadoUsingPOSTTestQueryMap() {
        PagamentoCredenciadoRequest request = null;
        ServicoCargaCreditoCredenciado2Api.CarregarCredenciadoUsingPOSTQueryParams queryParams = new ServicoCargaCreditoCredenciado2Api.CarregarCredenciadoUsingPOSTQueryParams()
            .apiKey(null)
            .apiKeyId(null);
        // PagamentoCredenciadoRequest response = api.carregarCredenciadoUsingPOST(request, queryParams);

    // TODO: test validations
    }
    
}
