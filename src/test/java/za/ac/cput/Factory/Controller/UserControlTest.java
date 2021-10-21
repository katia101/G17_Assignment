package za.ac.cput.Controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class UserControlTest {
    private static User user = UserFactory.createUser("Mzi", "Mwa");

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/user";
    @Test
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<User> postResponse = restTemplate.postForEntity(url, user, User.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertEquals(postResponse.getStatusCode(), HttpStatus.OK);
        user = postResponse.getBody();
        System.out.println("Captured" + user);
        assertEquals(user.getUserId(), postResponse.getBody().getUserId());
    }
    @Test
    void read() {
        String url = baseURL + "/read" + user.getUserId();
        System.out.println("URL" + url);
        ResponseEntity<User> response = restTemplate.postForEntity(url, user, User.class);
        assertEquals(user.getUserId(), response.getBody().getUserId());
    }

    @Test
    void update() {
        User updated = new User.Builder().copy(user).setFirstName("Sick").build();
        String url = baseURL + "/update";
        System.out.println("Post data: " + updated);
        ResponseEntity<User> response = restTemplate.postForEntity(url, updated, User.class);
        assertNotNull(response.getBody());
    }
    @Test
    void delete() {
        String url = baseURL + "/delete/" + user.getUserId();
        System.out.println("URL " + url);
        restTemplate.delete(url);
    }

    @Test
    void getAll() {
        String url = baseURL + "/getall";
        HttpHeaders header = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, header);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show");
        System.out.println(response);
        System.out.println(response.getBody());
    }


}