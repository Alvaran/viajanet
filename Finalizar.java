package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Repositorio.Repositorio;

public class Finalizar extends BasePages{
	public Finalizar() {
		super(driver);

	}

	public Finalizar email (){
		driver.findElement(By.id(Repositorio.ID_Email)).sendKeys("njr02752@cndps.com");
		return this;
	}
	public Finalizar nome (){
		driver.findElement(By.id(Repositorio.ID_Nome)).sendKeys("luiz");
		return this;
	}
	public Finalizar sobrenome (){
		driver.findElement(By.id(Repositorio.ID_SobreNome)).sendKeys("Carlos");
		return this;
	}
	public Finalizar dtnascimento (){
		driver.findElement(By.id(Repositorio.ID_DtNasc)).sendKeys("01/01/1980");
		return this;
	}
	public Finalizar sexo (){
		driver.findElement(By.name(Repositorio.NAME_Sexo)).click();
		return this;
	}
	public Finalizar parcela (){
		driver.findElement(By.id(Repositorio.ID_Par)).click();
		return this;
	}
	public Finalizar tipodecartao (){
		driver.findElement(By.id(Repositorio.ID_TipoCartao)).click();
		return this;
	}
	public Finalizar numerodocartao (){
		driver.findElement(By.id(Repositorio.ID_NumeroCartao)).sendKeys("4802888849801279");
		return this;
	}
	public Finalizar validadecartaomes (){
		driver.findElement(By.id(Repositorio.ID_ValidadeCartaoMes)).sendKeys("11");
		return this;
	}
	public Finalizar validadecartaoano (){
		driver.findElement(By.id(Repositorio.ID_ValidaeCartaoAno)).sendKeys("2019");
		return this;
	}
	public Finalizar titulardocartao (){
		driver.findElement(By.id(Repositorio.ID_TitularCartao)).sendKeys("Luiz Carlos Araujo");
		return this;
	}
	public Finalizar cpf (){
		driver.findElement(By.id(Repositorio.ID_CPF)).sendKeys("84884281039");
		return this;
	}
	public Finalizar cep(){
		driver.findElement(By.id(Repositorio.ID_CEP)).sendKeys("08520-000");
		return this;
	}
	public Finalizar Endereço (){
		driver.findElement(By.id(Repositorio.ID_Endereço)).sendKeys("rua xavier");
		return this;
	}
	public Finalizar numerocasa (){
		driver.findElement(By.id(Repositorio.ID_NuemroCasa)).sendKeys("200");
		return this;
	}
	public Finalizar bairro (){
		driver.findElement(By.id(Repositorio.ID_Bairro)).sendKeys("jaquare");
		return this;
	}
	public Finalizar cidade (){
		driver.findElement(By.id(Repositorio.ID_Cidade)).sendKeys("São Paulo");
		return this;
	}
	public Finalizar estado (){
		driver.findElement(By.id(Repositorio.ID_Estado)).sendKeys("Estado");
		return this;
	}
	public Finalizar contato (){
		driver.findElement(By.id(Repositorio.ID_EmailContato)).sendKeys("luiza@gmp.com");
		return this;
	}
	public Finalizar confirmaemail (){
		driver.findElement(By.id(Repositorio.ID_EmailContatoConfirme)).sendKeys("luiza@gmp.com");
		return this;
	}
	public Finalizar telefone (){
		driver.findElement(By.id(Repositorio.ID_Celular)).click();
		return this;
	
}
	public Finalizar numerotelefone (){
		driver.findElement(By.id(Repositorio.ID_NumeroCelular)).sendKeys("11558877889");
		return this;
	
}
	public Finalizar termoaceite (){
		driver.findElement(By.id(Repositorio.ID_TermoAceite)).click();
		return this;
	
}
	public Reserva finalizarcompra (){
		driver.findElement(By.xpath(Repositorio.Xpath_FinalizarComprar)).click();
		return new Reserva();
	
}}