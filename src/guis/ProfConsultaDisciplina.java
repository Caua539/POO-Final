package guis;

import mainpkg.*;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfConsultaDisciplina extends JDialog {

	private static Professor professor;
	private PrimeiraJanela inicial;
	private JComboBox disciplinas;
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setInicial(PrimeiraJanela inicio){
		this.inicial = inicio;
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfConsultaDisciplina dialog = new ProfConsultaDisciplina(professor);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public ProfConsultaDisciplina(Professor prof) {
		professor = prof;
		setBounds(100, 100, 371, 231);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(99, 130, 191)), "Disciplinas cadastradas", TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font("Sylfaen", 1, 24), null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inicial.setVisible(true);
				setVisible(false);
				try {
					this.finalize();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		});
		
		JLabel lblEscolhaUmaDisciplina = new JLabel("Escolha uma disciplina para consultar");
		
		JLabel lblOsAlunosCadastrados = new JLabel("os alunos e gerenciar suas notas");
		
		disciplinas = new JComboBox();
		disciplinas.setModel(new DefaultComboBoxModel(professor.getDisciplinasMinistradas()));
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bttnContinuarPerformed();
			}
		});
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblEscolhaUmaDisciplina))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblOsAlunosCadastrados, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(71, Short.MAX_VALUE)
					.addComponent(disciplinas, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addGap(58))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSair)
					.addPreferredGap(ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEscolhaUmaDisciplina)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblOsAlunosCadastrados)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(disciplinas, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSair, Alignment.TRAILING)
						.addComponent(btnNewButton, Alignment.TRAILING))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);

	}
	
	public void bttnContinuarPerformed(){
		ProfSelecionaAluno listaaluno = new ProfSelecionaAluno(ObjArrays.buscaDisciplina(professor.getSingleDisciplinaMinistrada(disciplinas.getSelectedIndex())));
		listaaluno.setLastWindow(this);
		listaaluno.setVisible(true);
		setVisible(false);
	}
	
	public int getDiscCode(){
		int cod = ObjArrays.buscaDisciplina(professor.getSingleDisciplinaMinistrada(disciplinas.getSelectedIndex())).getCod();
		return cod;
	}
	
}
