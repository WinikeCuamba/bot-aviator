package infra.controlers;

import app.usesCases.AutomatorLogin;
import domain.User;


public class LoginControler {
    private final User user;
    private final AutomatorLogin automatorLogin;

    public LoginControler(User user, AutomatorLogin automatorLogin) {
        // new User("winike", "872204494", "PROplayer2023");
        this.user = user;
        this.automatorLogin = automatorLogin;
    }

    public void Login() {
        this.automatorLogin.login();
    }
}
