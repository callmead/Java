import tools.diit.*;


public class SplashScreen
{

	public SplashScreen()
	{
		//public JLake(int duration, String imageFile,int width,int height)
		JLake tv = new JLake(6000,"./Images/imran.jpg",423,255);
	}

public static void main(String[] args) {

    new SplashScreen();
    frmMainMenu frmMainMenu = new frmMainMenu();
    frmMainMenu.setVisible(true);
  }
}