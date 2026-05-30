import javax.swing.JOptionPane;
public class Land {
    public static void main(String[] args) {
        String length_i, width_i;
        double length, width, area;

        length_i = JOptionPane.showInputDialog("Enter the length of the plot in inches:");
        width_i = JOptionPane.showInputDialog("Enter the width of the plot in inches:");
        length = Double.parseDouble(length_i) * 2.54;
        width = Double.parseDouble(width_i) * 2.54;
        area = length * width;
        JOptionPane.showMessageDialog(null,"Length: " + length/2.54 + " inches (" + length + "cm)\n" + "Width: " + width/2.54 + " inches (" + width + "cm)\n" + "Area: " + area/(2.54*2.54) + " inches (" + area + " square cm)", "Plot Area Calculator", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
