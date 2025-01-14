package com.euronet.main.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.euronet.main.domain.Catagory;

public class CatagoryRepository implements CatagoryRepositoryInterface {
	private Connection connection;
	private PreparedStatement preparedstatement;
	private ResultSet resultset;

	private static final String URL = "jdbc:mysql://localhost:3306/euronetdb";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

	private static final String INSERT_NEW_CATAGORY = "insert into catagory(catagory_name) values (?)";
	private static final String UPDATE_CATAGORY_BY_CATAGORYID = "update catagory set catagory_name=? where catagory_id =?";
	private static final String DELETE_CATAGORY_BY_CATAGORYID = "delete from catagory where catagory_id =?";
	private static final String SELETE_CATAGORY_BY_CATAGORYID = "select * from catagory where catagory_id=?";
	private static final String SELECT_ALL_CATAGORY = "select * from catagory";

	@Override
	public Catagory addNewCatagory(Catagory catagory) {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection
					.prepareStatement(INSERT_NEW_CATAGORY);
			preparedstatement.setString(1, catagory.getCatagoryname());
			int count = preparedstatement.executeUpdate();
			System.out.println("No.of rows incerted :" + count);
			return catagory;
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Something Went Wrong");
			System.err.println(e.getMessage());
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
	public Catagory updateCatagoryByCatagoryId(Catagory catagory) {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection
					.prepareStatement(UPDATE_CATAGORY_BY_CATAGORYID);
			preparedstatement.setString(1, catagory.getCatagoryname());
			preparedstatement.setInt(2, catagory.getCatagoryid());
			int count = preparedstatement.executeUpdate();
			System.out.println("Updated Rows :" + count);
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
	public Catagory getCatagoryByCatagoryId(int catagoryId) {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection
					.prepareStatement(SELETE_CATAGORY_BY_CATAGORYID);
			preparedstatement.setInt(1, catagoryId);
			resultset = preparedstatement.executeQuery();
			if (resultset.next()) {
				int catid = resultset.getInt("catagory_id");
				String catagoryname = resultset.getString("catagory_name");
				Catagory catagory = new Catagory(catid, catagoryname);
				return catagory;
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
	public boolean deleteCatagoryByCatagoryId(int catagoryId) {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection
					.prepareStatement(DELETE_CATAGORY_BY_CATAGORYID);
			preparedstatement.setInt(1, catagoryId);
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
	public List<Catagory> getAllCatagories() {
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			preparedstatement = connection
					.prepareStatement(SELECT_ALL_CATAGORY);
			resultset = preparedstatement.executeQuery();

			List<Catagory> allcatagories = new ArrayList<>();
			while (resultset.next()) {
				int catagoryid = resultset.getInt("catagory_id");
				String catagoryname = resultset.getString("catagory_name");
				Catagory catagory = new Catagory(catagoryid, catagoryname);
				allcatagories.add(catagory);
			}
			return allcatagories;

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
