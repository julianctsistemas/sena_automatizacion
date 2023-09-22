package com.co.sena.tasks;

import com.co.sena.models.LoginCredential;
import com.co.sena.userinterfaces.LoginComponent;
import com.co.sena.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {
    LoginCredential loginCredential;

    public LoginTask(LoginCredential loginCredential) {
        this.loginCredential = loginCredential;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginComponent.BTN_LOGIN),
                Enter.theValue(loginCredential.getEmail()).into(LoginPage.TXT_NAME),
                Enter.theValue(loginCredential.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static LoginTask enterCredential(LoginCredential loginCredential)
    {
        return Tasks.instrumented(LoginTask.class, loginCredential);
    }
}
