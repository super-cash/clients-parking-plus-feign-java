package cash.super_.platform.client.parkingplus.api;

import cash.super_.platform.client.parkingplus.invoker.ApiClient;
import cash.super_.platform.client.parkingplus.invoker.EncodingUtils;

import cash.super_.platform.client.parkingplus.model.PagamentoCartaoDebitoRequest;
import cash.super_.platform.client.parkingplus.model.RetornoCreditarCartao;
import cash.super_.platform.client.parkingplus.model.RetornoErro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-10T21:54:19.607Z")
public interface ServicoPagamentoCartaoDebito2Api extends ApiClient.Api {


  /**
   * Tenta efetuar a recarda de um cardão de débito WPS
   * 
    * @param apiKey sha1(numeroCartao + chaveGaragem + bandeira + enderecoIP + idTransacao + udid + chave*) (required)
    * @param request request (required)
    * @param apiKeyId ID da ApiKey (optional)
   * @return RetornoCreditarCartao
   */
  @RequestLine("POST /2/creditarCartao?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RetornoCreditarCartao creditarCartaoUsingPOST(@Param("apiKey") String apiKey, PagamentoCartaoDebitoRequest request, @Param("apiKeyId") Long apiKeyId);

  /**
   * Tenta efetuar a recarda de um cardão de débito WPS
   * 
   * Note, this is equivalent to the other <code>creditarCartaoUsingPOST</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link CreditarCartaoUsingPOSTQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param request request (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>apiKey - sha1(numeroCartao + chaveGaragem + bandeira + enderecoIP + idTransacao + udid + chave*) (required)</li>
   *   <li>apiKeyId - ID da ApiKey (optional)</li>
   *   </ul>
   * @return RetornoCreditarCartao
   */
  @RequestLine("POST /2/creditarCartao?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RetornoCreditarCartao creditarCartaoUsingPOST(PagamentoCartaoDebitoRequest request, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>creditarCartaoUsingPOST</code> method in a fluent style.
   */
  public static class CreditarCartaoUsingPOSTQueryParams extends HashMap<String, Object> {
    public CreditarCartaoUsingPOSTQueryParams apiKey(final String value) {
      put("apiKey", EncodingUtils.encode(value));
      return this;
    }
    public CreditarCartaoUsingPOSTQueryParams apiKeyId(final Long value) {
      put("apiKeyId", EncodingUtils.encode(value));
      return this;
    }
  }
}
