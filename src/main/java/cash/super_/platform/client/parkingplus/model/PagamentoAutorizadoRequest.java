/*
 * API de pagamento mobile WPS Brasil
 * <#noparse> ### Objetivo  Este documento tem por objetivo definir a interface de integração entre o sistema Parking Plus Enterprise e Aplicativos para Smartphones. A integração possibilitará o pagamento da estadia dos clientes do estacionamento através desse aplicativo.  ### Integração A integração entre as aplicações será realizada por meio de webservice disponibilizados em ambiente de internet. Esse webservice possibilitará a consulta do valor da estadia dos tickets e o pagamento do ticket do estacionamento utilizando como meio de pagamento o cartão de crédito.  O sistema Parking Plus Enterprise encaminha os dados do cliente para os sistemas Gateway de Pagamento de forma que estes possam solicitar a autorização da cobrança em cartão de crédito, da estadia do estacionamento.  ### Especificação dos Serviços (Webservices) O protocolo de comunicação utilizado para a integração entre o sistema Parking Plus Enterprise e o Aplicativo será o HTTPS. O webservice utilizará a tecnologia REST para o acesso aos serviços, e JSON para o POST e o retorno das informações solicitadas para o webservice. Dessa forma, o aplicativo desenvolvido deverá atender aos requisitos necessários para acessar esses serviços.    ## Mapa de Erros |errorCode |descrição |mensagem padrão | | --- | --- | --- | | 0 | Nenhum erro. |   | | 999 |Utilizado quando alguma exceção não especifica é lançada.| Erro no processamento da solicitação. | |1 | O ticket não foi encontrado no banco do Enterprise. | Ticket não encontrado. | | 2 | Garagem offline no enterprise. | Serviço indisponível no momento. | | 3 | O número do ticket possui CRC inválido. | O número do ticket digitado não é um número de ticket válido. | | 4 |O ticket não foi encontrado no pátio. Ocorre se o ticket já saiu do pátio. Pode ocorrer se um ticket correto(ainda no pátio) não foi sincronizado e um ticket de outra garagem é encontrado mas o mesmo já saiu. | Ticket inválido ou já processado. | | 5* | A garagem não possui uma Loja Virtual Cadastrada. | A Garagem não possui uma Loja Virtual Cadastrada. | | 6 | A garagem não se encontra na whitelist de garagens permitidas da API. | Não é permitida a validação de tickets desta garagem. | | 7 | O ticket já recebeu uma validação hoje. | Você já ganhou seu estacionamento gratuito hoje. | | 8 | O valor do pagamento é inválido. Valor a pagar é maior que o sendo pago. | Valor Inválido. | | 9 | Transação já realizada. idTransacao já existe no banco. | Transação já realizada. | | 10* | A apikey enviada é inválida. | Aplicativo não autorizado! | | 11** | ~~O cartão possui CRC inválido.~~ | ~~O número do Cartão Pré-Pago é inválido.~~ | | 12** | ~~O cartão não foi encontrado no banco.~~ | ~~Cartão Pré-Pago não encontrado.~~ | | 13 | Erro ao descriptografar o cartão de crédito. | Cartão com problema, tente recadastrar. | | 14 | Erro ao tentar se conectar com o gateway de pagamento. | Erro de conexão com o Gateway! | | 15 | Existe alguma restrição para o cartão. | Serviço não autorizado para este cartão! | | 16 | Erro de transação com o gateway. | Sua transação não foi concluída. Aguarde alguns instantes e tente novamente. | | 17 | Emissora do cartão indisponível para o gateway. | Emissor indisponível! Aguarde alguns instantes e tente novamente ou entre em contato com a emissora de seu cartão. | | 18* | Existe algum erro na configuração do gateway. | Pagamento indisponível no momento. | | 19 | Informações do cartão inválidas. | Cartão inválido! Entre em contato com a emissora do seu cartão para mais detalhes. | | 20 | A transação foi negada pelo emissor do cartão. | Transação negada pelo emissor! Entre em contato com a emissora do seu cartão para mais detalhes. | | 21 | Pagamento desabilitado. | O pagamento está momentaneamente desabilitado. | | 22 | Erro ao tentar criptografar o cartão de crédito. | Erro ao criptografar cartão! | | 23 | Erro ao tentar encontrar o cliente no banco de dados. Pode ocorrer se o UDID do cliente for alterado mas o cartão criptografado antigo for utilizado. | Cliente alterado! recadastre o cartão. | | 24 | Erro ao descriptografar um cartão de crédito. | Cartão de crédito com problema, tente recadastrar. | | 25** | ~~O Método chamado foi descontinuado.~~ | ~~Este método foi descontinuado.~~ | | 26 | Id/Chave de garagem não encontrada no sistema | Falha ao encontrar garagem! |    \\* Deve ser corrigido durante a homologação  ** Apenas retornados por métodos internos ou ainda não documentados  </#noparse>
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cash.super_.platform.client.parkingplus.model;

import java.util.Objects;
import java.util.Arrays;
import cash.super_.platform.client.parkingplus.model.DadosCnpj;
import cash.super_.platform.client.parkingplus.model.DadosCpf;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PagamentoAutorizadoRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-10T21:57:48.744Z")



public class PagamentoAutorizadoRequest {
  @JsonProperty("bandeira")
  private String bandeira = null;

  @JsonProperty("cpfCnpj")
  private Long cpfCnpj = null;

  @JsonProperty("dadosCnpj")
  private DadosCnpj dadosCnpj = null;

  @JsonProperty("dadosCpf")
  private DadosCpf dadosCpf = null;

  @JsonProperty("faturado")
  private Boolean faturado = null;

  @JsonProperty("guidGaragem")
  private String guidGaragem = null;

  @JsonProperty("idGaragem")
  private Long idGaragem = null;

  @JsonProperty("idPromocao")
  private Long idPromocao = null;

  @JsonProperty("idTransacao")
  private String idTransacao = null;

  @JsonProperty("notas")
  private List<String> notas = null;

  @JsonProperty("numeroTicket")
  private String numeroTicket = null;

  @JsonProperty("permitirValorExcedente")
  private Boolean permitirValorExcedente = null;

  @JsonProperty("permitirValorParcial")
  private Boolean permitirValorParcial = null;

  @JsonProperty("tokenAutenticacao")
  private String tokenAutenticacao = null;

  @JsonProperty("udid")
  private String udid = null;

  @JsonProperty("valor")
  private Integer valor = null;

  public PagamentoAutorizadoRequest bandeira(String bandeira) {
    this.bandeira = bandeira;
    return this;
  }

   /**
   * Bandeira do cartão de crédito
   * @return bandeira
  **/
  @ApiModelProperty(required = true, value = "Bandeira do cartão de crédito")
  public String getBandeira() {
    return bandeira;
  }

  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
  }

  public PagamentoAutorizadoRequest cpfCnpj(Long cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

   /**
   * Número do documento do cliente para geração do RPS
   * @return cpfCnpj
  **/
  @ApiModelProperty(value = "Número do documento do cliente para geração do RPS")
  public Long getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(Long cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  public PagamentoAutorizadoRequest dadosCnpj(DadosCnpj dadosCnpj) {
    this.dadosCnpj = dadosCnpj;
    return this;
  }

   /**
   * Dados de pessoa jurídica.
   * @return dadosCnpj
  **/
  @ApiModelProperty(value = "Dados de pessoa jurídica.")
  public DadosCnpj getDadosCnpj() {
    return dadosCnpj;
  }

  public void setDadosCnpj(DadosCnpj dadosCnpj) {
    this.dadosCnpj = dadosCnpj;
  }

  public PagamentoAutorizadoRequest dadosCpf(DadosCpf dadosCpf) {
    this.dadosCpf = dadosCpf;
    return this;
  }

   /**
   * Dados de pessoa física.
   * @return dadosCpf
  **/
  @ApiModelProperty(value = "Dados de pessoa física.")
  public DadosCpf getDadosCpf() {
    return dadosCpf;
  }

  public void setDadosCpf(DadosCpf dadosCpf) {
    this.dadosCpf = dadosCpf;
  }

  public PagamentoAutorizadoRequest faturado(Boolean faturado) {
    this.faturado = faturado;
    return this;
  }

   /**
   * Valor faturado.
   * @return faturado
  **/
  @ApiModelProperty(example = "false", value = "Valor faturado.")
  public Boolean isFaturado() {
    return faturado;
  }

  public void setFaturado(Boolean faturado) {
    this.faturado = faturado;
  }

  public PagamentoAutorizadoRequest guidGaragem(String guidGaragem) {
    this.guidGaragem = guidGaragem;
    return this;
  }

   /**
   * GUID da Garagem referente ao ticket do estacionamento. Caso não utilizado o sistema tentará buscar o ticket pelo ID ou em todas as garagens. Retorna erro se mais de um ticket for encontrado
   * @return guidGaragem
  **/
  @ApiModelProperty(value = "GUID da Garagem referente ao ticket do estacionamento. Caso não utilizado o sistema tentará buscar o ticket pelo ID ou em todas as garagens. Retorna erro se mais de um ticket for encontrado")
  public String getGuidGaragem() {
    return guidGaragem;
  }

  public void setGuidGaragem(String guidGaragem) {
    this.guidGaragem = guidGaragem;
  }

  public PagamentoAutorizadoRequest idGaragem(Long idGaragem) {
    this.idGaragem = idGaragem;
    return this;
  }

   /**
   * ID da Garagem referente ao ticket do estacionamento. Caso não utilizado o sistema tentará buscar o ticket pelo GUID ou em todas as garagens. Retorna erro se mais de um ticket for encontrado
   * @return idGaragem
  **/
  @ApiModelProperty(value = "ID da Garagem referente ao ticket do estacionamento. Caso não utilizado o sistema tentará buscar o ticket pelo GUID ou em todas as garagens. Retorna erro se mais de um ticket for encontrado")
  public Long getIdGaragem() {
    return idGaragem;
  }

  public void setIdGaragem(Long idGaragem) {
    this.idGaragem = idGaragem;
  }

  public PagamentoAutorizadoRequest idPromocao(Long idPromocao) {
    this.idPromocao = idPromocao;
    return this;
  }

   /**
   * Get idPromocao
   * @return idPromocao
  **/
  @ApiModelProperty(value = "")
  public Long getIdPromocao() {
    return idPromocao;
  }

  public void setIdPromocao(Long idPromocao) {
    this.idPromocao = idPromocao;
  }

  public PagamentoAutorizadoRequest idTransacao(String idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }

   /**
   * Identificação única para a transação
   * @return idTransacao
  **/
  @ApiModelProperty(required = true, value = "Identificação única para a transação")
  public String getIdTransacao() {
    return idTransacao;
  }

  public void setIdTransacao(String idTransacao) {
    this.idTransacao = idTransacao;
  }

  public PagamentoAutorizadoRequest notas(List<String> notas) {
    this.notas = notas;
    return this;
  }

  public PagamentoAutorizadoRequest addNotasItem(String notasItem) {
    if (this.notas == null) {
      this.notas = new ArrayList<String>();
    }
    this.notas.add(notasItem);
    return this;
  }

   /**
   * Get notas
   * @return notas
  **/
  @ApiModelProperty(value = "")
  public List<String> getNotas() {
    return notas;
  }

  public void setNotas(List<String> notas) {
    this.notas = notas;
  }

  public PagamentoAutorizadoRequest numeroTicket(String numeroTicket) {
    this.numeroTicket = numeroTicket;
    return this;
  }

   /**
   * Número do código de barras do ticket do estacionamento
   * @return numeroTicket
  **/
  @ApiModelProperty(required = true, value = "Número do código de barras do ticket do estacionamento")
  public String getNumeroTicket() {
    return numeroTicket;
  }

  public void setNumeroTicket(String numeroTicket) {
    this.numeroTicket = numeroTicket;
  }

  public PagamentoAutorizadoRequest permitirValorExcedente(Boolean permitirValorExcedente) {
    this.permitirValorExcedente = permitirValorExcedente;
    return this;
  }

   /**
   * Permitir pagamento com valor excedente.
   * @return permitirValorExcedente
  **/
  @ApiModelProperty(example = "false", value = "Permitir pagamento com valor excedente.")
  public Boolean isPermitirValorExcedente() {
    return permitirValorExcedente;
  }

  public void setPermitirValorExcedente(Boolean permitirValorExcedente) {
    this.permitirValorExcedente = permitirValorExcedente;
  }

  public PagamentoAutorizadoRequest permitirValorParcial(Boolean permitirValorParcial) {
    this.permitirValorParcial = permitirValorParcial;
    return this;
  }

   /**
   * Permitir pagamento com valor parcial.
   * @return permitirValorParcial
  **/
  @ApiModelProperty(example = "false", value = "Permitir pagamento com valor parcial.")
  public Boolean isPermitirValorParcial() {
    return permitirValorParcial;
  }

  public void setPermitirValorParcial(Boolean permitirValorParcial) {
    this.permitirValorParcial = permitirValorParcial;
  }

  public PagamentoAutorizadoRequest tokenAutenticacao(String tokenAutenticacao) {
    this.tokenAutenticacao = tokenAutenticacao;
    return this;
  }

   /**
   * O token de autenticação para a promoção.
   * @return tokenAutenticacao
  **/
  @ApiModelProperty(value = "O token de autenticação para a promoção.")
  public String getTokenAutenticacao() {
    return tokenAutenticacao;
  }

  public void setTokenAutenticacao(String tokenAutenticacao) {
    this.tokenAutenticacao = tokenAutenticacao;
  }

  public PagamentoAutorizadoRequest udid(String udid) {
    this.udid = udid;
    return this;
  }

   /**
   * Identificador único para o dispositivo
   * @return udid
  **/
  @ApiModelProperty(required = true, value = "Identificador único para o dispositivo")
  public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public PagamentoAutorizadoRequest valor(Integer valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor do pagamento em centavos. Exemplo: para um pagamento de R$1,50 enviar 150
   * @return valor
  **/
  @ApiModelProperty(required = true, value = "Valor do pagamento em centavos. Exemplo: para um pagamento de R$1,50 enviar 150")
  public Integer getValor() {
    return valor;
  }

  public void setValor(Integer valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagamentoAutorizadoRequest pagamentoAutorizadoRequest = (PagamentoAutorizadoRequest) o;
    return Objects.equals(this.bandeira, pagamentoAutorizadoRequest.bandeira) &&
        Objects.equals(this.cpfCnpj, pagamentoAutorizadoRequest.cpfCnpj) &&
        Objects.equals(this.dadosCnpj, pagamentoAutorizadoRequest.dadosCnpj) &&
        Objects.equals(this.dadosCpf, pagamentoAutorizadoRequest.dadosCpf) &&
        Objects.equals(this.faturado, pagamentoAutorizadoRequest.faturado) &&
        Objects.equals(this.guidGaragem, pagamentoAutorizadoRequest.guidGaragem) &&
        Objects.equals(this.idGaragem, pagamentoAutorizadoRequest.idGaragem) &&
        Objects.equals(this.idPromocao, pagamentoAutorizadoRequest.idPromocao) &&
        Objects.equals(this.idTransacao, pagamentoAutorizadoRequest.idTransacao) &&
        Objects.equals(this.notas, pagamentoAutorizadoRequest.notas) &&
        Objects.equals(this.numeroTicket, pagamentoAutorizadoRequest.numeroTicket) &&
        Objects.equals(this.permitirValorExcedente, pagamentoAutorizadoRequest.permitirValorExcedente) &&
        Objects.equals(this.permitirValorParcial, pagamentoAutorizadoRequest.permitirValorParcial) &&
        Objects.equals(this.tokenAutenticacao, pagamentoAutorizadoRequest.tokenAutenticacao) &&
        Objects.equals(this.udid, pagamentoAutorizadoRequest.udid) &&
        Objects.equals(this.valor, pagamentoAutorizadoRequest.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandeira, cpfCnpj, dadosCnpj, dadosCpf, faturado, guidGaragem, idGaragem, idPromocao, idTransacao, notas, numeroTicket, permitirValorExcedente, permitirValorParcial, tokenAutenticacao, udid, valor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoAutorizadoRequest {\n");
    
    sb.append("    bandeira: ").append(toIndentedString(bandeira)).append("\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    dadosCnpj: ").append(toIndentedString(dadosCnpj)).append("\n");
    sb.append("    dadosCpf: ").append(toIndentedString(dadosCpf)).append("\n");
    sb.append("    faturado: ").append(toIndentedString(faturado)).append("\n");
    sb.append("    guidGaragem: ").append(toIndentedString(guidGaragem)).append("\n");
    sb.append("    idGaragem: ").append(toIndentedString(idGaragem)).append("\n");
    sb.append("    idPromocao: ").append(toIndentedString(idPromocao)).append("\n");
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    notas: ").append(toIndentedString(notas)).append("\n");
    sb.append("    numeroTicket: ").append(toIndentedString(numeroTicket)).append("\n");
    sb.append("    permitirValorExcedente: ").append(toIndentedString(permitirValorExcedente)).append("\n");
    sb.append("    permitirValorParcial: ").append(toIndentedString(permitirValorParcial)).append("\n");
    sb.append("    tokenAutenticacao: ").append(toIndentedString(tokenAutenticacao)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

