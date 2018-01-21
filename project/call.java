import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.*;

class call extends JFrame
  { 
	 call()throws IOException
	
		{
			
		  setTitle("******* Welcome to Mobile Information System *******");

         BufferedImage image1 =ImageIO.read(new File("img1.jpg"));
         
       login ip = new login(image1);
       add(ip);
       
        setSize(600,450);
        setBackground(Color.orange);
        show();
		  
	  }
  public static void main(String[] args) throws IOException
    {
    	new call();
    }
  }
