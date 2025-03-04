package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void initialAccountHasBalancethatmakessense() {
        Account account = new Account();
        //account.deposit(10);
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void deposit_money() {
        Account account = new Account();
        assertThat(account.deposit(10)).isEqualTo(10);
    }

}
