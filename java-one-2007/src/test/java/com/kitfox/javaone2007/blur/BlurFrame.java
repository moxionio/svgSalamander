/*
 * TexRectangleFrame.java
 *
 * Created on April 25, 2007, 8:26 PM
 */

package com.kitfox.javaone2007.blur;

import com.kitfox.javaone2007.texRectangle.TexRectanglePanel;
import java.awt.BorderLayout;

/**
 *
 * @author  kitfox
 */
public class BlurFrame extends javax.swing.JFrame
{
    BlurPanel panel = new BlurPanel();
    
    /** Creates new form TexRectangleFrame */
    public BlurFrame()
    {
        initComponents();
        
        getContentPane().add(panel, BorderLayout.CENTER);
        
        setSize(640, 480);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new BlurFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
