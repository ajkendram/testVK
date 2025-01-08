import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainApiTest {

//WebDriver driver = new ChromeDriver();

    @Test

    public void getTest() {

        given()
                .baseUri("https://postman-echo.com")
                .when()
                .get("/get")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();


        given()
                .baseUri("https://postman-echo.com")
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .assertThat()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .log().all();


    }

    @Test
    public void postRawTest() {
        given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "application/json")

                .body("{\"test11\": \"value\"}")
                .when()
                .post("/post")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all()

                .body("data.test11", equalTo("value"));

    }


    @Test
    public void postFromDataTest2() {
        RestAssured.given()
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .post("https://postman-echo.com/post")

                .then()
                .log().all()

                .statusCode(200)

                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));

    }

    @Test
    public void putTest() {
        RestAssured.given()
                .contentType(ContentType.TEXT)
                .body("This is expected to be sent back as part of response body.")
                .put("https://postman-echo.com/put")
                .then()
                .log().all()
                .statusCode(200).body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void patchTest() {
        RestAssured.
                given().
                contentType(ContentType.TEXT)
                .body("This is expected to be sent back as part of response body.")
                .patch("https://postman-echo.com/patch")
                .then().log().all().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));

    }


    @Test
    public void deleteTest() {
        RestAssured
                .given()
                .contentType(ContentType.TEXT)
                .body("This is expected to be sent back as part of response body.")
                .delete("https://postman-echo.com/delete")
                .then().log().all().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}
