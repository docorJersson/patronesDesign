/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesDesign.formularios;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import patronesDesign.entidades.Cuenta;
import patronesDesign.entidades.TipoMovimiento;
import patronesDesign.entidades.empleado;
import patronesDesign.entidades.movimiento;
import patronesDesign.entidades.transferenciaMovimiento;
import patronesDesign.logica.CuentaLogica;
import patronesDesign.logica.EmpleadoLogica;
import patronesDesign.logica.movimientosLogica;
import patronesDesign.operaciones.MovimientoOperacion;

/**
 *
 * @author Jersson Chilon
 */
public class Movimientos extends javax.swing.JDialog {

    private ArrayList<TipoMovimiento> lista;
    private ArrayList<Cuenta> listaCuenta;
    private Cuenta cuenta;
    private Cuenta cuentaDestino;
    private TipoMovimiento t;
    private boolean estado = false;
    private ArrayList<empleado> empleado;
    private empleado e;

    public Movimientos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(null, "Buen día estimado cliente. \n Por motivos técnicos la plataforma solo está habilidada para las siguientes operaciones: \n 1:Depósitos \n 2:Retiros \n 3:Transferencias \n De antemano le ofrecemos nuestras más sentidas disculpas y le hacemos saber que estamos trabajando en ello.");
        initComponents();
        llenarCuenta(null, lsCuenta);
        llenarAccion();
        panelDestino(estado);
        panelAccion(false);
        detalleMovimiento(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAccion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lsAccion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtAccion = new javax.swing.JTextField();
        btnAccion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        lsCuenta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroMovimiento = new javax.swing.JTextField();
        panelDestino = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSaldoDestino = new javax.swing.JTextField();
        lsCuentaDestino = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFechaDestino = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fechaOperacion = new javax.swing.JTextField();
        lsEmpleado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnRealizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pAccion.setBackground(new java.awt.Color(255, 255, 255));
        pAccion.setEnabled(false);

        jLabel1.setText("Accion");

        lsAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        lsAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsAccionActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Acción:");

        txtAccion.setEnabled(false);

        btnAccion.setText("Confirmar");
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pAccionLayout = new javax.swing.GroupLayout(pAccion);
        pAccion.setLayout(pAccionLayout);
        pAccionLayout.setHorizontalGroup(
            pAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pAccionLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lsAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccion))
                    .addGroup(pAccionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAccion)))
                .addContainerGap())
        );
        pAccionLayout.setVerticalGroup(
            pAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lsAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("C° Cuenta");

        txtSaldo.setEnabled(false);

        lsCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        lsCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsCuentaActionPerformed(evt);
            }
        });

        jLabel4.setText("Saldo:");

        jLabel5.setText("Fecha de Creación:");

        txtFecha.setEnabled(false);

        jLabel12.setText("N° Movimiento");

        txtNumeroMovimiento.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lsCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumeroMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(txtSaldo))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lsCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumeroMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDestino.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("C° Cuenta");

        txtSaldoDestino.setEnabled(false);

        lsCuentaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        lsCuentaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsCuentaDestinoActionPerformed(evt);
            }
        });

        jLabel7.setText("Saldo:");

        jLabel8.setText("Fecha de Creación:");

        txtFechaDestino.setEnabled(false);

        javax.swing.GroupLayout panelDestinoLayout = new javax.swing.GroupLayout(panelDestino);
        panelDestino.setLayout(panelDestinoLayout);
        panelDestinoLayout.setHorizontalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDestinoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lsCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDestinoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaDestino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSaldoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDestinoLayout.setVerticalGroup(
            panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lsCuentaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSaldoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFechaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Fecha:");

        jLabel10.setText("Empleado:");

        fechaOperacion.setEnabled(false);
        fechaOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaOperacionActionPerformed(evt);
            }
        });

        lsEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        lsEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsEmpleadoActionPerformed(evt);
            }
        });

        jLabel11.setText("Importe:");

        btnRealizar.setText("Realizar");
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtImporte)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lsEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRealizar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(fechaOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(128, 89, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Sitka Subheading", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Banco");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Subheading", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("EuroBank");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 7)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tu banco de confianza ....");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Sitka Subheading", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Movimientos");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void panelAccion(boolean e) {
        lsAccion.setEnabled(e);
        txtAccion.setEnabled(e);
        btnAccion.setEnabled(e);
    }

    void llenarAccion() {
        lista = movimientosLogica.listMovimientos();
        for (TipoMovimiento t : lista) {
            lsAccion.addItem(t.toString());
        }
    }

    void llenarEmpleado() {
        empleado = EmpleadoLogica.listEmpleado();
        int size = empleado.size();
        for (empleado e : empleado) {
            lsEmpleado.addItem(e.getNombre());
        }
    }

    void panelDestino(boolean estado) {
        panelDestino.setVisible(estado);
    }

    void llenarCuenta(String exepcion, JComboBox select) {
        try {
            listaCuenta = CuentaLogica.listCuenta();
            for (Cuenta l : listaCuenta) {
                if (!l.getCuenCodigo().equals(exepcion)) {
                    select.addItem(l.getCuenCodigo());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Movimientos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void intercambio(TipoMovimiento tA, TipoMovimiento tN) {

    }
    private void lsAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsAccionActionPerformed
        if (lsAccion.getSelectedIndex() == 0) {
            txtAccion.setText("");
        } else {
            if(lsAccion.getSelectedItem().toString().toUpperCase().equals("TRANSFERENCIA") || lsAccion.getSelectedItem().toString().toUpperCase().equals("DEPOSITO") || lsAccion.getSelectedItem().toString().toUpperCase().equals("RETIRO"))
            {
                
            
            int i = lsAccion.getSelectedIndex();
            t = lista.get(i - 1);
            String descripcion = t.getTipoDescripcion().toUpperCase();
            if (descripcion.equals("TRANSFERENCIA")) {
                estado = true;
                llenarCuenta(cuenta.getCuenCodigo(), lsCuentaDestino);
            } else {
                estado = false;
            }
            txtAccion.setText(t.getTipoAccion());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Operaciones disponibles \n 1:Depósitos \n 2:Retiros \n 3:Transferencias \n De antemano le ofrecemos nuestras más sentidas disculpas y le hacemos saber que estamos trabajando en ello.");
                lsAccion.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_lsAccionActionPerformed
    void detalleMovimiento(boolean e)
    {
        lsEmpleado.setEnabled(e);
        btnRealizar.setEnabled(e);
        txtImporte.setEnabled(e);
    }
    void numeroMovimiento(String cuenta) {
        txtNumeroMovimiento.setText("");
        int numero = movimientosLogica.numeroMovimiento(cuenta);
        txtNumeroMovimiento.setText(String.valueOf(numero));
    }
    private void lsCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsCuentaActionPerformed
        if (lsCuenta.getSelectedIndex() == 0) {
            txtSaldo.setText("");
            txtFecha.setText("");
        } else {
            int i = lsCuenta.getSelectedIndex();
            cuenta = listaCuenta.get(i - 1);
            numeroMovimiento(cuenta.getCuenCodigo());
            txtSaldo.setText(String.valueOf(cuenta.getCuenSaldo()));
            txtFecha.setText(cuenta.getCuenFechaCreacion().toString());
            panelAccion(true);
        }    }//GEN-LAST:event_lsCuentaActionPerformed

    private void lsCuentaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsCuentaDestinoActionPerformed
        if (lsCuentaDestino.getSelectedIndex() == 0) {
            txtSaldoDestino.setText("");
            txtFechaDestino.setText("");
        } else {
            int i = lsCuentaDestino.getSelectedIndex();
            cuentaDestino = listaCuenta.get(i - 1);
            txtSaldoDestino.setText(String.valueOf(cuentaDestino.getCuenSaldo()));
            txtFechaDestino.setText(cuentaDestino.getCuenFechaCreacion().toString());
        }
    }//GEN-LAST:event_lsCuentaDestinoActionPerformed

    private void fechaOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaOperacionActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        panelDestino(estado);
        llenarEmpleado();
        detalleMovimiento(true);
        fechaOperacion.setText(new Date().toString());

    }//GEN-LAST:event_btnAccionActionPerformed
    void updateTabla() {
        MainBank.modelo.setRowCount(0);
        try {
            MainBank.listar();
        } catch (SQLException ex) {
            Logger.getLogger(MainBank.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        if (lsEmpleado.getSelectedIndex() != 0) {
            int i = lsEmpleado.getSelectedIndex();
            e = empleado.get(i - 1);
        }
        int numeroMov = Integer.parseInt(txtNumeroMovimiento.getText());
        LocalDate fechaMov = now();
        float importe = Float.parseFloat(txtImporte.getText());
        String destino = "";
        if (estado) {
            destino = cuentaDestino.getCuenCodigo();
        }
        TipoMovimiento tipo = MovimientoOperacion.seleccion(t.getTipoDescripcion().toUpperCase(), destino);
        tipo.setCuenta(cuenta);
        tipo.setMoviNumero(numeroMov);
        tipo.setMoviFecha(fechaMov);
        tipo.setEmpleado(e);
        tipo.setTipoCodigo(t.getTipoCodigo());
        tipo.setMovImporte(importe);
        boolean accion = movimientosLogica.saveMovimiento(tipo, destino);
        if (accion) {
            JOptionPane.showMessageDialog(null, "Movimiento Guardado");
            updateTabla();
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Movimiento Rechazado");
        }

    }//GEN-LAST:event_btnRealizarActionPerformed

    private void lsEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lsEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Movimientos dialog = new Movimientos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JTextField fechaOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> lsAccion;
    private javax.swing.JComboBox<String> lsCuenta;
    private javax.swing.JComboBox<String> lsCuentaDestino;
    private javax.swing.JComboBox<String> lsEmpleado;
    private javax.swing.JPanel pAccion;
    private javax.swing.JPanel panelDestino;
    private javax.swing.JTextField txtAccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaDestino;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNumeroMovimiento;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtSaldoDestino;
    // End of variables declaration//GEN-END:variables
}
