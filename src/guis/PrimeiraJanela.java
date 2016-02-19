
package guis;

import mainpkg.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.GroupLayout;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 *
 * @authors Cauã, Ana Luísa e Paula
 */
@SuppressWarnings("serial")
public class PrimeiraJanela extends javax.swing.JFrame {
	
	private PrimeiraJanela inicial = this;


    public PrimeiraJanela() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        bttnEntrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Tahoma", Font.BOLD, 14));
        bttnSair = new javax.swing.JButton();
        btnSouProfessor = new javax.swing.JButton();
        btnSouAluno = new javax.swing.JButton();
        senhaIncorreta = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bem Vindo!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24)));

        matricula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matricula.setName("");
        matricula.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent arg0) {
        		senhaIncorreta.setText("");
        	}
        });

        jLabel2.setText("Matr\u00EDcula");

        jLabel3.setText("Senha");

        bttnEntrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bttnEntrar.setText("Entrar");
        bttnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEntrarActionPerformed(evt);
            }
        });

        jLabel4.setText("N\u00E3o possui cadastro?");

        bttnSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bttnSair.setText("Sair");
        bttnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSairActionPerformed(evt);
            }
        });
        
        senha = new JPasswordField();
        senha.setHorizontalAlignment(SwingConstants.CENTER);
        senha.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		senhaIncorreta.setText("");
        	}
        });
        
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        
        JLabel lblEntreComSuas = new JLabel();
        lblEntreComSuas.setText("Entre com suas credenciais");
        lblEntreComSuas.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        senhaIncorreta.setText("");
        senhaIncorreta.setForeground(Color.RED);
        
        btnSouProfessor= new JButton("Sou Professor");
        btnSouProfessor.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnSouProfessor.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Professor novoprof = new Professor();
				ObjArrays.criarProfessores(novoprof);
				JanelaProfCadastro cadastroprof = new JanelaProfCadastro();
				cadastroprof.setInicial(inicial);
				cadastroprof.setVisible(true);
				setVisible(false);
        	}
        });
        
        btnSouAluno = new JButton("Sou Aluno");
        btnSouAluno.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnSouAluno.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Aluno novoalun = new Aluno();
				ObjArrays.criarAlunos(novoalun);
				JanelaAlunoCadastro cadastroalun = new JanelaAlunoCadastro();
				cadastroalun.setInicial(inicial);
		    	cadastroalun.setVisible(true);
		    	setVisible(false);
        	}
        });
        
        
        GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
        gl_jPanel1.setHorizontalGroup(
        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(26)
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
        						.addComponent(btnSouProfessor, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnSouAluno, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(15)
        					.addComponent(jLabel4)))
        			.addGap(32)
        			.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        							.addGroup(gl_jPanel1.createSequentialGroup()
        								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(bttnSair)
        									.addComponent(lblEntreComSuas))
        								.addGap(210))
        							.addGroup(gl_jPanel1.createSequentialGroup()
        								.addGap(36)
        								.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
        									.addComponent(senha, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
        									.addComponent(matricula, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
        									.addComponent(senhaIncorreta, Alignment.LEADING))
        								.addContainerGap()))
        						.addGroup(gl_jPanel1.createSequentialGroup()
        							.addGap(60)
        							.addComponent(bttnEntrar)
        							.addContainerGap()))
        					.addGroup(gl_jPanel1.createSequentialGroup()
        						.addGap(77)
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        						.addContainerGap()))
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(71)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        gl_jPanel1.setVerticalGroup(
        	gl_jPanel1.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addContainerGap(11, Short.MAX_VALUE)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(19)
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblEntreComSuas, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addGap(18)
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_jPanel1.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jLabel2)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(matricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addGap(11)
        							.addComponent(jLabel3)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(senha, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bttnEntrar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(senhaIncorreta))
        						.addGroup(gl_jPanel1.createSequentialGroup()
        							.addComponent(btnSouProfessor, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
        							.addComponent(btnSouAluno, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        							.addGap(35)))))
        			.addGap(17)
        			.addComponent(bttnSair)
        			.addContainerGap())
        );
        jPanel1.setLayout(gl_jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);
        
        Vector<Component> order = new Vector<Component>(7);
        order.add(matricula);
        order.add(senha);
        order.add(bttnEntrar);
        order.add(btnSouProfessor);
        order.add(btnSouAluno);
        order.add(bttnSair);
        ConfigFocusOrder newPolicy = new ConfigFocusOrder(order);
        this.setFocusTraversalPolicy(newPolicy);
        

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void bttnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSairActionPerformed
    	
    	try {
			FileOutputStream fout = new FileOutputStream("dados.txt");
	    	ObjectOutputStream oos = new ObjectOutputStream(fout);
	    	oos.writeObject(ObjArrays.getProfessores());
	    	oos.writeObject(ObjArrays.getDisciplinas());
	    	oos.writeObject(ObjArrays.getAlunos());
	    	oos.writeInt(ObjArrays.getFinalProf());
	    	oos.writeInt(ObjArrays.getFinaldisc());
	    	oos.writeInt(ObjArrays.getFinalAlun());
	    	oos.writeObject(ObjArrays.getDiscArray());
	    	oos.close();
	    	System.out.println("DONE");
    	}
    	catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
        System.exit(0);
    }//GEN-LAST:event_bttnSairActionPerformed

    private void bttnEntrarActionPerformed(java.awt.event.ActionEvent evt) {
    	//GEN-FIRST:event_bttnEntrarActionPerformed
    	
    	String strSenha = new String(senha.getPassword());
    	if (matricula.getText().length() == 8){
    		Professor prof = validaCadastroProf(matricula.getText(), strSenha);
    		if (prof != null) {
    			JanelaProfSelecaoDisciplina janelanovaprof = new JanelaProfSelecaoDisciplina(prof);
    			janelanovaprof.setInicial(this);
    			janelanovaprof.setVisible(true);
    			senha.setText("");
    			setVisible(false);
    		}
    	}
    	else if (matricula.getText().length() == 10){
    		Aluno aluno = validaCadastroAluno(matricula.getText(), strSenha);
    		if (aluno != null) {
    			JanelaAlunoSelecDisciplina janelanova = new JanelaAlunoSelecDisciplina(aluno);
    			janelanova.setInicial(this);
    			janelanova.setVisible(true);
    			senha.setText("");
    			setVisible(false);
    		}
    	}
    	else senhaIncorreta.setText("Matrícula inexistente!");
    	
    }//GEN-LAST:event_bttnEntrarActionPerformed

    /**
     * @param args the command line arguments
     */

    /**
     *
     * 
     */

    /**
     *
     * @param args
     */
    @SuppressWarnings({ "unchecked"})
	public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrimeiraJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimeiraJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimeiraJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeiraJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeiraJanela().setVisible(true);
            }
        });
        
        
        try {
    		FileInputStream fin = new FileInputStream("dados.txt");
	    	ObjectInputStream ois = new ObjectInputStream(fin);
	    	//ObjArrays objeto = (ObjArrays) ois.readObject();
	    	ObjArrays.setProfessoresArray((ArrayList<Professor>) ois.readObject());
	    	ObjArrays.setDisciplinasArray((ArrayList<Disciplina>) ois.readObject());
	    	System.out.println(ObjArrays.getDisciplinas().get(0).getNome());
	    	ObjArrays.setAlunosArray((ArrayList<Aluno>) ois.readObject());
	    	ObjArrays.setFinalProf(ois.readInt());
	    	ObjArrays.setFinalDisc(ois.readInt());
	    	ObjArrays.setFinalAlun(ois.readInt());
	    	ObjArrays.setDiscArray((String[])ois.readObject());
	    	ois.close();
	    	System.out.println(ObjArrays.getProfessores().get(0).getMatricula());
    	}
    	catch (Exception ex){
    		ex.printStackTrace();
    	}
        
        if (ObjArrays.getFinaldisc() < 21){
        	ObjArrays.setDisciplinas("Língua Portuguesa", "Humanas");
            ObjArrays.setDisciplinas("Geografia Fisica", "Humanas");
            ObjArrays.setDisciplinas("Geografia Política", "Humanas");
            ObjArrays.setDisciplinas("História Antiga", "Humanas");
            ObjArrays.setDisciplinas("História Moderna", "Humanas");
            ObjArrays.setDisciplinas("História do Brasil", "Humanas");
            ObjArrays.setDisciplinas("Filosofia", "Humanas");
            ObjArrays.setDisciplinas("Sociologia", "Humanas");
            ObjArrays.setDisciplinas("Língua Inglesa", "Humanas");
            ObjArrays.setDisciplinas("Matemática: Geometria", "Exatas");
            ObjArrays.setDisciplinas("Matemática: Trigonometria", "Exatas");
            ObjArrays.setDisciplinas("Matemática Básica", "Exatas");
            ObjArrays.setDisciplinas("Física Mecânica", "Exatas");
            ObjArrays.setDisciplinas("Física Térmica", "Exatas");
            ObjArrays.setDisciplinas("Física Óptica", "Exatas");
            ObjArrays.setDisciplinas("Física Elétrica", "Exatas");
            ObjArrays.setDisciplinas("Química", "Exatas");
            ObjArrays.setDisciplinas("Química Orgânica", "Exatas");
            ObjArrays.setDisciplinas("Ecologia", "Biológicas");
            ObjArrays.setDisciplinas("Genética", "Biológicas");
            ObjArrays.setDisciplinas("Bioquímica", "Biológicas");
        }
        
        
    }
    private javax.swing.JButton bttnEntrar;
    private javax.swing.JButton bttnSair;
    private JButton btnSouProfessor;
    private JButton btnSouAluno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matricula;
    private JPasswordField senha;
    private JLabel senhaIncorreta;
    // End of variables declaration//GEN-END:variables


    private Professor validaCadastroProf(String matricula, String senha) {
        Professor prof = ObjArrays.buscaProfessor(matricula);
        if (prof != null){
        	if (senha.equals(prof.getSenha())){
        		return prof;
        	}
        	else {
        		senhaIncorreta.setText("Senha Incorreta!");
        		return null;
        	}
        }
        else {
        	senhaIncorreta.setText("Matrícula inexistente!");
        	return null;
        }

    }
    
    private Aluno validaCadastroAluno(String matricula, String senha) {
        Aluno aluno = ObjArrays.buscaAluno(matricula);
        if (aluno != null){
        	if (senha.equals(aluno.getSenha())){
        		return aluno;
        	}
        	else {
        		senhaIncorreta.setText("Senha Incorreta!");
        		return null;
        	}
        }
        else {
        	senhaIncorreta.setText("Matrícula inexistente!");
        	return null;
        }

    }
	
	public static class ConfigFocusOrder extends FocusTraversalPolicy {
		Vector<Component> order;
		
		public ConfigFocusOrder(Vector<Component> order) {
			this.order = new Vector<Component>(order.size());
			this.order.addAll(order);
		}
		
		public Component getComponentAfter(Container focusCycleRoot, Component aComponent) {
			int idx = (order.indexOf(aComponent) + 1) % order.size();
			return order.get(idx);
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component aComponent) {
			int idx = order.indexOf(aComponent) - 1;
			if (idx < 0) {
				idx = order.size() - 1;
			}
			return order.get(idx);
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			return order.get(0);
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			return order.lastElement();
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			return order.get(0);
		}
	}
}


