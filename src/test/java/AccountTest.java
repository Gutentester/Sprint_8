import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    Account account;

    @Test
    @DisplayName("Позитиная проверка с корректным аккаунтом")
    @Description("Допустимый аккаунт. Один пробел в середине. Больше 3 и меньше 19 символов.")
    public void setAccountWithAllowedCharTest() {
        boolean expectedResult = true;
        account = new Account("Тимоти Шаламе");
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Негативная проверка - больше 19 символов")
    @Description("Недопустимый аккаунт. В строке больше 19 символов.")
    public void setAccountWithOverMaxCharTest() {
        boolean expectedResult = false;
        account = new Account("Александр Илларионов");
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Негативная проверка - меньше 3 символов")
    @Description("Недопустимый аккаунт. В строке меньше 3 символов.")
    public void setAccountWithOverMinCharTest() {
        boolean expectedResult = false;
        account = new Account("Ы");
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

    @Test // Недопустимый аккаунт. Больше двух пробелов в строке.
    @DisplayName("Негативная проверка - более 2х пробелов")
    @Description("Недопустимый аккаунт. Больше двух пробелов в строке.")
    public void setAccountWithMoreThanOneSpaseTest() {
        boolean expectedResult = false;
        account = new Account("Си Шун Хван");
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Негативная проверка - пробел в начале")
    @Description("Недопустимый аккаунт. Строка начинается с пробела.")
    public void setAccountWithStartSpaceTest() {
        boolean expectedResult = false;
        account = new Account(" Тимоти Шаламе");
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

    @Test //
    @DisplayName("Негативная проверка - пробело в конце")
    @Description("Недопустимый аккаунт. Строка заканчивается пробелом.")
    public void setAccountWithEndSpaceTest() {
        boolean expectedResult = false;
        account = new Account("Тимоти Шаламе ");
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }
}
