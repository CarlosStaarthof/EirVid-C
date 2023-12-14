/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

//Carlos
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AddUser {    //add them
    public ArrayList<Users> users;

    public AddUser() {
        this.users = new ArrayList<>();
        LoadUsers.LoadUsersFromFile();
    }

    public void RegisterUser(String Username, String Password) {
        Users newUser = new Users(Username, Password);
        users.add(newUser);

        // Save users into the CSV file
        SaveUsersInFile();

        System.out.println("REGISTER SUCCESSFUL!"); //done
    }

    public ArrayList<Users> getUsers() {
        return users;
    }

    // Save users to txt file
    public void SaveUsersInFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.csv"))) {
            for (Users user : users) {
                // Format: "Username/email +Password"
                String userLine = user.getUsername() + "," + user.getPassword();
                writer.write(userLine);
                writer.newLine();
            }
        } catch (IOException e) {
        }
    }
}
