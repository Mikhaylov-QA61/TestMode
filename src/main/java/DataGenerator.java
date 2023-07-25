import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import lombok.Value;
import static io.restassured.RestAssured.given;
import java.util.ArrayList;
import java.util.List;
import io.restassured.http.ContentType;

public class DataGenerator {
    private static final RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("http://localhost")
            .setPort(9999)
            .setAccept(ContentType.JSON)
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();


    private static void sendRequest(RegistrationDto user) {
        given()
                .spec(requestSpec)
                .body(new RegistrationDto(user.login, user.password, user.status))
            .when()
                .post("/api/system/users")
            .then()
                .statusCode(200);

        // TODO: отправить запрос на указанный в требованиях path, передав в body запроса объект user
        //  и не забудьте передать подготовленную спецификацию requestSpec.
        //  Пример реализации метода показан в условии к задаче.
    }

    public static String getRandomLogin() {
        List<String> massLogin = new ArrayList<>();
        massLogin.add("Igor");
        massLogin.add("Gregory");
        massLogin.add("Vladislav");
        massLogin.add("Vladimir");
        massLogin.add("Vitaly");
        massLogin.add("Kirill");
        massLogin.add("Egor");
        massLogin.add("Petya");
        massLogin.add("Vasya");
        int count = (int) Math.floor(Math.random()* massLogin.size());

        String login = massLogin.get((int) count);
        return login;
    }

    public static String getRandomPassword() {
        List<String> massPassword = new ArrayList<>();
        massPassword.add("MXXHC8c1");
        massPassword.add("CEF38URE");
        massPassword.add("n6oxYe0D");
        massPassword.add("EAP0EG3z");
        massPassword.add("kRg7joQR");
        massPassword.add("zr8TcXZu");
        massPassword.add("1KmRz2NW");
        massPassword.add("pqaJk3UJ");
        massPassword.add("NhCRJMo1");
        int count = (int) Math.floor(Math.random()* massPassword.size());

        String password = massPassword.get((int) count);
        return password;
    }

    public static class Registration {
        private Registration() {
        }

        public static RegistrationDto getUser(String status) {

            RegistrationDto user = new RegistrationDto(getRandomLogin(),getRandomPassword(),status);

            // TODO: создать пользователя user используя методы getRandomLogin(), getRandomPassword() и параметр status
            return user;
        }

        public static RegistrationDto getRegisteredUser(String status) {

            RegistrationDto registeredUser= getUser(status);
            sendRequest(registeredUser);
            // TODO: объявить переменную registeredUser и присвоить ей значение возвращённое getUser(status).
            // Послать запрос на регистрацию пользователя с помощью вызова sendRequest(registeredUser)

            return registeredUser;
        }
    }

    @Value
    public static class RegistrationDto {
        String login;
        String password;
        String status;

    }
}