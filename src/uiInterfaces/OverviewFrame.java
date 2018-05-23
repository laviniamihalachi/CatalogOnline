//---cod Ana begin---//
package uiInterfaces;
/**
 *
 * @author Sclav
 */
public class OverviewFrame extends javax.swing.JFrame {

    /**
     * Creates new form OveraviewFrame
     */

    private double medieElevVal;
    private double medieClasaVal;
    private String prenumeElev;

    public OverviewFrame(double medieElev, double medieClasaElev, String prenumeElev) {
        this.medieElevVal = medieElev;
        this.medieClasaVal = medieClasaElev;
        this.prenumeElev = prenumeElev;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        mesajOverview = new javax.swing.JLabel();
        medieElev = new javax.swing.JLabel();
        medieClasa = new javax.swing.JLabel();
        overview = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Overview");

        if(medieElevVal >= medieClasaVal) {
            //System.out.println(medieElevVal + " " + medieClasaVal);

            mesajOverview.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
            mesajOverview.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            mesajOverview.setText("Felicitari" + prenumeElev + "!");

            medieElev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            medieElev.setText("Media ta este: " + medieElevVal);

            medieClasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            medieClasa.setText("Media clasei tale este: " + medieClasaVal);

            overview.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            overview.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            overview.setText("Esti peste nivelul clasei tale.");
        } else {
            //System.out.println(medieElevVal + " " + medieClasaVal);

            mesajOverview.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
            mesajOverview.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            mesajOverview.setText("Invata mai mult, " + prenumeElev + "!");

            medieElev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            medieElev.setText("Media ta este: " + medieElevVal);

            medieClasa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            medieClasa.setText("Media clasei tale este : " + medieClasaVal);

            overview.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            overview.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            overview.setText("Esti sub nivelul clasei tale.");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(overview, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(medieClasa)
                                        .addComponent(medieElev, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mesajOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(mesajOverview)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(overview)
                                .addGap(37, 37, 37)
                                .addComponent(medieElev)
                                .addGap(18, 18, 18)
                                .addComponent(medieClasa)
                                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    // Variables declaration - do not modify
    private javax.swing.JLabel medieClasa;
    private javax.swing.JLabel medieElev;
    private javax.swing.JLabel mesajOverview;
    private javax.swing.JLabel overview;
    // End of variables declaration
}
//---cod Ana end---//