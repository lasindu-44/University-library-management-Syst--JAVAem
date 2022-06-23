
package com.mycompany.library;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;


public class Issue extends JFrame implements ActionListener{
    
    private JPanel contentPane;
    JDateChooser dateChooser,dchoser;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
    private JButton b1,b2,b3,b4;
    private JComboBox comboBox_3, cb1;


    public static void main(String[] args) {
	new Issue().setVisible(true);
			
    }
    
    public Issue() {
        setBounds(300, 200, 900, 800);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("Item_id");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(47, 63, 100, 23);
	contentPane.add(l1);

	JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(47, 97, 100, 23);
	contentPane.add(l2);

	JLabel l3 = new JLabel("Publish id");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(47, 131, 100, 23);
	contentPane.add(l3);

	JLabel l4 = new JLabel("Publisher");
	l4.setForeground(new Color(47, 79, 79));
	l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	l4.setBounds(47, 165, 100, 23);
	contentPane.add(l4);

	JLabel l5 = new JLabel("Author");
	l5.setForeground(new Color(47, 79, 79));
	l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	l5.setBounds(47, 199, 100, 23);
	contentPane.add(l5);

	JLabel l6 = new JLabel("Price");
	l6.setForeground(new Color(47, 79, 79));
	l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	l6.setBounds(47, 233, 100, 23);
	contentPane.add(l6);

	JLabel l7 = new JLabel("Pages");
	l7.setForeground(new Color(47, 79, 79));
	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
	l7.setBounds(47, 267, 100, 23);
	contentPane.add(l7);

	t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(126, 66, 86, 20);
	contentPane.add(t1);
	
	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(234, 59, 100, 30);
        
	contentPane.add(b1);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(126, 100, 208, 20);
	contentPane.add(t2);
	t2.setColumns(10);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setColumns(10);
	t3.setBounds(126, 131, 208, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setEditable(false);
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setColumns(10);
	t4.setBounds(126, 168, 208, 20);
	contentPane.add(t4);

	t5 = new JTextField();
	t5.setEditable(false);
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setColumns(10);
	t5.setBounds(126, 202, 208, 20);
	contentPane.add(t5);

	t6 = new JTextField();
	t6.setEditable(false);
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setColumns(10);
	t6.setBounds(126, 236, 208, 20);
	contentPane.add(t6);

	t7 = new JTextField();
	t7.setEditable(false);
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setColumns(10);
	t7.setBounds(126, 270, 208, 20);
	contentPane.add(t7);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 2, true), "Issue",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34, 139, 34)));
	panel.setFont(new Font("Tahoma", Font.BOLD, 14));
	panel.setBounds(10, 38, 345, 288);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);

	JLabel l8 = new JLabel("Student/Lec_id");
	l8.setForeground(new Color(47, 79, 79));
	l8.setFont(new Font("Tahoma", Font.BOLD, 14));
	l8.setBounds(384, 63, 130, 23);
	contentPane.add(l8);

	JLabel l9 = new JLabel("Name");
	l9.setForeground(new Color(47, 79, 79));
	l9.setFont(new Font("Tahoma", Font.BOLD, 14));
	l9.setBounds(384, 103, 100, 23);
	contentPane.add(l9);

	JLabel l10 = new JLabel("Telephone");
	l10.setForeground(new Color(47, 79, 79));
	l10.setFont(new Font("Tahoma", Font.BOLD, 14));
	l10.setBounds(384, 147, 100, 23);
	contentPane.add(l10);

	JLabel l11 = new JLabel("Batch No");
	l11.setForeground(new Color(47, 79, 79));
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(384, 191, 100, 23);
	contentPane.add(l11);

	JLabel l12 = new JLabel("Course");
	l12.setForeground(new Color(47, 79, 79));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(384, 230, 100, 23);
	contentPane.add(l12);

	JLabel l13 = new JLabel("Email");
	l13.setForeground(new Color(47, 79, 79));
	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
	l13.setBounds(384, 270, 100, 23);
	contentPane.add(l13);

	JLabel l14 = new JLabel("Address");
	l14.setForeground(new Color(47, 79, 79));
	l14.setFont(new Font("Tahoma", Font.BOLD, 14));
	l14.setBounds(384, 310, 100, 23);
	contentPane.add(l14);

	t8 = new JTextField();
	t8.setForeground(new Color(47, 79, 79));
	t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t8.setColumns(10);
	t8.setBounds(508, 66, 86, 20);
	contentPane.add(t8);

	b2 = new JButton("Search");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b2.setBounds(604, 59, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	t9 = new JTextField();
	t9.setForeground(new Color(47, 79, 79));
	t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t9.setEditable(false);
	t9.setColumns(10);
	t9.setBounds(508, 106, 208, 20);
	contentPane.add(t9);

	t10 = new JTextField();
	t10.setForeground(new Color(47, 79, 79));
	t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t10.setEditable(false);
	t10.setColumns(10);
	t10.setBounds(508, 150, 208, 20);
	contentPane.add(t10);

	t11 = new JTextField();
	t11.setForeground(new Color(47, 79, 79));
	t11.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t11.setEditable(false);
	t11.setColumns(10);
	t11.setBounds(508, 190, 208, 20);
	contentPane.add(t11);

	t12 = new JTextField();
	t12.setForeground(new Color(47, 79, 79));
	t12.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t12.setEditable(false);
	t12.setColumns(10);
	t12.setBounds(508, 230, 208, 20);
	contentPane.add(t12);

	t13 = new JTextField();
	t13.setForeground(new Color(47, 79, 79));
	t13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t13.setEditable(false);
	t13.setColumns(10);
	t13.setBounds(508, 270, 208, 20);
	contentPane.add(t13);

	t14 = new JTextField();
	t14.setForeground(new Color(47, 79, 79));
	t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t14.setEditable(false);
	t14.setColumns(10);
	t14.setBounds(508, 310, 208, 20);
	contentPane.add(t14);

	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new TitledBorder(new LineBorder(new Color(70, 130, 180), 2, true), "Student-Deatails",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
	panel_1.setForeground(new Color(0, 100, 0));
	panel_1.setBounds(360, 38, 378, 320);
        panel_1.setBackground(Color.WHITE);
	contentPane.add(panel_1);
        
	JLabel l15 = new JLabel(" Date of Issue :");
	l15.setForeground(new Color(105, 105, 105));
	l15.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l15.setBounds(20, 340, 118, 26);
	contentPane.add(l15);

	dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("yyyy-MM-dd");
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));
	dateChooser.setBounds(137, 337, 200, 29);
	contentPane.add(dateChooser);
        
        JLabel l19 = new JLabel(" Return Date :");
	l19.setForeground(new Color(105, 105, 105));
	l19.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l19.setBounds(20, 380, 118, 26);
	contentPane.add(l19);

	dchoser = new JDateChooser();
	dchoser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dchoser.setForeground(new Color(105, 105, 105));
        dchoser.setDateFormatString("yyyy-MM-dd");
	dchoser.setBounds(137, 377, 200, 29);
	contentPane.add(dchoser);

	b3 = new JButton("Issue");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b3.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b3.setBounds(360, 380, 118, 33);
	b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        contentPane.add(b3);

	b4 = new JButton("Back");
	b4.addActionListener(this);
	b4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b4.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
	b4.setBounds(560, 380, 118, 33);
	b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        contentPane.add(b4);
        
        comboBox_3 = new JComboBox();
	comboBox_3.setModel(new DefaultComboBoxModel(
			new String[] { "Book", "Magazine", "CD/DVD", "Paper"}));
	comboBox_3.setForeground(new Color(47, 79, 79));
	comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox_3.setBounds(560, 440, 154, 20);
	contentPane.add(comboBox_3);
        
        JLabel l18 = new JLabel(" Item Type :");
	l18.setForeground(new Color(105, 105, 105));
	l18.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l18.setBounds(360, 440, 118, 20);
	contentPane.add(l18);
        
        cb1 = new JComboBox();
	cb1.setModel(new DefaultComboBoxModel(
			new String[] { "Student", "Lecturer"}));
	cb1.setForeground(new Color(47, 79, 79));
	cb1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	cb1.setBounds(560, 475, 154, 20);
	contentPane.add(cb1);
        
        JLabel l20 = new JLabel(" Member Type :");
	l20.setForeground(new Color(105, 105, 105));
	l20.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	l20.setBounds(360, 475, 118, 20);
	contentPane.add(l20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            connect con = new connect();
            if(e.getSource() == b1){
                if(comboBox_3.getSelectedItem() == "Book"){
                String sql = "select * from book where book_id = ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, t1.getText());
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("publisher_id"));
                    t4.setText(rs.getString("pubname"));
                    t5.setText(rs.getString("Author"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
                }
                st.close();
                rs.close();
                }
                
                if(comboBox_3.getSelectedItem() == "Magazine"){
                String sql1 = "select * from magazine where mag_id = ?";
                PreparedStatement st1 = con.c.prepareStatement(sql1);
                st1.setString(1, t1.getText());
                ResultSet rs1 = st1.executeQuery();
                
                while (rs1.next()) {
                    t2.setText(rs1.getString("name"));
                    t3.setText(rs1.getString("publisher_id"));
                    t4.setText(rs1.getString("pubdate"));
                    t6.setText(rs1.getString("price"));
                    t7.setText(rs1.getString("pages"));
                }
                st1.close();
                rs1.close();
                }
                if(comboBox_3.getSelectedItem() == "CD/DVD"){
                String sql2 = "select * from cd where cd_id = ?";
                PreparedStatement st2 = con.c.prepareStatement(sql2);
                st2.setString(1, t1.getText());
                ResultSet rs2 = st2.executeQuery();
                
                while (rs2.next()) {
                    t2.setText(rs2.getString("name"));
                    t3.setText(rs2.getString("publisher_id"));
                    t5.setText(rs2.getString("pubname"));
                    t6.setText(rs2.getString("price"));
                    t7.setText(rs2.getString("edition"));
                }
                st2.close();
                rs2.close();
                }
                if(comboBox_3.getSelectedItem() == "Paper"){
                String sql2 = "select * from paper where paper_id = ?";
                PreparedStatement st2 = con.c.prepareStatement(sql2);
                st2.setString(1, t1.getText());
                ResultSet rs2 = st2.executeQuery();
                
                while (rs2.next()) {
                    t2.setText(rs2.getString("name"));
                    t3.setText(rs2.getString("publisher_id"));
                    t5.setText(rs2.getString("language"));
                    t6.setText(rs2.getString("price"));
                    t7.setText(rs2.getString("edition"));
                }
                st2.close();
                rs2.close();
                }
                
                
            }
            if(e.getSource() == b2){
                if(cb1.getSelectedItem() == "Student"){
                String sql = "select * from student where student_id = ?";
                PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, t8.getText());
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    t9.setText(rs.getString("name"));
                    t10.setText(rs.getString("phone"));
                    t11.setText(rs.getString("bno"));
                    t12.setText(rs.getString("course"));
                    t13.setText(rs.getString("email"));
                    t14.setText(rs.getString("address"));
                }
                st.close();
                rs.close();
                }
                if(cb1.getSelectedItem() == "Lecturer"){
                String sql4 = "select * from lecturer where lecture_id = ?";
                PreparedStatement st4 = con.c.prepareStatement(sql4);
                st4.setString(1, t8.getText());
                ResultSet rs4 = st4.executeQuery();
                
                while (rs4.next()) {
                    t9.setText(rs4.getString("name"));
                    t10.setText(rs4.getString("phone"));
                    t13.setText(rs4.getString("email"));
                    t14.setText(rs4.getString("address"));
                }
                st4.close();
                rs4.close();
                }
                
            }
            if(e.getSource() == b3){
                    String sql = "insert into issue(item_id, student_id, itemname, sname, course, address, dateOfIssue, return_date) values(?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t8.getText());
                    st.setString(3, t2.getText());
                    st.setString(4, t9.getText());
                    st.setString(5, t12.getText());
                    st.setString(6, t14.getText());
                    
                    /*SimpleDateFormat format1 = new SimpleDateFormat("MMM dd, yyyy");
                    SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
                    String a = dateChooser.getDateFormatString();
                    Date date= (Date) format1.parse(a);
                    st.setString(7, format2.format(date));*/
                   st.setString(7, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                    //st.setString(7, new SimpleDateFormat("yyyy-MM-DD").format(dateChooser.getDate()));
                   st.setString(8, ((JTextField) dchoser.getDateEditor().getUiComponent()).getText());
                   // st.setString(8, new SimpleDateFormat("yyyy-MM-DD").format(dchoser.getDate()));
                    
                    /*SimpleDateFormat format3 = new SimpleDateFormat("MMM dd, yyyy");
                    SimpleDateFormat format4 = new SimpleDateFormat("yyyy-MM-dd");
                    String b = dchoser.getDateFormatString();
                    Date date1= (Date) format3.parse(b);
                    st.setString(8, format4.format(date1));*/
                    
                    
                    int i = st.executeUpdate();
                    if (i > 0)
                        JOptionPane.showMessageDialog(null, "Successfully Issued..!");
                    else
                        JOptionPane.showMessageDialog(null, "error");
              
            }
            if(e.getSource() == b4){
                this.setVisible(false);
                new MainPage().setVisible(true);
                
            }
            
            con.c.close();
        } catch (Exception ex) {
            
        }
    }
    
}
