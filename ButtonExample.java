import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ButtonExample {

    private void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*JFrame.DO_NOTHING_ON_CLOSE → Prevents the window from closing.
JFrame.HIDE_ON_CLOSE → Hides the window but does not terminate the program (default behavior).
JFrame.DISPOSE_ON_CLOSE → Closes the window and releases resources, but the program continues running if other threads exist. */

        // Create a button
        JButton button = new JButton("Me");

        // Add the button to the content pane of the frame
        frame.add(button);

        // Set the size of the frame
        frame.setSize(400, 400);

        // Center the frame on the screen
       // frame.setLocationRelativeTo(null);

        // Display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event dispatch thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonExample().createAndShowGUI();
            }
        });
    }
}