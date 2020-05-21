package accounts;

import base.BaseTests;
import models.Account;
import org.junit.jupiter.api.Test;
import utils.APIUtil;
import utils.Customers;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTests extends BaseTests {

    private String username = "john", password = "demo";

    @Test
    public void accountsListed() {

        //Demonstrates `var` (Java 10)
        var accountsOverviewPage = page.login(username, password);
        var actualAccountIdsList = accountsOverviewPage.getAccounts();
        String customerId = Customers.getCustomerId(username);
        
        var expectedAccountIdsList =
                APIUtil.getAccounts(customerId)
                        .stream()
                        .map(Account::id)
                        .map(String::valueOf)
                        .collect(Collectors.toList());

        assertEquals(expectedAccountIdsList, actualAccountIdsList);
    }
}