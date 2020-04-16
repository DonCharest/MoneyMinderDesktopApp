/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bu.dcharest;

import javax.swing.JOptionPane;

/**
 *
 * @author Don Charest
 */
public class DialogMessages {

    protected void messageEmptyTable() {
        JOptionPane.showMessageDialog(null, "The Table is Empty!",
                "Status Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void messageSelectLine() {
        JOptionPane.showMessageDialog(null, "You must Select a Line Item!",
                "Error Message", JOptionPane.ERROR_MESSAGE);
    }

    protected void messageFieldsIncomplete() {
        JOptionPane.showMessageDialog(null, "All Fields Must Be Completed!",
                "Error Message", JOptionPane.ERROR_MESSAGE);
    }

    protected void messageNumberFormat() {
        JOptionPane.showMessageDialog(null, "Amount field must be a valid dollar amount! "
                + "\n i.e. => 399.99 "
                + "\n Do not include \"$\" or commas",
                "Error Message", JOptionPane.ERROR_MESSAGE);
    }

    protected void messagePasswordError() {
        JOptionPane.showMessageDialog(null, "Password fields do not match!",
                "Error Message", JOptionPane.ERROR_MESSAGE);
    }

    protected void messageReminderCreated() {
        JOptionPane.showMessageDialog(null, "Reminder created!",
                "Status Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void messageAccountCreated() {
        JOptionPane.showMessageDialog(null, "Account created!",
                "Status Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void messageReminderEdited() {
        JOptionPane.showMessageDialog(null, "Reminder Edited!",
                "Status Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void messageReminderDeleted() {
        JOptionPane.showMessageDialog(null, "Reminder Deleted!",
                "Status Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void messageUserLoggedOut() {
        JOptionPane.showMessageDialog(null, "You Are Logged Out",
                "Status Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void messageUserNotLoggedIn() {
        JOptionPane.showMessageDialog(null, "User Not Logged In",
                "Status Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void messageMustLogOut() {
        JOptionPane.showMessageDialog(null, "You must log out first",
                "Status Message", JOptionPane.ERROR_MESSAGE);
    }

    protected void messageUserPassInvalid() {
        JOptionPane.showMessageDialog(null, "Username or Paswword Invalid",
                "Error Message", JOptionPane.ERROR_MESSAGE);
    }

}
