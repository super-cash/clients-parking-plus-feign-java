package cash.super_.platform.client.parkingplus.api;

import cash.super_.platform.client.parkingplus.invoker.ApiClient;
import cash.super_.platform.client.parkingplus.model.PagamentoAutorizadoRequest;
import cash.super_.platform.client.parkingplus.model.PagamentoEfetuado;
import cash.super_.platform.client.parkingplus.model.PagamentoRequest;
import cash.super_.platform.client.parkingplus.model.Promocao;
import cash.super_.platform.client.parkingplus.model.RetornoConsulta;
import cash.super_.platform.client.parkingplus.model.RetornoErro;
import cash.super_.platform.client.parkingplus.model.RetornoPagamento;
import cash.super_.platform.client.parkingplus.model.TicketRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServicoPagamentoTicket2Api
 */
public class ServicoPagamentoTicket2ApiTest {

    private ServicoPagamentoTicket2Api api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(ServicoPagamentoTicket2Api.class);
    }

    
    /**
     * Função para obter a lista de **Promoções Disponíveis** para uma garagem
     *
     * Esta função deverá ser utilizada para obter uma lista de promoções válidas para uma garagem. As promoções podem ser cadastradas no enterprise.
     */
    @Test
    public void getPromocoesUsingGETTest() {
        String apiKey = null;
        Long apiKeyId = null;
        Long idGaragem = null;
        String guidGaragem = null;
        List<String> tiposPromocao = null;
        String numeroTicket = null;
        String token = null;
        // List<Promocao> response = api.getPromocoesUsingGET(apiKey, apiKeyId, idGaragem, guidGaragem, tiposPromocao, numeroTicket, token);

        // TODO: test validations
    }

    /**
     * Função para obter a lista de **Promoções Disponíveis** para uma garagem
     *
     * Esta função deverá ser utilizada para obter uma lista de promoções válidas para uma garagem. As promoções podem ser cadastradas no enterprise.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getPromocoesUsingGETTestQueryMap() {
        ServicoPagamentoTicket2Api.GetPromocoesUsingGETQueryParams queryParams = new ServicoPagamentoTicket2Api.GetPromocoesUsingGETQueryParams()
            .apiKey(null)
            .apiKeyId(null)
            .idGaragem(null)
            .guidGaragem(null)
            .tiposPromocao(null)
            .numeroTicket(null)
            .token(null);
        // List<Promocao> response = api.getPromocoesUsingGET(queryParams);

    // TODO: test validations
    }
    
    /**
     * Função para **Consultar Ticket** do Estacionamento
     *
     * Esta função deverá ser utilizada para verificar o status do ticket do estacionamento. Será possível através dos dados de retorno desse serviço, verificar o valor da tarifa a ser paga pelo cliente, e identificar os campos obrigatórios para a solicitação de pagamento.
     */
    @Test
    public void getTicketUsingGETTest() {
        String numeroTicket = null;
        String udid = null;
        String apiKey = null;
        Long apiKeyId = null;
        Long idGaragem = null;
        String guidGaragem = null;
        List<String> tiposPromocao = null;
        // RetornoConsulta response = api.getTicketUsingGET(numeroTicket, udid, apiKey, apiKeyId, idGaragem, guidGaragem, tiposPromocao);

        // TODO: test validations
    }

    /**
     * Função para **Consultar Ticket** do Estacionamento
     *
     * Esta função deverá ser utilizada para verificar o status do ticket do estacionamento. Será possível através dos dados de retorno desse serviço, verificar o valor da tarifa a ser paga pelo cliente, e identificar os campos obrigatórios para a solicitação de pagamento.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getTicketUsingGETTestQueryMap() {
        String numeroTicket = null;
        ServicoPagamentoTicket2Api.GetTicketUsingGETQueryParams queryParams = new ServicoPagamentoTicket2Api.GetTicketUsingGETQueryParams()
            .udid(null)
            .apiKey(null)
            .apiKeyId(null)
            .idGaragem(null)
            .guidGaragem(null)
            .tiposPromocao(null);
        // RetornoConsulta response = api.getTicketUsingGET(numeroTicket, queryParams);

    // TODO: test validations
    }
    
    /**
     * Função para **Consultar Ticket** do Estacionamento
     *
     * Esta função deverá ser utilizada para verificar o status do ticket do estacionamento. Será possível através dos dados de retorno desse serviço, verificar o valor da tarifa a ser paga pelo cliente, e identificar os campos obrigatórios para a solicitação de pagamento.
     */
    @Test
    public void getTicketUsingPOSTTest() {
        String apiKey = null;
        TicketRequest request = null;
        Long apiKeyId = null;
        // RetornoConsulta response = api.getTicketUsingPOST(apiKey, request, apiKeyId);

        // TODO: test validations
    }

    /**
     * Função para **Consultar Ticket** do Estacionamento
     *
     * Esta função deverá ser utilizada para verificar o status do ticket do estacionamento. Será possível através dos dados de retorno desse serviço, verificar o valor da tarifa a ser paga pelo cliente, e identificar os campos obrigatórios para a solicitação de pagamento.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void getTicketUsingPOSTTestQueryMap() {
        TicketRequest request = null;
        ServicoPagamentoTicket2Api.GetTicketUsingPOSTQueryParams queryParams = new ServicoPagamentoTicket2Api.GetTicketUsingPOSTQueryParams()
            .apiKey(null)
            .apiKeyId(null);
        // RetornoConsulta response = api.getTicketUsingPOST(request, queryParams);

    // TODO: test validations
    }
    
    /**
     * Função para consultar **Pagamentos Efetuados**
     *
     * Esta função deverá ser utilizada para verificar os pagamentos efetuados por um cliente. Ela retorna os pagamentos em ordem decrescente de data. Os parâmetros [inicio] e [limite] podem ser utilizados para paginação.
     */
    @Test
    public void pagamentosEfetuadosUsingGETTest() {
        String apiKey = null;
        String udid = null;
        Long apiKeyId = null;
        Integer inicio = null;
        Integer limite = null;
        // List<PagamentoEfetuado> response = api.pagamentosEfetuadosUsingGET(apiKey, udid, apiKeyId, inicio, limite);

        // TODO: test validations
    }

    /**
     * Função para consultar **Pagamentos Efetuados**
     *
     * Esta função deverá ser utilizada para verificar os pagamentos efetuados por um cliente. Ela retorna os pagamentos em ordem decrescente de data. Os parâmetros [inicio] e [limite] podem ser utilizados para paginação.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pagamentosEfetuadosUsingGETTestQueryMap() {
        ServicoPagamentoTicket2Api.PagamentosEfetuadosUsingGETQueryParams queryParams = new ServicoPagamentoTicket2Api.PagamentosEfetuadosUsingGETQueryParams()
            .apiKey(null)
            .apiKeyId(null)
            .udid(null)
            .inicio(null)
            .limite(null);
        // List<PagamentoEfetuado> response = api.pagamentosEfetuadosUsingGET(queryParams);

    // TODO: test validations
    }
    
    /**
     * Função para efetuar o **Pagamento de Ticket** do Estacionamento sem utilizar um Gateway
     *
     * Esta função deverá ser utilizada para efetuar o pagamento da tarifa do estacionamento quando a autorização do pagamento não é necessária.
     */
    @Test
    public void pagarTicketAutorizadoUsingPOSTTest() {
        String apiKey = null;
        PagamentoAutorizadoRequest request = null;
        Long apiKeyId = null;
        // RetornoPagamento response = api.pagarTicketAutorizadoUsingPOST(apiKey, request, apiKeyId);

        // TODO: test validations
    }

    /**
     * Função para efetuar o **Pagamento de Ticket** do Estacionamento sem utilizar um Gateway
     *
     * Esta função deverá ser utilizada para efetuar o pagamento da tarifa do estacionamento quando a autorização do pagamento não é necessária.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pagarTicketAutorizadoUsingPOSTTestQueryMap() {
        PagamentoAutorizadoRequest request = null;
        ServicoPagamentoTicket2Api.PagarTicketAutorizadoUsingPOSTQueryParams queryParams = new ServicoPagamentoTicket2Api.PagarTicketAutorizadoUsingPOSTQueryParams()
            .apiKey(null)
            .apiKeyId(null);
        // RetornoPagamento response = api.pagarTicketAutorizadoUsingPOST(request, queryParams);

    // TODO: test validations
    }
    
    /**
     * Função para efetuar o **Pagamento de Ticket** do Estacionamento
     *
     * Esta função deverá ser utilizada para efetuar o pagamento da tarifa do estacionamento utilizando, como forma de pagamento, o cartão de crédito. Esta função utiliza um Gateway de pagamento cadastrado no Enterprise para tentar efetuar o pagamento. O pagamento pode ser realizado passando o **cartão de crédito** ou **cartão criptografado**.
     */
    @Test
    public void pagarTicketUsingPOSTTest() {
        String apiKey = null;
        PagamentoRequest request = null;
        Long apiKeyId = null;
        // RetornoPagamento response = api.pagarTicketUsingPOST(apiKey, request, apiKeyId);

        // TODO: test validations
    }

    /**
     * Função para efetuar o **Pagamento de Ticket** do Estacionamento
     *
     * Esta função deverá ser utilizada para efetuar o pagamento da tarifa do estacionamento utilizando, como forma de pagamento, o cartão de crédito. Esta função utiliza um Gateway de pagamento cadastrado no Enterprise para tentar efetuar o pagamento. O pagamento pode ser realizado passando o **cartão de crédito** ou **cartão criptografado**.
     *
     * This tests the overload of the method that uses a Map for query parameters instead of
     * listing them out individually.
     */
    @Test
    public void pagarTicketUsingPOSTTestQueryMap() {
        PagamentoRequest request = null;
        ServicoPagamentoTicket2Api.PagarTicketUsingPOSTQueryParams queryParams = new ServicoPagamentoTicket2Api.PagarTicketUsingPOSTQueryParams()
            .apiKey(null)
            .apiKeyId(null);
        // RetornoPagamento response = api.pagarTicketUsingPOST(request, queryParams);

    // TODO: test validations
    }
    
}
