
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.TransferHandler;


public class Tablero_201123911 extends javax.swing.JFrame {
public static String NombreP, NombreZ;
public static int CantidadP, CantidadZ,posA,posicionesMov,y, ancho, alto;
public static JLabel JugadorA;
public static int segundos = 0,minutos=0;
public static Timer timer;
public static int dim1,dim2,contador;   
public static Icon Icono;

JLabel label;    
String Texto;
Casillas_201123911 arregloCasillas[][];

   
    public Tablero_201123911() {
          super("Plants vrs. Zombies Guatemalteco 201123911");
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("src/Imagenes/Fondo.jpg")));
        setLayout(new FlowLayout());
        initComponents();
        NombreP= ElegirJ_201123911.NombreP; 
        NombreZ= ElegirJ_201123911.NombreZ;
        LblJZ.setText(NombreZ);
        LblJP.setText(NombreP);
        CantidadZ=ElegirJ_201123911.CantidadZ;
        CantidadP=ElegirJ_201123911.CantidadP;
        LblPR.setText(""+CantidadP);
        LblZR.setText(""+CantidadZ);
         dim1=FrTTablero_201123911.dim1;
        dim2=FrTTablero_201123911.dim2;

        Label1.setText(""+dim1+" x "+dim2);
//        this.tiempo();
        //PnlTablero.setBounds(25, 25, dim1*28, dim2*28);
        imprimirArreglo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblJP = new javax.swing.JLabel();
        LblJZ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LblPR = new javax.swing.JLabel();
        LblZR = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jugador:");

        jLabel2.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jugador:");

        LblJP.setFont(new java.awt.Font("Zombie", 2, 24)); // NOI18N
        LblJP.setForeground(new java.awt.Color(255, 255, 255));

        LblJZ.setFont(new java.awt.Font("Zombie", 2, 24)); // NOI18N
        LblJZ.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Champagne & Limousines", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Zombies Restantes:");

        jLabel4.setFont(new java.awt.Font("Champagne & Limousines", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Plantas Restantes:");

        LblPR.setFont(new java.awt.Font("Zombie", 2, 24)); // NOI18N
        LblPR.setForeground(new java.awt.Color(255, 255, 255));

        LblZR.setFont(new java.awt.Font("Zombie", 2, 24)); // NOI18N
        LblZR.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblJP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblJZ, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(LblPR, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblZR, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblJZ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblJP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblPR, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(LblZR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void GenerarNodosI(){
//        try {
//
//              String dotPath = "c:\\Archivos de programa\\Graphviz 2.38\\bin\\dot.exe";
//
//              String fileInputPath = "\\desktop\\grafo1.txt";
//              String fileOutputPath = "\\desktop\\grafo1.jpg";
//
//              String tParam = "-Tjpg";
//              String tOParam = "-o";
//
//              String[] cmd = new String[5];
//              cmd[0] = dotPath;
//              cmd[1] = tParam;
//              cmd[2] = fileInputPath;
//              cmd[3] = tOParam;
//              cmd[4] = fileOutputPath;
//
//              Runtime rt = Runtime.getRuntime();
//
//              rt.exec( cmd );
//
//            } catch (Exception ex) {
//              ex.printStackTrace();
//            } finally {
//            
//        }           
    }
 public  void imprimirArreglo(){


        String Posicion="";
        Casillas_201123911 Casillas;
        for (int i= 0; i < dim1; i++) {  //ciclo para x
            for (int j= 0; j < dim2; j++) {  //ciclo para y
                Casillas=arregloCasillas[i][j];                
                 label =  new JLabel(Posicion);
                label.setBounds(28*i, 28*j, 28, 28);
                
                label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                if (j==0 ||i==0||i==dim1-1||j==dim2-1){
                    ImageIcon fondoC = new ImageIcon("src/Imagenes/LO2.png");
                    label.setIcon(fondoC); 
                }
                else{
                    ImageIcon fondoC = new ImageIcon("src/Imagenes/FB.png");
                    label.setIcon(fondoC); 
                    label.setTransferHandler(new TransferHandler("icon"));
                    arregloCasillas[i][j].icono=fondoC;                }
                
                PnlTablero.add(label);
                
            }
           
        }
 


//        timer.start();




    }
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(Tablero_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero_201123911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero_201123911().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblJP;
    private javax.swing.JLabel LblJZ;
    private javax.swing.JLabel LblPR;
    private javax.swing.JLabel LblZR;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
