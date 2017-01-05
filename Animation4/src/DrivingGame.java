import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

public class DrivingGame extends JPanel {

   // For animation, increases by 1 in each frame.

   private int frameNumber;
   
   // A path used for drawing the ground, with "hills".

   private GeneralPath       ground;

   // A path used for drawing one windmill blade.

   private GeneralPath windmillVane;
   
   // The size of a pixel in drawing coordinates.

   private float pixelSize;                                   

   // Desired coordinate limits.

   private double[] limitsRequested = new double[] {0,7,4,-1};

   /**
    * =====================================================================
    * Constructor sets the preferred size of the panel to 700-by-500,
    * adds a gray border, and starts a timer that will drive the animation.
    * =====================================================================
    */

   public DrivingGame() {

      setPreferredSize( new Dimension(700,500));
      setBackground( Color.LIGHT_GRAY );
      setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));

      // Creates the street/ground

      ground = new GeneralPath();
      ground.moveTo(0,-1);
      ground.lineTo(0,1);
      ground.curveTo(1,2,1,2,1.5F,2);
      ground.curveTo(2.5F,2,2.5F,1.5F,2,1.5F);
      ground.curveTo(2.5F,1.5F,2.5F,2.5F,3,2.5F);
      ground.curveTo(3.5F,2.5F,3.5F,1.8F,4,1.8F);
      ground.curveTo(5,1.8F,4,2.2F,5,2.2F);
      ground.curveTo(6,2.2F,6,2,7,2);
      ground.lineTo(7,-1);
      ground.closePath();

      // Creates the windmills

      windmillVane = new GeneralPath();
      windmillVane.moveTo(0,0);
      windmillVane.lineTo(0.5F,0.1F);
      windmillVane.lineTo(1.5F,0);
      windmillVane.lineTo(0.5F,-0.1F);
      windmillVane.closePath();

      // Creates and runs the timebased animation

      new Timer(30,new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            frameNumber++;
            repaint();
         }
      }).start();
   }
   
   /**
    * Creates the frame of the animation.
    */

   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g.create();

      g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
                           RenderingHints.VALUE_ANTIALIAS_ON);
      
  

      applyLimits(g2, getWidth(), getHeight(), limitsRequested, false);
      
      
      // This creates the sky, street and ground directly.
     

      // Sky is filled in behind the cloud

      g2.setColor( new Color(150,150,255) );
      g2.fillRect(0,0,7,4);

      // Fill the ground ....

      g2.setColor( new Color(0,150,30) );
      g2.fill(ground);

      // Draw the road ...

      g2.setColor(new Color(100,100,150));
      g2.fill(new Rectangle2D.Double(0,-0.4,7,0.8));

      // Creates stripes on the street

      g2.setStroke( new BasicStroke(0.1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,
            new float[] { 0.25F, 0.2F }, 1) );
      g2.setColor(Color.WHITE);
      g2.drawLine(0,0,7,0);
      g2.setStroke( new BasicStroke(pixelSize) );
      
      
      AffineTransform saveTr = g2.getTransform();
      
      // Creates the sun

      g2.translate(5,3.3);
      drawSun(g2);
      g2.setTransform(saveTr);
      
      // Creates the three windmills 
     
      
      g2.translate(0.75,1);
      g2.scale(0.6,0.6);
      drawWindmill(g2);
      g2.setTransform(saveTr);

      g2.translate(2.2,1.6);
      g2.scale(0.4,0.4);
      drawWindmill(g2);
      g2.setTransform(saveTr);

      g2.translate(3.7,0.8);
      g2.scale(1.0,1.0);
      drawWindmill(g2);
      g2.setTransform(saveTr);
      
   
      // Creates the red car.
      
      
      g2.translate(-3 + 13*(frameNumber % 300) / 300.0, 0);
      g2.scale(0.3,0.3);
      drawCart(g2);
   }
   
   
   private void applyLimits(Graphics2D g2, int width, int height,
                            double[] limitsRequested, boolean preserveAspect) {

      double[] limits = limitsRequested;

      if (preserveAspect) {
         double displayAspect   = Math.abs((double)height / width);
         double requestedAspect = Math.abs(( limits[3] - limits[2] ) / ( limits[1] - limits[0] ));

         if (displayAspect > requestedAspect) {
            double excess = (limits[3] - limits[2]) * (displayAspect/requestedAspect - 1);
            limits = new double[] { limits[0], limits[1],
                                    limits[2] - excess/2, limits[3] + excess/2 };
         }
         else if (displayAspect < requestedAspect) {
            double excess = (limits[1] - limits[0]) * (requestedAspect/displayAspect - 1);
            limits = new double[] { limits[0] - excess/2,
                                    limits[1] + excess/2, limits[2], limits[3] };
         }
      }

      double pixelWidth  = Math.abs(( limits[1] - limits[0] ) / width);
      double pixelHeight = Math.abs(( limits[3] - limits[2] ) / height);
      pixelSize = (float) Math.min(pixelWidth,pixelHeight);

      g2.scale( width / (limits[1]-limits[0]), height / (limits[3]-limits[2]) );
      g2.translate( -limits[0], -limits[2] );
   }

   /**
    * ==========================================================================
    * Creates a sun with radius 0.5 centered at (0,0). There are also 13 rays which
    * extend outside from the sun for another 0.25 units.
    */

   private void drawSun(Graphics2D g2) {
      g2.setColor(Color.YELLOW);

      // This creates the 13 rays, each has it's own rotations.

      for (int i = 0; i < 13; i++) { 
         g2.rotate( 2*Math.PI / 13 ); 
         g2.draw( new Line2D.Double(0,0,0.75,0) ); 
      }

      // This creates the sun ....

      g2.fill( new Ellipse2D.Double(-0.5,-0.5,1,1) );
      g2.setColor( new Color(180,180,0) );
      g2.draw( new Ellipse2D.Double(-0.5,-0.5,1,1) );
   }
   

   private void drawWindmill(Graphics2D g2) {

      g2.setColor(new Color(200,200,225));
      g2.fill(new Rectangle2D.Double(-0.05,0,0.1,3));

      // Translations to move the vanes to the top of the pole.

      g2.translate(0,3);

      // Apply an overall rotation to the set of vanes.

      g2.rotate(frameNumber/23.0);
      g2.setColor(new Color(100,100,200));

      // Draw wind vanes 60 degrees apart.....

      for (int i = 0; i < 6; i++) {
         g2.rotate(1*Math.PI/3);
         g2.fill(windmillVane); 
      }
   }
   
   /**
    * Creates a car with rectangle body and two wheels.
    */

   private void drawCart(Graphics2D g2) {
      AffineTransform tr = g2.getTransform();  // save the current transform

      // Center of first wheel will be at (-1.5,-0.1)

      g2.translate(-1.5,-0.1);
      g2.scale(0.8,0.8);
      drawWheel(g2);

      // Restore the transform 

      g2.setTransform(tr);

      // Center of second wheel will be at (1.5,-0.1)

      g2.translate(1.5,-0.1);
      g2.scale(0.8,0.8);
      drawWheel(g2);

      // Restore the transform

      g2.setTransform(tr);
      g2.setColor(Color.RED);

      // Creates the body of the car

      g2.fill(new Rectangle2D.Double(-2.5,0,5,2) );
   }
   
   /**
    * ==========================================================================
    * Draw a wheel centered at (0,0) and with radius 1. The wheel has 15 spokes
    * that rotate in a clockwise direction as the animation proceeds.
    * ==========================================================================
    */

   private void drawWheel(Graphics2D g2) {

      // Draw outline of wheel ....

      g2.setColor(Color.BLACK);
      g2.fill( new Ellipse2D.Double(-1,-1,2,2) );
      g2.setColor(Color.LIGHT_GRAY);
      g2.fill( new Ellipse2D.Double(-0.8,-0.8,1.6,1.6) );
      g2.setColor(Color.BLACK);
      g2.fill( new Ellipse2D.Double(-0.2,-0.2,0.4,0.4) );
      g2.rotate( -frameNumber/30.0 );

      // Draw 15 spokes ....

      for (int i = 0; i < 15; i++) {  
         g2.rotate(2*Math.PI/15);
         g2.draw( new Rectangle2D.Double(0,-0.1,1,0.2) );
      }
   }

   // ========================
   // Exercise simulation ....
   // ========================

   public static void main(String[] args) {

      DrivingGame demo = new DrivingGame();

      JFrame window = new JFrame("Car Driving Down the Street Aligned With Windmills");
      window.setContentPane( demo );
      window.pack();
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
   }
}
