package com.euronet.main.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.euronet.main.domain.BookDetails;
import com.euronet.main.domain.IssueDetails;
import com.euronet.main.domain.MemberDetails;

public class IssueDetailsRepository implements IssueDetailsRepositoryInterface {

	private Connection connection;
	private PreparedStatement preparedstatement;
	private ResultSet resultset;

	private static final String URL = "jdbc:mysql://localhost:3306/Lmsdb";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	private static final String INSERT_NEW_ISSUE = "insert into issue_details(issued_date,return_date,book_id,menber_id) values (?,?,?,?)";
	private static final String UPDATE_ISSUE_BY_ISSUEID = "update issue_details set issued_date =? ,return_date = ? ,book_id =?, menber_id = ?  where catagory_id =?";
	private static final String DELETE_ISSUE_BY_ISSUEID = "delete from issue_details where issue_id =?";
	private static final String SELETE_ISSUE_BY_ISSUEID = "select * from issue_details where issue_id=?";
	private static final String SELECT_ALL_ISSUES = "select * from issue_details";

	@Override
	public IssueDetails addNewIssue(IssueDetails issuedetails) {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection.prepareStatement(INSERT_NEW_ISSUE);
			// Passing issue LocalDate to Database
			LocalDate dateinlocal = issuedetails.getIssuedate();
			Date issuedate = Date.valueOf(dateinlocal);
			preparedstatement.setDate(1, issuedate);
			// Passing return LocalDate to Database
			LocalDate dateinlocal1 = issuedetails.getIssuedate();
			Date returndate = Date.valueOf(dateinlocal1);
			preparedstatement.setDate(2, returndate);
			// Passing BookId to Database
			preparedstatement.setInt(3, issuedetails.getBookDetails()
					.getBookid());
			// Passing MemberId to Database
			preparedstatement.setInt(4, issuedetails.getMemberDetails()
					.getMenberid());
			int count = preparedstatement.executeUpdate();
			System.out.println("No.of rows incerted :" + count);
			return issuedetails;
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
	public IssueDetails updateIssueByIssueId(IssueDetails issuedetails) {
		System.out.println("Not yet implemented");
		return null;
	}

	@Override
	public IssueDetails getIssueByIssueId(int issueid) {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection
					.prepareStatement(SELETE_ISSUE_BY_ISSUEID);
			preparedstatement.setInt(1, issueid);
			resultset = preparedstatement.executeQuery();
			if (resultset.next()) {
				// Get id
				int issid = resultset.getInt("issue_id");
				// get Book_Details
				BookDetails bookDetails = (BookDetails) resultset
						.getObject("book_id");
				// Get Member_Details
				MemberDetails memberDetails = (MemberDetails) resultset
						.getObject("menber_id");
				// Get Issue_Date
				Date sqlissuedate = Date.valueOf("issued_date");
				LocalDate issuedate = sqlissuedate.toLocalDate();
				// Get Return_Date
				Date sqlreturndate = Date.valueOf("return_date");
				LocalDate returndate = sqlreturndate.toLocalDate();
				// Getting Issue_Details Object
				IssueDetails issuedetails = new IssueDetails(issid,
						bookDetails, memberDetails, issuedate, returndate);
				return issuedetails;
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
	public boolean deleteIssueByIssueId(int issueid) {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection
					.prepareStatement(DELETE_ISSUE_BY_ISSUEID);
			preparedstatement.setInt(1, issueid);
			int count = preparedstatement.executeUpdate();
			if (count > 0) {
				return true;
			} else {
				return false;
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
		return false;
	}

	@Override
	public List<IssueDetails> getAllIssues() {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection.prepareStatement(SELECT_ALL_ISSUES);
			resultset = preparedstatement.executeQuery();
			List<IssueDetails> allissues = new ArrayList<>();

			while (resultset.next()) {
				// Get id
				int issid = resultset.getInt("issue_id");
				// get Book_Details
				BookDetails bookDetails = (BookDetails) resultset
						.getObject("book_id");
				// Get Member_Details
				MemberDetails memberDetails = (MemberDetails) resultset
						.getObject("menber_id");
				// Get Issue_Date
				Date sqlissuedate = Date.valueOf("issued_date");
				LocalDate issuedate = sqlissuedate.toLocalDate();
				// Get Return_Date
				Date sqlreturndate = Date.valueOf("return_date");
				LocalDate returndate = sqlreturndate.toLocalDate();
				// Getting Issue_Details Object
				IssueDetails issuedetails = new IssueDetails(issid,
						bookDetails, memberDetails, issuedate, returndate);
				allissues.add(issuedetails);
			}
			return allissues;
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
}
