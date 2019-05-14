package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Repositorio.Repositorio;


public class Reserva extends BasePages{
	public Reserva() {
		super(driver);
	}
	
	public Reserva reservado(){
	Assert.assertEquals("Reserva em processamento.", Repositorio.Xpath_Reserva);
	return this;

}}