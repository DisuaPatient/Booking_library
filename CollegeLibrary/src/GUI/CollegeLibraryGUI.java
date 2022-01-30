package GUI;

import Exceptions.DissertationBorrowedException;
import LibraryItemClasses.Book;
import LibraryItemClasses.Dissertation;
import LibraryItemClasses.LibraryItem;
import UserClasses.Librarian;
import UserClasses.Student;
import UserClasses.User;
import java.awt.event.KeyEvent;
import java.util.ConcurrentModificationException;
import javax.swing.JOptionPane;

public class CollegeLibraryGUI extends javax.swing.JFrame {

    Librarian master = new Librarian(1, "Joe", "Bloggs", 1, 2021);//This is an object created for the master librarian

    Student newStudent;//Variable created for new students to be added
    Librarian newLibrarian;//Variable created for new librarians to be added

    Book book;//Variable created for new books to be added
    Dissertation dissertation;//Variable created for new dissertations to be added

    public CollegeLibraryGUI() {
        initComponents();
        User.users.add(master);//Adds the master librarian to the users ArrayList
        makeButtonsInvisible();//Calls this method initially to make the buttons invisible on the login screen
    }

    private void makeButtonsInvisible() {//Method created to make all the buttons invisible
        addBookBtn.setVisible(false);
        addDissertationBtn.setVisible(false);
        checkoutItemBtn.setVisible(false);
        logoutBtn.setVisible(false);
        registerLibrarianBtn.setVisible(false);
        registerStudentBtn.setVisible(false);
        returnItemBtn.setVisible(false);
    }//End of method makeButtonsInvisible()

    private void makeButtonsVisibleForLibrarian() {//Method created to make the buttons visible only to a librarian
        addBookBtn.setVisible(true);
        addDissertationBtn.setVisible(true);
        logoutBtn.setVisible(true);
        registerLibrarianBtn.setVisible(true);
        registerStudentBtn.setVisible(true);
    }//End of method makeButtonsVisibleForLibrarian()

    private void makeButtonsVisibleForStudent() {//Method created to make the buttons visible only to a student
        checkoutItemBtn.setVisible(true);
        returnItemBtn.setVisible(true);
        logoutBtn.setVisible(true);
    }//End of method makeButtonsVisibleForStudent()

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idInputLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        addDissertationBtn = new javax.swing.JButton();
        addBookBtn = new javax.swing.JButton();
        registerStudentBtn = new javax.swing.JButton();
        registerLibrarianBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        checkoutItemBtn = new javax.swing.JButton();
        returnItemBtn = new javax.swing.JButton();
        userDetailLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("College Library");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        idInputLabel.setText("Enter Id: ");

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        idTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idTextFieldKeyPressed(evt);
            }
        });

        addDissertationBtn.setText("Add Dissertation");
        addDissertationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDissertationBtnActionPerformed(evt);
            }
        });

        addBookBtn.setText("Add Book");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        registerStudentBtn.setText("Register Student");
        registerStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStudentBtnActionPerformed(evt);
            }
        });

        registerLibrarianBtn.setText("Register Librarian");
        registerLibrarianBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerLibrarianBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Sign Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        checkoutItemBtn.setText("Checkout Item");
        checkoutItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutItemBtnActionPerformed(evt);
            }
        });

        returnItemBtn.setText("Return Item");
        returnItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnItemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userDetailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idInputLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addDissertationBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addBookBtn))
                            .addComponent(logoutBtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkoutItemBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registerStudentBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerLibrarianBtn)
                                    .addComponent(returnItemBtn))))
                        .addGap(0, 418, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInputLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userDetailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDissertationBtn)
                    .addComponent(addBookBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerStudentBtn)
                    .addComponent(registerLibrarianBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutItemBtn)
                    .addComponent(returnItemBtn))
                .addGap(23, 23, 23)
                .addComponent(logoutBtn)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyPressed
        try {
            int id = Integer.parseInt(idTextField.getText());//variable created to get the user id in the textfield
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {//if the enter button on the keyboard is pressed
                for (User u : User.users) {//Loops through all the users stored in the users ArrayList
                    if (u.getUserId() == id && u instanceof Librarian) {//if the user id entered in the textfield exists in the users ArrayList AND is a librarian
                        makeButtonsVisibleForLibrarian();//Calls this method to make the librarian buttons visible
                        idTextField.setEnabled(false);//Disables the user id textfield when logged in
                        userDetailLbl.setText(u.toString());//Prints out the details of the logged in user onto the GUI
                    } else if (u.getUserId() == id && u instanceof Student) {//else if the user id entered in the textfield exists in the users ArrayList AND is a student
                        makeButtonsVisibleForStudent();//Calls this method to make the student buttons visible
                        idTextField.setEnabled(false);//Disables the user id textfield when logged in
                        userDetailLbl.setText(u.toString());//Prints out the details of the logged in user onto the GUI
                    }
                }//End of for-each loop
            }//End of if the keyboard enter button is pressed
        } catch (NumberFormatException ex) {//Catches all possible exceptions that could occur

        }
    }//GEN-LAST:event_idTextFieldKeyPressed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        makeButtonsInvisible();//Calls this method to make all the buttons invisible when a user logs out
        idTextField.setText("");//Clears the user id textfield after being logged out
        idTextField.setEnabled(true);//Enables the user id textfield after being logged out
        userDetailLbl.setText("");//Clears the user details
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void registerStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStudentBtnActionPerformed
        try {
            int idUser = Integer.parseInt(JOptionPane.showInputDialog("Please assign ID to this new student"));//Prompts the user to assign an ID to the new student
            String fName = JOptionPane.showInputDialog("Enter first name of new student");//Prompts the user to input the new student's first name
            String lName = JOptionPane.showInputDialog("Enter last name of new student");//Prompts the user to input the new student's last name
            int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year of enrolment"));//Prompts the user to input the new student's enrolment year
            int librarianID = Integer.parseInt(idTextField.getText());//This variable gets the user id that's already displaying in the user textfield

            for (User u : User.users) {//Loops through the entire users ArrayList
                if (u.getUserId() == idUser) {//if the id assigned to the new student ALREADY exists in the users ArrayList
                    JOptionPane.showMessageDialog(rootPane, " This ID is already taken by another user ", "", JOptionPane.WARNING_MESSAGE);//Outputs this warning message
                    return;//Do Nothing more
                }

            }//End of for-each loop

            newStudent = new Student(idUser, fName, lName, librarianID, year, false);//Creates an object for the new student
            User.users.add(newStudent);//Adds the new student to the users ArrayList
            JOptionPane.showMessageDialog(rootPane, " New student successfully added ", "Success", JOptionPane.INFORMATION_MESSAGE);//Outputs this message indicating that a new student has been created and added to the system
        } catch (NumberFormatException ex) {//Catches all possible exceptions that could occur
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerStudentBtnActionPerformed

    private void registerLibrarianBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerLibrarianBtnActionPerformed
        try {
            int idUser = Integer.parseInt(JOptionPane.showInputDialog("Please assign ID to this new librarian"));//Prompts the user to assign an ID to the new librarian
            String fName = JOptionPane.showInputDialog("Enter first name of new librarian");//Prompts the user to input the new librarian's first name
            String lName = JOptionPane.showInputDialog("Enter last name of new librarian");//Prompts the user to input the new librarian's last name
            int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year of employment"));//Prompts the user to input the new librarian's employment year
            int librarianID = Integer.parseInt(idTextField.getText());//This variable gets the user id that's already displaying in the user textfield

            for (User u : User.users) {//Loops through the entire users ArrayList
                if (u.getUserId() == idUser) {//if the id assigned to the new librarian ALREADY exists in the users ArrayList
                    JOptionPane.showMessageDialog(rootPane, " This ID is already taken by another user ", "", JOptionPane.WARNING_MESSAGE);//Outputs this warning message
                    return;//Do Nothing more
                }

            }//End of for-each loop

            newLibrarian = new Librarian(idUser, fName, lName, librarianID, year);//Creates an object for the new librarian
            User.users.add(newLibrarian);//Adds the new librarian to the users ArrayList
            JOptionPane.showMessageDialog(rootPane, " New librarian successfully added ", "Success", JOptionPane.INFORMATION_MESSAGE);//Outputs this message indicating that a new librarian has been created and added to the system
        } catch (NumberFormatException ex) {//Catches all possible exceptions that could occur
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_registerLibrarianBtnActionPerformed

    private void addDissertationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDissertationBtnActionPerformed
        try {
            int itemID = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to assign to this new dissertation"));//Prompts the user to assign an ID to the new dissertation
            String author = JOptionPane.showInputDialog("Enter author name");//Prompts the user to input the author's name of the new dissertation
            int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year of new dissertation"));//Prompts the user to input the year of the new dissertation
            String title = JOptionPane.showInputDialog("Enter title");//Prompts the user to input the title of the new dissertation
            int addedBy = Integer.parseInt(idTextField.getText());//This variable gets the user id that's already displaying in the user textfield
            String course = JOptionPane.showInputDialog("Enter course");//Prompts the user to input the course of the new dissertation

            for (LibraryItem item : LibraryItem.items) {//Loops through the entire items ArrayList
                if (item.getItemId() == itemID) {//if the ID assigned to the new dissertation ALREADY exists in the items ArrayList
                    JOptionPane.showMessageDialog(rootPane, " This ID is already given to an item ", "", JOptionPane.WARNING_MESSAGE);//Outputs this warning message
                    return;//Do Nothing More
                }
            }//End of for-each loop

            dissertation = new Dissertation(itemID, author, year, title, addedBy, null, course);//Creates an object for the new dissertation
            LibraryItem.items.add(dissertation);//Adds the new dissertation to the items ArrayList
            JOptionPane.showMessageDialog(rootPane, " New dissertation added to the library ", "Success", JOptionPane.INFORMATION_MESSAGE);//Outputs this message indicating that a new dissertation has been created and added to the system
        } catch (NumberFormatException ex) {//Catches all possible exceptions that could occur
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addDissertationBtnActionPerformed

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        try {
            int itemID = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to assign to this new book"));//Prompts the user to assign an ID to the new book
            String author = JOptionPane.showInputDialog("Enter author name");//Prompts the user to input the author's name of the new book
            int year = Integer.parseInt(JOptionPane.showInputDialog("Enter year of new book"));//Prompts the user to input the year of the new book
            String title = JOptionPane.showInputDialog("Enter title");//Prompts the user to input the title of the new book
            int addedBy = Integer.parseInt(idTextField.getText());//This variable gets the user id that's already displaying in the user textfield
            String publisher = JOptionPane.showInputDialog("Enter publisher");//Prompts the user to input the publisher of the new book

            for (LibraryItem item : LibraryItem.items) {//Loops through the entire items ArrayList
                if (item.getItemId() == itemID) {//if the ID assigned to the new book ALREADY exists in the items ArrayList
                    JOptionPane.showMessageDialog(rootPane, " This ID is already given to an item ", "", JOptionPane.WARNING_MESSAGE);//Outputs this warning message
                    return;//Do Nothing More
                }
            }

            book = new Book(itemID, author, year, title, addedBy, null, publisher);//Creates an object for the new book
            LibraryItem.items.add(book);//Adds the new book to the items ArrayList
            JOptionPane.showMessageDialog(rootPane, " New book added to the library ", "Success", JOptionPane.INFORMATION_MESSAGE);//Outputs this message indicating that a new book has been created and added to the system
        } catch (NumberFormatException ex) {//Catches all possible exceptions that could occur
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void checkoutItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutItemBtnActionPerformed
        try {
            String output = "";//Reserve String variable created
            int loggedInUser = Integer.parseInt(idTextField.getText());//This variable gets the logged in user id from the textfield
            for (LibraryItem item : LibraryItem.items) {//Loops through the entire items ArrayList
                if (item instanceof Book) {//If the item is a Book
                    output += "\n \nBook: " + item;//Stores all the books in this variable
                }
                if (item instanceof Dissertation) {//If the item is a dissertation
                    output += "\n \nDissertation: " + item;//Stores all the dissertations in this variable
                }
            }//End of for-each loop

            int itemID = Integer.parseInt(JOptionPane.showInputDialog(" Available Items " + "\n" + output));//Displays an input dialog box to the user, displaying ALL the available books/dissertations, and prompts the user to enter an ID of the book/dissertation to borrow

            for (LibraryItem item : LibraryItem.items) {//Loops through the entire items ArrayList
                for (User user : User.users) {//Loops through the entire users ArrayList
                    if ((item.getItemId() == itemID && item instanceof Dissertation) && (user.getUserId() == loggedInUser && user instanceof Student)) {//If the item id inputted exists in the items ArrayList AND is a dissertation AND the user exists AND is a student
                        dissertation.checkoutItem((Student) user);//Checks out the dissertation to the logged in student
                        item.setAssignedStudent((Student) user);//Sets the assigned student to the borrowed dissertation
                        LibraryItem.items.remove(item);//removes the borrowed library item from the items ArrayList
                        LibraryItem.borrowedItems.add(item);//adds the borrowed library item to the borrowed ArrayList
                        userDetailLbl.setText(user.toString());
                    } else if ((item.getItemId() == itemID && item instanceof Book) && (user.getUserId() == loggedInUser && user instanceof Student)) {//Else if the item id inputted exists in the items ArrayList AND is a book AND the user exists AND is a student
                        book.checkoutItem((Student) user);//Checks out the book to the logged in student
                        item.setAssignedStudent((Student) user);//Sets the assigned student to the borrowed book
                        LibraryItem.items.remove(item);//removes the borrowed library item from the items ArrayList
                        LibraryItem.borrowedItems.add(item);//adds the borrowed library item to the borrowed ArrayList
                    }
                }//End of users for-each loop
            }//End of items for-each loop 

        } catch (NumberFormatException | ConcurrentModificationException ex) {//Catches all possible exceptions that could occur

        } catch (DissertationBorrowedException dbex) {//Catches this exception in the event that a student is trying to borrow more than 1 dissertation
            JOptionPane.showMessageDialog(rootPane, dbex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkoutItemBtnActionPerformed

    private void returnItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnItemBtnActionPerformed
        try {
            String output = "";//Reserve String variable created
            int loggedInUser = Integer.parseInt(idTextField.getText());//This variable gets the logged in user id from the textfield
            for (LibraryItem item : LibraryItem.borrowedItems) {//Loops through the entire borrowed items ArrayList
                for (User user : User.users) {//Loops through the entire users ArrayList
                    if (item instanceof Book && (user.getUserId() == loggedInUser && item.getAssignedStudent().equals((Student) user))) {//If the item is a Book and the user id is a logged in user and if the logged in user has borrowed the item(s)
                        output += "\n \nBook: " + item;//Stores all the books in this variable
                    }
                    if (item instanceof Dissertation && (user.getUserId() == loggedInUser && item.getAssignedStudent().equals((Student) user))) {//If the item is a Dissertation and the user id is a logged in user and if the logged in user has borrowed the item(s)
                        output += "\n \nDissertation: " + item;//Stores all the dissertations in this variable
                    }
                }//End of users for-each loop
            }//End of borrowed items for-each loop

            int itemID = Integer.parseInt(JOptionPane.showInputDialog(" Your Checked Out Items " + "\n" + output));//Displays the items the user has borrowed and prompts the user to input an ID of the borrowed item to return

            for (LibraryItem item : LibraryItem.borrowedItems) {//Loops through the entire borrowed items ArrayList
                for (User user : User.users) {//Loops through the entire users ArrayList
                    if ((item.getItemId() == itemID && item instanceof Dissertation && item.getAssignedStudent().equals(user)) && (user.getUserId() == loggedInUser)) {//If the item id inputted exists in the borrowed items ArrayList AND is a dissertation AND the user exists AND is a student
                        dissertation.returnItem((Student) user);//returns the dissertation back to the library system
                        item.setAssignedStudent(null);//Sets the assigned student of the returned dissertation to null
                        LibraryItem.borrowedItems.remove(item);//removes the returned library item from the borrowed ArrayList
                        LibraryItem.items.add(item);//adds the returned library item to the items ArrayList
                        userDetailLbl.setText(user.toString());
                    } else if ((item.getItemId() == itemID && item instanceof Book && item.getAssignedStudent().equals(user)) && (user.getUserId() == loggedInUser)) {//Else if the item id inputted exists in the borrowed items ArrayList AND is a book AND the user exists AND is a student
                        book.returnItem((Student) user);//returns the book back to the library system
                        item.setAssignedStudent(null);//Sets the assigned student of the returned book to null
                        LibraryItem.borrowedItems.remove(item);//removes the returned library item from the borrowed ArrayList
                        LibraryItem.items.add(item);//adds the returned library item to the items ArrayList
                    }
                }//End of users for-each loop
            }//End of borrowed items for-each loop
        } catch (NumberFormatException | ConcurrentModificationException | NullPointerException ex) {//Catches all possible exceptions that could occur

        }
    }//GEN-LAST:event_returnItemBtnActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CollegeLibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollegeLibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollegeLibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollegeLibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollegeLibraryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookBtn;
    private javax.swing.JButton addDissertationBtn;
    private javax.swing.JButton checkoutItemBtn;
    private javax.swing.JLabel idInputLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton registerLibrarianBtn;
    private javax.swing.JButton registerStudentBtn;
    private javax.swing.JButton returnItemBtn;
    private javax.swing.JLabel userDetailLbl;
    // End of variables declaration//GEN-END:variables
}
