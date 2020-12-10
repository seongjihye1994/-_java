package com.kh.mini_Project.view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
public class  test extends JFrame
implements ActionListener, ListSelectionListener
{
	JTextField tfDir;
	JList lst;
	File fileList[];//���丮�� ���� ����� ���� ����
	JTextArea ta;
	JButton btSave, btClear, btColor;
	JComboBox combo;
	String [] fonts;

	BufferedReader br;
	BufferedWriter bw;

	public test(){
		super(":: MyDirDemo ::");
		Container cp=getContentPane();
		tfDir=new JTextField();
		cp.add(tfDir,"North");
		tfDir.setBorder(new TitledBorder("���丮���� �Է��ϼ���"));

		lst=new JList();//���丮 ���� ����� ���⿡ ��������.
		cp.add(new JScrollPane(lst),"West");
		lst.setBorder(new TitledBorder("���� ���"));

		//ta����
		ta=new JTextArea();
		cp.add(new JScrollPane(ta),"Center");

		//�Ʒ�(South)�� �г� ����
		JPanel p1=new JPanel();
		cp.add(p1,"South");
		p1.add(btSave=new JButton("SAVE"));
		p1.add(btClear=new JButton("CLEAR"));
		p1.add(btColor=new JButton("COLOR"));
		//�ý��� ��ü�� �������� ����� ���� �޼ҵ� ȣ��
		fonts=getSystemFonts();
		combo=new JComboBox(fonts);
		p1.add(new JScrollPane(combo));

		//������ ����----
		tfDir.addActionListener(this);
		btSave.addActionListener(this);
		btClear.addActionListener(this);
		btColor.addActionListener(this);
		//JList���� � ������ ����??
		lst.addListSelectionListener(this);


		addWindowListener(new WindowAdapter(){ 
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}//������-------

	public void valueChanged(ListSelectionEvent e){
		Object o=e.getSource();
		if(o==lst){
			//1. ����Ʈ���� ������ ���ϸ��� ������.
			//Object getSelectedValue()
			//boolean getValueIsAdjusting() 
			boolean res=e.getValueIsAdjusting();
			System.out.println("res: "+res);
			//���콺 Ŭ���� ��true, ���콺 ���� false�� ����.
			if(!res){		
				try{
					readFile();//����� ���� �޼ҵ� ȣ��..
				}catch(IOException ex){
					JOptionPane.showMessageDialog(this,
						"Error: "+ex.getMessage());
				}
			}//if----------
		}
	}//--------------
	public String[] getSystemFonts(){
			GraphicsEnvironment ge=
				  GraphicsEnvironment.getLocalGraphicsEnvironment();
					String[] f=ge.getAvailableFontFamilyNames();
					return f;
	}//-----------------
	public void readFile() throws IOException{
		ta.setText("");//�б����� ta�� ���ڿ��� �ʱ�ȭ...
		Object obj=lst.getSelectedValue();
		
			//setTitle(obj.toString());
			File selFile=(File)obj;
	if(selFile !=null){
			System.out.println(selFile);
			//2. �� ������ java �Ǵ�  txt�����̶��
			String fname=selFile.getName();
			if(fname.endsWith(".java")||fname.endsWith(".txt")){
			//3. 1�� ������ �����θ� ���ѵ�
				String path=obj.toString();
			//4. ������ �д� ��彺Ʈ���� �����Ѵ�.
				FileReader fr=new FileReader(selFile);
			//5. BufferedReader�� ���͸�...
			br=new BufferedReader(fr);
			//6. �ݺ��� ���鼭 �ٴ����� �о�� ������
			//7. ta�� append()����.	
			String line="";
			while((line=br.readLine())!=null){
				ta.append(line+"\n");
			}//while----
			//8. �ڿ� �ݳ�
			if(br!=null) br.close();
			if(fr!=null) fr.close();

			}else{
				JOptionPane.showMessageDialog(this,
							"������ ������ ���丮�̰ų� �б� ���� �����Դϴ�");
			}
	  }//if---��üũ if��---
	}//readFile()--------------

	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();
		if(o==tfDir){
			//1. ����ڰ� �Է��� ���丮���� ���´�.
			String dirName=tfDir.getText().trim();
			//2. 1���� ���� ���ڿ��� ���� File��ü ����
			File dir=new File(dirName);
			//3. ���丮���� �ƴ��� �Ǻ�...
			if(dir.isDirectory()){
			//4. ���丮���...�ش� ���丮�� ���� ����� ������.
				fileList=dir.listFiles();
				//String[] flist=dir.list();
				//File[] flist=dir.listFiles();
			}//if------
			//5. ���� ���� ����� JList�� ������...
			lst.setListData(fileList);
		}else if(o==btSave){
			saveFile();///����� ���� �޼ҵ� ȣ��
		}else if(o==btClear){
			ta.setText("");
		}else if(o==btColor){
			changeTxtColor();//����� ���� �޼ҵ� ȣ��
		}
	}//---------------
	public void changeTxtColor(){
		//1. JColorChooser��ü�� �޼ҵ�(showXXX())�� ȣ���Ͽ�
		//   ���� ���̾�α׸� ����.
		//static Color showDialog(Component component, String title, Color initialColor) 
		Color cr=JColorChooser.showDialog(this, "", Color.blue);
	
		//2. ����ڰ� ������ ������ ���´�.
		//3. ta�� �� ������ ���ڻ����� �����Ѵ�.
		ta.setForeground(cr);

	}//changeTxtColor()--------
	public void saveFile(){
		//1. JFileChooser ��ü�� �����Ͽ� ������̾�α׸� �����ش�.
			JFileChooser jc=new JFileChooser();
			jc.showSaveDialog(this);
			//2. 1���� ����ڰ� �Է��� ���ϸ��� ����
			// File getSelectedFile()  
			File saveFile=jc.getSelectedFile();
			//��Ҹ� ������ null �� ������...���� ��üũ �ʼ�..
			if(saveFile!=null)
				setTitle(saveFile.getName());
		try{
			String contents=ta.getText();
			if(contents==null|| contents.trim().equals("")){
				JOptionPane.showMessageDialog(this,"������ ������"
													+"�Է��ؾ� �մϴ�.");
				ta.requestFocus();
				//ta�� ��Ŀ�� �ֱ�..
				return;
			}//if--
			//3. ���Ͽ� ���� ��Ʈ���� ��� ������ �ϰ�...
			FileWriter fw=new FileWriter(saveFile);
			//4. BufferedWriter�� ���͸��� �� ��		
			bw=new BufferedWriter(fw);
			//5. ta(�ؽ�Ʈ������)�� ������ 4�� ��Ʈ���� ����
			//   ���Ͽ� ���� �۾��� �Ѵ�. 
			
			bw.write(contents);
			bw.flush();
			//6. ����� ��Ʈ�� �ݱ�.
			if(bw!=null) bw.close();
			if(fw!=null) fw.close();
		}catch(IOException ex){
			System.out.println("IO Error: "+ex.getMessage());
		}

	}//saveFile()---------

	public static void main(String[] args) 
	{
		test d=new test();
		d.setSize(800,500);
		d.setVisible(true);
		
	}
	
	
	
	
	
	
	
	
}