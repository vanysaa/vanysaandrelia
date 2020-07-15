package rumahsakit;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class pasien extends javax.swing.JFrame {
    private Connection Con;
    private Statement stm;

    /**
     * Creates new form user
     */
    public pasien() {
        initComponents();
        tampilkan_data();
         setLocationRelativeTo(this);
        aktif(false);
        setTombol(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kdpasien = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        btcari = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        umur = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jk = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        bttambah = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Kode Pasien");

        jLabel2.setText("Nama Pasien");

        kdpasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kdpasienMouseClicked(evt);
            }
        });
        kdpasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kdpasienActionPerformed(evt);
            }
        });

        btcari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahsakit/Text preview.png"))); // NOI18N
        btcari.setText("Cari");
        btcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcariActionPerformed(evt);
            }
        });

        jLabel3.setText("Umur");

        jLabel4.setText("Jenis Kelamin");

        jLabel6.setText("Alamat");

        jk.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PILIH JENIS KELAMIN", "Laki-Laki", "Perempuan" }));
        jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnama)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(kdpasien, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btcari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(umur, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alamat)
                    .addComponent(jk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kdpasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(umur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bttambah.setText("Tambah");
        bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahActionPerformed(evt);
            }
        });

        btsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahsakit/gtk-save-as.png"))); // NOI18N
        btsimpan.setText("Simpan");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahsakit/gtk-edit.png"))); // NOI18N
        btedit.setText("Edit");
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });

        bthapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahsakit/document_delete.png"))); // NOI18N
        bthapus.setText("Hapus");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        btbatal.setText("Batal");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        btkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rumahsakit/Cancel.png"))); // NOI18N
        btkeluar.setText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bttambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bthapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btedit)
                    .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsimpan)
                    .addComponent(bthapus)
                    .addComponent(btkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("DATA PASIEN ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        // TODO add your handling code here:
String user_id = kdpasien.getText();
String nama = txtnama.getText();
String umurq = umur.getText();
String jkel = (String) jk.getSelectedItem();
String alamatq = alamat.getText();
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="UPDATE pasien SET nama_pasien='"+nama+"',umur='"+umurq+"',jenis_kelamin='"+jkel+"',alamat='"+alamatq+"' WHERE kd_pasien LIKE '"+user_id+"'";
statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil diedit..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
koneksi.close();
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}finally{
tampilkan_data();
}
    }//GEN-LAST:event_bteditActionPerformed

private void jenis_kelamin(){ 
jk.addItem("Laki-laki"); 
jk.addItem("Perempuan"); 
jk.setSelectedIndex(-1); }
    
    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btkeluarActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
kdpasien.setText("");
txtnama.setText("");
umur.setText("");
jk.setSelectedItem("");
alamat.setText("");
aktif(false);
setTombol(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btbatalActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
String user_id = kdpasien.getText();
String nama = txtnama.getText();
String umurq = umur.getText();
String jkel = (String) jk.getSelectedItem();
String alamatq = alamat.getText();

{
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="insert into pasien values('"+user_id+"','"+nama+"','"+umurq+"','"+jkel+"','"+alamatq+"')";
int executeUpdate = statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
aktif(true);
kdpasien.setText("");
txtnama.setText("");
umur.setText("");
jk.setSelectedItem("");
alamat.setText("");
koneksi.close();
}
catch (     ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
finally {
tampilkan_data();
}
    }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahActionPerformed
aktif(true);
setTombol(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bttambahActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        // TODO add your handling code here:
        String user_id = kdpasien.getText();
      try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="DELETE FROM pasien WHERE 	kd_pasien LIKE '"+user_id+"'";
statement.executeUpdate(sql);
statement.close();
kdpasien.setText("");
txtnama.setText("");
umur.setText("");
jk.setSelectedItem("");
alamat.setText("");
JOptionPane.showMessageDialog(null, "Data berhasil dihapus..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
koneksi.close();
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) { JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}finally{
tampilkan_data();
      }
    }//GEN-LAST:event_bthapusActionPerformed

    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcariActionPerformed
        // TODO add your handling code here:
        String user_id = kdpasien.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
            Statement statement = (Statement) koneksi.createStatement();
            String sql="SELECT * FROM pasien WHERE 	kd_pasien like '"+user_id+"'";
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next())
            {
                aktif(true);
                setTombol(false);
                txtnama.setText(rs.getString(2));
                umur.setText(rs.getString(3));
                jk.setSelectedItem(rs.getString(4));
                alamat.setText(rs.getString(5));
                JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
            }
            statement.close();
            koneksi.close();
        }
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
            //System.err.println("Exception: "+e.getMessage());
        }
    }//GEN-LAST:event_btcariActionPerformed

    private void kdpasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kdpasienActionPerformed
        // TODO add your handling code her
    }//GEN-LAST:event_kdpasienActionPerformed

    private void jkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jkActionPerformed

    private void kdpasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kdpasienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kdpasienMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pasien().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btcari;
    private javax.swing.JButton btedit;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton bttambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jk;
    private javax.swing.JTextField kdpasien;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField umur;
    // End of variables declaration//GEN-END:variables

    private void tampilkan_data() {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("KODE PASIEN");
        tabelmapel.addColumn("NAMA");
        tabelmapel.addColumn("UMUR");
        tabelmapel.addColumn("JENIS KELAMIN");
        tabelmapel.addColumn("ALAMAT");
        
        try {
            open_db();
             String sql = "select * from pasien";
            stm = (Statement) Con.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[5];
                o[0] = rs.getString("kd_pasien");
                o[1] = rs.getString("nama_pasien");
                o[2] = rs.getString("umur");
                o[3] = rs.getString("jenis_kelamin");
                o[4] = rs.getString("alamat");
                tabelmapel.addRow(o);
                
            }
           jTable1.setModel(tabelmapel);
        } catch (Exception e) {
        }
    }

    private void open_db() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
Con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
            stm = (Statement) Con.createStatement();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi gagal");
            System.out.println(e.getMessage());
        }
    }

    private void aktif(boolean x) {
        txtnama.setEditable(x);
      
      kdpasien.requestFocus();}

    private void setTombol(boolean t) {
     bttambah.setEnabled(t);
     btsimpan.setEnabled(!t);
     bthapus.setEnabled(!t);
     btedit.setEnabled(!t);
     btbatal.setEnabled(!t);
    }

    private void btcariActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}