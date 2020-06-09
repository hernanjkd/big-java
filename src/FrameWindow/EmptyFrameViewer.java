package FrameWindow;

import javax.swing.JFrame;
        
public class EmptyFrameViewer 
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame();
    
        frame.setSize(300,400);  //otherwise the frame will be 0 by 0
    
        frame.setTitle("An Empty Frame");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**
         * When the user exits the frame, the program automatically exits.
         * Otherwise the program keeps running after closing it.
         */
        
        frame.setVisible(true);  //makes the frame visible
    }
}
