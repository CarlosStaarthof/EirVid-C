/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

//Carlos

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadUsers {
    private static final String USERS_FILE = "users.csv"; 
    private static final List<Users> users = new ArrayList<>();

    public static void LoadUsersFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    users.add(new Users(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {            
        }
    }

    public static void LoadUsers() {
        LoadUsersFromFile();
    }

    public static List<Users> getLoadedUsers() {
        List<Users> loadedUsers = LoadUsers.getLoadedUsers();
for (Users user : loadedUsers) {
    System.out.println("Username: " + user.getUsername() + ", Password: " + user.getPassword());
    
}
        return users;

    }
}


