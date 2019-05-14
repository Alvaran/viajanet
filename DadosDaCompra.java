package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Repositorio.Repositorio;

public class DadosDaCompra extends BasePages {

	public DadosDaCompra() {
		super(driver);

	}
	
	public Finalizar BtnComprar (){
	driver.findElement(By.xpath(Repositorio.Xpath_Comprar)).click();
	return new Finalizar();
	
}
}