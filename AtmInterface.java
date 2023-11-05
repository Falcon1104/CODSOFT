/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atminterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author kulka
 */
class Interface extends JFrame implements ActionListener {
    
    JTextField name;
    Container cp;
    JPanel basicInput, selectionScreen, TransferScreen, WithDrawScreen;
    JTextField name1, TransAmt, WithAmt;
    JPasswordField jpf;
    JButton jb;
    CardLayout cd;
    
    
    
    JButton WithDraw, Transfer, Back,Back1,Back2, wd, tf;
    
    public Interface() {
        
        super("Atm interface");
        setSize(500, 500);
        cp = getContentPane();
        
        cd = new CardLayout();
        cp.setLayout(cd);
        setVisible(true);
        basicInput = new JPanel();
        basicInput.setLayout(new GridLayout());
        name1 = new JTextField("Name");
        name1.setToolTipText("ENTER NAME");
        jpf = new JPasswordField();
        jpf.setToolTipText("ENTER PASSWORD");
        
        jb = new JButton("Enter");
        jb.setActionCommand("password");
        jb.addActionListener(this);
        
        basicInput.add(name1);
        basicInput.add(jpf);
        basicInput.add(jb);
        basicInput.setSize(200, 200);
        
        jpf.setText("Password");
        cp.add(basicInput, "ioScreen");

        //selection screen 
        selectionScreen = new JPanel();
        selectionScreen.setLayout(new GridLayout());
        
        Back = new JButton("Back");
        Back.setActionCommand("Back");
        Back.addActionListener(this);
        WithDraw = new JButton("With-draw");
        WithDraw.setActionCommand("With-Draw");
        WithDraw.addActionListener(this);
        
        Transfer = new JButton("Transfer");
        Transfer.setActionCommand("Transfer");
        Transfer.addActionListener(this);
        
        selectionScreen.add(WithDraw);
        selectionScreen.add(Transfer);
        selectionScreen.add(Back);
        
        cp.add(selectionScreen);

        //Transfer-screen
        TransferScreen = new JPanel();
        TransferScreen.setLayout(new GridLayout());
        
        TransAmt = new JTextField("Enter amt");
        TransAmt.setToolTipText("Enter amt to transfer");
        
        tf = new JButton("Send");
        //add button and textFeild to  the panel and add the panel to cp thats the main container
        tf.addActionListener(this);
        tf.setActionCommand("transferScreen");
        
        TransferScreen.add(TransAmt);
        TransferScreen.add(tf);
        Back1=new JButton("Back");
        Back1.setActionCommand("Back");
        Back1.addActionListener(this);
        TransferScreen.add(Back1);
        
        cp.add(TransferScreen, "transferScreen");

        //Withdraw screen 
        WithDrawScreen = new JPanel();
        
        wd = new JButton("With-Draw");
        wd.setActionCommand("With-draw");
        wd.addActionListener(this);
        
        WithAmt = new JTextField(" Enter Withdrawal amount ");
        
        WithAmt.setToolTipText("Enter amount you want to withdrawal ");
        
        WithDrawScreen.add(WithAmt);
        WithDrawScreen.add(wd);
        Back2=new JButton("Back");
        Back2.setActionCommand("Back");
        Back2.addActionListener(this);
        WithDrawScreen.add(Back2);
        cp.add(WithDrawScreen, "With-Draw");
        
        
        jpf.setText("password");
        name1.setText("abc");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Entered action listener ");
        if (e.getActionCommand() == "password") {
            

                         jb.setLabel("Correct password");
                         cd.next(cp);            

        
        } else if (e.getActionCommand() == "Transfer") {
            
            cd.show(cp, "transferScreen");
            
        } else if (e.getActionCommand() == "With-Draw") {
            
            cd.show(cp, "With-Draw");
            
        } else if (e.getActionCommand() == "Back") {
            
            cd.show(cp, "ioScreen");
            
        } else if (e.getActionCommand() == "transferScreen") {
            
            String smt = TransAmt.getText();
            
            if (Integer.parseInt(smt) < 20000) {
                
                TransAmt.setText("Amount sent :" + smt);
            } else {
                
                TransAmt.setText("Limit exceeded");
            }
            
        } 
        
        else if (e.getActionCommand() == "With-Draw") {
            System.out.println("Enter action listener");
            String smt = WithAmt.getText();
            
            if (Integer.parseInt(smt) < 20000) {
                System.out.println("Entered if ");
                WithAmt.setText("Amount withdrawn :" + smt);
            } else {
                WithAmt.setText("Limit exceeded");
            }
            
        }
        
    }
    
}

public class AtmInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Interface in = new Interface();
    }
    
}
