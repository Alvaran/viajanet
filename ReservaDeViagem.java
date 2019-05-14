package Step;
import Pages.DadosDaCompra;
import Pages.Finalizar;
import Pages.ProcessamentoDaCompra;
import Pages.Reserva;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ReservaDeViagem {

	private ProcessamentoDaCompra cadastro = new ProcessamentoDaCompra();
	private DadosDaCompra comprar = new DadosDaCompra();
	private Finalizar confirma = new Finalizar();
	private Reserva reserva = new Reserva();

	@Given("^que eu acesse o site do viajanet$")
	public void queEuAcesseOSiteDoViajanet() throws Throwable {
		cadastro.setUrl();
	}

	@Given("^clico na opção Ida e volta$")
	public void clicoNaOpçãoIdaEVolta() throws Throwable {
    cadastro.IdaVolta();
	}

	@Given("^Informe sua origem$")
	public void informeSuaOrigem() throws Throwable {
    cadastro.Origem();
	}

	@Given("^Informe seu destino$")
	public void informeSeuDestino() throws Throwable {
    cadastro.Destino();
	}

	@Given("^Data de ida$")
	public void dataDeIda() throws Throwable {
    cadastro.DtIda();
	}

	@Given("^Data de volta$")
	public void dataDeVolta() throws Throwable {
    cadastro.DtVolta();
	
	}

	@When("^clico no botão pesquisar$")
	public void clicoNoBotãoPesquisar() throws Throwable {
		cadastro.Pesquisar();
	}

	@Then("^obtenho o resultado da pesquisa$")
	public void obtenhoOResultadoDaPesquisa() throws Throwable {
	
	}

	@Given("^que eu clico em Comprar$")
	public void queEuClicoEmComprar() throws Throwable {
		comprar.BtnComprar();
	}

	@Given("^Informo o email$")
	public void informoOEmail() throws Throwable {
		confirma.email();
	}

	@Given("^Informo o Nome$")
	public void informoONome() throws Throwable {
		confirma.confirmaemail();
	}

	@Given("^Informo o Sobrenome$")
	public void informoOSobrenome() throws Throwable {
		confirma.sobrenome();
	}

	@Given("^Informo a Data de nasc$")
	public void informoADataDeNasc() throws Throwable {
		confirma.dtnascimento();
	}

	@Given("^Informo o Sexo$")
	public void informoOSexo() throws Throwable {
		confirma.sexo();
		}

	@Given("^Informo a forma de pagamento$")
	public void informoAFormaDePagamento() throws Throwable {
		confirma.parcela();
	}

	@Given("^Informo o Cartão$")
	public void informoOCartão() throws Throwable {
		confirma.tipodecartao();
		}

	@Given("^Informo o Número do cartão$")
	public void informoONúmeroDoCartão() throws Throwable {
		confirma.numerodocartao();
	}

	@Given("^Informo os campos do Válido até$")
	public void informoOsCamposDoVálidoAté() throws Throwable {
	}

	@Given("^Informo o Nome do Titular do cartão$")
	public void informoONomeDoTitularDoCartão() throws Throwable {
		confirma.titulardocartao();
		}

	@Given("^Informo o CPF do titular do cartão$")
	public void informoOCPFDoTitularDoCartão() throws Throwable {
		confirma.cpf();
	}

	@Given("^Informo o CEP$")
	public void informoOCEP() throws Throwable {
		confirma.cep();

	}

	@Given("^Informo o Endereço$")
	public void informoOEndereço() throws Throwable {
confirma.Endereço();
	}

	@Given("^Informo o Número$")
	public void informoONúmero() throws Throwable {
		confirma.numerocasa();

	}

	@Given("^Informo o Bairro$")
	public void informoOBairro() throws Throwable {
		confirma.bairro();
	}

	@Given("^Informo a Cidade$")
	public void informoACidade() throws Throwable {
    confirma.cidade();
    }

	@Given("^Informo o Estado$")
	public void informoOEstado() throws Throwable {
		confirma.estado();

	}

	@Given("^Informo o E-mail para envio de informação da compra$")
	public void informoOEMailParaEnvioDeInformaçãoDaCompra() throws Throwable {
confirma.email();
	}

	@Given("^Informo o Confirme seu e-mail$")
	public void informoOConfirmeSeuEMail() throws Throwable {
confirma.confirmaemail();
	}

	@Given("^Informo o tipo do Telefone$")
	public void informoOTipoDoTelefone() throws Throwable {
confirma.telefone();
	}

	@Given("^Informo o Número do telefone$")
	public void informoONúmeroDoTelefone() throws Throwable {
confirma.numerotelefone();
	}

	@Given("^Clico na opção Li e aceito as condições de compra$")
	public void clicoNaOpçãoLiEAceitoAsCondiçõesDeCompra() throws Throwable {
confirma.termoaceite();
	}

	@When("^clico no botão Finalizar compra$")
	public void clicoNoBotãoFinalizarCompra() throws Throwable {
confirma.finalizarcompra();
	}

	@Then("^o sistema exibe a tela de Reserva em processamneto\\.$")
	public void oSistemaExibeATelaDeReservaEmProcessamneto() throws Throwable {
reserva.reservado();
	}}