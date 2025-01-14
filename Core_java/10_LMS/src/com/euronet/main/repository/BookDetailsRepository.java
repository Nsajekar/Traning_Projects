package com.euronet.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.euronet.main.domain.BookDetails;

public class BookDetailsRepository implements BookDetailsRepositoryInterface {
	private Connection connection;
	private PreparedStatement preparedstatement;
	private ResultSet resultset;

	private static final String URL = "jdbc:mysql://localhost:3306/Lmsdb";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	private static final String SELETE_BOOK_BY_BOOKID = "select * from book_details where book_id=?";

	@Override
	public BookDetails addNewBook(BookDetails bookdetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDetails updateBookByBookId(BookDetails bookdetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDetails getBookByBookId(int bookId) {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection
					.prepareStatement(SELETE_BOOK_BY_BOOKID);
			preparedstatement.setInt(1, bookId);
			resultset = preparedstatement.executeQuery();
			if (resultset.next()) {
				int bokid = resultset.getInt("book_id");
				String bookname = resultset.getString("book_name");
				String authername = resultset.getString("book_authers");
				String status = resultset.getString("book_status");
				BookDetails bookDetails = new BookDetails(bokid, bookname,
						authername, status);
				return bookDetails;
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Something Went Wrong");
			e.getMessage();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.err.println("Failed to close connection");
			}
		}
		return null;
	}

	@Override
	public boolean deleteBookByBookId(int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookDetails> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
