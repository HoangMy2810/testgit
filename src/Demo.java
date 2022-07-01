import java.awt.*;
class Demo
{
        public static void main(String args[]) {
            Frame f = new Frame("Chao");
            Label l = new Label("Chao Java - AWT");
            Font fo = new Font("Arial", Font.BOLD, 20);
            l.setFont(fo);
            l.setForeground(Color.red);
            f.add(l);
            f.setSize(200, 100);
            f.setVisible(false);
        }
}