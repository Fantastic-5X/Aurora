import javax.swing.*;

public class Main{
    private JFrame frame;
    private JPanel panel;
    private JLabel massLabel, heightLabel, speedLabel;
    private JTextField massField, heightField, speedField;
    private JButton potentialButton, kineticButton, mechanicalButton;

    public Main() {
        frame = new JFrame("Energy Calculator");

        // create components for the panel
        panel = new JPanel();
        massLabel = new JLabel("Mass:");
        massField = new JTextField(10);
        heightLabel = new JLabel("Height:");
        heightField = new JTextField(10);
        speedLabel = new JLabel("Speed:");
        speedField = new JTextField(10);

        // create buttons for the panel
        potentialButton = new JButton("Potential Energy");
        kineticButton = new JButton("Kinetic Energy");
        mechanicalButton = new JButton("Mechanical Energy");

        // add action listeners to the buttons
        potentialButton.addActionListener(e -> calculatePotentialEnergy());
        kineticButton.addActionListener(e -> calculateKineticEnergy());
        mechanicalButton.addActionListener(e -> calculateMechanicalEnergy());

        // add components to the panel
        panel.add(massLabel);
        panel.add(massField);
        panel.add(heightLabel);
        panel.add(heightField);
        panel.add(speedLabel);
        panel.add(speedField);
        panel.add(potentialButton);
        panel.add(kineticButton);
        panel.add(mechanicalButton);

        // add panel to frame
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void calculatePotentialEnergy() {
        double mass = Double.parseDouble(massField.getText());
        double height = Double.parseDouble(heightField.getText());
        double potential = mass * 10.0 * height;
        JOptionPane.showMessageDialog(frame, "The potential energy is " + potential + " J");
    }

    private void calculateKineticEnergy() {
        double mass = Double.parseDouble(massField.getText());
        double speed = Double.parseDouble(speedField.getText());
        double kinetic = 0.5 * mass * speed * speed;
        JOptionPane.showMessageDialog(frame, "The kinetic energy is " + kinetic + " J");
    }

    private void calculateMechanicalEnergy() {
        double mass = Double.parseDouble(massField.getText());
        double height = Double.parseDouble(heightField.getText());
        double speed = Double.parseDouble(speedField.getText());
        double potential = mass * 10.0 * height;
        double kinetic = 0.5 * mass * speed * speed;
        double mechanical = potential + kinetic;
        JOptionPane.showMessageDialog(frame, "The mechanical energy is " + mechanical + " J");
    }

    public static void main(String[] args) {
        new Main();
    }
}




