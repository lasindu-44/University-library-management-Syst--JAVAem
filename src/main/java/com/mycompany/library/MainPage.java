
package com.mycompany.library;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author crx
 */
public class MainPage extends JFrame implements ActionListener {
    
    private JPanel contentPane;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

    public static void main(String[] args) {
        new MainPage().setVisible(true);
    }
        
    public MainPage() {
	
            setBounds(400, 150, 1600, 800);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
            menuBar.setBackground(Color.CYAN);
            menuBar.setBounds(0, 10, 1300, 35);
            contentPane.add(menuBar);

            JMenu mnExit = new JMenu("Exit");
            mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            
            
            JMenuItem mntmLogout = new JMenuItem("Logout");
            mntmLogout.setBackground(new Color(211, 211, 211));
            mntmLogout.setForeground(new Color(105, 105, 105));
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);
            
            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setForeground(new Color(105, 105, 105));
            mntmExit.setBackground(new Color(211, 211, 211));
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);
               

            JMenu mnRecord = new JMenu("Record");
            mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            

            JMenuItem bookdetails = new JMenuItem("Book Details");
            bookdetails.addActionListener(this);
            bookdetails.setBackground(new Color(211, 211, 211));
            bookdetails.setForeground(Color.DARK_GRAY);
            mnRecord.add(bookdetails);
            
            JMenuItem magdetails = new JMenuItem("Magazine Details");
            magdetails.addActionListener(this);
            magdetails.setBackground(new Color(211, 211, 211));
            magdetails.setForeground(Color.DARK_GRAY);
            mnRecord.add(magdetails);
            
            JMenuItem cddetails = new JMenuItem("CD/DVD Details");
            cddetails.addActionListener(this);
            cddetails.setBackground(new Color(211, 211, 211));
            cddetails.setForeground(Color.DARK_GRAY);
            mnRecord.add(cddetails);
            
            JMenuItem Paperdetails = new JMenuItem("Paper Details");
            Paperdetails.setBackground(new Color(211, 211, 211));
            Paperdetails.setForeground(Color.DARK_GRAY);
            Paperdetails.addActionListener(this);
            mnRecord.add(Paperdetails);

            JMenuItem studentdetails = new JMenuItem("Student Details");
            studentdetails.setBackground(new Color(211, 211, 211));
            studentdetails.setForeground(Color.DARK_GRAY);
            studentdetails.addActionListener(this);
            mnRecord.add(studentdetails);
            
            JMenuItem Lecturerdetails = new JMenuItem("Lecturer Details");
            Lecturerdetails.setBackground(new Color(211, 211, 211));
            Lecturerdetails.setForeground(Color.DARK_GRAY);
            Lecturerdetails.addActionListener(this);
            mnRecord.add(Lecturerdetails);
            
            
            
            menuBar.add(mnRecord);
            menuBar.add(mnExit);

            
            JLabel l1 = new JLabel("Library Management System");
            l1.setForeground(new Color(204, 51, 102));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(268, 30, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/second.png");
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(60, 140, 159, 152);
            contentPane.add(l2);
            
             b1 = new JButton("Add Books");
            b1.addActionListener(this);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setBounds(60, 320, 159, 44);
            contentPane.add(b1);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/second.png");
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(300, 160, 134, 128);
            contentPane.add(l3);
            
             b2 = new JButton("Add Magazine");
            b2.addActionListener(this);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            b2.setBounds(313, 320, 139, 44);
            contentPane.add(b2);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/11.png");
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(530, 140, 225, 152);
            contentPane.add(l4);
            
            b3 = new JButton("Add CD/DVD");
            b3.addActionListener(this);
            b3.setBackground(Color.BLACK);
            b3.setForeground(Color.WHITE);
            b3.setBounds(562, 320, 187, 44);
            contentPane.add(b3);
            
            JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/fourth.png");
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            l4 = new JLabel(i12);
            l4.setBounds(880, 140, 159, 152);
            contentPane.add(l4);
            
            b4 = new JButton("Add Student");
            b4.addActionListener(this);
            b4.setBackground(Color.BLACK);
            b4.setForeground(Color.WHITE);
            b4.setBounds(863, 320, 159, 44);
            contentPane.add(b4);
            
            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/fourth.png");
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            l4 = new JLabel(i15);
            l4.setBounds(1110, 140, 159, 152);
            contentPane.add(l4);
            
            b5 = new JButton("Add Lecturer");
            b5.addActionListener(this);
            b5.setBackground(Color.BLACK);
            b5.setForeground(Color.WHITE);
            b5.setBounds(1103, 320, 159, 44);
            contentPane.add(b5);

            
            
            
            

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(220, 20, 60)));
            panel.setBounds(20, 120, 1500, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);

            b6 = new JButton("Issue Book");
            b6.addActionListener(this);
            b6.setBackground(Color.BLACK);
            b6.setForeground(Color.WHITE);
            b6.setBounds(76, 620, 143, 41);
            contentPane.add(b6);

            b7 = new JButton("Return Book");
            b7.addActionListener(this);
            b7.setBackground(Color.BLACK);
            b7.setForeground(Color.WHITE);
            b7.setBounds(310, 620, 159, 41);
            contentPane.add(b7);

            b8 = new JButton("Statistics");
            b8.addActionListener(this);
            b8.setBackground(Color.BLACK);
            b8.setForeground(Color.WHITE);
            b8.setBounds(562, 620, 159, 41);
            contentPane.add(b8);

            JLabel l7 = new JLabel("");
            ImageIcon i16  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/fifth.png");
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            l5 = new JLabel(i18);
            l5.setBounds(60, 440, 159, 163);
            contentPane.add(l5);

            JLabel l8 = new JLabel("");
            ImageIcon i19  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/sixth.png");
            Image i20 = i19.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i21 = new ImageIcon(i20);
            l6 = new JLabel(i21);
            l6.setBounds(332, 440, 139, 152);
            contentPane.add(l6);

            JLabel l9 = new JLabel("");
            ImageIcon i22  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/third.png");
            Image i23 = i22.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i24 = new ImageIcon(i23);
            l7 = new JLabel(i24);
            l7.setBounds(562, 440, 157, 152);
            contentPane.add(l7);
            
            JLabel l10 = new JLabel("");
            ImageIcon i27  = new ImageIcon("C:/Users/crx/Documents/NetBeansProjects/library/src/main/java/img/icons/second.png");
            Image i28 = i27.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i29 = new ImageIcon(i28);
            l10 = new JLabel(i29);
            l10.setBounds(812, 440, 159, 152);
            contentPane.add(l10);
            
             b9 = new JButton("Add Papers");
            b9.addActionListener(this);
            b9.setBackground(Color.BLACK);
            b9.setForeground(Color.WHITE);
            b9.setBounds(812, 620, 159, 41);
            contentPane.add(b9);

            JPanel panel2 = new JPanel();
            panel2.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "Action", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(233, 150, 122)));
            panel2.setBounds(20, 420, 1100, 270);
            panel2.setBackground(Color.WHITE);
            contentPane.add(panel2);
            
            getContentPane().setBackground(Color.WHITE);
            contentPane.setBackground(Color.WHITE);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
            if(msg.equals("Logout")){
                setVisible(false);
		new Login().setVisible(true);
            }else if(msg.equals("Exit")){
                System.exit(ABORT);
            
            }else if(msg.equals("Book Details")){
                setVisible(false);
		new BookDetail().setVisible(true);
            }else if(msg.equals("Magazine Details")){
                setVisible(false);
		new MagazineDetail().setVisible(true);
                
            }else if(msg.equals("CD/DVD Details")){
                setVisible(false);
		new CdDVDDetail().setVisible(true);
            
            }else if(msg.equals("Paper Details")){
                setVisible(false);
		new PaperDetail().setVisible(true);
                    
            }else if(msg.equals("Student Details")){
                setVisible(false);
                new StudentDetails().setVisible(true);
			
            }
            else if(msg.equals("Lecturer Details")){
                setVisible(false);
		new LecturerDetails().setVisible(true);}
            
            if(e.getSource() == b1){
                this.setVisible(false);
                new AddBook().setVisible(true);
            }
            if(e.getSource() == b2){
                this.setVisible(false);
                new AddMag().setVisible(true);
            }
            if(e.getSource() == b3){
                this.setVisible(false);
                new AddCd().setVisible(true);
            }
            if(e.getSource() == b4){
                this.setVisible(false);
                new Student().setVisible(true);
            }
            if(e.getSource() == b5){
                this.setVisible(false);
                new Lecturer().setVisible(true);
            
            }
            if(e.getSource() == b6){
                this.setVisible(false);
                new Issue().setVisible(true);
            
            }
            if(e.getSource() == b7){
                this.setVisible(false);
                new Return().setVisible(true);
            }
            if(e.getSource() == b8){
                this.setVisible(false);
                new Statistics().setVisible(true);
            }
            
           if(e.getSource() == b9){
                this.setVisible(false);
                new AddPapers().setVisible(true);
            }
            
        
    }
    
}
