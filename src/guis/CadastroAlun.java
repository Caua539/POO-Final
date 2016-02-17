/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

import mainpkg.ObjArrays;

import javax.swing.JFormattedTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JLabel;

/**
 *
 * @author Ana Luísa, Cauã
 */
public class CadastroAlun extends javax.swing.JFrame {
	
	private PrimeiraJanela inicial;
	private boolean senhasconferem = false;
	private boolean nomeconferido = false;
	
	public void setInicial(PrimeiraJanela inicial){
		this.inicial = inicial;
	}
	
	public PrimeiraJanela getInicial(){
		return inicial;
	}

    /**
     * Creates new form Protótipo
     */
    public CadastroAlun() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        nome.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		if(nome.getText().equals("")){
        			confereNome.setText("Insira um nome");
        			nomeconferido = false;
        		}
        		else {
        			confereNome.setText("");
        			nomeconferido = true;
        		}
        	}
        });
        jLabel3 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        senha.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent e) {
        		String senhaStr = new String(senha.getPassword());
        		if(senhaStr.equals("")){
        			confereSenha.setText("Insira uma senha");
        			senhasconferem = false;
        		}
        		else confereSenha.setText("");
        	}
        });
        confereSenha = new javax.swing.JLabel();
        confereSenha.setForeground(Color.RED);
        jLabel7 = new javax.swing.JLabel();
        confirmaSenha = new javax.swing.JPasswordField();
        bttnContinuar = new javax.swing.JButton();
        bttnSair = new javax.swing.JButton();
        confirmpasswrong = new JLabel();

        jButton1.setText("jButton1");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new TitledBorder(new LineBorder(new Color(99, 130, 191)), "Cadastro de Aluno", TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font("Sylfaen", 1, 24), null));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        nome.setFont(new java.awt.Font("Tahoma", 0, 14));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Matr\u00EDcula");

        matricula.setFont(new java.awt.Font("Tahoma", 0, 14));
        matricula.setBackground(Color.LIGHT_GRAY);
        matricula.setText(ObjArrays.getAlunMatricula(ObjArrays.getFinalAlun()));
        matricula.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Digite sua senha:");

        senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senha.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Digite novamente:");

        confirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmaSenha.setToolTipText("");
        confirmaSenha.addFocusListener(new FocusAdapter() {
        	public void focusLost(FocusEvent e) {
        		String strConf = new String(confirmaSenha.getPassword());
        		String strSenha = new String(senha.getPassword());
        		if (!(strConf.equals(strSenha))){
        			confirmpasswrong.setText("Senhas não conferem");
        			senhasconferem = false;
        		}
        		else {
        			confirmpasswrong.setText("");
        			senhasconferem = true;
        		}
    		}
        });
        
        confirmpasswrong.setForeground(Color.RED);

        bttnContinuar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bttnContinuar.setText("Continuar");
        bttnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnContinuarActionPerformed(evt);
            }
        });

        bttnSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bttnSair.setText("Sair");
        bttnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSairActionPerformed(evt);
            }
        });
        
        confereNome = new JLabel("");
        confereNome.setForeground(Color.RED);
        
        
       
        GroupLayout gl_jPanel1 = new GroupLayout(jPanel1);
        gl_jPanel1.setHorizontalGroup(
        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addGap(12)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addComponent(jLabel3)
        					.addGap(12)
        					.addComponent(matricula, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addComponent(jLabel2)
        					.addGap(12)
        					.addComponent(nome, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(confereNome, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addComponent(jLabel4)
        					.addGap(12)
        					.addComponent(senha, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(confereSenha))
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addComponent(jLabel7)
        					.addGap(12)
        					.addComponent(confirmaSenha, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(confirmpasswrong, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addComponent(bttnSair)
        					.addPreferredGap(ComponentPlacement.RELATED, 511, Short.MAX_VALUE)
        					.addComponent(bttnContinuar))))
        );
        gl_jPanel1.setVerticalGroup(
        	gl_jPanel1.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jPanel1.createSequentialGroup()
        			.addGap(12)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(2)
        					.addComponent(jLabel3))
        				.addComponent(matricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(22)
        					.addComponent(jLabel2))
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(20)
        					.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
        						.addComponent(nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(confereNome))))
        			.addGap(18)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(2)
        					.addComponent(jLabel4))
        				.addComponent(senha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(3)
        					.addComponent(confereSenha)))
        			.addGap(8)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_jPanel1.createSequentialGroup()
        					.addGap(2)
        					.addComponent(jLabel7))
        				.addGroup(gl_jPanel1.createParallelGroup(Alignment.BASELINE)
        					.addComponent(confirmaSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(confirmpasswrong)))
        			.addGap(28)
        			.addGroup(gl_jPanel1.createParallelGroup(Alignment.LEADING)
        				.addComponent(bttnSair)
        				.addComponent(bttnContinuar))
        			.addGap(36))
        );
        jPanel1.setLayout(gl_jPanel1);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnContinuarActionPerformed
    	if(senhasconferem & nomeconferido){
        	String strSenha = new String(senha.getPassword());
        	ObjArrays.setDadosAlunos(nome.getText(),strSenha);
        	DisciplinasAluno disalun = new DisciplinasAluno();
        	disalun.setCastro(this);
        	disalun.setVisible(true);
        	setVisible(false);
    	}
    	
    }//GEN-LAST:event_bttnContinuarActionPerformed

    private void bttnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSairActionPerformed
    	inicial.setVisible(true);
    	setVisible(false);
    }//GEN-LAST:event_bttnSairActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnContinuar;
    private javax.swing.JButton bttnSair;
    private javax.swing.JPasswordField confirmaSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel confereSenha;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField senha;
    private JLabel confirmpasswrong;
    private JLabel confereNome;
}
