package cash.super_.platform.client.parkingplus.api;

import cash.super_.platform.client.parkingplus.invoker.ApiClient;
import cash.super_.platform.client.parkingplus.invoker.EncodingUtils;

import cash.super_.platform.client.parkingplus.model.PagamentoAutorizadoRequest;
import cash.super_.platform.client.parkingplus.model.PagamentoEfetuado;
import cash.super_.platform.client.parkingplus.model.PagamentoRequest;
import cash.super_.platform.client.parkingplus.model.Promocao;
import cash.super_.platform.client.parkingplus.model.RetornoConsulta;
import cash.super_.platform.client.parkingplus.model.RetornoErro;
import cash.super_.platform.client.parkingplus.model.RetornoPagamento;
import cash.super_.platform.client.parkingplus.model.TicketRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-06T03:48:42.172Z")
public interface ServicoPagamentoTicket2Api extends ApiClient.Api {


  /**
   * Função para obter a lista de **Promoções Disponíveis** para uma garagem
   * Esta função deverá ser utilizada para obter uma lista de promoções válidas para uma garagem. As promoções podem ser cadastradas no enterprise.
    * @param apiKey sha1(chave*) (required)
    * @param apiKeyId ID da ApiKey (optional)
    * @param idGaragem ID da garagem (optional)
    * @param guidGaragem GUID da garagem (optional)
    * @param tiposPromocao Lista de tipos de promoção aceitos (SIMPLE &#x3D; Qualquer promoção que precise somente do ID para ser utilizada) (optional)
    * @param numeroTicket Número do código de barras do ticket do estacionamento (optional)
    * @param token Token do usuário (optional)
   * @return List&lt;Promocao&gt;
   */
  @RequestLine("GET /2/promocoes?apiKey={apiKey}&apiKeyId={apiKeyId}&idGaragem={idGaragem}&guidGaragem={guidGaragem}&tiposPromocao={tiposPromocao}&numeroTicket={numeroTicket}&token={token}")
  @Headers({
    "Accept: application/json",
  })
  List<Promocao> getPromocoesUsingGET(@Param("apiKey") String apiKey, @Param("apiKeyId") Long apiKeyId, @Param("idGaragem") Long idGaragem, @Param("guidGaragem") String guidGaragem, @Param("tiposPromocao") List<String> tiposPromocao, @Param("numeroTicket") String numeroTicket, @Param("token") String token);

  /**
   * Função para obter a lista de **Promoções Disponíveis** para uma garagem
   * Esta função deverá ser utilizada para obter uma lista de promoções válidas para uma garagem. As promoções podem ser cadastradas no enterprise.
   * Note, this is equivalent to the other <code>getPromocoesUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetPromocoesUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>apiKey - sha1(chave*) (required)</li>
   *   <li>apiKeyId - ID da ApiKey (optional)</li>
   *   <li>idGaragem - ID da garagem (optional)</li>
   *   <li>guidGaragem - GUID da garagem (optional)</li>
   *   <li>tiposPromocao - Lista de tipos de promoção aceitos (SIMPLE &#x3D; Qualquer promoção que precise somente do ID para ser utilizada) (optional)</li>
   *   <li>numeroTicket - Número do código de barras do ticket do estacionamento (optional)</li>
   *   <li>token - Token do usuário (optional)</li>
   *   </ul>
   * @return List&lt;Promocao&gt;
   */
  @RequestLine("GET /2/promocoes?apiKey={apiKey}&apiKeyId={apiKeyId}&idGaragem={idGaragem}&guidGaragem={guidGaragem}&tiposPromocao={tiposPromocao}&numeroTicket={numeroTicket}&token={token}")
  @Headers({
  "Accept: application/json",
  })
  List<Promocao> getPromocoesUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getPromocoesUsingGET</code> method in a fluent style.
   */
  public static class GetPromocoesUsingGETQueryParams extends HashMap<String, Object> {
    public GetPromocoesUsingGETQueryParams apiKey(final String value) {
      put("apiKey", EncodingUtils.encode(value));
      return this;
    }
    public GetPromocoesUsingGETQueryParams apiKeyId(final Long value) {
      put("apiKeyId", EncodingUtils.encode(value));
      return this;
    }
    public GetPromocoesUsingGETQueryParams idGaragem(final Long value) {
      put("idGaragem", EncodingUtils.encode(value));
      return this;
    }
    public GetPromocoesUsingGETQueryParams guidGaragem(final String value) {
      put("guidGaragem", EncodingUtils.encode(value));
      return this;
    }
    public GetPromocoesUsingGETQueryParams tiposPromocao(final List<String> value) {
      put("tiposPromocao", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
    public GetPromocoesUsingGETQueryParams numeroTicket(final String value) {
      put("numeroTicket", EncodingUtils.encode(value));
      return this;
    }
    public GetPromocoesUsingGETQueryParams token(final String value) {
      put("token", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Função para **Consultar Ticket** do Estacionamento
   * Esta função deverá ser utilizada para verificar o status do ticket do estacionamento. Será possível através dos dados de retorno desse serviço, verificar o valor da tarifa a ser paga pelo cliente, e identificar os campos obrigatórios para a solicitação de pagamento.
    * @param numeroTicket Número do código de barras do ticket do estacionamento (required)
    * @param udid Identificador único para o usuário (required)
    * @param apiKey sha1(udid + chave*) (required)
    * @param apiKeyId ID da ApiKey (optional)
    * @param idGaragem ID da Garagem referente ao ticket do estacionamento. Caso não utilizado o sistema tentará buscar o ticket pelo GUID ou em todas as garagens. Retorna erro se mais de um ticket for encontrado. (optional)
    * @param guidGaragem GUID da Garagem referente ao ticket do estacionamento. Caso não utilizado o sistema tentará buscar o ticket pelo ID ou em todas as garagens. Retorna erro se mais de um ticket for encontrado. (optional)
    * @param tiposPromocao Lista de tipos de promoção aceitos (SIMPLE &#x3D; Qualquer promoção que precise somente do ID para ser utilizada) (optional)
   * @return RetornoConsulta
   */
  @RequestLine("GET /2/ticket/{numeroTicket}?udid={udid}&apiKey={apiKey}&apiKeyId={apiKeyId}&idGaragem={idGaragem}&guidGaragem={guidGaragem}&tiposPromocao={tiposPromocao}")
  @Headers({
    "Accept: application/json",
  })
  RetornoConsulta getTicketUsingGET(@Param("numeroTicket") String numeroTicket, @Param("udid") String udid, @Param("apiKey") String apiKey, @Param("apiKeyId") Long apiKeyId, @Param("idGaragem") Long idGaragem, @Param("guidGaragem") String guidGaragem, @Param("tiposPromocao") List<String> tiposPromocao);

  /**
   * Função para **Consultar Ticket** do Estacionamento
   * Esta função deverá ser utilizada para verificar o status do ticket do estacionamento. Será possível através dos dados de retorno desse serviço, verificar o valor da tarifa a ser paga pelo cliente, e identificar os campos obrigatórios para a solicitação de pagamento.
   * Note, this is equivalent to the other <code>getTicketUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTicketUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param numeroTicket Número do código de barras do ticket do estacionamento (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>udid - Identificador único para o usuário (required)</li>
   *   <li>apiKey - sha1(udid + chave*) (required)</li>
   *   <li>apiKeyId - ID da ApiKey (optional)</li>
   *   <li>idGaragem - ID da Garagem referente ao ticket do estacionamento. Caso não utilizado o sistema tentará buscar o ticket pelo GUID ou em todas as garagens. Retorna erro se mais de um ticket for encontrado. (optional)</li>
   *   <li>guidGaragem - GUID da Garagem referente ao ticket do estacionamento. Caso não utilizado o sistema tentará buscar o ticket pelo ID ou em todas as garagens. Retorna erro se mais de um ticket for encontrado. (optional)</li>
   *   <li>tiposPromocao - Lista de tipos de promoção aceitos (SIMPLE &#x3D; Qualquer promoção que precise somente do ID para ser utilizada) (optional)</li>
   *   </ul>
   * @return RetornoConsulta
   */
  @RequestLine("GET /2/ticket/{numeroTicket}?udid={udid}&apiKey={apiKey}&apiKeyId={apiKeyId}&idGaragem={idGaragem}&guidGaragem={guidGaragem}&tiposPromocao={tiposPromocao}")
  @Headers({
  "Accept: application/json",
  })
  RetornoConsulta getTicketUsingGET(@Param("numeroTicket") String numeroTicket, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTicketUsingGET</code> method in a fluent style.
   */
  public static class GetTicketUsingGETQueryParams extends HashMap<String, Object> {
    public GetTicketUsingGETQueryParams udid(final String value) {
      put("udid", EncodingUtils.encode(value));
      return this;
    }
    public GetTicketUsingGETQueryParams apiKey(final String value) {
      put("apiKey", EncodingUtils.encode(value));
      return this;
    }
    public GetTicketUsingGETQueryParams apiKeyId(final Long value) {
      put("apiKeyId", EncodingUtils.encode(value));
      return this;
    }
    public GetTicketUsingGETQueryParams idGaragem(final Long value) {
      put("idGaragem", EncodingUtils.encode(value));
      return this;
    }
    public GetTicketUsingGETQueryParams guidGaragem(final String value) {
      put("guidGaragem", EncodingUtils.encode(value));
      return this;
    }
    public GetTicketUsingGETQueryParams tiposPromocao(final List<String> value) {
      put("tiposPromocao", EncodingUtils.encodeCollection(value, "multi"));
      return this;
    }
  }

  /**
   * Função para **Consultar Ticket** do Estacionamento
   * Esta função deverá ser utilizada para verificar o status do ticket do estacionamento. Será possível através dos dados de retorno desse serviço, verificar o valor da tarifa a ser paga pelo cliente, e identificar os campos obrigatórios para a solicitação de pagamento.
    * @param apiKey sha1(udid + chave*) (required)
    * @param request request (required)
    * @param apiKeyId ID da ApiKey (optional)
   * @return RetornoConsulta
   */
  @RequestLine("POST /2/ticket?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RetornoConsulta getTicketUsingPOST(@Param("apiKey") String apiKey, TicketRequest request, @Param("apiKeyId") Long apiKeyId);

  /**
   * Função para **Consultar Ticket** do Estacionamento
   * Esta função deverá ser utilizada para verificar o status do ticket do estacionamento. Será possível através dos dados de retorno desse serviço, verificar o valor da tarifa a ser paga pelo cliente, e identificar os campos obrigatórios para a solicitação de pagamento.
   * Note, this is equivalent to the other <code>getTicketUsingPOST</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link GetTicketUsingPOSTQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param request request (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>apiKey - sha1(udid + chave*) (required)</li>
   *   <li>apiKeyId - ID da ApiKey (optional)</li>
   *   </ul>
   * @return RetornoConsulta
   */
  @RequestLine("POST /2/ticket?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RetornoConsulta getTicketUsingPOST(TicketRequest request, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>getTicketUsingPOST</code> method in a fluent style.
   */
  public static class GetTicketUsingPOSTQueryParams extends HashMap<String, Object> {
    public GetTicketUsingPOSTQueryParams apiKey(final String value) {
      put("apiKey", EncodingUtils.encode(value));
      return this;
    }
    public GetTicketUsingPOSTQueryParams apiKeyId(final Long value) {
      put("apiKeyId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Função para consultar **Pagamentos Efetuados**
   * Esta função deverá ser utilizada para verificar os pagamentos efetuados por um cliente. Ela retorna os pagamentos em ordem decrescente de data. Os parâmetros [inicio] e [limite] podem ser utilizados para paginação.
    * @param apiKey sha1(udid + chave*) (required)
    * @param udid Identificador único para o usuário (required)
    * @param apiKeyId ID da ApiKey (optional)
    * @param inicio Indice do primeiro objeto a ser retornado (optional, default to 0)
    * @param limite Quantidade maxima de objectos retornados (máximo 50). (optional, default to 30)
   * @return List&lt;PagamentoEfetuado&gt;
   */
  @RequestLine("GET /2/pagamentosEfetuados?apiKey={apiKey}&apiKeyId={apiKeyId}&udid={udid}&inicio={inicio}&limite={limite}")
  @Headers({
    "Accept: application/json",
  })
  List<PagamentoEfetuado> pagamentosEfetuadosUsingGET(@Param("apiKey") String apiKey, @Param("udid") String udid, @Param("apiKeyId") Long apiKeyId, @Param("inicio") Integer inicio, @Param("limite") Integer limite);

  /**
   * Função para consultar **Pagamentos Efetuados**
   * Esta função deverá ser utilizada para verificar os pagamentos efetuados por um cliente. Ela retorna os pagamentos em ordem decrescente de data. Os parâmetros [inicio] e [limite] podem ser utilizados para paginação.
   * Note, this is equivalent to the other <code>pagamentosEfetuadosUsingGET</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PagamentosEfetuadosUsingGETQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>apiKey - sha1(udid + chave*) (required)</li>
   *   <li>apiKeyId - ID da ApiKey (optional)</li>
   *   <li>udid - Identificador único para o usuário (required)</li>
   *   <li>inicio - Indice do primeiro objeto a ser retornado (optional, default to 0)</li>
   *   <li>limite - Quantidade maxima de objectos retornados (máximo 50). (optional, default to 30)</li>
   *   </ul>
   * @return List&lt;PagamentoEfetuado&gt;
   */
  @RequestLine("GET /2/pagamentosEfetuados?apiKey={apiKey}&apiKeyId={apiKeyId}&udid={udid}&inicio={inicio}&limite={limite}")
  @Headers({
  "Accept: application/json",
  })
  List<PagamentoEfetuado> pagamentosEfetuadosUsingGET(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pagamentosEfetuadosUsingGET</code> method in a fluent style.
   */
  public static class PagamentosEfetuadosUsingGETQueryParams extends HashMap<String, Object> {
    public PagamentosEfetuadosUsingGETQueryParams apiKey(final String value) {
      put("apiKey", EncodingUtils.encode(value));
      return this;
    }
    public PagamentosEfetuadosUsingGETQueryParams apiKeyId(final Long value) {
      put("apiKeyId", EncodingUtils.encode(value));
      return this;
    }
    public PagamentosEfetuadosUsingGETQueryParams udid(final String value) {
      put("udid", EncodingUtils.encode(value));
      return this;
    }
    public PagamentosEfetuadosUsingGETQueryParams inicio(final Integer value) {
      put("inicio", EncodingUtils.encode(value));
      return this;
    }
    public PagamentosEfetuadosUsingGETQueryParams limite(final Integer value) {
      put("limite", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Função para efetuar o **Pagamento de Ticket** do Estacionamento sem utilizar um Gateway
   * Esta função deverá ser utilizada para efetuar o pagamento da tarifa do estacionamento quando a autorização do pagamento não é necessária.
    * @param apiKey sha1(numeroTicket + udid + bandeira + idTransacao + chave*) (required)
    * @param request request (required)
    * @param apiKeyId ID da ApiKey (optional)
   * @return RetornoPagamento
   */
  @RequestLine("POST /2/pagamentoAutorizado?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RetornoPagamento pagarTicketAutorizadoUsingPOST(@Param("apiKey") String apiKey, PagamentoAutorizadoRequest request, @Param("apiKeyId") Long apiKeyId);

  /**
   * Função para efetuar o **Pagamento de Ticket** do Estacionamento sem utilizar um Gateway
   * Esta função deverá ser utilizada para efetuar o pagamento da tarifa do estacionamento quando a autorização do pagamento não é necessária.
   * Note, this is equivalent to the other <code>pagarTicketAutorizadoUsingPOST</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PagarTicketAutorizadoUsingPOSTQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param request request (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>apiKey - sha1(numeroTicket + udid + bandeira + idTransacao + chave*) (required)</li>
   *   <li>apiKeyId - ID da ApiKey (optional)</li>
   *   </ul>
   * @return RetornoPagamento
   */
  @RequestLine("POST /2/pagamentoAutorizado?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RetornoPagamento pagarTicketAutorizadoUsingPOST(PagamentoAutorizadoRequest request, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pagarTicketAutorizadoUsingPOST</code> method in a fluent style.
   */
  public static class PagarTicketAutorizadoUsingPOSTQueryParams extends HashMap<String, Object> {
    public PagarTicketAutorizadoUsingPOSTQueryParams apiKey(final String value) {
      put("apiKey", EncodingUtils.encode(value));
      return this;
    }
    public PagarTicketAutorizadoUsingPOSTQueryParams apiKeyId(final Long value) {
      put("apiKeyId", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * Função para efetuar o **Pagamento de Ticket** do Estacionamento
   * Esta função deverá ser utilizada para efetuar o pagamento da tarifa do estacionamento utilizando, como forma de pagamento, o cartão de crédito. Esta função utiliza um Gateway de pagamento cadastrado no Enterprise para tentar efetuar o pagamento. O pagamento pode ser realizado passando o **cartão de crédito** ou **cartão criptografado**.
    * @param apiKey sha1(numeroTicket + udid + enderecoIp + bandeira + portador + idTransacao + chave*) (required)
    * @param request request (required)
    * @param apiKeyId ID da ApiKey (optional)
   * @return RetornoPagamento
   */
  @RequestLine("POST /2/pagamento?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RetornoPagamento pagarTicketUsingPOST(@Param("apiKey") String apiKey, PagamentoRequest request, @Param("apiKeyId") Long apiKeyId);

  /**
   * Função para efetuar o **Pagamento de Ticket** do Estacionamento
   * Esta função deverá ser utilizada para efetuar o pagamento da tarifa do estacionamento utilizando, como forma de pagamento, o cartão de crédito. Esta função utiliza um Gateway de pagamento cadastrado no Enterprise para tentar efetuar o pagamento. O pagamento pode ser realizado passando o **cartão de crédito** ou **cartão criptografado**.
   * Note, this is equivalent to the other <code>pagarTicketUsingPOST</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link PagarTicketUsingPOSTQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param request request (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>apiKey - sha1(numeroTicket + udid + enderecoIp + bandeira + portador + idTransacao + chave*) (required)</li>
   *   <li>apiKeyId - ID da ApiKey (optional)</li>
   *   </ul>
   * @return RetornoPagamento
   */
  @RequestLine("POST /2/pagamento?apiKey={apiKey}&apiKeyId={apiKeyId}")
  @Headers({
  "Content-Type: application/json",
  "Accept: application/json",
  })
  RetornoPagamento pagarTicketUsingPOST(PagamentoRequest request, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>pagarTicketUsingPOST</code> method in a fluent style.
   */
  public static class PagarTicketUsingPOSTQueryParams extends HashMap<String, Object> {
    public PagarTicketUsingPOSTQueryParams apiKey(final String value) {
      put("apiKey", EncodingUtils.encode(value));
      return this;
    }
    public PagarTicketUsingPOSTQueryParams apiKeyId(final Long value) {
      put("apiKeyId", EncodingUtils.encode(value));
      return this;
    }
  }
}
