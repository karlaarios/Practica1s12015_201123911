
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;


public class CatalogoP_201123911 extends javax.swing.JFrame {
public static boolean p1,p2,p3,p4,p5;

    public CatalogoP_201123911() {
        super("Plants vrs. Zombies Guatemalteco 201123911");
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("src/Imagenes/EP.jpg")));
        setLayout(new FlowLayout());
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        P4 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        P5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtN1 = new javax.swing.JTextField();
        TxtA1 = new javax.swing.JTextField();
        TxtP1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtN2 = new javax.swing.JTextField();
        TxtA2 = new javax.swing.JTextField();
        TxtP2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtN3 = new javax.swing.JTextField();
        TxtA3 = new javax.swing.JTextField();
        TxtP3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtN4 = new javax.swing.JTextField();
        TxtA4 = new javax.swing.JTextField();
        TxtP4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtN5 = new javax.swing.JTextField();
        TxtA5 = new javax.swing.JTextField();
        TxtP5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(235, 235, 235));
        jButton1.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(142, 62, 59));
        jButton2.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 51));
        jButton2.setText("LISTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        P4.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        P4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p7.gif"))); // NOI18N
        P4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P4MousePressed(evt);
            }
        });

        P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p3.png"))); // NOI18N
        P2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P2MousePressed(evt);
            }
        });

        P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p1.gif"))); // NOI18N
        P1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P1MousePressed(evt);
            }
        });

        P3.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p5.gif"))); // NOI18N
        P3.setToolTipText("");
        P3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P3MousePressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton6.setText("Modificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton7.setText("Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton8.setText("Modificar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton9.setText("Agregar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton10.setText("Modificar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        P5.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        P5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p9.gif"))); // NOI18N
        P5.setToolTipText("");
        P5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                P5MousePressed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton11.setText("Modificar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jButton12.setText("Agregar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Atraque");

        jLabel3.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Puntos");

        TxtN1.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtN1.setText("Lanzador");
        TxtN1.setEnabled(false);

        TxtA1.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtA1.setText("Lanzador");
        TxtA1.setEnabled(false);
        TxtA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtA1ActionPerformed(evt);
            }
        });

        TxtP1.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtP1.setText("8");
        TxtP1.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Atraque");

        jLabel5.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puntos");

        TxtN2.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtN2.setText("Lanzador G5");
        TxtN2.setEnabled(false);
        TxtN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtN2ActionPerformed(evt);
            }
        });

        TxtA2.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtA2.setText("Distparo");
        TxtA2.setEnabled(false);
        TxtA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtA2ActionPerformed(evt);
            }
        });

        TxtP2.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtP2.setText("15");
        TxtP2.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Atraque");

        jLabel8.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puntos");

        TxtN3.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtN3.setText("Sandia");
        TxtN3.setEnabled(false);

        TxtA3.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtA3.setText("Disparo");
        TxtA3.setEnabled(false);
        TxtA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtA3ActionPerformed(evt);
            }
        });

        TxtP3.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtP3.setText("12");
        TxtP3.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Atraque");

        jLabel11.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Puntos");

        TxtN4.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtN4.setText("Bomba");
        TxtN4.setEnabled(false);
        TxtN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtN4ActionPerformed(evt);
            }
        });

        TxtA4.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtA4.setText("Directo");
        TxtA4.setEnabled(false);

        TxtP4.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtP4.setText("8");
        TxtP4.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Champagne & Limousines", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");

        jLabel13.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jLabel13.setText("Atraque");

        jLabel14.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jLabel14.setText("Puntos");

        TxtN5.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtN5.setText("Comelon");
        TxtN5.setEnabled(false);

        TxtA5.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtA5.setText("Directo");
        TxtA5.setEnabled(false);
        TxtA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtA5ActionPerformed(evt);
            }
        });

        TxtP5.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        TxtP5.setText("12");
        TxtP5.setEnabled(false);
        TxtP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtP5ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Champagne & Limousines", 0, 14)); // NOI18N
        jLabel15.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(P3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel8)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtA3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtN3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtP3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(TxtN4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel11)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtA4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtP4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(P1)))
                                .addGap(0, 15, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtA1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(21, 21, 21)
                                        .addComponent(TxtP2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtA2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(P2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TxtN2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtN5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton11))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(jLabel14)
                                                    .addGap(25, 25, 25))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TxtA5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TxtP5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(P5)))
                        .addGap(252, 252, 252)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtN5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(TxtN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(TxtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(TxtA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12)
                            .addComponent(jButton11)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(jButton4)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton5)
                                .addComponent(jButton6)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(TxtA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(TxtA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TxtP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TxtN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TxtA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton10))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TxtN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TxtA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TxtN1.setText(TxtN1.getText());
        TxtA1.setText(TxtA1.getText());
        TxtP1.setText(TxtP1.getText());
        TxtN2.setText(TxtN2.getText());
        TxtA2.setText(TxtA2.getText());
        TxtP2.setText(TxtP2.getText());
        TxtN3.setText(TxtN3.getText());
        TxtA3.setText(TxtA3.getText());
        TxtP3.setText(TxtP3.getText());
        TxtN4.setText(TxtN4.getText());
        TxtA4.setText(TxtA4.getText());
        TxtP4.setText(TxtP4.getText());
        TxtN5.setText(TxtN5.getText());
        TxtA5.setText(TxtA5.getText());
        TxtP5.setText(TxtP5.getText());
        
        ElegirJ_201123911 EJ=new ElegirJ_201123911();
        EJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TxtN1.setText(TxtN1.getText());
        TxtA1.setText(TxtA1.getText());
        TxtP1.setText(TxtP1.getText());
        TxtN2.setText(TxtN2.getText());
        TxtA2.setText(TxtA2.getText());
        TxtP2.setText(TxtP2.getText());
        TxtN3.setText(TxtN3.getText());
        TxtA3.setText(TxtA3.getText());
        TxtP3.setText(TxtP3.getText());
        TxtN4.setText(TxtN4.getText());
        TxtA4.setText(TxtA4.getText());
        TxtP4.setText(TxtP4.getText());
        TxtN5.setText(TxtN5.getText());
        TxtA5.setText(TxtA5.getText());
        TxtP5.setText(TxtP5.getText());
        ElegirJ_201123911 EJ=new ElegirJ_201123911();
        EJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void P4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4MousePressed

    }//GEN-LAST:event_P4MousePressed

    private void P2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2MousePressed
 
    }//GEN-LAST:event_P2MousePressed

    private void P1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1MousePressed
 
    }//GEN-LAST:event_P1MousePressed

    private void P3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3MousePressed

    }//GEN-LAST:event_P3MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        p1=true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        p2=true;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        p3=true;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        p4=true;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void P5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_P5MousePressed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        p5=true;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TxtN1.setEnabled(true);
        TxtA1.setEnabled(true);
        TxtP1.setEnabled(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TxtN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtN4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtN4ActionPerformed

    private void TxtA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtA3ActionPerformed

    private void TxtA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtA2ActionPerformed

    private void TxtN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtN2ActionPerformed

    private void TxtA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtA1ActionPerformed

    private void TxtA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtA5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtA5ActionPerformed

    private void TxtP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtP5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtP5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        TxtN2.setEnabled(true);
        TxtA2.setEnabled(true);
        TxtP2.setEnabled(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        TxtN5.setEnabled(true);
        TxtA5.setEnabled(true);
        TxtP5.setEnabled(true);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TxtN3.setEnabled(true);
        TxtA3.setEnabled(true);
        TxtP3.setEnabled(true);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        TxtN4.setEnabled(true);
        TxtA4.setEnabled(true);
        TxtP4.setEnabled(true);
        
    }//GEN-LAST:event_jButton10ActionPerformed

 
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
            java.util.logging.Logger.getLogger(CatalogoP_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogoP_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogoP_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogoP_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoP_201123911().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P4;
    private javax.swing.JLabel P5;
    private javax.swing.JTextField TxtA1;
    private javax.swing.JTextField TxtA2;
    private javax.swing.JTextField TxtA3;
    private javax.swing.JTextField TxtA4;
    private javax.swing.JTextField TxtA5;
    private javax.swing.JTextField TxtN1;
    private javax.swing.JTextField TxtN2;
    private javax.swing.JTextField TxtN3;
    private javax.swing.JTextField TxtN4;
    private javax.swing.JTextField TxtN5;
    private javax.swing.JTextField TxtP1;
    private javax.swing.JTextField TxtP2;
    private javax.swing.JTextField TxtP3;
    private javax.swing.JTextField TxtP4;
    private javax.swing.JTextField TxtP5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
