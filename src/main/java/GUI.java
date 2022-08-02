import javax.swing.*;

public class GUI extends JFrame {
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        laptopRadioButton = new JRadioButton();
        desktopRadioButton = new JRadioButton();
        storeLabel = new JLabel();
        motherboardLabel = new JLabel();
        cpuLabel = new JLabel();
        ramLabel = new JLabel();
        gpuLabel = new JLabel();
        storageLabel = new JLabel();
        psuLabel = new JLabel();
        storeField = new JTextField();
        motherboardField = new JTextField();
        cpuField = new JTextField();
        ramField = new JTextField();
        gpuField = new JTextField();
        storageField = new JTextField();
        psuField = new JTextField();
        searchButton = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        laptopRadioButton.setText("Laptop");
        laptopRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopRadioButtonActionPerformed(evt);
            }
        });

        desktopRadioButton.setText("Desktop");
        desktopRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desktopRadioButtonActionPerformed(evt);
            }
        });

        storeLabel.setText("Store:");

        motherboardLabel.setHorizontalAlignment(SwingConstants.CENTER);
        motherboardLabel.setText("Motherboard:");

        cpuLabel.setHorizontalAlignment(SwingConstants.LEFT);
        cpuLabel.setText("CPU:");

        ramLabel.setHorizontalAlignment(SwingConstants.LEFT);
        ramLabel.setText("RAM:");

        gpuLabel.setHorizontalAlignment(SwingConstants.LEFT);
        gpuLabel.setText("GPU:");

        storageLabel.setText("Storage:");

        psuLabel.setText("PSU:");

        storeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeFieldActionPerformed(evt);
            }
        });

        motherboardField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherboardFieldActionPerformed(evt);
            }
        });

        storageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageFieldActionPerformed(evt);
            }
        });

        psuField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psuFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String [] {
                        "Tienda", "Motherboard", "CPU", "RAM", "GPU", "Storage", "PSU"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 582, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(gpuLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ramLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cpuLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(motherboardLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(storeLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(storageLabel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(psuLabel, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ramField, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                        .addComponent(gpuField, GroupLayout.Alignment.TRAILING)
                                        .addComponent(cpuField)
                                        .addComponent(motherboardField)
                                        .addComponent(storeField)
                                        .addComponent(storageField)
                                        .addComponent(psuField))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(desktopRadioButton)
                                                        .addComponent(laptopRadioButton))
                                                .addGap(200, 200, 200))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
                                                .addGap(122, 122, 122))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(laptopRadioButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(desktopRadioButton)
                                                .addGap(36, 36, 36)
                                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(storeLabel)
                                                        .addComponent(storeField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(motherboardLabel)
                                                        .addComponent(motherboardField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cpuLabel)
                                                        .addComponent(cpuField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ramField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ramLabel))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(gpuField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(gpuLabel))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(storageLabel)
                                                        .addComponent(storageField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(psuField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(psuLabel))
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
        );

        pack();
    }

    private void laptopRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        desktopRadioButton.setSelected(false);
        psuLabel.setVisible(false);
        psuField.setVisible(false);
    }

    private void desktopRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        laptopRadioButton.setSelected(false);
        psuLabel.setVisible(true);
        psuField.setVisible(true);
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(laptopRadioButton.isSelected()){

        }
        else if(desktopRadioButton.isSelected()){

        }
    }

    private void motherboardFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void psuFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void storeFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void storageFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    private JTextField cpuField;
    private JLabel cpuLabel;
    private JRadioButton desktopRadioButton;
    private JTextField gpuField;
    private JLabel gpuLabel;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JRadioButton laptopRadioButton;
    private JTextField motherboardField;
    private JLabel motherboardLabel;
    private JTextField psuField;
    private JLabel psuLabel;
    private JTextField ramField;
    private JLabel ramLabel;
    private JButton searchButton;
    private JTextField storageField;
    private JLabel storageLabel;
    private JTextField storeField;
    private JLabel storeLabel;

}