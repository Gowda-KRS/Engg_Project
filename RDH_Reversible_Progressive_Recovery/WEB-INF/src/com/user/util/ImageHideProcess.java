package com.user.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageHideProcess
{
	public void stegnography(BufferedImage bimg,String msg,String filename)
    {

      int w=bimg.getWidth();
      int h=bimg.getHeight();
     //*************************************** 
     // String msg="Hide this message:)";
      System.out.println("message="+msg+" length="+msg.length());
    //*************************************** 

      if(msg.length()>255 )
      {
    	  System.out.println("MESSAGE IS LARGE THAN 255 CHARACTERS");            
      }
      else if( msg.length()*11 >w*h)
      {
    	  System.out.println("Image is too small");    
      }
      else{

  //-------------------------------------------
           byte[] msgbytes= msg.getBytes();

        int msglendecode= (bimg.getRGB(0,0)>>8)<<8;

         msglendecode |= msg.length();
        bimg.setRGB(0, 0,msglendecode );//hidig msg length at first position

         //System.out.println("\npixel at position (0,0)");
         // bitpattern(bimg.getRGB(0,0) );

         for(int i=1,msgpos=0,row=0,j=0;   row<h   ;row++  )
      {
          for(int col=0;col<w && j<msgbytes.length ;col++,i++ )
          {      

               if (i%11==0) {

                    int rgb = bimg.getRGB(col,row);


                    int a=((rgb >> 24) & 0xff);

                    int r = (((rgb >> 16) & 0xff)>>3)<<3;
                    r=r|(msgbytes[msgpos]>>5);

                    int g = (((rgb >> 8) & 0xff)>>3)<<3;
                    g=g|((msgbytes[msgpos]>>2)& 7);

                     int b = ((rgb & 0xff)>>2)<<2;
                    b=b|(msgbytes[msgpos]&0x3);


                    rgb=0;
                    rgb=(rgb|(a<<24));
                    rgb=(rgb|(r<<16));
                    rgb=(rgb|(g<<8));

                    rgb=(rgb|b);

                    bimg.setRGB(col,row,rgb);

                    msgpos++;
                    j++;

                  //bitpattern(bimg.getRGB(col,row));

              }


          }//for 2
      }//for 1

     try {

  //  File outputfile = new File("c:/Users/yathestha/Documents/"+filename);
     File outputfile = new File("outpng.png");
    ImageIO.write(bimg, "png", outputfile);
} catch (IOException e) {
         System.out.println("error in saving image ");
}

  //-------------------------------------------------
      }//else
 // decoding part----------------------------------------------------------------------   

    }
///////////////////////////////////////////////////////////////////////
public void decodestegnography(BufferedImage bimg) {

     System.out.println("in decode");

   int w=bimg.getWidth(),h=bimg.getHeight();
    
    int msglength=(bimg.getRGB(0, 0)&0xff);
   
    System.out.println("Message Length="+msglength);

    
      for(int row=0,j=0,i=1;   row<h   ;row++  )
  { 
      for(int col=0;col<w && j<msglength ;col++ ,i++)
      {

          if (i%11==0) {
             int result=bimg.getRGB(col,row);


              int charatpos = (((result >> 16) & 0x7) << 5);

              charatpos |=  (((result >> 8) & 0x7) << 2);

              charatpos |=  ((result & 0x3));
              
              char c=(char) charatpos;

              System.out.println(c);

             j++;
          }
      }
      
     
  } 

     System.out.println("decoding done");
}//function


}
