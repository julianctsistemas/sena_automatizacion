package com.co.sena.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class LoginComponent {

    public static final Target BTN_LOGIN = Target.the("click boton login")
            .locatedBy("//span[@class='dn-lg']");
}
