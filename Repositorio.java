package Repositorio;

public class Repositorio {

	//tela de cadastro de viagens
	public static final String URL                = "https://www.viajanet.com.br";
	public static final String ID_IdaVolta        = "iptRoundTrip";
	public static final String ID_Origem          = "inptorigin";
	public static final String ID_Destino         = "inptdestination";
	public static final String ID_DtIda           = "departureDate";
	public static final String ID_DtVolta         = "arrivalDate";
	public static final String Xpath_Pesquisar    = "//button[contains(.,'Pesquisar')]";
	
	//tela de compra da viagem
	public static final String Xpath_Comprar      = "//span[@class='btn-checkin'])[1])";
	
	//tela de finalizar
	public static final String ID_Email           =	"my-account_email";
	public static final String ID_Nome            =	"nome_0";
	public static final String ID_SobreNome       =	"lastName_0";
    public static final String ID_DtNasc          =	"birth_0";
    public static final String NAME_Sexo          =	"gender_0";
	public static final String ID_Par          =	"card1";	
	public static final String ID_TipoCartao      =	"flag_card";	
	public static final String ID_NumeroCartao    = "number_card-0";
	public static final String ID_ValidadeCartaoMes    =	"month-0";
	public static final String ID_ValidaeCartaoAno     =	"year-0";
	public static final String ID_TitularCartao    =	"name_card-0";
	public static final String ID_CPF              =	"cpf_card-0";
	public static final String ID_CEP              =	"zipcode-0";
	public static final String ID_Endereço         =	"address-0";
	public static final String ID_NuemroCasa       =	"number_address-0";
	public static final String ID_Bairro           =	"neighborhood-0";
	public static final String ID_Cidade           =	"city-0";
	public static final String ID_Estado           =	"state-0";
	public static final String ID_EmailContato     =	"contact_email";
	public static final String ID_EmailContatoConfirme     =	"contact_email_confirm";
	public static final String ID_Celular     =	"contact_phone_0";
	public static final String ID_NumeroCelular     =	"contact_phonenumber_0";
	public static final String ID_TermoAceite     =	"accept-checkout";
	public static final String Xpath_FinalizarComprar     =	"//button[contains(.,'Finalizar compra')]";
	
	//tela de reserva
	public static final String 
	Xpath_Reserva = "//span[@class='in-progress'][contains(.,'Reserva em processamento. \r\n" + 
		"Sua reserva está em processamento. Após a confirmação do pagamento você receberá sua passagem aérea por e-mail.')]\r\n" + "";
			

}
