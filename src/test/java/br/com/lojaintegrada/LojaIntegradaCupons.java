package br.com.lojaintegrada;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LojaIntegradaCupons {
    WebDriver chrome_browser;

    @Test
    public void minhaConta() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        chrome_browser = new ChromeDriver();
        chrome_browser.manage().window().maximize();
        chrome_browser.get("https://qastoredesafio.lojaintegrada.com.br/");

        String xpathMinhaConta = "//*[@id=\"cabecalho\"]/div[2]/div[1]/div[2]/div[1]/div[2]/ul/li[2]/a";
        WebElement btnMinhaConta = chrome_browser.findElement(By.xpath(xpathMinhaConta));
        btnMinhaConta.click();

        String xpathEmail = "//*[@id=\"id_email\"]";
        WebElement txtEmail = chrome_browser.findElement(By.xpath(xpathEmail));
        txtEmail.sendKeys("danivieira@mailinator.com");

        String xpathSenha = "//*[@id=\"id_senha\"]";
        WebElement txtSenha = chrome_browser.findElement(By.xpath(xpathSenha));
        txtSenha.sendKeys("Teste");

        String xpathProsseguir = "//*[@id=\"corpo\"]/div/div[2]/div[2]/div[1]/div/form/fieldset/div[2]/div/button";
        WebElement btnProsseguir = chrome_browser.findElement(By.xpath(xpathProsseguir));
        btnProsseguir.click();

        String xpathMenuProduto = "//*[@id=\"cabecalho\"]/div[2]/div[2]/ul/li[2]/a";
        WebElement menuProduto = chrome_browser.findElement(By.xpath(xpathMenuProduto));
        menuProduto.click();

        String xpathProdutoPeso = "//*[@id=\"listagemProdutos\"]/ul/li[5]/ul/li[1]/div/a";
        WebElement produtoPeso = chrome_browser.findElement(By.xpath(xpathProdutoPeso));
        produtoPeso.click();

        String xpathBotaoComprar = "//*[@id=\"corpo\"]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[3]/a";
        WebElement btnComprar = chrome_browser.findElement(By.xpath(xpathBotaoComprar));
        btnComprar.click();

        String xpathQuantidade = "//*[@id=\"corpo\"]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[4]/form/div/input";
        WebElement txtQuantidade = chrome_browser.findElement(By.xpath(xpathQuantidade));
        txtQuantidade.clear();
        txtQuantidade.sendKeys("300");

        String xpathBotaoAtualizarQuantidade = "//*[@id=\"corpo\"]/div/div[1]/div/div[2]/table/tbody/tr[1]/td[4]/form/div/button";
        WebElement btnAtualizarQuantidade = chrome_browser.findElement(By.xpath(xpathBotaoAtualizarQuantidade));
        btnAtualizarQuantidade.click();

        String xpathCep = "//*[@id=\"calcularFrete\"]";
        WebElement txtCep = chrome_browser.findElement(By.xpath(xpathCep));
        txtCep.clear();
        txtCep.sendKeys("04060001");
        
        String xpathCalcularFrete = "//*[@id=\"btn-frete\"]";
        WebElement btnCalcularFrete = chrome_browser.findElement(By.xpath(xpathCalcularFrete));
        btnCalcularFrete.click();

     /*  org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
  (Session info: chrome=109.0.5414.129)
        String xpathOpcaoRetirar = "//*[@id=\"corpo\"]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]/div/ul/li/label";
        WebElement radioOpcaoRetirar = chrome_browser.findElement(By.xpath(xpathOpcaoRetirar));
        radioOpcaoRetirar.click();
     */

        String xpathCupomDesconto = "//*[@id=\"usarCupom\"]";
        WebElement txtCupomDesconto = chrome_browser.findElement(By.xpath(xpathCupomDesconto));
        txtCupomDesconto.sendKeys("10OFF");

        String xpathBotaoUsarCupom = "//*[@id=\"btn-cupom\"]";
        WebElement btnUsarCupom = chrome_browser.findElement(By.xpath(xpathBotaoUsarCupom));
        btnUsarCupom.click();

        String xpathBotaoFinalizarCompra = "//*[@id=\"corpo\"]/div/div[1]/div/form/div/div[1]/button";
        WebElement btnFinalizarCompra = chrome_browser.findElement(By.xpath(xpathBotaoFinalizarCompra));
        btnFinalizarCompra.click();

        String xpathEndereco = "//*[@id=\"listaEndereco\"]/div[1]/label";
        WebElement radioEndereco = chrome_browser.findElement(By.xpath(xpathEndereco));
        radioEndereco.click();

        String xpathEntrega = "//*[@id=\"pagamento520160\"]/span[2]";
        WebElement radioEntrega = chrome_browser.findElement(By.xpath(xpathEntrega));
        radioEntrega.click();

        TimeUnit.SECONDS.sleep(5);

        String xpathPagamentoBoleto = "//*[@id=\"radio-mercadopagov1-520160\"]";
        WebElement radioPagamentoBoleto = chrome_browser.findElement(By.xpath(xpathPagamentoBoleto));
        radioPagamentoBoleto.click();

        String xpathBotaoConcluirCompra = "//*[@id=\"finalizarCompra\"]";
        WebElement btnConcluirCompra = chrome_browser.findElement(By.xpath(xpathBotaoConcluirCompra));
        btnConcluirCompra.click();

        String xpathBotaoFecharMsg = "//*[@id=\"modalAlerta\"]/div[2]/a";
        WebElement btnFecharMsg = chrome_browser.findElement(By.xpath(xpathBotaoFecharMsg));
        btnFecharMsg.click();
   }
}