import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class SendTestDate {
    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

    @Test
    @DisplayName("Should successfully login with active registered user")
    void shouldSuccessfulLoginIfRegisteredActiveUser() {

        var registeredUser = DataGenerator.Registration.getRegisteredUser("active");

        // TODO: добавить логику теста, в рамках которого будет выполнена попытка входа в личный кабинет с учётными
        //  данными зарегистрированного активного пользователя, для заполнения полей формы используйте
        //  пользователя registeredUser

    }
    @Test
    @DisplayName("Should get error message if login with not registered user")
    void shouldGetErrorIfNotRegisteredUser() {
        var notRegisteredUser = DataGenerator.Registration.getUser("active");
        // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет
        //  незарегистрированного пользователя, для заполнения полей формы используйте пользователя notRegisteredUser
    }
//
//    @Test
//    @DisplayName("Should get error message if login with blocked registered user")
//    void shouldGetErrorIfBlockedUser() {
//        var blockedUser = getRegisteredUser("blocked");
//        // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет,
//        //  заблокированного пользователя, для заполнения полей формы используйте пользователя blockedUser
//    }
//
//    @Test
//    @DisplayName("Should get error message if login with wrong login")
//    void shouldGetErrorIfWrongLogin() {
//        var registeredUser = getRegisteredUser("active");
//        var wrongLogin = getRandomLogin();
//        // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет с неверным
//        //  логином, для заполнения поля формы "Логин" используйте переменную wrongLogin,
//        //  "Пароль" - пользователя registeredUser
//    }
//
//    @Test
//    @DisplayName("Should get error message if login with wrong password")
//    void shouldGetErrorIfWrongPassword() {
//        var registeredUser = getRegisteredUser("active");
//        var wrongPassword = getRandomPassword();
//        // TODO: добавить логику теста в рамках которого будет выполнена попытка входа в личный кабинет с неверным
//        //  паролем, для заполнения поля формы "Логин" используйте пользователя registeredUser,
//        //  "Пароль" - переменную wrongPassword
//    }
}
