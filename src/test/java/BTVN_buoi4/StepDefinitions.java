package BTVN_buoi4;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StepDefinitions {

    WebDriver driver;

    public StepDefinitions(){
        this.driver = Hook.driver;
    }

    @Given("^Hien thi giao dien trang chu tiki$")
    public void hien_thi_giao_dien_trang_chu_tiki() throws Throwable {
        this.driver.get("https://tiki.vn/");
        Thread.sleep(3000);
    }

    @When("^Nguoi dung chon mua san pham bat ky$")
    public void nguoi_dung_chon_mua_san_pham_bat_ky() throws Throwable {
        //Nhap tu khoa de tim kiem sp
        WebElement txtSearch = this.driver.findElement(By.cssSelector("input.eUnWAD"));
        txtSearch.sendKeys("airpods");
        txtSearch.sendKeys(Keys.ENTER);
        Thread.sleep(8000);

        //Click chon san pham
        WebElement product = this.driver.findElement(By.xpath("//div[@class='product-box-list']/div[1]//a//div//p[@class='title']"));
        product.click();
        Thread.sleep(5000);
        //Click chon mua
        WebElement btnBuy= this.driver.findElement(By.xpath("//button[@class='btn btn-add-to-cart']"));
        btnBuy.click();
        Thread.sleep(5000);

    }


    @And("^Nguoi dung click chon kiem tra gio hang$")
    public void nguoi_dung_click_chon_kiem_tra_gio_hang() throws Throwable {
        WebElement btnAddcart = this.driver.findElement(By.xpath("//a[@class='btn-view-cart']"));
        btnAddcart.click();
        Thread.sleep(8000);
    }

    @Then("^San pham chon mua da duoc them vao trong gio hang$")
    public void san_pham_chon_mua_da_duoc_them_vao_trong_gio_hang() throws Throwable {
        WebElement productCart =this.driver.findElement(By.xpath("//a[@class='cart-products__name']"));
        String textProductCart = productCart.getText();
        Assert.assertTrue(textProductCart.contains("Tai Nghe Bluetooth Apple AirPods 2"));
    }

}
