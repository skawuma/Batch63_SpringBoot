package com.cogent.boot.controller;
import java.time.DateTimeException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cogent.boot.pojo.Book;
import com.cogent.boot.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	Scanner scanner = new Scanner(System.in);
	public void manageBook() {
		
		
	
		
		boolean continuethisloop =true;
		int option ;
		char answer = 'Y';
		Scanner keyboard = new Scanner(System.in);
		
		while(continuethisloop) {
			Book book= new Book();
			
			try {
				
				System.out.println("PLEASE  REFER to  MENU AND  SELECT ONE OF THE OPTIONS  ");
				System.out.println("*****************************");

				System.out.println("MENU");

				System.out.println("*****************************");

				System.out.println("1 . INSERT BOOK");
				System.out.println("2 . GET ALL BOOKS");
				System.out.println("3 . DELETE BOOK BY ID");
				System.out.println("4 . FIND BOOK BY ID");
				System.out.println("5 . UPDATE BOOK BY CATEGORY");
				System.out.println("9 . EXIT");
				 
				option = scanner.nextInt();
				
				switch(option) {
				
				case 1:
					answer= 'y';
					while (Character.toUpperCase(answer)=='Y') {
						
						System.out.println("Please  enter  The Book Title");
					    book.setTitle(scanner.next());
					    
					    System.out.println(" Please Enter The Book Author");
					    book.setAuthor(scanner.next());
					    
						System.out.println("Please enter the book Price");
						book.setPrice(scanner.nextDouble());
						bookService.addBook(book);
						System.out.println("Book Succesfully Added!");
						
						System.out.print("\n Do you want to Add more Products(y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');	
					}
				break;
				case 2:
					answer= 'y';
					while(Character.toUpperCase(answer)=='Y')
					{
						List<Book> books=bookService.getAllBooks();
						System.out.println(books);
						
						System.out.print("\nPress Any Key to Return Back to the Menu?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');
						
					}
                   break;
				
				case 3:
					answer= 'y';
					while (Character.toUpperCase(answer)=='Y') {
						
						System.out.println("Please  enter  The Book Id You want to delete");
					    Long b1 = scanner.nextLong();
					    bookService.deleteBookById(b1);
					    System.out.println("Book Succesfully Deleted!");
						
						System.out.print("\n Do you want to Add more Products(y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');	
					}
				break;	
				
				case 4:
					answer= 'y';
					while (Character.toUpperCase(answer)=='Y') {
						
						System.out.println("Please  enter  The Book Id You want to FIND");
					    Long b2 = scanner.nextLong();
					    bookService.getBookById(b2);
					    System.out.println("Book Succesfully Deleted!");
						
						System.out.print("\n Do you want to FIND  more BOOKS(y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');	
					}
				break;
				case 5:
					answer= 'y';
					while (Character.toUpperCase(answer)=='Y') {
						
						System.out.println( "Please Enter the Book id of the BOOK you want to UPDATE ");
						Long x1 = scanner.nextLong();
					 
					    System.out.println(" Please Enter The Updated Price of the bookr");
					     book.setPrice(scanner.nextDouble());
					     
					    
						bookService.updateBookById(x1,book);
						System.out.println("Book Succesfully Updated!");
						
						System.out.print("\n Do you want to Update more Books(y or n)?");
						answer = keyboard.next().charAt(0);

						if(answer=='Y');	
					}
				break;
				case 9:
					System.out.println("PROGRAM EXITED!!");
					System.exit(0);
				}	
				
			}
			
			catch (InputMismatchException | IllegalArgumentException e) {
					//e.printStackTrace();
					System.out.println("Oops that was an invalid input!!! TRY AGAIN");

					scanner.next();
				}	catch (DateTimeException e) {
					//e.printStackTrace();
					System.out.println("Oops that was an invalid input!!! TRY AGAIN");

					scanner.next();
				}
		
		}
		
	}
	
}
