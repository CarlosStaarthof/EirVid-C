/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveUsers {
    private static final String USERS_FILE = "users.csv";

    public static void SaveUsersInFile(List<Users> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE))) {
            for (Users user : users) {
                writer.write(String.format("%s=%s,%s",
                        Users.USERNAME_KEY, user.getUsername(),
                        Users.PASSWORD_KEY, user.getEncryptedPassword()));
                writer.newLine();
            }
        } catch (IOException e) {
        }
    }
}



