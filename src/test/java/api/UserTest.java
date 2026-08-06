package api;

import models.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class UserTest {
    
    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
    @Test
    @DisplayName("Verify username is correct")
    public void testingUserInfo(){
        
        // Arrange
        int testUserId = 1;

        //Act
        User user = given()
                .contentType(ContentType.JSON)
                .pathParam("id", testUserId)
                .when()
                .get("/users/{id}")
                .then()
                .statusCode(200)
                .extract()
                .as(User.class);  //Deserializes JSON directly to the Java object

        // Assert
        assertEquals("Leanne Graham", user.getName());
    }

}
