import controller.AuthorController;
import controller.BookController;
import database.ConfigDB;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ConfigDB.openConnection();
        String option = "";
        do {
            option = JOptionPane.showInputDialog("""
                    WELCOME TO LIBRARY
                    1. Author
                    2. Book
                    3. salir
                    Choose an option: 
                    """);
            switch (option) {
                case "1":
                    String optionAuthor = JOptionPane.showInputDialog("""
                            MENU AUTHOR
                            1.Insert Author
                            2.Find Author
                            3.Update Author
                            4.Delete Author
                            5.Salir
                            """);
                    switch (optionAuthor) {
                        case "1":
                            AuthorController.insertAutor();
                            break;
                        case "2":
                            AuthorController.getAuthorId();
                            break;
                        case "3":
                            AuthorController.updateAuthor();
                            break;
                        case "4":
                            AuthorController.delete();
                    }
                    break;
                case "2":
                    String optionBook = JOptionPane.showInputDialog("""
                            MENU AUTHOR
                            1.Insert Book
                            2.Show Books
                            3.Search Book (Id, title, author)
                            4.Update Author
                            5.Delete Author
                            6.Salir
                            """);
                    switch (optionBook) {
                        case "1":
                            BookController.InsertBook();
                            break;
                        case "2":
                            BookController.showBookAll();
                            break;
                        case "3":
                            String searchBook = JOptionPane.showInputDialog("""
                                    SEARCH BOOK
                                    1.ID
                                    2.Title
                                    3.Author
                                    """);
                            switch (searchBook) {
                                case "1":
                                    BookController.getBookById();
                                    break;
                                case "2":
                                    BookController.getBookByTitle();
                                    break;
                                case "3":
                                    BookController.getBookByNameAuthor();
                                    break;
                            }
                        case "4":
                            BookController.update();
                            break;
                        case "5":
                            



                    }
            }
        } while (!option.equalsIgnoreCase("3")) ;

    }
}
