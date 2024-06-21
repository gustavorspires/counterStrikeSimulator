package simuladordepartidas;
import models.*;
import java.util.Random;


public class SimuladorDePartidas extends javax.swing.JFrame {
    
    Random sorte;
    public SimuladorDePartidas() {
        this.sorte = new Random();
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTime1 = new javax.swing.JLabel();
        lblVersus = new javax.swing.JLabel();
        lblTime2 = new javax.swing.JLabel();
        txtTime1 = new javax.swing.JTextField();
        txtTime2 = new javax.swing.JTextField();
        numNivel1T1 = new javax.swing.JSpinner();
        numNivel1T2 = new javax.swing.JSpinner();
        lblRes = new javax.swing.JLabel();
        btnSim = new javax.swing.JButton();
        txtJ6 = new javax.swing.JTextField();
        txtJ1 = new javax.swing.JTextField();
        txtJ7 = new javax.swing.JTextField();
        txtJ8 = new javax.swing.JTextField();
        txtJ9 = new javax.swing.JTextField();
        txtJ10 = new javax.swing.JTextField();
        numNivel2T2 = new javax.swing.JSpinner();
        numNivel3T2 = new javax.swing.JSpinner();
        numNivel4T2 = new javax.swing.JSpinner();
        numNivel5T2 = new javax.swing.JSpinner();
        txtJ2 = new javax.swing.JTextField();
        txtJ3 = new javax.swing.JTextField();
        txtJ4 = new javax.swing.JTextField();
        txtJ5 = new javax.swing.JTextField();
        numNivel2T1 = new javax.swing.JSpinner();
        numNivel3T1 = new javax.swing.JSpinner();
        numNivel4T1 = new javax.swing.JSpinner();
        numNivel5T1 = new javax.swing.JSpinner();
        lblPlayers = new javax.swing.JLabel();
        lblRatingJ1 = new javax.swing.JLabel();
        lblRatingJ2 = new javax.swing.JLabel();
        lblRatingJ3 = new javax.swing.JLabel();
        lblRatingJ5 = new javax.swing.JLabel();
        lblRatingJ4 = new javax.swing.JLabel();
        lblRatingJ6 = new javax.swing.JLabel();
        lblRatingJ7 = new javax.swing.JLabel();
        lblRatingJ8 = new javax.swing.JLabel();
        lblRatingJ9 = new javax.swing.JLabel();
        lblRatingJ10 = new javax.swing.JLabel();
        lblKillsJ6 = new javax.swing.JLabel();
        lblDeathsJ6 = new javax.swing.JLabel();
        lblKillsJ7 = new javax.swing.JLabel();
        lblDeathsJ7 = new javax.swing.JLabel();
        lblKillsJ1 = new javax.swing.JLabel();
        lblDeathsJ1 = new javax.swing.JLabel();
        lblKillsJ2 = new javax.swing.JLabel();
        lblDeathsJ2 = new javax.swing.JLabel();
        lblKillsJ3 = new javax.swing.JLabel();
        lblDeathsJ3 = new javax.swing.JLabel();
        lblKillsJ4 = new javax.swing.JLabel();
        lblDeathsJ4 = new javax.swing.JLabel();
        lblKillsJ5 = new javax.swing.JLabel();
        lblDeathsJ5 = new javax.swing.JLabel();
        lblKillsJ8 = new javax.swing.JLabel();
        lblDeathsJ8 = new javax.swing.JLabel();
        lblKillsJ9 = new javax.swing.JLabel();
        lblDeathsJ9 = new javax.swing.JLabel();
        lblKillsJ10 = new javax.swing.JLabel();
        lblDeathsJ10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        lblTime1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTime1.setText("Time 1");

        lblVersus.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVersus.setText("X");

        lblTime2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTime2.setText("Time 2");

        txtTime1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        numNivel1T1.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        numNivel1T2.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        lblRes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRes.setForeground(new java.awt.Color(153, 51, 0));
        lblRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRes.setText("O resultado vai aparecer aqui!");

        btnSim.setText("Simular");
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });

        txtJ8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJ8ActionPerformed(evt);
            }
        });

        txtJ9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJ9ActionPerformed(evt);
            }
        });

        txtJ10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJ10ActionPerformed(evt);
            }
        });

        numNivel2T2.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        numNivel3T2.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        numNivel4T2.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        numNivel5T2.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        numNivel2T1.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        numNivel3T1.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        numNivel4T1.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        numNivel5T1.setModel(new javax.swing.SpinnerNumberModel(60.0d, 60.0d, 100.0d, 1.0d));

        lblPlayers.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPlayers.setText("Players");

        lblRatingJ1.setText("0.00");

        lblRatingJ2.setText("0.00");

        lblRatingJ3.setText("0.00");

        lblRatingJ5.setText("0.00");

        lblRatingJ4.setText("0.00");

        lblRatingJ6.setText("0.00");

        lblRatingJ7.setText("0.00");

        lblRatingJ8.setText("0.00");

        lblRatingJ9.setText("0.00");

        lblRatingJ10.setText("0.00");

        lblKillsJ6.setText("0");

        lblDeathsJ6.setText("0");

        lblKillsJ7.setText("0");

        lblDeathsJ7.setText("0");

        lblKillsJ1.setText("0");

        lblDeathsJ1.setText("0");

        lblKillsJ2.setText("0");

        lblDeathsJ2.setText("0");

        lblKillsJ3.setText("0");

        lblDeathsJ3.setText("0");

        lblKillsJ4.setText("0");

        lblDeathsJ4.setText("0");

        lblKillsJ5.setText("0");

        lblDeathsJ5.setText("0");

        lblKillsJ8.setText("0");

        lblDeathsJ8.setText("0");

        lblKillsJ9.setText("0");

        lblDeathsJ9.setText("0");

        lblKillsJ10.setText("0");

        lblDeathsJ10.setText("0");

        jLabel1.setText("K D");

        jLabel2.setText("K D");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTime1)
                                    .addGap(203, 203, 203)
                                    .addComponent(lblVersus)
                                    .addGap(203, 203, 203)
                                    .addComponent(lblTime2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(txtTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblKillsJ1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRatingJ1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(numNivel1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(numNivel1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtJ6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblKillsJ2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRatingJ2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(numNivel2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(numNivel2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtJ7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblKillsJ3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRatingJ3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(numNivel3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(numNivel3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtJ8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblKillsJ4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRatingJ4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(numNivel4T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(numNivel4T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtJ9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblKillsJ5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRatingJ5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtJ5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(numNivel5T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(numNivel5T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtJ10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRatingJ7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKillsJ7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRatingJ8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKillsJ8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRatingJ9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKillsJ9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRatingJ10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKillsJ10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblRatingJ6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblKillsJ6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDeathsJ6))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(276, 276, 276)
                        .addComponent(lblPlayers)
                        .addGap(276, 276, 276)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(611, Short.MAX_VALUE)
                .addComponent(btnSim, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTime1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTime2)
                        .addComponent(lblVersus)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPlayers)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numNivel1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numNivel1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ1)
                                .addComponent(lblKillsJ1)
                                .addComponent(lblDeathsJ1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ6)
                                .addComponent(lblKillsJ6)
                                .addComponent(lblDeathsJ6)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numNivel2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numNivel2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ2)
                                .addComponent(lblKillsJ2)
                                .addComponent(lblDeathsJ2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ7)
                                .addComponent(lblKillsJ7)
                                .addComponent(lblDeathsJ7)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numNivel3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numNivel3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ3)
                                .addComponent(lblKillsJ3)
                                .addComponent(lblDeathsJ3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ8)
                                .addComponent(lblKillsJ8)
                                .addComponent(lblDeathsJ8)))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numNivel4T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numNivel4T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ4)
                                .addComponent(lblKillsJ4)
                                .addComponent(lblDeathsJ4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ9)
                                .addComponent(lblKillsJ9)
                                .addComponent(lblDeathsJ9)))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numNivel5T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numNivel5T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ5)
                                .addComponent(lblKillsJ5)
                                .addComponent(lblDeathsJ5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtJ10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRatingJ10)
                                .addComponent(lblKillsJ10)
                                .addComponent(lblDeathsJ10)))))
                .addGap(28, 28, 28)
                .addComponent(btnSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRes)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        Jogador j1 = new Jogador(txtJ1.getText(), (int) Math.round((double) numNivel1T1.getValue()));
        Jogador j2 = new Jogador(txtJ2.getText(), (int) Math.round((double)numNivel2T1.getValue()));
        Jogador j3 = new Jogador(txtJ3.getText(), (int) Math.round((double)numNivel3T1.getValue()));
        Jogador j4 = new Jogador(txtJ4.getText(), (int) Math.round((double)numNivel4T1.getValue()));
        Jogador j5 = new Jogador(txtJ5.getText(), (int) Math.round((double)numNivel5T1.getValue()));
        
        Jogador j6 = new Jogador(txtJ6.getText(), (int) Math.round((double)numNivel1T2.getValue()));
        Jogador j7 = new Jogador(txtJ7.getText(), (int) Math.round((double)numNivel2T2.getValue()));
        Jogador j8 = new Jogador(txtJ8.getText(), (int) Math.round((double)numNivel3T2.getValue()));
        Jogador j9 = new Jogador(txtJ9.getText(), (int) Math.round((double)numNivel4T2.getValue()));
        Jogador j10 = new Jogador(txtJ10.getText(), (int) Math.round((double)numNivel5T2.getValue()));
        
        Jogador[] ti1 = { j1, j2, j3, j4, j5 };
        Jogador[] ti2 = { j6, j7, j8, j9, j10 };
        
        Time t1 = new Time(ti1, txtTime1.getText());
        Time t2 = new Time(ti2, txtTime2.getText());
        
        Jogo jogo = new Jogo(t1, t2);
        int[] resul = jogo.iniciarJogo();
        
        int count = 0;
        for (Jogador j : t1.jogadores) {
            
            switch(count) {
                case 0: 
                    lblKillsJ1.setText(Integer.toString(j.kills));
                    lblDeathsJ1.setText(Integer.toString(j.deaths));
                    lblRatingJ1.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                case 1:
                    lblKillsJ2.setText(Integer.toString(j.kills));
                    lblDeathsJ2.setText(Integer.toString(j.deaths));
                    lblRatingJ2.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                case 2:
                    lblKillsJ3.setText(Integer.toString(j.kills));
                    lblDeathsJ3.setText(Integer.toString(j.deaths));
                    lblRatingJ3.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                case 3:
                    lblKillsJ4.setText(Integer.toString(j.kills));
                    lblDeathsJ4.setText(Integer.toString(j.deaths));
                    lblRatingJ4.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                case 4:
                    lblKillsJ5.setText(Integer.toString(j.kills));
                    lblDeathsJ5.setText(Integer.toString(j.deaths));
                    lblRatingJ5.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                default:
                break;
            } 
            count++;
        }
        
        count = 0;
        for (Jogador j : t2.jogadores) {
            switch(count) {
                case 0: 
                    lblKillsJ6.setText(Integer.toString(j.kills));
                    lblDeathsJ6.setText(Integer.toString(j.deaths));
                    lblRatingJ6.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                case 1:
                    lblKillsJ7.setText(Integer.toString(j.kills));
                    lblDeathsJ7.setText(Integer.toString(j.deaths));
                    lblRatingJ7.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                case 2:
                    lblKillsJ8.setText(Integer.toString(j.kills));
                    lblDeathsJ8.setText(Integer.toString(j.deaths));
                    lblRatingJ8.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                case 3:
                    lblKillsJ9.setText(Integer.toString(j.kills));
                    lblDeathsJ9.setText(Integer.toString(j.deaths));
                    lblRatingJ9.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                case 4:
                    lblKillsJ10.setText(Integer.toString(j.kills));
                    lblDeathsJ10.setText(Integer.toString(j.deaths));
                    lblRatingJ10.setText(String.format("%.2f", j.calcularRating(jogo)));
                    break;
                default:
                break;
            }
        count++;
        }
        
        lblRes.setText(t1.nome + " " + resul[0] + " x " + resul[1] + " " + t2.nome);

        
    }//GEN-LAST:event_btnSimActionPerformed

    private void txtJ9ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtJ10ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtJ8ActionPerformed(java.awt.event.ActionEvent evt) {
    }

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
            java.util.logging.Logger.getLogger(SimuladorDePartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimuladorDePartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimuladorDePartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimuladorDePartidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SimuladorDePartidas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDeathsJ1;
    private javax.swing.JLabel lblDeathsJ10;
    private javax.swing.JLabel lblDeathsJ2;
    private javax.swing.JLabel lblDeathsJ3;
    private javax.swing.JLabel lblDeathsJ4;
    private javax.swing.JLabel lblDeathsJ5;
    private javax.swing.JLabel lblDeathsJ6;
    private javax.swing.JLabel lblDeathsJ7;
    private javax.swing.JLabel lblDeathsJ8;
    private javax.swing.JLabel lblDeathsJ9;
    private javax.swing.JLabel lblKillsJ1;
    private javax.swing.JLabel lblKillsJ10;
    private javax.swing.JLabel lblKillsJ2;
    private javax.swing.JLabel lblKillsJ3;
    private javax.swing.JLabel lblKillsJ4;
    private javax.swing.JLabel lblKillsJ5;
    private javax.swing.JLabel lblKillsJ6;
    private javax.swing.JLabel lblKillsJ7;
    private javax.swing.JLabel lblKillsJ8;
    private javax.swing.JLabel lblKillsJ9;
    private javax.swing.JLabel lblPlayers;
    private javax.swing.JLabel lblRatingJ1;
    private javax.swing.JLabel lblRatingJ10;
    private javax.swing.JLabel lblRatingJ2;
    private javax.swing.JLabel lblRatingJ3;
    private javax.swing.JLabel lblRatingJ4;
    private javax.swing.JLabel lblRatingJ5;
    private javax.swing.JLabel lblRatingJ6;
    private javax.swing.JLabel lblRatingJ7;
    private javax.swing.JLabel lblRatingJ8;
    private javax.swing.JLabel lblRatingJ9;
    private javax.swing.JLabel lblRes;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JLabel lblTime2;
    private javax.swing.JLabel lblVersus;
    private javax.swing.JSpinner numNivel1T1;
    private javax.swing.JSpinner numNivel1T2;
    private javax.swing.JSpinner numNivel2T1;
    private javax.swing.JSpinner numNivel2T2;
    private javax.swing.JSpinner numNivel3T1;
    private javax.swing.JSpinner numNivel3T2;
    private javax.swing.JSpinner numNivel4T1;
    private javax.swing.JSpinner numNivel4T2;
    private javax.swing.JSpinner numNivel5T1;
    private javax.swing.JSpinner numNivel5T2;
    private javax.swing.JTextField txtJ1;
    private javax.swing.JTextField txtJ10;
    private javax.swing.JTextField txtJ2;
    private javax.swing.JTextField txtJ3;
    private javax.swing.JTextField txtJ4;
    private javax.swing.JTextField txtJ5;
    private javax.swing.JTextField txtJ6;
    private javax.swing.JTextField txtJ7;
    private javax.swing.JTextField txtJ8;
    private javax.swing.JTextField txtJ9;
    private javax.swing.JTextField txtTime1;
    private javax.swing.JTextField txtTime2;
    // End of variables declaration//GEN-END:variables

}