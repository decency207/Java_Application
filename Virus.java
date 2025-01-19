import java.swing.*;
import java.awt.*;

public class Virus{
   public static void main (String[] args){
      JOptionPane pane = new JOptionPane("Catch me if yiu can");
	  boolean activate = true;
      JDialog ui= null;
      while (true){
          if (activate){
            ui = pane.createDialog(null, "");
            ui.setModal(false);
            ui.setVisible(true);
            activate = false;
		  }
        else if(ui instanceof JDialoge ){
          PointerInfo mouse = MouseInfo.getPointerInfo();
          Point mLoc = mouse.getLocation();
          Point uilcn = ui.getLocation();
          if (mLoc.x >= uilcn.x && mloc.x <= uilcn.x+300  ){
	        if(mLoc.y >= uilcn.y && mloc.y <= uilcn.y+160 ){
		       if(uilcn.x == 850) {
			      ui.setLocation(544, 296);
		     }else {
			     ui.setLocation(850, 296);
			 }
			}
		  }
		}
	  }
}
	  
  

