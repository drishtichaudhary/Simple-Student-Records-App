/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.sql.Date;

public class StudentDatabase {
    
    private void btnSubmitActionPerformed(ActionEvent evt) {
    String url = "jdbc:postgresql://localhost:5432/student_db";
    String user = "postgres";
    String password = "your_password";

    // Parse and get data from your Swing form fields:
    // (Replace these with your actual JTextField/JComboBox etc. variable names)
    // Getting values from GUI form (replace txtXYZ with your actual Swing components)
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        java.sql.Date dob = java.sql.Date.valueOf(txtDob.getText()); // format: YYYY-MM-DD
        String gender = txtGender.getText();
        String phone = txtPhone.getText();
        String student = txtStudent.getText();

        String subject1 = txtSub1.getText();
        int subject1_marks = Integer.parseInt(txtSub1M.getText());

        String subject2 = txtSub2.getText();
        int subject2_marks = Integer.parseInt(txtSub2M.getText());

        String subject3 = txtSub3.getText();
        int subject3_marks = Integer.parseInt(txtSub3M.getText());

    String sql = "INSERT INTO students (name, age, dob, gender, phone, student, subject1, subject1_marks, subject2, subject2_marks, subject3, subject3_marks) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setDate(3, dob);
            pstmt.setString(4, gender);
            pstmt.setString(5, phone);
            pstmt.setString(6, student);

            pstmt.setString(7, subject1);
            pstmt.setInt(8, subject1_marks);
            pstmt.setString(9, subject2);
            pstmt.setInt(10, subject2_marks);
            pstmt.setString(11, subject3);
            pstmt.setInt(12, subject3_marks);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Student record added successfully!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/student_db";
        String user = "postgres";
        String password = "your_password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");

            String sql = "SELECT * FROM students";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Roll: " + rs.getInt("roll") + 
                                   ", Name: " + rs.getString("name") + 
                                   ", Subject1: " + rs.getString("subject1") + 
                                   ", Marks1: " + rs.getInt("subject1_marks") + 
                                   ", Subject2: " + rs.getString("subject2") + 
                                   ", Marks2: " + rs.getInt("subject2_marks") + 
                                   ", Subject3: " + rs.getString("subject3") + 
                                   ", Marks3: " + rs.getInt("subject3_marks"));
            }

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
    
    // Declare them as class members
private javax.swing.JTextField txtName;
private javax.swing.JTextField txtAge;
private javax.swing.JTextField txtDob;
private javax.swing.JTextField txtGender;
private javax.swing.JTextField txtPhone;
private javax.swing.JTextField txtStudent;
private javax.swing.JTextField txtSub1;
private javax.swing.JTextField txtSub1M;
private javax.swing.JTextField txtSub2;
private javax.swing.JTextField txtSub2M;
private javax.swing.JTextField txtSub3;
private javax.swing.JTextField txtSub3M;

}

