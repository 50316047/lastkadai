package framedb;

public class DBFrameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBFrameController controller = new DBFrameController();
		DBFrameView frame =new DBFrameView(controller);
		frame.setBounds(5,5,655,455);
		frame.setVisible(true);
	}

}
