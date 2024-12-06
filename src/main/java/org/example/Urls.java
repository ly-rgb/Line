package org.example;


public class Urls {
    public static final String INIT_URL = "https://cix.line-apps.com/R4";
    public static final String SUBMIT_DEVICE_INFO_URL = "https://jp-col-tcp.nelo.linecorp.com/_store";
    public static final String EMAIL_VERIFY_URL = "https://android.googleapis.com/auth";
    public static final String SUBMIT_USERNAME_URL = "https://legy.line-apps.com/acct/pais/v1";
    public static final String SUBMIT_PASSWORD_URL = "https://legy.line-apps.com/acct/pais/v1";
    public static final String UPDATE_LINE_ACCOUNT_URL = "https://legy.line-apps.com/acct/pais/v1";

    private Urls() {
        throw new UnsupportedOperationException("Cannot instantiate the Urls class");
    }
}