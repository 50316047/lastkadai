package dbconsole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {
	public static void main(String[] args) {
		int id, score;
		String name;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();
		try {while(rs.next()){
                id = rs.getInt("id");
                name = rs.getString("name");
                score = rs.getInt("score");
                System.out.println("ID�F" + id);
                System.out.println("���O�F" + name);
                System.out.println("���_�F" + score);
		}
		} catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }//try catch�ň͂�
	}
}
	
