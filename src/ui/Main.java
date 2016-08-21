/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import business.Komponent;
import business.KomponentList;
import business.Product;
import business.ProductList;
import java.awt.Dialog;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Chuot Bach
 */
public class Main extends javax.swing.JFrame {
    private ProductList allProducts = null;
    private ProductList searchedProducts = null;
    private ProductTableModel model = null;
    private final JFileChooser fileChooser = new JFileChooser();
    /**
     * Creates new form Main
     */

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        aboutDialog.setLocationRelativeTo(this);
        
        model = new ProductTableModel();
        allProducts = model.getProductList();
        jTable.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        detailsDialog = new javax.swing.JDialog();
        productDetails1 = new ui.ProductDetails();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnViewAll = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnFile = new javax.swing.JMenu();
        btnNew = new javax.swing.JMenuItem();
        btnImport = new javax.swing.JMenuItem();
        mnExport = new javax.swing.JMenuItem();
        btnExit = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();

        aboutDialog.setMinimumSize(new java.awt.Dimension(400, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product Management System");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html> Phiên bản: 1.0 <br> Tác giả: Bạch Minh Đức <br> Email: minhduc150496@gmail.com <br> Facebook: <a href=\"#\">www.facebook.com</a> </html>");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout aboutDialogLayout = new javax.swing.GroupLayout(aboutDialog.getContentPane());
        aboutDialog.getContentPane().setLayout(aboutDialogLayout);
        aboutDialogLayout.setHorizontalGroup(
            aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        aboutDialogLayout.setVerticalGroup(
            aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutDialogLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        detailsDialog.setMinimumSize(new java.awt.Dimension(400, 300));
        detailsDialog.setModal(true);

        productDetails1.setMinimumSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout detailsDialogLayout = new javax.swing.GroupLayout(detailsDialog.getContentPane());
        detailsDialog.getContentPane().setLayout(detailsDialogLayout);
        detailsDialogLayout.setHorizontalGroup(
            detailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        detailsDialogLayout.setVerticalGroup(
            detailsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Management System");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Stt", "Tên sản phẩm", "Serials"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnViewAll.setText("Xem tất cả");
        btnViewAll.setFocusable(false);
        btnViewAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewAll.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });
        jToolBar1.add(btnViewAll);

        btnAdd.setText("Thêm dòng");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAdd);

        btnDelete.setText("Xoá dòng");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDelete);

        btnUp.setText("Chuyển lên");
        btnUp.setFocusable(false);
        btnUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUp);

        btnDown.setText("Chuyển xuống");
        btnDown.setFocusable(false);
        btnDown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDown.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDown);

        btnDetails.setText("Chi tiết");
        btnDetails.setFocusable(false);
        btnDetails.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDetails.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDetails);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        txtSearch.setText("Nhập serial");
        jToolBar2.add(txtSearch);

        btnSearch.setText("Tìm kiếm");
        btnSearch.setFocusable(false);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jToolBar2.add(btnSearch);

        btnFile.setText("Tệp");

        btnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnNew.setText("Tạo mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        btnFile.add(btnNew);

        btnImport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        btnImport.setText("Mở từ file Excel");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });
        btnFile.add(btnImport);

        mnExport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnExport.setText("Xuất file Excel");
        mnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExportActionPerformed(evt);
            }
        });
        btnFile.add(mnExport);

        btnExit.setText("Thoát");
        btnFile.add(btnExit);

        jMenuBar1.add(btnFile);

        mnHelp.setText("Trợ giúp");

        mnAbout.setText("Giới thiệu");
        mnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        mnHelp.add(mnAbout);

        jMenuBar1.add(mnHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(true);
        btnDown.setEnabled(true);
        btnUp.setEnabled(true);
        
        model.setProductList(allProducts);
        jTable.updateUI();
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(false);
        btnDown.setEnabled(false);
        btnUp.setEnabled(false);
        
        String serial = txtSearch.getText();
        searchedProducts = allProducts.searchBySerial(serial);
        model.setProductList(searchedProducts);
        jTable.updateUI();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void mnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAboutActionPerformed
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_mnAboutActionPerformed

    private void mnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExportActionPerformed
        try {
            fileChooser.showSaveDialog(this);
            File outputFile = fileChooser.getSelectedFile();
            if (outputFile==null) return;
            
            WritableWorkbook workbook = Workbook.createWorkbook(outputFile);
            WritableSheet sheet = workbook.createSheet("Sheet1", 0);
            
            String[] headers = {"Stt","Tên sản phẩm","Serials"};
            for(int i=0; i<headers.length; i++) {
                Label label = new Label(i, 0, headers[i]);
                sheet.addCell(label);
            }
            for (int i = 0; i < allProducts.size(); i++) {
                sheet.addCell(new Label(0, i+1, i+1+""));
                sheet.addCell(new Label(1, i+1, allProducts.get(i).getName()));
                KomponentList komponentList = allProducts.get(i).getKomponentList();
                for (int j = 0; j < komponentList.size(); j++) {
                    Komponent komponent = komponentList.get(j);
                    sheet.addCell(new Label(j*2+2, i+1, komponent.getName()));
                    sheet.addCell(new Label(j*2+3, i+1, komponent.getSerial()));
                }
            }
            
            workbook.write();
            workbook.close();
            
            JOptionPane.showMessageDialog(this, "Xuất file Excel thành công.");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra. Xin vui lòng thử lại.");
        } catch (WriteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra. Xin vui lòng thử lại.");
        }
    }//GEN-LAST:event_mnExportActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        try {
            fileChooser.showSaveDialog(this);
            File file = fileChooser.getSelectedFile();
            if (file==null) return;
            
            Workbook workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
            
            ProductList newList = new ProductList();
            for (int row = 1; row < sheet.getRows(); row++) {
                ///sheet.getColumns();
                // 1. check stt
                String stt = sheet.getCell(0, row).getContents();
                if (stt.equals("")) break;
                // 2. get Cell content
                String name = sheet.getCell(1, row).getContents();
                
                KomponentList komponentList = new KomponentList();
                for(int col = 2; col < sheet.getColumns(); col+=2) {
                    Komponent komponent = new Komponent();
                    komponent.setName(sheet.getCell(col, row).getContents());
                    komponent.setSerial(sheet.getCell(col+1, row).getContents());
                    komponentList.add(komponent);
                }
                
                // 3. add new product
                Product product = new Product();
                product.setName(name);
                product.setKomponentList(komponentList);
                newList.add(product);
            }
            
            allProducts = newList;
            model.setProductList(allProducts);
            jTable.updateUI();        
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra. Xin vui lòng thử lại.");
        } catch (BiffException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra. Xin vui lòng thử lại.");
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        allProducts.clear();
        jTable.updateUI();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        allProducts.add(new Product());
        jTable.updateUI();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = jTable.getSelectedRow();
        if (row < 0) return;
        allProducts.remove((int)row);        
        jTable.updateUI();
        jTable.setRowSelectionInterval(row-1, row-1);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        int row = jTable.getSelectedRow();
        if (row < 0) return; // no select
        if (row == 0) return; // cannot move up
        allProducts.swap(row, row-1);
        jTable.updateUI();
        jTable.setRowSelectionInterval(row-1, row-1);
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        int row = jTable.getSelectedRow();
        if (row < 0) return; // no select
        if (row == allProducts.size()-1) return; // cannot move up
        allProducts.swap(row, row+1);
        jTable.updateUI();
        jTable.setRowSelectionInterval(row+1, row+1);
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        int row = jTable.getSelectedRow();
        if (row < 0) return; // no select
        
        Product product = allProducts.get(row);        
        productDetails1.loadProduct(product);
        detailsDialog.setVisible(true);
        
    }//GEN-LAST:event_btnDetailsActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog aboutDialog;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnDown;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenu btnFile;
    private javax.swing.JMenuItem btnImport;
    private javax.swing.JMenuItem btnNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUp;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JDialog detailsDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JMenuItem mnExport;
    private javax.swing.JMenu mnHelp;
    private ui.ProductDetails productDetails1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
