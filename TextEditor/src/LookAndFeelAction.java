import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class LookAndFeelAction
{
    JFrame jf;
    public LookAndFeelAction(JFrame j)
    {
        jf=j;
    }

    public static void setBasicLookAndFeel()
    {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            JFrame.setDefaultLookAndFeelDecorated(false);
            AdvancedNotepad tb = new AdvancedNotepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
            }
            tb.setIconImage(image);
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
    }

    public static void setMotifLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            AdvancedNotepad tb = new AdvancedNotepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
    }

    //    public static void setNimbusLookAndFeel()
    //    {
    //        try
    //        {
    //            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
    //            AdvancedNotepad tb=new AdvancedNotepad();
    //            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
    //            BufferedImage image = null;
    //            try {
    //                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
    //            } catch (IOException e) {
    //            }
    //            tb.setIconImage(image);
    //            tb.setSize(800, 600);
    //            tb.setLocation(100, 50);
    //            tb.setVisible(true);
    //        }
    //        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){ }
    //    }

    public static void setWindowsLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            AdvancedNotepad tb = new AdvancedNotepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
    }

    public static void setWindowsClassicLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            AdvancedNotepad tb = new AdvancedNotepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
    }

    public static void setGlobalDarkLookAndFeel()
    {
        MetalLookAndFeel.setCurrentTheme(new JavaGlobalDarkTheme().darkTheme);
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (Exception ev) {
        }

        JFrame.setDefaultLookAndFeelDecorated(true);
        AdvancedNotepad tb = new AdvancedNotepad();
        tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
        BufferedImage image = null;
        try {
            image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
        } catch (IOException e) {
        }
        tb.setIconImage(image);
        tb.setSize(800, 600);
        tb.setLocation(100, 50);
        tb.setVisible(true);

    }

}

class JavaGlobalDarkTheme {

    DefaultMetalTheme darkTheme = new DefaultMetalTheme() {

        @Override
        public ColorUIResource getPrimary1() {
            return new ColorUIResource(new Color(30, 30, 30));
        }


        @Override
        public ColorUIResource getPrimary2() {
            return new ColorUIResource(new Color(20, 20, 20));
        }

        @Override
        public ColorUIResource getPrimary3() {
            return new ColorUIResource(new Color(30, 30, 30));
        }

        @Override
        public ColorUIResource getBlack(){
            return new ColorUIResource(new Color(30, 30, 30));
        }

        @Override
        public ColorUIResource getWhite() {
            return new ColorUIResource(new Color(240, 240, 240));
        }


        @Override
        public ColorUIResource getMenuForeground() {
            return new ColorUIResource(new Color(200, 200, 200));
        }

        @Override
        public ColorUIResource getMenuBackground() {
            return new ColorUIResource(new Color(25, 25, 25));
        }

        @Override
        public ColorUIResource getMenuSelectedBackground(){
            return new ColorUIResource(new Color(50, 50, 50));
        }

        @Override
        public ColorUIResource getMenuSelectedForeground() {
            return new ColorUIResource(new Color(255, 255, 255));
        }


        @Override
        public ColorUIResource getSeparatorBackground() {
            return new ColorUIResource(new Color(15, 15, 15));
        }


        @Override
        public ColorUIResource getUserTextColor() {
            return new ColorUIResource(new Color(240, 240, 240));
        }

        @Override
        public ColorUIResource getTextHighlightColor() {
            return new ColorUIResource(new Color(80, 40, 80));
        }


        @Override
        public ColorUIResource getAcceleratorForeground(){
            return new ColorUIResource(new Color(30, 30,30));
        }


        @Override
        public ColorUIResource getWindowTitleInactiveBackground() {
            return new ColorUIResource(new Color(30, 30, 30));
        }


        @Override
        public ColorUIResource getWindowTitleBackground() {
            return new ColorUIResource(new Color(30, 30, 30));
        }


        @Override
        public ColorUIResource getWindowTitleForeground() {
            return new ColorUIResource(new Color(230, 230, 230));
        }

        @Override
        public ColorUIResource getPrimaryControlHighlight() {
            return new ColorUIResource(new Color(40, 40, 40));
        }

        @Override
        public ColorUIResource getPrimaryControlDarkShadow() {
            return new ColorUIResource(new Color(40, 40, 40));
        }

        @Override
        public ColorUIResource getPrimaryControl() {
            //color for minimize,maxi,and close
            return new ColorUIResource(new Color(60, 60, 60));
        }

        @Override
        public ColorUIResource getControlHighlight() {
            return new ColorUIResource(new Color(20, 20, 20));
        }

        @Override
        public ColorUIResource getControlDarkShadow() {
            return new ColorUIResource(new Color(50, 50, 50));
        }

        @Override
        public ColorUIResource getControl() {
            return new ColorUIResource(new Color(25, 25, 25));
        }

        @Override
        public ColorUIResource getControlTextColor() {
            return new ColorUIResource(new Color(230, 230, 230));
        }

        @Override
        public ColorUIResource getFocusColor() {
            return new ColorUIResource(new Color(0, 100, 0));
        }

        @Override
        public ColorUIResource getHighlightedTextColor() {
            return new ColorUIResource(new Color(250, 250, 250));
        }

    };
}
