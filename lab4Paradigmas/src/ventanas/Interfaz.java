//@author Maria Jesus Canoles
//Rut 20300159-2
//Ultimo Edit 20/09/2020
//@version 1.0
package ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author mariajesuscanoles
 */
public class Interfaz extends javax.swing.JFrame {
    
    Repositorio repositorio;
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        workspace = new javax.swing.JLabel();
        index = new javax.swing.JLabel();
        localRepository = new javax.swing.JLabel();
        remoteRepository = new javax.swing.JLabel();
        init = new javax.swing.JButton();
        add = new javax.swing.JButton();
        commit = new javax.swing.JButton();
        nuevoArchivo = new javax.swing.JButton();
        pull = new javax.swing.JButton();
        push = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        zona4 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        zona3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        zona2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        zona1 = new javax.swing.JTextArea();
        log = new javax.swing.JButton();
        branch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        workspace.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        workspace.setText("WORKSPACE");
        getContentPane().add(workspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        index.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        index.setText("INDEX");
        getContentPane().add(index, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        localRepository.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        localRepository.setText("LOCAL REPOSITORY");
        getContentPane().add(localRepository, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        remoteRepository.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        remoteRepository.setText("REMOTE REPOSITORY");
        getContentPane().add(remoteRepository, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, 20));

        init.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        init.setText("Init");
        init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initActionPerformed(evt);
            }
        });
        getContentPane().add(init, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        add.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        commit.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        commit.setText("Commit");
        commit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitActionPerformed(evt);
            }
        });
        getContentPane().add(commit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        nuevoArchivo.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        nuevoArchivo.setText("Nuevo Archivo");
        nuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevoArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        pull.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        pull.setText("Pull");
        pull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pullActionPerformed(evt);
            }
        });
        getContentPane().add(pull, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, -1, -1));

        push.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        push.setText("Push");
        push.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pushActionPerformed(evt);
            }
        });
        getContentPane().add(push, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, -1));

        zona4.setColumns(20);
        zona4.setRows(5);
        jScrollPane1.setViewportView(zona4);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 450, 90));

        zona3.setColumns(20);
        zona3.setRows(5);
        jScrollPane2.setViewportView(zona3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 450, 90));

        zona2.setColumns(20);
        zona2.setRows(5);
        jScrollPane3.setViewportView(zona2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 450, 90));

        zona1.setColumns(20);
        zona1.setRows(5);
        jScrollPane4.setViewportView(zona1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 450, 90));

        log.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        log.setText("Log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, -1, -1));

        branch.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        branch.setText("Branch");
        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
    
    /** 
     * metodo que muestra una ventana para realizar un git init, en caso
     * que no cumpla para hacerlo, se le informa al usuario
     */
    private void initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initActionPerformed
        if (this.repositorio == null){
            GitInit init = new GitInit();
            init.repositorio = this.repositorio;
            init.setVisible(true);
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null,"Ya inicializo su repositorio","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_initActionPerformed
    
    /** 
     * metodo que muestra una ventana para realizar un git add, en caso
     * que no cumpla para hacerlo, se le informa al usuario
     */
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (this.repositorio == null){
            JOptionPane.showMessageDialog(null,"Debe inicializar su repositorio","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if (this.repositorio.workspace.archivos.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sin archivos en el Workspace","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            GitAdd add = new GitAdd();
            add.repositorio = this.repositorio;
            add.setVisible(true);
            this.setVisible(false); 
        } 
    }//GEN-LAST:event_addActionPerformed
    
    /** 
     * metodo que muestra una ventana para realizar un git commit, en caso
     * que no cumpla para hacerlo, se le informa al usuario
     */
    private void commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitActionPerformed
        if (this.repositorio == null){
            JOptionPane.showMessageDialog(null,"Debe inicializar su repositorio","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if (this.repositorio.index.archivos.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sin archivos en el Index","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            GitCommit commit = new GitCommit();
            commit.repositorio = this.repositorio;
            commit.setVisible(true);
            this.setVisible(false); 
        } 
    }//GEN-LAST:event_commitActionPerformed
    
    /** 
     * metodo que muestra una ventana para crear un archivo, en caso
     * que no cumpla para hacerlo, se le informa al usuario
     */
    private void nuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoArchivoActionPerformed
        if (this.repositorio == null){
            JOptionPane.showMessageDialog(null,"Debe inicializar su repositorio","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            CrearArchivo archivo = new CrearArchivo();
            archivo.repositorio = this.repositorio;
            archivo.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_nuevoArchivoActionPerformed
    
    /** 
     * metodo que muestra una ventana para realizar un git pull, en caso
     * que no cumpla para hacerlo, se le informa al usuario
     */
    private void pullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pullActionPerformed
        if (this.repositorio == null){
            JOptionPane.showMessageDialog(null,"Debe inicializar su repositorio","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if (this.repositorio.remote.commits.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sin commits en el Remote","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.repositorio.gitPull();
            this.zona1.setText(this.repositorio.workspace.toString());
            this.zona2.setText(this.repositorio.index.toString());
            this.zona3.setText(this.repositorio.local.toString());
            this.zona4.setText(this.repositorio.remote.toString());
        }
    }//GEN-LAST:event_pullActionPerformed
    
    /** 
     * metodo que muestra una ventana para realizar un git push, en caso
     * que no cumpla para hacerlo, se le informa al usuario
     */
    private void pushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pushActionPerformed
        if (this.repositorio == null){
            JOptionPane.showMessageDialog(null,"Debe inicializar su repositorio","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if (this.repositorio.local.commits.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sin commits en el Local","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            this.repositorio.gitPush();
            this.zona1.setText(this.repositorio.workspace.toString());
            this.zona2.setText(this.repositorio.index.toString());
            this.zona3.setText(this.repositorio.local.toString());
            this.zona4.setText(this.repositorio.remote.toString());
        }    
    }//GEN-LAST:event_pushActionPerformed
    
    /** 
     * metodo que muestra una ventana para realizar un git log, en caso
     * que no cumpla para hacerlo, se le informa al usuario
     */
    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        GitLog log = new GitLog();
        log.repositorio = this.repositorio;
        log.informacion.setText(this.repositorio.gitLog());
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logActionPerformed
    
    /** 
     * metodo que muestra una ventana para realizar un git branch, en caso
     * que no cumpla para hacerlo, se le informa al usuario
     */
    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        if (this.repositorio == null){
            JOptionPane.showMessageDialog(null,"Debe inicializar su repositorio","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if (this.repositorio.index.archivos.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sin archivos en el Index","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            GitBranch branch = new GitBranch();
            branch.repositorio = this.repositorio;
            branch.setVisible(true);
            this.setVisible(false); 
        } 
    }//GEN-LAST:event_branchActionPerformed
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton branch;
    private javax.swing.JButton commit;
    private javax.swing.JLabel index;
    private javax.swing.JButton init;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel localRepository;
    private javax.swing.JButton log;
    private javax.swing.JButton nuevoArchivo;
    private javax.swing.JButton pull;
    private javax.swing.JButton push;
    private javax.swing.JLabel remoteRepository;
    private javax.swing.JButton salir;
    private javax.swing.JLabel workspace;
    public javax.swing.JTextArea zona1;
    public javax.swing.JTextArea zona2;
    public javax.swing.JTextArea zona3;
    public javax.swing.JTextArea zona4;
    // End of variables declaration//GEN-END:variables
}
