package cash.super_.platform.client.parkingplus.api;

import cash.super_.platform.client.parkingplus.invoker.ApiClient;
import cash.super_.platform.client.parkingplus.invoker.EncodingUtils;

import cash.super_.platform.client.parkingplus.model.PagamentoCredenciadoRequest;
import cash.super_.platform.client.parkingplus.model.RetornoErro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-10T21:54:19.607Z")
public interface ServicoCargaCreditoCredenciado2Api extends ApiClient.Api {


  /**
   * Tenta efetuar a recarda de um cardão de crédito WPS
   * 
    * @param apiKey sha1(chaveGaragem + bandeira + enderecoIP + idTransacao + udid + chave*) (required)
    * @param request request (required)
    * @param apiKeyId ID da ApiKey (optional)
   * @return PagamentoCredenciadoRequest
   */
  @RequestLine("POST /2/carregarCredenciado?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  PagamentoCredenciadoRequest carregarCredenciadoUsingPOST(@Param("apiKey") String apiKey, PagamentoCredenciadoRequest request, @Param("apiKeyId") Long apiKeyId);

  /**
   * Tenta efetuar a recarda de um cardão de crédito WPS
   * 
   * Note, this is equivalent to the other <code>carregarCredenciadoUsingPOST</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CarregarCredenciadoUsingPOSTQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param request request (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>apiKey - sha1(chaveGaragem + bandeira + enderecoIP + idTransacao + udid + chave*) (required)</li>
   *   <li>apiKeyId - ID da ApiKey (optional)</li>
   *   </ul>
   * @return PagamentoCredenciadoRequest
   */
  @RequestLine("POST /2/carregarCredenciado?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  PagamentoCredenciadoRequest carregarCredenciadoUsingPOST(PagamentoCredenciadoRequest request, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>carregarCredenciadoUsingPOST</code> method in a fluent style.
   */
  public static class CarregarCredenciadoUsingPOSTQueryParams extends HashMap<String, Object> {
    public CarregarCredenciadoUsingPOSTQueryParams apiKey(final String value) {
      put("apiKey", EncodingUtils.encode(value));
      return this;
    }
    public CarregarCredenciadoUsingPOSTQueryParams apiKeyId(final Long value) {
      put("apiKeyId", EncodingUtils.encode(value));
      return this;
    }
  }
}
