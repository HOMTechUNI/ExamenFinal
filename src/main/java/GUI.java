import Builder.Desktop;
import Builder.Laptop;
import Composite.Store;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class GUI extends javax.swing.JFrame {

    Generator generator = new Generator();
    StoreIterator storeIterator = new StoreIterator();

    ArrayList<String> title = new ArrayList<>();

    DefaultTableModel modelLaptop = new DefaultTableModel(new Object[]{
            "Motherboard", "CPU", "RAM", "GPU", "Storage", "PSU"
    }, 0);

    DefaultTableModel modelDesktop = new DefaultTableModel(new Object[]{
            "Motherboard", "CPU", "RAM", "GPU", "Storage", "PSU"
    }, 0);

    public GUI() {
        ArrayList<Store> stores=generator.genStoresPackagesDevices(3,5,3);
        storeIterator.setStore(stores);
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        laptopRadioButton = new javax.swing.JRadioButton();
        desktopRadioButton = new javax.swing.JRadioButton();
        motherboardLabel = new javax.swing.JLabel();
        cpuLabel = new javax.swing.JLabel();
        ramLabel = new javax.swing.JLabel();
        gpuLabel = new javax.swing.JLabel();
        storageLabel = new javax.swing.JLabel();
        psuLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxMotherboard = new javax.swing.JComboBox<>();
        jComboBoxCPU = new javax.swing.JComboBox<>();
        jComboBoxRAM = new javax.swing.JComboBox<>();
        jComboBoxGPU = new javax.swing.JComboBox<>();
        jComboBoxStorage = new javax.swing.JComboBox<>();
        jComboBoxPSU = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        desktopRadioButton.setSelected(true);

        motherboardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        motherboardLabel.setText("Motherboard:");

        cpuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cpuLabel.setText("CPU:");

        ramLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ramLabel.setText("RAM:");

        gpuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gpuLabel.setText("GPU:");

        storageLabel.setText("Storage:");

        psuLabel.setText("PSU:");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });



        title.add("Motherboard");
        title.add("CPU");
        title.add("RAM");
        title.add( "GPU");
        title.add("Storage");
        title.add("PSU");

        ArrayList<Laptop> laptops =storeIterator.returnAllLaptops();
        for(Laptop laptop : laptops){
            modelLaptop.addRow(new Object[]{laptop.getMotherboard().getName(),laptop.getCpu().getName(),laptop.getRam().getName(),laptop.getGpu().getName(),laptop.getStorage().getName(), ""});
        }

        ArrayList<Desktop> desktops =storeIterator.returnAllDesktops();
        for(Desktop desktop : desktops){
            modelDesktop.addRow(new Object[]{desktop.getMotherboard().getName(),desktop.getCpu().getName(),desktop.getRam().getName(),desktop.getGpu().getName(),desktop.getStorage().getName(), desktop.getPsu().getName()});
        }
        jTable1.setModel(modelDesktop);

        jScrollPane1.setViewportView(jTable1);

        jComboBoxMotherboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Gigabyte Z690 Aorus Pro", "MSI MEG Z690I Unify", "NZXT N7 B550", "MSI MAG B660M Mortar", "Asus ROG Strix B660-I"}));
        jComboBoxCPU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Intel Core i9-12900KS", "Intel Core i7-12900K", "AMD Ryzen 9 5950X", "AMD Ryzen Threadripper 3960X","Intel Core i5-11600KF"}));
        jComboBoxRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Corsair Vengeance LPX","Lexar Thor", "Kingston FURY Renegade", "Teamgroup T-Force Vulcan Z","G.Skill Ripjaws Serie V"}));
        jComboBoxStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Samsung 870 EVO","Crucial MX300", "HyperX Fury", "OCZ ARC 100","Samsung 960"}));
        jComboBoxGPU.setModel (new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Radeon RX 6950 XT","GeForce RTX 3090 Ti", "NVIDIA Titan RTX", "GeForce GTX 1650","Radeon RX 6900 XT OC"}));
        jComboBoxPSU.setModel (new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Corsair SF750","SilverStone SX1000 SFX-L", "EVGA SuperNOVA 1600 T2", "Corsair AX1600i","EVGA SuperNOVA 1000 T2"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(gpuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(ramLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(cpuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(motherboardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(storageLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(psuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBoxMotherboard, 0, 119, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxCPU, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxRAM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxGPU, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxPSU, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxStorage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(desktopRadioButton)
                                                                        .addComponent(laptopRadioButton))
                                                                .addGap(200, 200, 200))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(122, 122, 122))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(laptopRadioButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(desktopRadioButton)
                                                .addGap(36, 36, 36)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(motherboardLabel)
                                                        .addComponent(jComboBoxMotherboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cpuLabel)
                                                        .addComponent(jComboBoxCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ramLabel)
                                                        .addComponent(jComboBoxRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(gpuLabel)
                                                        .addComponent(jComboBoxGPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(storageLabel)
                                                        .addComponent(jComboBoxStorage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(psuLabel)
                                                        .addComponent(jComboBoxPSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
        );

        pack();
    }

    private void laptopRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        desktopRadioButton.setSelected(false);
        psuLabel.setVisible(false);
        jComboBoxPSU.setVisible(false);
        jComboBoxMotherboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Apple MacBook Pro Motherboard", "LG Gram 17Z90N Motherboard", "Alienware AW15R3-7002SLV-PUS Motherboard", "Razer Blade Pro 17 Motherboard","Asus ZenBook Flip S 13 Motherboard"}));
        jComboBoxCPU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Intel Core i7-12700H", "Intel Core i9-12900H", "AMD Ryzen 7 6800H", "AMD Ryzen 9 5900HS","Intel Xeon W-10885M"}));
        jComboBoxRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","G.Skill Trident Z5 RGB","Samsung DDR5-4800", "TeamGroup T-Force Xtreem", "Patriot Viper Steel","Corsair Vengeance RGB Pro"}));
        jComboBoxStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Samsung 970 Evo Plus NVMe","HP EX950", "Adata XPG SX8200 Pro", "Crucial P1 3D","Gigabyte Aorus"}));
        jComboBoxGPU.setModel (new javax.swing.DefaultComboBoxModel<>(new String[] { "--","NVIDIA GeForce RTX 3080 Ti Laptop GPU","NVIDIA GeForce GTX 1080 SLI", "Apple M1 8-Core", "NVIDIA GeForce RTX 2080","AMD Radeon RX 6800S"}));
        jTable1.setModel(modelLaptop);
    }

    private void desktopRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        laptopRadioButton.setSelected(false);
        psuLabel.setVisible(true);
        jComboBoxPSU.setVisible(true);
        jComboBoxMotherboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Gigabyte Z690 Aorus Pro", "MSI MEG Z690I Unify", "NZXT N7 B550", "MSI MAG B660M Mortar", "Asus ROG Strix B660-I"}));
        jComboBoxCPU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Intel Core i9-12900KS", "Intel Core i7-12900K", "AMD Ryzen 9 5950X", "AMD Ryzen Threadripper 3960X","Intel Core i5-11600KF"}));
        jComboBoxRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Corsair Vengeance LPX","Lexar Thor", "Kingston FURY Renegade", "Teamgroup T-Force Vulcan Z","G.Skill Ripjaws Serie V"}));
        jComboBoxStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Samsung 870 EVO","Crucial MX300", "HyperX Fury", "OCZ ARC 100","Samsung 960"}));
        jComboBoxGPU.setModel (new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Radeon RX 6950 XT","GeForce RTX 3090 Ti", "NVIDIA Titan RTX", "GeForce GTX 1650","Radeon RX 6900 XT OC"}));
        jComboBoxPSU.setModel (new javax.swing.DefaultComboBoxModel<>(new String[] { "--","Corsair SF750","SilverStone SX1000 SFX-L", "EVGA SuperNOVA 1600 T2", "Corsair AX1600i","EVGA SuperNOVA 1000 T2"}));
        jTable1.setModel(modelDesktop);
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(laptopRadioButton.isSelected()){
            ArrayList<String> searchList = new ArrayList<>();
            searchList.add(jComboBoxMotherboard.getSelectedItem().toString());
            searchList.add(jComboBoxCPU.getSelectedItem().toString());
            searchList.add(jComboBoxRAM.getSelectedItem().toString());
            searchList.add(jComboBoxStorage.getSelectedItem().toString());
            searchList.add(jComboBoxGPU.getSelectedItem().toString());

            /*ArrayList<Laptop> laptops =storeIterator.search(searchList);

            DefaultTableModel modelLaptop = new DefaultTableModel(new Object[]{
                    "Motherboard", "CPU", "RAM", "GPU", "Storage", "PSU"
            }, 0);
            for(Laptop laptop : laptops){
                modelLaptop.addRow(new Object[]{laptop.getMotherboard().getName(),laptop.getCpu().getName(),laptop.getRam().getName(),laptop.getGpu().getName(),laptop.getStorage().getName(), ""});
            }
            jTable1.setModel(modelLaptop);
            */
        } else if (desktopRadioButton.isSelected()) {
            ArrayList<String> searchList = new ArrayList<>();
            searchList.add(jComboBoxMotherboard.getSelectedItem().toString());
            searchList.add(jComboBoxCPU.getSelectedItem().toString());
            searchList.add(jComboBoxRAM.getSelectedItem().toString());
            searchList.add(jComboBoxStorage.getSelectedItem().toString());
            searchList.add(jComboBoxGPU.getSelectedItem().toString());
            searchList.add(jComboBoxPSU.getSelectedItem().toString());

            DefaultTableModel modelDesktop = new DefaultTableModel(new Object[]{
                    "Motherboard", "CPU", "RAM", "GPU", "Storage", "PSU"
            }, 0);

            /*ArrayList<Desktop> desktops =storeIterator.search(searchList);
            for(Desktop desktop : desktops){
                modelDesktop.addRow(new Object[]{desktop.getMotherboard().getName(),desktop.getCpu().getName(),desktop.getRam().getName(),desktop.getGpu().getName(),desktop.getStorage().getName(), desktop.getPsu().getName()});
            }
            jTable1.setModel(modelDesktop);
        */}
    }

    private void jComboBoxMotherboardActionPerformed(java.awt.event.ActionEvent evt) {

    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel cpuLabel;
    private javax.swing.JRadioButton desktopRadioButton;
    private javax.swing.JLabel gpuLabel;
    private javax.swing.JComboBox<String> jComboBoxCPU;
    private javax.swing.JComboBox<String> jComboBoxGPU;
    private javax.swing.JComboBox<String> jComboBoxMotherboard;
    private javax.swing.JComboBox<String> jComboBoxPSU;
    private javax.swing.JComboBox<String> jComboBoxRAM;
    private javax.swing.JComboBox<String> jComboBoxStorage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton laptopRadioButton;
    private javax.swing.JLabel motherboardLabel;
    private javax.swing.JLabel psuLabel;
    private javax.swing.JLabel ramLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel storageLabel;
}
