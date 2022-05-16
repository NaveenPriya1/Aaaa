import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDao {
	
	int insert(Student s) throws ClassNotFoundException, SQLException {
		Connection con=Dbcon.getConn();
		String sql1="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql1);
		ps.setInt(1,s.getSid());
		ps.setString(2,s.getSname());
		ps.setString(3,s.getSemail());
		int row=ps.executeUpdate();
		return row;
	}
	
	
	public void retrive() throws ClassNotFoundException, SQLException {
		String sql2="select * from student";
		Connection con=Dbcon.getConn();
		PreparedStatement ps1=con.prepareStatement(sql2);
		ResultSet rs=ps1.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));
		}
	}
	
	
	public int update() throws ClassNotFoundException, SQLException {
		Connection con=Dbcon.getConn();
		String sql1="update student set sname=? where sid=?";
		Student s=new Student();
		PreparedStatement ps=con.prepareStatement(sql1);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details to be updated");
		System.out.println("enter the sid value");
		s.setSid(sc.nextInt());
		System.out.println("enter the sname value");
		s.setSname(sc.next());
		ps.setString(1,s.getSname());
		ps.setInt(2,s.getSid());
		int row=ps.executeUpdate();
		return row;	
	}

}
