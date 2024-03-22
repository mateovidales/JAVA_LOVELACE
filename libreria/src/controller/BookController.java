package controller;

import entities.Book;
import model.BookModel;

import javax.swing.*;

public class BookController {

    public static void InsertBook() {

        BookModel objBookModel = new BookModel();
        String title = JOptionPane.showInputDialog("Insert title: ");
        String year_publication = JOptionPane.showInputDialog("Insert year of publication");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Insert price of the book"));
        int idAuthor = Integer.parseInt(JOptionPane.showInputDialog("Insert ID of the author"));
        Book objBook = new Book();
        objBook.setTitle(title);
        objBook.setYear_publication(year_publication);
        objBook.setPrice(price);
        objBook.setFk_id_autor(idAuthor);

        objBook = (Book) objBookModel.insert(objBook);

        JOptionPane.showMessageDialog(null, objBook.toString());
    }
    public static String showBookAll(){
        BookModel objBookModel = new BookModel();
        String listBooks = "Book List \n";
        for (Object i: objBookModel.findAll()){
            Book objBook = (Book) i;
            listBooks += objBook.toString();
        }
        JOptionPane.showMessageDialog(null, listBooks);
        return listBooks;
    }
    public static void getBookById(){
        BookModel objBookModel = new BookModel();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Insert ID of the book"));
        Book objBook = objBookModel.findById(id);
        JOptionPane.showMessageDialog(null, objBook.toString());

    }
    public static void getBookByTitle(){
        BookModel objBookModel = new BookModel();
        String listBooks = "Books List \n";
        String title = JOptionPane.showInputDialog("Insert title of the book");
        for (Object i: objBookModel.findByName(title)){

            Book objBook = (Book) i;

            listBooks += objBook.toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,listBooks);
    }
    public static void getBookByNameAuthor(){
        BookModel objBookModel = new BookModel();
        String listBooks = "Books List \n";
        String name = JOptionPane.showInputDialog("Insert name of the author");
        for (Object i: objBookModel.findByAuthor(name)){

            Book objBook = (Book) i;

            listBooks += objBook.toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,listBooks);
    }
    public static void update(){
        BookModel objBookModel = new BookModel();
        String listBooks = showBookAll();
        int idBookUpdate = Integer.parseInt(JOptionPane.showInputDialog(listBooks+"\n Enter id the book to edit: "));
        Book objBook = objBookModel.findById(idBookUpdate);
        if (objBook == null){
            JOptionPane.showMessageDialog(null, "Book not found");
        }else {
            String title = JOptionPane.showInputDialog(null, "Enter new title: ",objBook.getTitle());
            String year_publication = JOptionPane.showInputDialog(null, "Enter new year of publication: ",objBook.getYear_publication());
            double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter new price: ",objBook.getPrice()));
            int fk_id_autor = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter new id author: "),objBook.getFk_id_autor());
            objBook.setTitle(title);
            objBook.setYear_publication(year_publication);
            objBook.setPrice(price);
            objBook.setFk_id_autor(fk_id_autor);
            objBookModel.update(objBook);
        }

    }


}
