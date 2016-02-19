package guis;

import mainpkg.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaProfSelecaoAluno extends JFrame {

	private JPanel contentPane;
	
	private static Disciplina currentDisc;
	private JanelaProfSelecaoDisciplina lastWindow;
	JList listaAlunos;
	
	public void setCurrentDisc(Disciplina disc){
		this.currentDisc = disc;
		System.out.println(currentDisc.getNome());
	}
	
	public void setLastWindow(JanelaProfSelecaoDisciplina window){
		this.lastWindow = window;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaProfSelecaoAluno frame = new JanelaProfSelecaoAluno(currentDisc);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JanelaProfSelecaoAluno(Disciplina disc) {
		this.currentDisc = disc;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(99, 130, 191)), "Rela\u00E7\u00E3o de alunos", TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font("Sylfaen", 1, 24), null));
		setContentPane(contentPane);
		
		final JList listaDeAlunos = new JList();
		listaDeAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaDeAlunos.setModel(new AbstractListModel() {
			String[] values = currentDisc.getAlunoCod();
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listaAlunos = listaDeAlunos;
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lastWindow.setVisible(true);
				setVisible(false);
				try {
					this.finalize();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		});
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				bttnContinuarPerformed();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnVoltar)
							.addPreferredGap(ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
							.addComponent(btnContinuar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(68)
							.addComponent(listaDeAlunos, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(listaDeAlunos, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVoltar)
						.addComponent(btnContinuar))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void bttnContinuarPerformed(){
		if(listaAlunos.getSelectedValue() == null) return;
		String plhString = listaAlunos.getSelectedValue().toString();
		String matricula = plhString.replaceAll(" .*", "");
		Aluno aluno = ObjArrays.buscaAluno(matricula);
		/*int disciplinaAConsultar = 0;
		for(int i=0; i < ObjArrays.getFinaldisc(); i++){
			if(aluno.getDisciplinasIntArray()[i] == currentDisc.getCod()){
				disciplinaAConsultar = i;
				break;
			}
		}*/
		JanelaProfNotasAluno notas = new JanelaProfNotasAluno(aluno, lastWindow.getDiscCode()-1);
		notas.setLastWindow(this);
		notas.setVisible(true);
		setVisible(false);
	}
}
