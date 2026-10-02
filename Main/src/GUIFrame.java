import java.awt.*;
import java.awt.event.*;

public class GUIFrame extends Frame implements  ActionListener {


        // 1. Declare UI Components
        private Label labelHeader;
        private Label labelPrompt;
        private TextField textInput;
        private Button btnSubmit;
        private Label labelOutput;

    public GUIFrame() {
        // Configure Frame Properties
        setTitle("Java AWT GUI Demo");
        setSize(400, 250);
        setLayout(new FlowLayout()); // Use FlowLayout for simple row placement
        //setLayout(null);

        // 2. Instantiate Components
        labelHeader = new Label("Welcome to Java AWT GUI!");
        labelPrompt = new Label("Enter your name:");
        textInput = new TextField(20);
        btnSubmit = new Button("Submit");
        labelOutput = new Label("                                 "); // Placeholder space
        labelHeader.setSize(20,30);
        // 3. Register Event Listener on the Button

        btnSubmit.addActionListener(this);

        // Window Closing Event (Required for AWT Frame close button to function)
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 4. Add Components to Container (Frame)
        add(labelHeader);
        add(labelPrompt);
        add(textInput);
        add(btnSubmit);
        add(labelOutput);

        // Make frame visible
        setVisible(true);
    }

        // 5. Implement Event Handling Method
        @Override
        public void actionPerformed(ActionEvent e) {
        String name = textInput.getText().trim();
        if (name.isEmpty()) {
            labelOutput.setText("Please enter a name first!");
        } else {
            labelOutput.setText("Hello, " + name + "! Welcome to AWT.");
        }
    }


}
