package uni_assignments;

import javax.swing.*;

public class Calories {
    public static void main(String[] args) {
        double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "input weight"));
        double calories = weight * 19;
        JOptionPane.showMessageDialog(null, "you calories value is " + calories);

    }
}
