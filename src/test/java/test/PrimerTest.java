package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerTest {

    @Test
    public void abrirNavegador() throws InterruptedException {
        // 1. Le decimos a Selenium que abra Chrome
        WebDriver driver = new ChromeDriver();

        // 2. Maximizamos la ventana
        driver.manage().window().maximize();

        // 3. Le decimos que navegue a la web de Workday (o cualquier otra)
        driver.get("https://www.google.com");

        // 4. Pausa de 3 segundos para que te dé tiempo a verlo (¡Solo para esta prueba!)
        Thread.sleep(3000);

        // 5. Cerramos el navegador para no dejar procesos colgados
        driver.quit();
    }
}