package framedb;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbconsole.MySQL;


public class DBFrameView extends Frame implements ActionListener,WindowListener{
	
	private Button button1 =new Button("DBConsole");
	//M/m/1用
	
	
	
	public DBFrameView(DBFrameController controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(button1);
		button1.addActionListener(this);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){
			int id, score;
			String name;
			ResultSet rs;
			MySQL mysql = new MySQL();
			rs = mysql.selectAll();
			try {while(rs.next()){
	                id = rs.getInt("id");
	                name = rs.getString("name");
	                score = rs.getInt("score");
	                System.out.println("ID：" + id);
	                System.out.println("名前：" + name);
	                System.out.println("得点：" + score);
			}
			} catch (SQLException k) {
	            // TODO Auto-generated catch block
	            k.printStackTrace();
	        }//try catchで囲む
			}
	}
}