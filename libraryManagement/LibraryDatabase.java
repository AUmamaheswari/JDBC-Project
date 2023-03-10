package libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryDatabase {
	private static Scanner obj=new Scanner(System.in);

	void toAdd(Connection connection) throws SQLException {
		PreparedStatement pstmt=connection.prepareStatement("INSERT INTO LibraryBookDetailsvalues(?,?,?,?,,?,?)");
		System.out.println("Enter the BookId:");
		pstmt.setByte(1, obj.nextByte());
		System.out.println("Enter the BookName:");
		pstmt.setString(2, obj.nextLine());
		System.out.println("Enter the AuthorName:");
		pstmt.setString(3, obj.nextLine());

		System.out.println("Enter the Journal:");
		pstmt.setString(4, obj.nextLine());

		System.out.println("Enter the Edition:");
		pstmt.setByte(5, obj.nextByte());

		System.out.println("Enter the NoOfCopies:");
		pstmt.setByte(6, obj.nextByte());
		int resultSet=pstmt.executeUpdate();
		System.out.println(resultSet+ "Record Inserted");

	}

	void toDisplayAll(Connection connection) throws SQLException {

		Statement stmt=connection.createStatement();
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM LibraryBookDetails");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1) +"    "+ resultSet.getString(2) +"    "+resultSet.getString(3)+"    "+resultSet.getString(4)+"    "+resultSet.getInt(5)+"     "+resultSet.getInt(6));
		}
	}

	void toSearchByID(Connection connection) throws SQLException  {

		PreparedStatement pstmt=connection.prepareStatement("SELECT * FROM LibraryBookDetails WHERE BookId=?");
		System.out.println("Enter the BookId:");
		byte value=obj.nextByte();
		pstmt.setByte(1,value);
		ResultSet resultSet =pstmt.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1) +"    "+ resultSet.getString(2) +"    "+resultSet.getString(3)+"    "+resultSet.getString(4)+"    "+resultSet.getInt(5)+"     "+resultSet.getInt(6));
		}
	}

	void toDeleteByID(Connection connection) throws SQLException {

		PreparedStatement pstmt=connection.prepareStatement("DELETE FROM LibraryBookDetails WHERE BookId=?");
		System.out.println("Enter the BookId you want to delete: ");
		byte value=obj.nextByte();
		pstmt.setByte(1,value);
		byte resultSet=(byte) pstmt.executeUpdate();
		System.out.println(resultSet +" record is deleted");
	}

	void toUpdate(Connection connection) throws SQLException {
		PreparedStatement pstmt=connection.prepareStatement("UPDATE LibraryBookDetails set NoOfDetails=? WHERE BookId=?");
		System.out.println("Enter how many copies you want: ");
		pstmt.setByte(1,obj.nextByte());
		System.out.println("Enter the BookId you want to Update: ");
		pstmt.setByte(2,obj.nextByte());
		int resultSet=pstmt.executeUpdate();
		System.out.println(resultSet+"Record Updated");




	}
}

