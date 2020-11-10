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

/**
 * PagamentoCartaoDebitoRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-10T21:57:48.744Z")



public class PagamentoCartaoDebitoRequest {
  @JsonProperty("bandeira")
  private String bandeira = null;

  @JsonProperty("cartaoCriptografado")
  private String cartaoCriptografado = null;

  @JsonProperty("cartaoDeCredito")
  private Long cartaoDeCredito = null;

  @JsonProperty("chaveGaragem")
  private String chaveGaragem = null;

  @JsonProperty("codigoDeSeguranca")
  private String codigoDeSeguranca = null;

  @JsonProperty("cpfCnpj")
  private Long cpfCnpj = null;

  @JsonProperty("dadosCnpj")
  private DadosCnpj dadosCnpj = null;

  @JsonProperty("dadosCpf")
  private DadosCpf dadosCpf = null;

  @JsonProperty("enderecoIp")
  private String enderecoIp = null;

  @JsonProperty("idTransacao")
  private String idTransacao = null;

  @JsonProperty("numeroCartao")
  private String numeroCartao = null;

  @JsonProperty("portador")
  private String portador = null;

  @JsonProperty("udid")
  private String udid = null;

  @JsonProperty("validade")
  private String validade = null;

  @JsonProperty("valor")
  private Integer valor = null;

  public PagamentoCartaoDebitoRequest bandeira(String bandeira) {
    this.bandeira = bandeira;
    return this;
  }

   /**
   * Bandeira do cartão de crédito utilizado no pagamento do ticket.
   * @return bandeira
  **/
  @ApiModelProperty(required = true, value = "Bandeira do cartão de crédito utilizado no pagamento do ticket.")
  public String getBandeira() {
    return bandeira;
  }

  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
  }

  public PagamentoCartaoDebitoRequest cartaoCriptografado(String cartaoCriptografado) {
    this.cartaoCriptografado = cartaoCriptografado;
    return this;
  }

   /**
   * O Cartão criptografado.
   * @return cartaoCriptografado
  **/
  @ApiModelProperty(value = "O Cartão criptografado.")
  public String getCartaoCriptografado() {
    return cartaoCriptografado;
  }

  public void setCartaoCriptografado(String cartaoCriptografado) {
    this.cartaoCriptografado = cartaoCriptografado;
  }

  public PagamentoCartaoDebitoRequest cartaoDeCredito(Long cartaoDeCredito) {
    this.cartaoDeCredito = cartaoDeCredito;
    return this;
  }

   /**
   * Número do cartão de crédito a ser utilizado para pagamento.
   * @return cartaoDeCredito
  **/
  @ApiModelProperty(required = true, value = "Número do cartão de crédito a ser utilizado para pagamento.")
  public Long getCartaoDeCredito() {
    return cartaoDeCredito;
  }

  public void setCartaoDeCredito(Long cartaoDeCredito) {
    this.cartaoDeCredito = cartaoDeCredito;
  }

  public PagamentoCartaoDebitoRequest chaveGaragem(String chaveGaragem) {
    this.chaveGaragem = chaveGaragem;
    return this;
  }

   /**
   * A chave da garagem. Pode ser obtida pelo método consultarGaragens.
   * @return chaveGaragem
  **/
  @ApiModelProperty(required = true, value = "A chave da garagem. Pode ser obtida pelo método consultarGaragens.")
  public String getChaveGaragem() {
    return chaveGaragem;
  }

  public void setChaveGaragem(String chaveGaragem) {
    this.chaveGaragem = chaveGaragem;
  }

  public PagamentoCartaoDebitoRequest codigoDeSeguranca(String codigoDeSeguranca) {
    this.codigoDeSeguranca = codigoDeSeguranca;
    return this;
  }

   /**
   * Código de segurança do carão de crédito.
   * @return codigoDeSeguranca
  **/
  @ApiModelProperty(required = true, value = "Código de segurança do carão de crédito.")
  public String getCodigoDeSeguranca() {
    return codigoDeSeguranca;
  }

  public void setCodigoDeSeguranca(String codigoDeSeguranca) {
    this.codigoDeSeguranca = codigoDeSeguranca;
  }

  public PagamentoCartaoDebitoRequest cpfCnpj(Long cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
    return this;
  }

   /**
   * Número do documento do cliente para geração do RPS.
   * @return cpfCnpj
  **/
  @ApiModelProperty(required = true, value = "Número do documento do cliente para geração do RPS.")
  public Long getCpfCnpj() {
    return cpfCnpj;
  }

  public void setCpfCnpj(Long cpfCnpj) {
    this.cpfCnpj = cpfCnpj;
  }

  public PagamentoCartaoDebitoRequest dadosCnpj(DadosCnpj dadosCnpj) {
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

  public PagamentoCartaoDebitoRequest dadosCpf(DadosCpf dadosCpf) {
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

  public PagamentoCartaoDebitoRequest enderecoIp(String enderecoIp) {
    this.enderecoIp = enderecoIp;
    return this;
  }

   /**
   * Endereço IP do dispositivo conectado ao serviço.
   * @return enderecoIp
  **/
  @ApiModelProperty(required = true, value = "Endereço IP do dispositivo conectado ao serviço.")
  public String getEnderecoIp() {
    return enderecoIp;
  }

  public void setEnderecoIp(String enderecoIp) {
    this.enderecoIp = enderecoIp;
  }

  public PagamentoCartaoDebitoRequest idTransacao(String idTransacao) {
    this.idTransacao = idTransacao;
    return this;
  }

   /**
   * Um id único para a transação.
   * @return idTransacao
  **/
  @ApiModelProperty(required = true, value = "Um id único para a transação.")
  public String getIdTransacao() {
    return idTransacao;
  }

  public void setIdTransacao(String idTransacao) {
    this.idTransacao = idTransacao;
  }

  public PagamentoCartaoDebitoRequest numeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
    return this;
  }

   /**
   * O número do cartão de débito WPS.
   * @return numeroCartao
  **/
  @ApiModelProperty(required = true, value = "O número do cartão de débito WPS.")
  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public PagamentoCartaoDebitoRequest portador(String portador) {
    this.portador = portador;
    return this;
  }

   /**
   * Nome do portador do cartão de crédito.
   * @return portador
  **/
  @ApiModelProperty(required = true, value = "Nome do portador do cartão de crédito.")
  public String getPortador() {
    return portador;
  }

  public void setPortador(String portador) {
    this.portador = portador;
  }

  public PagamentoCartaoDebitoRequest udid(String udid) {
    this.udid = udid;
    return this;
  }

   /**
   * Identificador único do dispositivo que acessa o serviço.
   * @return udid
  **/
  @ApiModelProperty(required = true, value = "Identificador único do dispositivo que acessa o serviço.")
  public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  public PagamentoCartaoDebitoRequest validade(String validade) {
    this.validade = validade;
    return this;
  }

   /**
   * Validade do cartão de crédito no formato MMYYYY.
   * @return validade
  **/
  @ApiModelProperty(required = true, value = "Validade do cartão de crédito no formato MMYYYY.")
  public String getValidade() {
    return validade;
  }

  public void setValidade(String validade) {
    this.validade = validade;
  }

  public PagamentoCartaoDebitoRequest valor(Integer valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Número inteiro representando o valor a pagar em centavos. (R$1,50 &#x3D; 150)
   * @return valor
  **/
  @ApiModelProperty(required = true, value = "Número inteiro representando o valor a pagar em centavos. (R$1,50 = 150)")
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
    PagamentoCartaoDebitoRequest pagamentoCartaoDebitoRequest = (PagamentoCartaoDebitoRequest) o;
    return Objects.equals(this.bandeira, pagamentoCartaoDebitoRequest.bandeira) &&
        Objects.equals(this.cartaoCriptografado, pagamentoCartaoDebitoRequest.cartaoCriptografado) &&
        Objects.equals(this.cartaoDeCredito, pagamentoCartaoDebitoRequest.cartaoDeCredito) &&
        Objects.equals(this.chaveGaragem, pagamentoCartaoDebitoRequest.chaveGaragem) &&
        Objects.equals(this.codigoDeSeguranca, pagamentoCartaoDebitoRequest.codigoDeSeguranca) &&
        Objects.equals(this.cpfCnpj, pagamentoCartaoDebitoRequest.cpfCnpj) &&
        Objects.equals(this.dadosCnpj, pagamentoCartaoDebitoRequest.dadosCnpj) &&
        Objects.equals(this.dadosCpf, pagamentoCartaoDebitoRequest.dadosCpf) &&
        Objects.equals(this.enderecoIp, pagamentoCartaoDebitoRequest.enderecoIp) &&
        Objects.equals(this.idTransacao, pagamentoCartaoDebitoRequest.idTransacao) &&
        Objects.equals(this.numeroCartao, pagamentoCartaoDebitoRequest.numeroCartao) &&
        Objects.equals(this.portador, pagamentoCartaoDebitoRequest.portador) &&
        Objects.equals(this.udid, pagamentoCartaoDebitoRequest.udid) &&
        Objects.equals(this.validade, pagamentoCartaoDebitoRequest.validade) &&
        Objects.equals(this.valor, pagamentoCartaoDebitoRequest.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandeira, cartaoCriptografado, cartaoDeCredito, chaveGaragem, codigoDeSeguranca, cpfCnpj, dadosCnpj, dadosCpf, enderecoIp, idTransacao, numeroCartao, portador, udid, validade, valor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentoCartaoDebitoRequest {\n");
    
    sb.append("    bandeira: ").append(toIndentedString(bandeira)).append("\n");
    sb.append("    cartaoCriptografado: ").append(toIndentedString(cartaoCriptografado)).append("\n");
    sb.append("    cartaoDeCredito: ").append(toIndentedString(cartaoDeCredito)).append("\n");
    sb.append("    chaveGaragem: ").append(toIndentedString(chaveGaragem)).append("\n");
    sb.append("    codigoDeSeguranca: ").append(toIndentedString(codigoDeSeguranca)).append("\n");
    sb.append("    cpfCnpj: ").append(toIndentedString(cpfCnpj)).append("\n");
    sb.append("    dadosCnpj: ").append(toIndentedString(dadosCnpj)).append("\n");
    sb.append("    dadosCpf: ").append(toIndentedString(dadosCpf)).append("\n");
    sb.append("    enderecoIp: ").append(toIndentedString(enderecoIp)).append("\n");
    sb.append("    idTransacao: ").append(toIndentedString(idTransacao)).append("\n");
    sb.append("    numeroCartao: ").append(toIndentedString(numeroCartao)).append("\n");
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
    sb.append("    validade: ").append(toIndentedString(validade)).append("\n");
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

