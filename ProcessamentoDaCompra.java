package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Repositorio.Repositorio;


public class ProcessamentoDaCompra extends BasePages {
	public ProcessamentoDaCompra() {
		super(driver);
	}

	
	
public ProcessamentoDaCompra setUrl( ){
		System.setProperty("webdriver.chrome.driver", "C:/DriverdoChromeFunc/chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get(Repositorio.URL);
		return this;		
	}
	
public ProcessamentoDaCompra IdaVolta(){
	driver.findElement(By.id(Repositorio.ID_IdaVolta)).click();
	return this;
	
}
public ProcessamentoDaCompra Origem (){
driver.findElement(By.id(Repositorio.ID_Origem)).sendKeys("São Paulo");
return this;
}
public ProcessamentoDaCompra Destino (){
driver.findElement(By.id(Repositorio.ID_Destino)).sendKeys("Madri");
return this;

}
public ProcessamentoDaCompra DtIda (){
driver.findElement(By.id(Repositorio.ID_DtIda)).sendKeys("14052019");
return this;

}
public ProcessamentoDaCompra DtVolta (){
driver.findElement(By.id(Repositorio.ID_DtVolta)).sendKeys("14062019");
return this;

}
public DadosDaCompra Pesquisar (){
driver.findElement(By.xpath(Repositorio.Xpath_Pesquisar)).click();
return  new DadosDaCompra();

}

}
