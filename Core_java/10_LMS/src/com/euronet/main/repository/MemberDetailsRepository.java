package com.euronet.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.euronet.main.domain.MemberDetails;

public class MemberDetailsRepository implements
		MemberDeatailsRepositoryInterface {
	private Connection connection;
	private PreparedStatement preparedstatement;
	private ResultSet resultset;

	private static final String URL = "jdbc:mysql://localhost:3306/Lmsdb";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	private static final String SELETE_MEMBER_BY_MEMBERID = "select * from member_details where menber_id=?";


	@Override
	public MemberDetails addNewMember(MemberDetails memberdetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDetails updateMemberByMemberId(MemberDetails memberdetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDetails getMemberByMemberId(int memberId) {
		try {
			Class.forName(DRIVER_NAME);
			
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		
			preparedstatement = connection
					.prepareStatement(SELETE_MEMBER_BY_MEMBERID);
			preparedstatement.setInt(1, memberId);
			resultset = preparedstatement.executeQuery();
			if (resultset.next()) {
				int membid = resultset.getInt("menber_id");
				String firstname = resultset.getString("member_firstname");
				String lastname = resultset.getString("member_lastname");
				String membertype = resultset.getString("member_type");
				MemberDetails memberDetails = new MemberDetails(membid, firstname,
						lastname, membertype);
				return memberDetails;
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
	public boolean deleteMemberByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MemberDetails> getAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

}
