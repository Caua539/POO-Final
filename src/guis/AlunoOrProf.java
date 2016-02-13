package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlunoOrProf extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton AlunoButton;
	private JButton ProfButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AlunoOrProf dialog = new AlunoOrProf();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AlunoOrProf() {
		setBounds(100, 100, 370, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new CompoundBorder());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			AlunoButton = new JButton("Aluno");
			AlunoButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					CadastroAlun cadastroalun = new CadastroAlun();
					cadastroalun.setVisible(true);
					setVisible(false);
				}
			});
			AlunoButton.setActionCommand("");
		}
		{
			ProfButton = new JButton("Professor");
			ProfButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Cadastro cadastroprof = new Cadastro();
					cadastroprof.setVisible(true);
					setVisible(false);
				}
			});
			ProfButton.setActionCommand("");
		}
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addGap(31)
					.addComponent(AlunoButton, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
					.addComponent(ProfButton, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(31))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(96)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(AlunoButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(ProfButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(110, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
	}

}
