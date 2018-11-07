import java.awt.*;
import java.applet.*;

import javax.imageio.ImageIO;

/*
<applet code="Diwali" height="300" width="500">
		
	</applet>
*/

public class DiwaliApplet extends Applet{
	
	
	Image pic1,pic2;  
	  
	  public void init() {  
		  pic1 = getImage(getDocumentBase(), "images.png");
		  pic2 = getImage(getDocumentBase(), "d.jpg");
         
	  }
	
	
	public void paint(Graphics g)
	{	
		setBackground(Color.red);
		
		 g.drawImage(pic1, 30,30, this);
		 g.drawImage(pic2, 30,200, this);
		
		
	}
}
