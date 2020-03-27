import java.awt.*;
public class FileWithFrame

{
	public static void main(String f[])
	{
		JFrame abc = new JFrame ("Data");

		JLabel lblN = new JLabel("Name :");
		JLabel lblA = new JLabel("Age :");
		JLabel lblT = new JLabel("Tel :");

		JTextField txtN = new JTextField(15);
		JTextField txtA = new JTextField(5);
		JTextField txtT = new JTextField(8);

		JButton btnNext = new JButton("Next");
		JButton btnExit = new JButton("Exit");




		abc.SetDefaultCloseOperaion(abc.EXIT_ON_CLOSE);
		abc.setSize(500,500);
		abc.show();