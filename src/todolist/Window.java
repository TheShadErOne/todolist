/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author ShadEr laptop
 */
public class Window extends javax.swing.JFrame {
    
    DefaultTableModel tabela;//Init table model
    File Actions;//File initialisation
    boolean directoryExist = false;
    java.nio.file.Path path;//Init path
    String kategoria = "";
    
    public Window() 
    {
       initComponents();
       tabela = (DefaultTableModel) tableTodo.getModel();//Creating table model
       Actions = new File("Actions.txt");//Creating File storing an actions
       boolean statusFile = false;//File status init deafult false
        try 
        {
            statusFile = Actions.createNewFile();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
       if(statusFile==false)
       {
       String home = System.getProperty("user.home");
       path = java.nio.file.Paths.get(home, "Actions");
       
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(Actions));
            String fline = br.readLine().trim();
            String [] ColumnNames = fline.split(",");
            tabela.setColumnIdentifiers(ColumnNames);
            Object [] tableLines = br.lines().toArray();
            
            for(int i=0;i<tableLines.length;i++)
            {
                String line = tableLines[i].toString().trim();
                String [] dataRow = line.split(";");
                tabela.addRow(dataRow);
            }
            
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       else
       {
           try 
           {  
               BufferedWriter writer = new BufferedWriter(new FileWriter(Actions));
               writer.write("Kategoria,Data,Opis");
               writer.newLine();
               writer.close();
           } catch (IOException ex) 
           {
               Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wyborDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        anulujButton = new javax.swing.JButton();
        tytulField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kategoriaCombo = new javax.swing.JComboBox<>();
        dodajZadanieButton = new javax.swing.JButton();
        wyborPliku = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        wszystkoPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pracaPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        domPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        uczelniaPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usunButton = new javax.swing.JButton();
        dodajButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTodo = new javax.swing.JTable();

        wyborDialog.setTitle("Dodaj Zadanie");
        wyborDialog.setAlwaysOnTop(true);
        wyborDialog.setBackground(new java.awt.Color(0, 75, 135));
        wyborDialog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(0, 75, 135));

        anulujButton.setBackground(new java.awt.Color(255, 255, 255));
        anulujButton.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        anulujButton.setText("Anuluj");
        anulujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulujButtonActionPerformed(evt);
            }
        });

        tytulField.setText("Wpisz tytuł zadania...");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tytuł");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kategoria");
        jLabel8.setToolTipText("");

        kategoriaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Praca", "Dom", "Uczelnia" }));

        dodajZadanieButton.setBackground(new java.awt.Color(255, 255, 255));
        dodajZadanieButton.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        dodajZadanieButton.setText("Dodaj");
        dodajZadanieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajZadanieButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(50, Short.MAX_VALUE)
                        .addComponent(dodajZadanieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anulujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tytulField)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(kategoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(266, 266, 266)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tytulField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kategoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anulujButton)
                    .addComponent(dodajZadanieButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout wyborDialogLayout = new javax.swing.GroupLayout(wyborDialog.getContentPane());
        wyborDialog.getContentPane().setLayout(wyborDialogLayout);
        wyborDialogLayout.setHorizontalGroup(
            wyborDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wyborDialogLayout.setVerticalGroup(
            wyborDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout wyborPlikuLayout = new javax.swing.GroupLayout(wyborPliku.getContentPane());
        wyborPliku.getContentPane().setLayout(wyborPlikuLayout);
        wyborPlikuLayout.setHorizontalGroup(
            wyborPlikuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wyborPlikuLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        wyborPlikuLayout.setVerticalGroup(
            wyborPlikuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wyborPlikuLayout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(97, 212, 195));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 65, 117));

        wszystkoPanel.setBackground(new java.awt.Color(0, 75, 135));
        wszystkoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wszystkoPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wszystkoPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wszystkoPanelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Wszystko");

        javax.swing.GroupLayout wszystkoPanelLayout = new javax.swing.GroupLayout(wszystkoPanel);
        wszystkoPanel.setLayout(wszystkoPanelLayout);
        wszystkoPanelLayout.setHorizontalGroup(
            wszystkoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wszystkoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        wszystkoPanelLayout.setVerticalGroup(
            wszystkoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wszystkoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pracaPanel.setBackground(new java.awt.Color(0, 75, 135));
        pracaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pracaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pracaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pracaPanelMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Praca");

        javax.swing.GroupLayout pracaPanelLayout = new javax.swing.GroupLayout(pracaPanel);
        pracaPanel.setLayout(pracaPanelLayout);
        pracaPanelLayout.setHorizontalGroup(
            pracaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pracaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
        pracaPanelLayout.setVerticalGroup(
            pracaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pracaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        domPanel.setBackground(new java.awt.Color(0, 75, 135));
        domPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                domPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                domPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                domPanelMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dom");

        javax.swing.GroupLayout domPanelLayout = new javax.swing.GroupLayout(domPanel);
        domPanel.setLayout(domPanelLayout);
        domPanelLayout.setHorizontalGroup(
            domPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, domPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );
        domPanelLayout.setVerticalGroup(
            domPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(domPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        uczelniaPanel.setBackground(new java.awt.Color(0, 75, 135));
        uczelniaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uczelniaPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uczelniaPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uczelniaPanelMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Uczelnia");

        javax.swing.GroupLayout uczelniaPanelLayout = new javax.swing.GroupLayout(uczelniaPanel);
        uczelniaPanel.setLayout(uczelniaPanelLayout);
        uczelniaPanelLayout.setHorizontalGroup(
            uczelniaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uczelniaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        uczelniaPanelLayout.setVerticalGroup(
            uczelniaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uczelniaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Do Zrobienia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wszystkoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pracaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(uczelniaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(domPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(wszystkoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pracaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uczelniaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(domPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));

        usunButton.setBackground(new java.awt.Color(255, 255, 255));
        usunButton.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        usunButton.setText("Usuń");
        usunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usunButtonActionPerformed(evt);
            }
        });

        dodajButton.setBackground(new java.awt.Color(255, 255, 255));
        dodajButton.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        dodajButton.setText("Dodaj");
        dodajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleBackground"));
        jScrollPane1.setBorder(null);

        tableTodo.setAutoCreateRowSorter(true);
        tableTodo.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        tableTodo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tableTodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategoria", "Data", "Opis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTodo.setFillsViewportHeight(true);
        tableTodo.setGridColor(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleBackground"));
        tableTodo.setRowHeight(36);
        jScrollPane1.setViewportView(tableTodo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dodajButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usunButton)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usunButton)
                    .addComponent(dodajButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usunButtonActionPerformed
            int row = tableTodo.getSelectedRow();//Geting value from selected row
            String [] value = new String [tableTodo.getColumnCount()];   
            for(int i=0;i< tableTodo.getColumnCount();i++)
            {
            //Reading all data in row
            value [i] = tableTodo.getModel().getValueAt(row, i).toString();
            }
            String valueTemp = String.join(";", value);//joinign from array
            File tempFile = new File("temp.txt");
            File inputFile = new File("Actions.txt");

            BufferedReader reader;
            BufferedWriter writer;
            try 
            {
            String lineToRemove = valueTemp;//Serching for specific String
            String currentLine;
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(tempFile));
            while((currentLine = reader.readLine()) != null) 
            {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            //If line equals line to remove break iteration
            if(trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
            }
            inputFile.delete();
            reader.close();
            writer.close();
            renameFiles("temp.txt","Actions.txt");
            } 
            catch (FileNotFoundException ex) 
            {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }    
            catch (IOException ex) 
            {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }  
            //Removing seleted line in tabela
            if(tableTodo.getSelectedRow() != -1)
            tabela.removeRow(tableTodo.getSelectedRow());
            
    }//GEN-LAST:event_usunButtonActionPerformed

    private void dodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajButtonActionPerformed
        //Set Visible dialog
        wyborDialog.pack();
        wyborDialog.setVisible(true);     
    }//GEN-LAST:event_dodajButtonActionPerformed

    private void anulujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulujButtonActionPerformed
        //Close dialog
        wyborDialog.dispose();
    }//GEN-LAST:event_anulujButtonActionPerformed

    private void dodajZadanieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodajZadanieButtonActionPerformed
        String kat = kategoriaCombo.getSelectedItem().toString();//Select category
        String opis = tytulField.getText();//Select description
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//Select date
        String date = sdf.format(dateChooser.getSelectedDate().getTime());
        tabela.addRow(new Object[]{kat,date,opis});//Write to tabela
        BufferedWriter writerNewLine;
        try {
            //Writing to txt file Actions
            writerNewLine = new BufferedWriter(new FileWriter(Actions,true));
            writerNewLine.write(kat+";"+date+";"+opis);
            writerNewLine.newLine();
            writerNewLine.close();
        } catch (IOException ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        wyborDialog.dispose();
         
    }//GEN-LAST:event_dodajZadanieButtonActionPerformed

    private void wszystkoPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wszystkoPanelMouseEntered
      wszystkoPanel.setBackground(new Color(0,46,84));//Changing color while mouse is entering panel
    }//GEN-LAST:event_wszystkoPanelMouseEntered

    private void wszystkoPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wszystkoPanelMouseExited
      wszystkoPanel.setBackground(new Color(0,75,135));
    }//GEN-LAST:event_wszystkoPanelMouseExited

    private void pracaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pracaPanelMouseEntered
        pracaPanel.setBackground(new Color(0,46,84));//Changing color while mouse is entering panel
    }//GEN-LAST:event_pracaPanelMouseEntered

    private void pracaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pracaPanelMouseExited
        pracaPanel.setBackground(new Color(0,75,135));//Changing color while mouse is exiting panel
    }//GEN-LAST:event_pracaPanelMouseExited

    private void domPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domPanelMouseEntered
       domPanel.setBackground(new Color(0,46,84));//Changing color while mouse is entering panel
    }//GEN-LAST:event_domPanelMouseEntered

    private void domPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domPanelMouseExited
        domPanel.setBackground(new Color(0,75,135));//Changing color while mouse is exiting panel
    }//GEN-LAST:event_domPanelMouseExited

    private void uczelniaPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uczelniaPanelMouseEntered
        uczelniaPanel.setBackground(new Color(0,46,84));//Changing color while mouse is entering panel
    }//GEN-LAST:event_uczelniaPanelMouseEntered

    private void uczelniaPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uczelniaPanelMouseExited
        uczelniaPanel.setBackground(new Color(0,75,135));//Changing color while mouse is exiting panel
    }//GEN-LAST:event_uczelniaPanelMouseExited

    private void wszystkoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wszystkoPanelMouseClicked
       kategoria = "";
       Sort(kategoria);//Show all categories
    }//GEN-LAST:event_wszystkoPanelMouseClicked

    private void pracaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pracaPanelMouseClicked
       kategoria = "Praca";
       Sort(kategoria);//Show Praca category
    }//GEN-LAST:event_pracaPanelMouseClicked

    private void uczelniaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uczelniaPanelMouseClicked
        kategoria = "Uczelnia";
        Sort(kategoria);//Show Uczelnia category
    }//GEN-LAST:event_uczelniaPanelMouseClicked

    private void domPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domPanelMouseClicked
        kategoria = "Dom";
        Sort(kategoria);//Show Dom category
    }//GEN-LAST:event_domPanelMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
      
    }//GEN-LAST:event_formMouseMoved
    
    //Function that taking paramteter KategoriaZadana and sorting items in tableTodo
    private void Sort(String kategoriaZadania)
    {
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (tabela); //Init sorter
       tableTodo.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(kategoriaZadania));
    }

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() 
            {
                new Window().setVisible(true);
            }
        });
    }
    //Function that takes two parameters oldName and newName, it renames files
    void renameFiles(String oldName, String newName)
{
    String sCurrentLine = "";
    try
    {
        BufferedReader br = new BufferedReader(new FileReader(oldName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(newName));

        while ((sCurrentLine = br.readLine()) != null)
        {
            bw.write(sCurrentLine);
            bw.newLine();
        }

        br.close();
        bw.close();

        File org = new File(oldName);
        org.delete();

    }
    catch (FileNotFoundException e)
    {
        e.printStackTrace();
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anulujButton;
    private javax.swing.JButton dodajButton;
    private javax.swing.JButton dodajZadanieButton;
    private javax.swing.JPanel domPanel;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategoriaCombo;
    private javax.swing.JPanel pracaPanel;
    private javax.swing.JTable tableTodo;
    private javax.swing.JTextField tytulField;
    private javax.swing.JPanel uczelniaPanel;
    private javax.swing.JButton usunButton;
    private javax.swing.JPanel wszystkoPanel;
    private javax.swing.JDialog wyborDialog;
    private javax.swing.JDialog wyborPliku;
    // End of variables declaration//GEN-END:variables
}
