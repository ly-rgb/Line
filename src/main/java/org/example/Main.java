package org.example;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import static org.example.Init.*;

public class Main {// 函数入口，封装了业务层代码，Line账户注册的6个步骤写在这
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        app_init();
        submit_device_info();
        email_verify();
        submit_username();
        submit_password();
        update_line_account();
    }
}