package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPrincipal window = new FormPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuCadastros = new JMenu("Cadastros");
		menuBar.add(menuCadastros);
		
		JMenuItem menuItemPessoas = new JMenuItem("Pessoas");
		menuCadastros.add(menuItemPessoas);
		
		JMenuItem MenuItemCidades = new JMenuItem("Cidades");
		menuCadastros.add(MenuItemCidades);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		
		JMenuItem menuItemSobre = new JMenuItem("Sobre");
		menuAjuda.add(menuItemSobre);
		
		menuItemSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Sistema de Cadastro\nDireitos Reservados");
			}
		});
		menuBar.add(menuAjuda);
		//kkkkkkkkkkkkkk
		
	}

}
