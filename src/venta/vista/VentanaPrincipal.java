package venta.vista;

import java.awt.Image;
import venta.autos.Auto;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex Córdova
 * Fecha de creación: Mayo 26 de 2020
 * Fecha de modificación: 28 de Mayo de 2020
 * Programa para almacenar automóviles
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    Auto[] autos;
    String encabezado[] = new String[]{"Id", "Marca", "Modelo", "Valor comercial","Tipo","Valor final"};
    DefaultTableModel defaultTable;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        defaultTable = new DefaultTableModel(encabezado,0){
            @Override
            public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
        };
        tablaAutos.setModel(defaultTable);
        setLocationRelativeTo(null);
        this.desactivarEntrada();
        
        eliminar.setEnabled(false);
        actualizar.setEnabled(false);
        //Ajusta el icono al tamaño del Jlabel
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/venta/vista/carroIco.png"));
        ImageIcon imagen2 = new ImageIcon(imagen1.getImage().getScaledInstance(icono.getWidth(), icono.getHeight(), Image.SCALE_DEFAULT));
        icono.setIcon(imagen2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        modelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valorComercial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        limpiarCampos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        actualizar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        totalAutos = new javax.swing.JTextField();
        idAuto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));
        setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel2.setText("Marca");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel6.setText("Tipo de auto");

        marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                marcaKeyPressed(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familiar", "Publico", "Carga" }));
        tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tipoKeyPressed(evt);
            }
        });

        modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modeloKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel7.setText("Modelo");

        valorComercial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorComercialKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel8.setText("Valor");

        limpiarCampos.setBackground(new java.awt.Color(255, 255, 255));
        limpiarCampos.setText("Limpiar campos");
        limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(marca)
                    .addComponent(valorComercial))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiarCampos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorComercial)
                    .addComponent(jLabel8)
                    .addComponent(limpiarCampos))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 51));

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.setMaximumSize(new java.awt.Dimension(71, 23));
        eliminar.setMinimumSize(new java.awt.Dimension(71, 23));
        eliminar.setPreferredSize(new java.awt.Dimension(71, 23));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        reiniciar.setBackground(new java.awt.Color(255, 0, 51));
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(153, 184, 229));
        jScrollPane1.setForeground(new java.awt.Color(102, 255, 51));

        tablaAutos.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        tablaAutos.setForeground(new java.awt.Color(255, 112, 0));
        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaAutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaAutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAutos);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de almacén de autos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        icono.setText("jLabel3");

        jLabel3.setText("Almacen de autos y cálculo del precio final");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(34, 34, 34))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel4.setText("Total de autos");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        totalAutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalAutosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalAutosKeyTyped(evt);
            }
        });

        idAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idAutoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idAutoKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel5.setText("Id");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Agregar registro
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
        if(marca.getText().isEmpty() | modelo.getText().isEmpty() | valorComercial.getText().isEmpty() ){
            JOptionPane.showMessageDialog(rootPane, "No pueden haber campos vacios"); 
            return;
        }
        
        int index = this.indexVacio();
        
        if(index!=-1){
            try{
                //Obtenemos los valores ingresados
                String marcaTemp = marca.getText();
                String modeloTemp = modelo.getText();
                String tipoTemp = tipo.getSelectedItem().toString();
                float valorComercialTemp = Float.parseFloat(valorComercial.getText());
                float valorFinal;
                if(valorComercialTemp<150000f){
                    valorFinal = valorComercialTemp*1.16f;          
                }else{
                    valorFinal = valorComercialTemp*1.20f;
                }

                //Guardar los datos en el array
                autos[index] = new Auto(marcaTemp, modeloTemp, tipoTemp, valorComercialTemp, valorFinal, index);
                defaultTable.setRowCount(0);

                //Obtenemos los datos de la lista
                this.imprimirArreglo();
                limpiador();
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error al agregar: "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Total de autos alcanzandos");
        }
    }//GEN-LAST:event_agregarActionPerformed
    
    //Limpia los campos y desactiva los botones editar y actualizar
    private void limpiador(){
        tablaAutos.clearSelection();
        marca.requestFocus();
        marca.setText("");
        modelo.setText("");
        valorComercial.setText("");
        tipo.setSelectedIndex(0);
        idAuto.setText("");
        agregar.setEnabled(true);
        eliminar.setEnabled(false);
        actualizar.setEnabled(false);
    }
    
    /*Esta función regresa el primer "espacio" vacio que encuentre
    *de lo contrario, regresa -1, que indicaría que el arreglo está lleno
    */
    private int indexVacio(){
        int index=-1;
        for(int i=0; i<autos.length; i++){
            if(autos[i]==null){
                index = i;
                break;
            }
        }
        System.out.println("Index: "+index);
        return index;
    }
  
     private void desactivarEntrada(){
         actualizar.setEnabled(false);
         eliminar.setEnabled(false);
         agregar.setEnabled(false);
         tipo.setEnabled(false);
         modelo.setEnabled(false);
         marca.setEnabled(false);
         valorComercial.setEnabled(false);
         limpiarCampos.setEnabled(false);
         idAuto.setEnabled(false);
     }
     
     private void activarEntrada(){
         agregar.setEnabled(true);
         tipo.setEnabled(true);
         modelo.setEnabled(true);
         marca.setEnabled(true);
         valorComercial.setEnabled(true);
         limpiarCampos.setEnabled(true);
     }
    
    private void imprimirArreglo(){
        for (Auto auto : autos) {
            if (auto != null) {
                Object[] objeto = {auto.identificador, auto.marca, auto.modelo, String.format("%.1f", auto.valorComercial), auto.tipo, String.format("%.1f", auto.valorFinal)};
                defaultTable.addRow(objeto);
            }
        }
    }
    //Eliminar registro
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(tablaAutos.getSelectedRow()>=0){
            try{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "Eliminar este auto", "Eliminar", dialogButton);
                if(dialogResult == 0){
                    int index = Integer.parseInt(idAuto.getText());
                    int fila = tablaAutos.getSelectedRow();
                    defaultTable.removeRow(fila);
                    autos[index]= null;
                    defaultTable.setRowCount(0);
                    this.imprimirArreglo();
                    limpiador();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "No se pudo eliminar: "+e.getMessage());
            }
        }else
            JOptionPane.showMessageDialog(rootPane, "Nada seleccionado");
    }//GEN-LAST:event_eliminarActionPerformed

//Función que verifica que solo se ingresen numeros
public void verif(KeyEvent evt){
    char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Igrese solo numeros");
        }
}

//Actualizar registro
    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        
        try{
            //Obtenemos los valores ingresados
            String marcaTemp = marca.getText();
            String modeloTemp = modelo.getText();
            String tipoTemp = tipo.getSelectedItem().toString();
            float valorComercialTemp = Float.parseFloat(valorComercial.getText());
            float valorFinalTemp;

            if(valorComercialTemp<150000f){
                valorFinalTemp = valorComercialTemp*1.16f;
            }else{
                valorFinalTemp = valorComercialTemp*1.20f;
            }

            int index = Integer.parseInt(idAuto.getText());
            
            autos[index].marca = marcaTemp;
            autos[index].modelo = modeloTemp;
            autos[index].tipo = tipoTemp;
            autos[index].valorComercial = valorComercialTemp;
            autos[index].valorFinal = valorFinalTemp;

            defaultTable.setRowCount(0);

            //Obtenemos los datos de la lista
            this.imprimirArreglo();
            limpiador();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "No se pudo actualizar: "+e.getMessage());
        }
    }//GEN-LAST:event_actualizarActionPerformed

    //Obtiene los datos y los pinta al seleccionar una index
    private void tablaAutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAutosMouseClicked
        // TODO add your handling code here:
        int fila = tablaAutos.getSelectedRow();
        
        idAuto.setText(defaultTable.getValueAt(fila, 0).toString());
        marca.setText(defaultTable.getValueAt(fila, 1).toString());
        modelo.setText(defaultTable.getValueAt(fila, 2).toString());
        valorComercial.setText(defaultTable.getValueAt(fila, 3).toString());
        String tipoTemp = defaultTable.getValueAt(fila, 4).toString();
        for (int i = 0; i<(tipo.getItemCount());i++){
            if (tipo.getItemAt(i).equalsIgnoreCase(tipoTemp)){
                tipo.setSelectedIndex(i);
            }
        }
        agregar.setEnabled(false);
        eliminar.setEnabled(true);
        actualizar.setEnabled(true);
    }//GEN-LAST:event_tablaAutosMouseClicked

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        this.desactivarEntrada();
        totalAutos.setEnabled(true);
        totalAutos.requestFocus();
        totalAutos.setText("");
        autos = null;
        defaultTable.setRowCount(0);
        tablaAutos.clearSelection();
        marca.setText("");
        modelo.setText("");
        valorComercial.setText("");
        tipo.setSelectedIndex(0);
        idAuto.setText("");
    }//GEN-LAST:event_reiniciarActionPerformed

    private void idAutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idAutoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_idAutoKeyTyped

    private void idAutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idAutoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAutoKeyPressed

    private void totalAutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalAutosKeyTyped
        this.verif(evt);
    }//GEN-LAST:event_totalAutosKeyTyped

    private void totalAutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalAutosKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            try{
                int tamaño = Integer.parseInt(totalAutos.getText());
                autos = new Auto[tamaño];
                totalAutos.setEnabled(false);
                this.activarEntrada();
                this.marca.requestFocus();
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Numero no valido, introduzca un numero entero: "+e.getMessage());
            }
        }
    }//GEN-LAST:event_totalAutosKeyPressed

    private void limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarCamposActionPerformed
        limpiador();
    }//GEN-LAST:event_limpiarCamposActionPerformed

    private void valorComercialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorComercialKeyTyped
        this.verif(evt);
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            agregar.requestFocus();
        }
    }//GEN-LAST:event_valorComercialKeyTyped

    private void modeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            valorComercial.requestFocus();
        }
    }//GEN-LAST:event_modeloKeyPressed

    private void tipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            modelo.requestFocus();
        }
    }//GEN-LAST:event_tipoKeyPressed

    private void marcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            tipo.requestFocus();
        }
    }//GEN-LAST:event_marcaKeyPressed
    
        
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel icono;
    private javax.swing.JTextField idAuto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarCampos;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JButton reiniciar;
    private javax.swing.JTable tablaAutos;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JTextField totalAutos;
    private javax.swing.JTextField valorComercial;
    // End of variables declaration//GEN-END:variables
}