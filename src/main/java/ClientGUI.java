import Builder.Desktop;
import Builder.Laptop;
import Components.Generator;
import Composite.Store;
import Iterator.StoreIterator;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ClientGUI extends javax.swing.JFrame {

    Generator generator = new Generator();
    StoreIterator storeIterator = new StoreIterator();

    public ClientGUI() {
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
        setComboBoxModelDesktop();
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

        ArrayList<Desktop> desktops =storeIterator.returnAllDesktops();
        setJTableModelDesktop(desktops);


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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxGPU, 0, 249, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxPSU, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxStorage, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxCPU, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxRAM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jComboBoxMotherboard, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(96, 96, 96)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(laptopRadioButton)
                                                                        .addComponent(desktopRadioButton)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(75, 75, 75))
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
                                                .addGap(10, 10, 10)
                                                .addComponent(desktopRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(laptopRadioButton)
                                                .addGap(18, 18, 18)
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
        jComboBoxPSU.setEnabled(false);
        setComboBoxModelLaptop();
        ArrayList<Laptop> laptops =storeIterator.returnAllLaptops();
        setJTableModelLaptops(laptops);
    }

    private void desktopRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        laptopRadioButton.setSelected(false);
        jComboBoxPSU.setEnabled(true);
        setComboBoxModelDesktop();
        ArrayList<Desktop> desktops =storeIterator.returnAllDesktops();
        setJTableModelDesktop(desktops);
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(laptopRadioButton.isSelected()){
            ArrayList<String> searchList = new ArrayList<>();
            searchList.add(jComboBoxMotherboard.getSelectedItem().toString());
            searchList.add(jComboBoxCPU.getSelectedItem().toString());
            searchList.add(jComboBoxRAM.getSelectedItem().toString());
            searchList.add(jComboBoxStorage.getSelectedItem().toString());
            searchList.add(jComboBoxGPU.getSelectedItem().toString());
            ArrayList<Laptop> laptops =storeIterator.searchLaptop(searchList);
            setJTableModelLaptops(laptops);

        } else if (desktopRadioButton.isSelected()) {
            ArrayList<String> searchList = new ArrayList<>();
            searchList.add(jComboBoxMotherboard.getSelectedItem().toString());
            searchList.add(jComboBoxCPU.getSelectedItem().toString());
            searchList.add(jComboBoxRAM.getSelectedItem().toString());
            searchList.add(jComboBoxStorage.getSelectedItem().toString());
            searchList.add(jComboBoxGPU.getSelectedItem().toString());
            searchList.add(jComboBoxPSU.getSelectedItem().toString());
            ArrayList<Desktop> desktops =storeIterator.searchDesktop(searchList);
            setJTableModelDesktop(desktops);
        }
    }

    public void setJTableModelDesktop(ArrayList<Desktop> desktops){
        DefaultTableModel modelDesktop = new DefaultTableModel(new Object[]{
                "Motherboard", "CPU", "RAM", "GPU", "Storage", "PSU"
        }, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for(Desktop desktop : desktops){
            modelDesktop.addRow(new Object[]{desktop.getMotherboard().getName(),desktop.getCpu().getName(),desktop.getRam().getName(),desktop.getGpu().getName(),desktop.getStorage().getName(), desktop.getPsu().getName()});
        }
        jTable1.setModel(modelDesktop);
        jScrollPane1.setViewportView(jTable1);
    }

    public void setJTableModelLaptops(ArrayList<Laptop> laptops){
        DefaultTableModel modelLaptop = new DefaultTableModel(new Object[]{
                "Motherboard", "CPU", "RAM", "GPU", "Storage", "PSU"
        }, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for(Laptop laptop : laptops){
            modelLaptop.addRow(new Object[]{laptop.getMotherboard().getName(),laptop.getCpu().getName(),laptop.getRam().getName(),laptop.getGpu().getName(),laptop.getStorage().getName(), ""});
        }
        jTable1.setModel(modelLaptop);
        jScrollPane1.setViewportView(jTable1);
    }

    public void setComboBoxModelDesktop(){
        jComboBoxMotherboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Gigabyte Z690 Aorus Pro", "MSI MEG Z690I Unify", "NZXT N7 B550", "MSI MAG B660M Mortar", "Asus ROG Strix B660-I"}));
        jComboBoxCPU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Intel Core i9-12900KS", "Intel Core i7-12900K", "AMD Ryzen 9 5950X", "AMD Ryzen Threadripper 3960X","Intel Core i5-11600KF"}));
        jComboBoxRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Corsair Vengeance LPX","Lexar Thor", "Kingston FURY Renegade", "Teamgroup T-Force Vulcan Z","G.Skill Ripjaws Serie V"}));
        jComboBoxStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Samsung 870 EVO","Crucial MX300", "HyperX Fury", "OCZ ARC 100","Samsung 960"}));
        jComboBoxGPU.setModel (new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Radeon RX 6950 XT","GeForce RTX 3090 Ti", "NVIDIA Titan RTX", "GeForce GTX 1650","Radeon RX 6900 XT OC"}));
        jComboBoxPSU.setModel (new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Corsair SF750","SilverStone SX1000 SFX-L", "EVGA SuperNOVA 1600 T2", "Corsair AX1600i","EVGA SuperNOVA 1000 T2"}));
    }

    public void setComboBoxModelLaptop(){
        jComboBoxMotherboard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Apple MacBook Pro Motherboard", "LG Gram 17Z90N Motherboard", "Alienware AW15R3-7002SLV-PUS Motherboard", "Razer Blade Pro 17 Motherboard","Asus ZenBook Flip S 13 Motherboard"}));
        jComboBoxCPU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Intel Core i7-12700H", "Intel Core i9-12900H", "AMD Ryzen 7 6800H", "AMD Ryzen 9 5900HS","Intel Xeon W-10885M"}));
        jComboBoxRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","G.Skill Trident Z5 RGB","Samsung DDR5-4800", "TeamGroup T-Force Xtreem", "Patriot Viper Steel","Corsair Vengeance RGB Pro"}));
        jComboBoxStorage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","Samsung 970 Evo Plus NVMe","HP EX950", "Adata XPG SX8200 Pro", "Crucial P1 3D","Gigabyte Aorus"}));
        jComboBoxGPU.setModel (new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el componente","NVIDIA GeForce RTX 3080 Ti Laptop GPU","NVIDIA GeForce GTX 1080 SLI", "Apple M1 8-Core", "NVIDIA GeForce RTX 2080","AMD Radeon RX 6800S"}));
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
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
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
