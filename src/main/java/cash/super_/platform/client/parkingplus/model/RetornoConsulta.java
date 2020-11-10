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
import cash.super_.platform.client.parkingplus.model.NotaInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RetornoConsulta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-10T21:57:48.744Z")



public class RetornoConsulta {
  @JsonProperty("cnpjGaragem")
  private String cnpjGaragem = null;

  @JsonProperty("dataConsulta")
  private Long dataConsulta = null;

  @JsonProperty("dataDeEntrada")
  private Long dataDeEntrada = null;

  @JsonProperty("dataPermitidaSaida")
  private Long dataPermitidaSaida = null;

  @JsonProperty("dataPermitidaSaidaUltimoPagamento")
  private Long dataPermitidaSaidaUltimoPagamento = null;

  @JsonProperty("errorCode")
  private Integer errorCode = null;

  @JsonProperty("garagem")
  private String garagem = null;

  @JsonProperty("idGaragem")
  private Long idGaragem = null;

  @JsonProperty("idPromocao")
  private Long idPromocao = null;

  @JsonProperty("imagemLink")
  private String imagemLink = null;

  @JsonProperty("mensagem")
  private String mensagem = null;

  @JsonProperty("notas")
  private List<NotaInfo> notas = new ArrayList<NotaInfo>();

  @JsonProperty("numeroTicket")
  private String numeroTicket = null;

  @JsonProperty("promocaoAtingida")
  private Boolean promocaoAtingida = null;

  @JsonProperty("promocoesDisponiveis")
  private Boolean promocoesDisponiveis = null;

  @JsonProperty("setor")
  private String setor = null;

  @JsonProperty("tarifa")
  private Integer tarifa = null;

  @JsonProperty("tarifaPaga")
  private Integer tarifaPaga = null;

  @JsonProperty("tarifaSemDesconto")
  private Integer tarifaSemDesconto = null;

  @JsonProperty("ticketValido")
  private Boolean ticketValido = null;

  @JsonProperty("valorDesconto")
  private Integer valorDesconto = null;

  public RetornoConsulta cnpjGaragem(String cnpjGaragem) {
    this.cnpjGaragem = cnpjGaragem;
    return this;
  }

   /**
   * CNPJ da Garagem
   * @return cnpjGaragem
  **/
  @ApiModelProperty(required = true, value = "CNPJ da Garagem")
  public String getCnpjGaragem() {
    return cnpjGaragem;
  }

  public void setCnpjGaragem(String cnpjGaragem) {
    this.cnpjGaragem = cnpjGaragem;
  }

  public RetornoConsulta dataConsulta(Long dataConsulta) {
    this.dataConsulta = dataConsulta;
    return this;
  }

   /**
   * Data do servidor no momento da consulta(Unix Epoch em milissegundos)
   * @return dataConsulta
  **/
  @ApiModelProperty(required = true, value = "Data do servidor no momento da consulta(Unix Epoch em milissegundos)")
  public Long getDataConsulta() {
    return dataConsulta;
  }

  public void setDataConsulta(Long dataConsulta) {
    this.dataConsulta = dataConsulta;
  }

  public RetornoConsulta dataDeEntrada(Long dataDeEntrada) {
    this.dataDeEntrada = dataDeEntrada;
    return this;
  }

   /**
   * Data de entrada(Unix Epoch em milissegundos)
   * @return dataDeEntrada
  **/
  @ApiModelProperty(required = true, value = "Data de entrada(Unix Epoch em milissegundos)")
  public Long getDataDeEntrada() {
    return dataDeEntrada;
  }

  public void setDataDeEntrada(Long dataDeEntrada) {
    this.dataDeEntrada = dataDeEntrada;
  }

  public RetornoConsulta dataPermitidaSaida(Long dataPermitidaSaida) {
    this.dataPermitidaSaida = dataPermitidaSaida;
    return this;
  }

   /**
   * Uma previsão da data permitida para saída se o ticket for pago com o valor atual (Unix Epoch em milissegundos)
   * @return dataPermitidaSaida
  **/
  @ApiModelProperty(required = true, value = "Uma previsão da data permitida para saída se o ticket for pago com o valor atual (Unix Epoch em milissegundos)")
  public Long getDataPermitidaSaida() {
    return dataPermitidaSaida;
  }

  public void setDataPermitidaSaida(Long dataPermitidaSaida) {
    this.dataPermitidaSaida = dataPermitidaSaida;
  }

  public RetornoConsulta dataPermitidaSaidaUltimoPagamento(Long dataPermitidaSaidaUltimoPagamento) {
    this.dataPermitidaSaidaUltimoPagamento = dataPermitidaSaidaUltimoPagamento;
    return this;
  }

   /**
   * Se o ticket já possuir pagamento, esta é a data permitida para a saída calculada no mesmo
   * @return dataPermitidaSaidaUltimoPagamento
  **/
  @ApiModelProperty(value = "Se o ticket já possuir pagamento, esta é a data permitida para a saída calculada no mesmo")
  public Long getDataPermitidaSaidaUltimoPagamento() {
    return dataPermitidaSaidaUltimoPagamento;
  }

  public void setDataPermitidaSaidaUltimoPagamento(Long dataPermitidaSaidaUltimoPagamento) {
    this.dataPermitidaSaidaUltimoPagamento = dataPermitidaSaidaUltimoPagamento;
  }

  public RetornoConsulta errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Código de erro
   * @return errorCode
  **/
  @ApiModelProperty(required = true, value = "Código de erro")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public RetornoConsulta garagem(String garagem) {
    this.garagem = garagem;
    return this;
  }

   /**
   * Nome da Garagem associada ao ticket
   * @return garagem
  **/
  @ApiModelProperty(required = true, value = "Nome da Garagem associada ao ticket")
  public String getGaragem() {
    return garagem;
  }

  public void setGaragem(String garagem) {
    this.garagem = garagem;
  }

  public RetornoConsulta idGaragem(Long idGaragem) {
    this.idGaragem = idGaragem;
    return this;
  }

   /**
   * ID da Garagem
   * @return idGaragem
  **/
  @ApiModelProperty(required = true, value = "ID da Garagem")
  public Long getIdGaragem() {
    return idGaragem;
  }

  public void setIdGaragem(Long idGaragem) {
    this.idGaragem = idGaragem;
  }

  public RetornoConsulta idPromocao(Long idPromocao) {
    this.idPromocao = idPromocao;
    return this;
  }

   /**
   * O id da promoção(O mesmo do request)
   * @return idPromocao
  **/
  @ApiModelProperty(value = "O id da promoção(O mesmo do request)")
  public Long getIdPromocao() {
    return idPromocao;
  }

  public void setIdPromocao(Long idPromocao) {
    this.idPromocao = idPromocao;
  }

  public RetornoConsulta imagemLink(String imagemLink) {
    this.imagemLink = imagemLink;
    return this;
  }

   /**
   * Link de uma imagem para o estacionamento
   * @return imagemLink
  **/
  @ApiModelProperty(required = true, value = "Link de uma imagem para o estacionamento")
  public String getImagemLink() {
    return imagemLink;
  }

  public void setImagemLink(String imagemLink) {
    this.imagemLink = imagemLink;
  }

  public RetornoConsulta mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

   /**
   * Mensagem de erro
   * @return mensagem
  **/
  @ApiModelProperty(required = true, value = "Mensagem de erro")
  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public RetornoConsulta notas(List<NotaInfo> notas) {
    this.notas = notas;
    return this;
  }

  public RetornoConsulta addNotasItem(NotaInfo notasItem) {
    this.notas.add(notasItem);
    return this;
  }

   /**
   * Lista com as informações sobre as notas enviadas
   * @return notas
  **/
  @ApiModelProperty(required = true, value = "Lista com as informações sobre as notas enviadas")
  public List<NotaInfo> getNotas() {
    return notas;
  }

  public void setNotas(List<NotaInfo> notas) {
    this.notas = notas;
  }

  public RetornoConsulta numeroTicket(String numeroTicket) {
    this.numeroTicket = numeroTicket;
    return this;
  }

   /**
   * O número do ticket
   * @return numeroTicket
  **/
  @ApiModelProperty(required = true, value = "O número do ticket")
  public String getNumeroTicket() {
    return numeroTicket;
  }

  public void setNumeroTicket(String numeroTicket) {
    this.numeroTicket = numeroTicket;
  }

  public RetornoConsulta promocaoAtingida(Boolean promocaoAtingida) {
    this.promocaoAtingida = promocaoAtingida;
    return this;
  }

   /**
   * Se a promoção existe e foi atingida
   * @return promocaoAtingida
  **/
  @ApiModelProperty(example = "false", required = true, value = "Se a promoção existe e foi atingida")
  public Boolean isPromocaoAtingida() {
    return promocaoAtingida;
  }

  public void setPromocaoAtingida(Boolean promocaoAtingida) {
    this.promocaoAtingida = promocaoAtingida;
  }

  public RetornoConsulta promocoesDisponiveis(Boolean promocoesDisponiveis) {
    this.promocoesDisponiveis = promocoesDisponiveis;
    return this;
  }

   /**
   * Se existem promoções cadastradas para a garagem do ticket
   * @return promocoesDisponiveis
  **/
  @ApiModelProperty(example = "false", required = true, value = "Se existem promoções cadastradas para a garagem do ticket")
  public Boolean isPromocoesDisponiveis() {
    return promocoesDisponiveis;
  }

  public void setPromocoesDisponiveis(Boolean promocoesDisponiveis) {
    this.promocoesDisponiveis = promocoesDisponiveis;
  }

  public RetornoConsulta setor(String setor) {
    this.setor = setor;
    return this;
  }

   /**
   * Setor do ticket
   * @return setor
  **/
  @ApiModelProperty(required = true, value = "Setor do ticket")
  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public RetornoConsulta tarifa(Integer tarifa) {
    this.tarifa = tarifa;
    return this;
  }

   /**
   * Valor TOTAL da tarifa do ticket em centavos(R$1,50 &#x3D; 150). Este valor ignora o valor já pago, mas não ignora descontos. ATENÇÃO: Este valor é zero quando o ticket está na tolerância!
   * @return tarifa
  **/
  @ApiModelProperty(required = true, value = "Valor TOTAL da tarifa do ticket em centavos(R$1,50 = 150). Este valor ignora o valor já pago, mas não ignora descontos. ATENÇÃO: Este valor é zero quando o ticket está na tolerância!")
  public Integer getTarifa() {
    return tarifa;
  }

  public void setTarifa(Integer tarifa) {
    this.tarifa = tarifa;
  }

  public RetornoConsulta tarifaPaga(Integer tarifaPaga) {
    this.tarifaPaga = tarifaPaga;
    return this;
  }

   /**
   * Valor da tarifa já paga em centavos(R$1,50 &#x3D; 150). Para calcular o valor a pagar utilize &#39;max(tarifa - tarifaPaga, 0)&#39;
   * @return tarifaPaga
  **/
  @ApiModelProperty(required = true, value = "Valor da tarifa já paga em centavos(R$1,50 = 150). Para calcular o valor a pagar utilize 'max(tarifa - tarifaPaga, 0)'")
  public Integer getTarifaPaga() {
    return tarifaPaga;
  }

  public void setTarifaPaga(Integer tarifaPaga) {
    this.tarifaPaga = tarifaPaga;
  }

  public RetornoConsulta tarifaSemDesconto(Integer tarifaSemDesconto) {
    this.tarifaSemDesconto = tarifaSemDesconto;
    return this;
  }

   /**
   * Valor TOTAL e sem desconto da tarifa do ticket em centavos(R$1,50 &#x3D; 150).
   * @return tarifaSemDesconto
  **/
  @ApiModelProperty(required = true, value = "Valor TOTAL e sem desconto da tarifa do ticket em centavos(R$1,50 = 150).")
  public Integer getTarifaSemDesconto() {
    return tarifaSemDesconto;
  }

  public void setTarifaSemDesconto(Integer tarifaSemDesconto) {
    this.tarifaSemDesconto = tarifaSemDesconto;
  }

  public RetornoConsulta ticketValido(Boolean ticketValido) {
    this.ticketValido = ticketValido;
    return this;
  }

   /**
   * Se o ticket consultado é válido
   * @return ticketValido
  **/
  @ApiModelProperty(example = "false", required = true, value = "Se o ticket consultado é válido")
  public Boolean isTicketValido() {
    return ticketValido;
  }

  public void setTicketValido(Boolean ticketValido) {
    this.ticketValido = ticketValido;
  }

  public RetornoConsulta valorDesconto(Integer valorDesconto) {
    this.valorDesconto = valorDesconto;
    return this;
  }

   /**
   * Valor do desconto aplicado na tarifa em centavos(R$1,50 &#x3D; 150)
   * @return valorDesconto
  **/
  @ApiModelProperty(required = true, value = "Valor do desconto aplicado na tarifa em centavos(R$1,50 = 150)")
  public Integer getValorDesconto() {
    return valorDesconto;
  }

  public void setValorDesconto(Integer valorDesconto) {
    this.valorDesconto = valorDesconto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetornoConsulta retornoConsulta = (RetornoConsulta) o;
    return Objects.equals(this.cnpjGaragem, retornoConsulta.cnpjGaragem) &&
        Objects.equals(this.dataConsulta, retornoConsulta.dataConsulta) &&
        Objects.equals(this.dataDeEntrada, retornoConsulta.dataDeEntrada) &&
        Objects.equals(this.dataPermitidaSaida, retornoConsulta.dataPermitidaSaida) &&
        Objects.equals(this.dataPermitidaSaidaUltimoPagamento, retornoConsulta.dataPermitidaSaidaUltimoPagamento) &&
        Objects.equals(this.errorCode, retornoConsulta.errorCode) &&
        Objects.equals(this.garagem, retornoConsulta.garagem) &&
        Objects.equals(this.idGaragem, retornoConsulta.idGaragem) &&
        Objects.equals(this.idPromocao, retornoConsulta.idPromocao) &&
        Objects.equals(this.imagemLink, retornoConsulta.imagemLink) &&
        Objects.equals(this.mensagem, retornoConsulta.mensagem) &&
        Objects.equals(this.notas, retornoConsulta.notas) &&
        Objects.equals(this.numeroTicket, retornoConsulta.numeroTicket) &&
        Objects.equals(this.promocaoAtingida, retornoConsulta.promocaoAtingida) &&
        Objects.equals(this.promocoesDisponiveis, retornoConsulta.promocoesDisponiveis) &&
        Objects.equals(this.setor, retornoConsulta.setor) &&
        Objects.equals(this.tarifa, retornoConsulta.tarifa) &&
        Objects.equals(this.tarifaPaga, retornoConsulta.tarifaPaga) &&
        Objects.equals(this.tarifaSemDesconto, retornoConsulta.tarifaSemDesconto) &&
        Objects.equals(this.ticketValido, retornoConsulta.ticketValido) &&
        Objects.equals(this.valorDesconto, retornoConsulta.valorDesconto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnpjGaragem, dataConsulta, dataDeEntrada, dataPermitidaSaida, dataPermitidaSaidaUltimoPagamento, errorCode, garagem, idGaragem, idPromocao, imagemLink, mensagem, notas, numeroTicket, promocaoAtingida, promocoesDisponiveis, setor, tarifa, tarifaPaga, tarifaSemDesconto, ticketValido, valorDesconto);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetornoConsulta {\n");
    
    sb.append("    cnpjGaragem: ").append(toIndentedString(cnpjGaragem)).append("\n");
    sb.append("    dataConsulta: ").append(toIndentedString(dataConsulta)).append("\n");
    sb.append("    dataDeEntrada: ").append(toIndentedString(dataDeEntrada)).append("\n");
    sb.append("    dataPermitidaSaida: ").append(toIndentedString(dataPermitidaSaida)).append("\n");
    sb.append("    dataPermitidaSaidaUltimoPagamento: ").append(toIndentedString(dataPermitidaSaidaUltimoPagamento)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    garagem: ").append(toIndentedString(garagem)).append("\n");
    sb.append("    idGaragem: ").append(toIndentedString(idGaragem)).append("\n");
    sb.append("    idPromocao: ").append(toIndentedString(idPromocao)).append("\n");
    sb.append("    imagemLink: ").append(toIndentedString(imagemLink)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    notas: ").append(toIndentedString(notas)).append("\n");
    sb.append("    numeroTicket: ").append(toIndentedString(numeroTicket)).append("\n");
    sb.append("    promocaoAtingida: ").append(toIndentedString(promocaoAtingida)).append("\n");
    sb.append("    promocoesDisponiveis: ").append(toIndentedString(promocoesDisponiveis)).append("\n");
    sb.append("    setor: ").append(toIndentedString(setor)).append("\n");
    sb.append("    tarifa: ").append(toIndentedString(tarifa)).append("\n");
    sb.append("    tarifaPaga: ").append(toIndentedString(tarifaPaga)).append("\n");
    sb.append("    tarifaSemDesconto: ").append(toIndentedString(tarifaSemDesconto)).append("\n");
    sb.append("    ticketValido: ").append(toIndentedString(ticketValido)).append("\n");
    sb.append("    valorDesconto: ").append(toIndentedString(valorDesconto)).append("\n");
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

