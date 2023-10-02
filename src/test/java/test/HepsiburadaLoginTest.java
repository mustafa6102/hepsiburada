package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HepsiburadaLoginTest {

    public static void main(String[] args) {
        // WebDriver'ı başlat
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();

        // Hepsiburada ana sayfasını aç
        driver.get("https://www.hepsiburada.com");

        // "myAccount" üzerine gelerek giriş yapma alanını görüntüle
        WebElement myAccount = driver.findElement(By.id("myAccount"));
        myAccount.click();

        // "Login" alanına tıkla
        WebElement loginLink = driver.findElement(By.id("login"));
        loginLink.click();

        // E-posta girişi
        WebElement emailInput = driver.findElement(By.id("txtUserName"));
        emailInput.sendKeys("seleniumOtomasyonu@gmail.com");

        // "btnLogin" butonuna tıkla
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        // Şifre girişi
        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        passwordInput.sendKeys("your_password");

        // "btnEmailSelect" butonuna tıkla ve giriş yap
        WebElement loginSubmitButton = driver.findElement(By.id("btnEmailSelect"));
        loginSubmitButton.click();

        // Ana sayfaya geri dön
        driver.get("https://www.hepsiburada.com");

        // Arama kutusuna "Airpods" yaz ve ara
        WebElement searchBox = driver.findElement(By.id("SearchBoxOld_dca4b494-a270-458a-4b2e-5cf06aaf576d"));
        searchBox.sendKeys("Airpods");
        searchBox.sendKeys(Keys.ENTER);

        // Ürün sonuçlarından ilk ürüne tıkla
        WebElement firstProduct = driver.findElement(By.xpath("//div[@class='moria-ProductCard-joawUM jwtmNu seywqefuj2v']//a"));
        firstProduct.click();

        // Ürün detaylarına göz at

        // İncelemeler sekmesine tıkla
        WebElement reviewsTab = driver.findElement(By.id("productReviewsTab"));
        reviewsTab.click();

        // Ürün incelemelerini görüntüle

        // Ürünün puanını kontrol et
        WebElement averageRating = driver.findElement(By.xpath("//span[@class='hermes-AverageRateBox-module-g3di4HmmxfHjT7Q81WvH']"));
        double rating = Double.parseDouble(averageRating.getText());
        if (rating >= 4.5) {
            // Puan 4.5'in üzerindeyse ürünü sepete ekle

            // Arttır butonuna tıkla
            WebElement increaseButton = driver.findElement(By.xpath("//button[@title='Arttır']"));
            increaseButton.click();

            // Sepete ekle butonuna tıkla
            WebElement addToCartButton = driver.findElement(By.id("addToCart"));
            addToCartButton.click();

            // Ana sayfaya geri dön
            driver.navigate().back();
        } else {
            System.out.println("Ürünün puanı 4.5'in altında olduğu için sepete eklenmedi.");
        }

        // Ana sayfaya geri dön
        driver.navigate().back();

        // Sepeti görüntüleme
        WebElement shoppingCart = driver.findElement(By.id("shoppingCart"));
        shoppingCart.click();

        // Devam et butonuna tıkla
        WebElement continueButton = driver.findElement(By.id("continue_step_btn"));
        continueButton.click();

        // "co-checkbox-gcyInH.cMWEsL.sj4ps5esgp2" alanına tıkla
        WebElement checkBox = driver.findElement(By.cssSelector(".co-checkbox-gcyInH.cMWEsL.sj4ps5esgp2"));
        checkBox.click();

        // Devam et butonuna tıkla
        continueButton = driver.findElement(By.id("continue_step_btn"));
        continueButton.click();

        // Ana sayfaya geri dön
        driver.navigate().back();

        // Üst menüde kullanıcı bilgilerine tıkla
        WebElement myAccountMenu = driver.findElement(By.xpath("//div[@id='oldHeader_3deaa898-852f-4559-b9a0-481d931246ea']//span//span[1]"));
        myAccountMenu.click();

        // Kullanıcı bilgilerini güncelleme
        WebElement userProfileMenu = driver.findElement(By.xpath("//div[@class='sf-OldMyAccount-IMCbeURaRPyXfubeWCC7']//a[@title='Kullanıcı Bilgilerim'][contains(text(),'Kullanıcı Bilgilerim')]"));
        userProfileMenu.click();

        // Adı güncelle
        WebElement nameInput = driver.findElement(By.xpath("//div[@class='dZAEjxk-ljB6ui8oOynrl']//input[@name='name']"));
        nameInput.clear();
        nameInput.sendKeys("Abdurrahman");

        // Güncelle butonuna tıkla
        WebElement updateButton = driver.findElement(By.xpath("//div[@class='dZAEjxk-ljB6ui8oOynrl']//button[@class='hb-AxgMb iIiYmr s1z26y5ik9z'][normalize-space()='Güncelle']"));
        updateButton.click();

        // İletişim tercihlerine tıkla
        WebElement communicationPreferences = driver.findElement(By.xpath("//a[@class='_1bRKrjOVGge7DPeI5K49jh false'][contains(text(),'İletişim tercihlerim')]"));
        communicationPreferences.click();

        // isSendSmsAvailable alanını false yap
        WebElement smsAvailabilityToggle = driver.findElement(By.id("isSendSmsAvailable"));
        if (smsAvailabilityToggle.isSelected()) {
            smsAvailabilityToggle.click();
        }

        // Şifre değişikliği sayfasına tıkla
        WebElement changePasswordLink = driver.findElement(By.xpath("//a[@class='_1bRKrjOVGge7DPeI5K49jh false'][contains(text(),'Şifre değişikliği')]"));
        changePasswordLink.click();

        // Eski şifre, yeni şifre ve tekrar yeni şifre gir
        WebElement oldPasswordInput = driver.findElement(By.xpath("//input[@id='txtOldPassword']"));
        oldPasswordInput.sendKeys("Mcicek0282?");

        WebElement newPasswordInput = driver.findElement(By.xpath("//input[@id='txtNewPassword']"));
        newPasswordInput.sendKeys("Amenna6106?");

        WebElement confirmPasswordInput = driver.findElement(By.xpath("//input[@id='txtConfirmNewPassword']"));
        confirmPasswordInput.sendKeys("Amenna6106?");

        // Şifre güncelleme butonuna tıkla
        WebElement changePasswordButton = driver.findElement(By.xpath("//button[@class='hb-AxgMb iIiYmr s1z26y5ik9z']"));
        changePasswordButton.click();

        // Hepsiburada hesabınıza gitmek için URL'yi kullanın
        driver.get("https://hesabim.hepsiburada.com/");

        // İlgili menüye tıkla
        WebElement navigationMenuItem = driver.findElement(By.xpath("//div[@class='customerAccount-NavigationMenuItem-tktgo customerAccount-NavigationMenuItem-2-43J']"));
        navigationMenuItem.click();

        // Açılan pencerede ilgili öğeye tıkla
        WebElement maskPathElement = driver.findElement(By.xpath("//*[(name()='g' and contains(@mask,'url(#3r8hh')) and (name()='path' and contains(@fill-rule,'evenodd'))]"));
        maskPathElement.click();

        // Açılan alanda ilgili butona tıkla
        WebElement cargoTrackingButton = driver.findElement(By.xpath("//a[@class='action-button action-button--cargo-tracking']"));
        cargoTrackingButton.click();

        // Tarayıcıyı kapat
        driver.quit();
    }
}
