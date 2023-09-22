package com.co.sena.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_NAME = Target.the("Click en campo nombre")
            .locatedBy("//input[@id='login_username']");

    public static final Target TXT_PASSWORD = Target.the("Click en el campo contraseña")
            .locatedBy("//input[@id='login_password']");

    public static final Target BTN_LOGIN = Target.the("Click boton login")
            .locatedBy("//button[@type='submit']");
}
