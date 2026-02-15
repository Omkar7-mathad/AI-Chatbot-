import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Chatbot {

    String getResponse(String input) {
        input = input.toLowerCase();
        if (input.contains("hello") || input.contains("hi"))
            return "Hello! How can I assist you today?";
        else if (input.contains("your name"))
            return "I am your friendly chatbot!";
        else if (input.contains("how are you"))
            return "I am just code, but I am functioning well!";
        else if (input.contains("thank"))
            return "You're welcome! 😊";
        else if (input.contains("what can you do"))
            return "I can greet you, answer simple questions, and chat with you!";
        else if (input.contains("who created you"))
            return "I was created by a Java developer like you! 😎";
        else if (input.contains("time"))
            return "Sorry, I cannot tell the time yet, but I am learning!";
        else if (input.contains("date"))
            return "I cannot access the current date now, but maybe in version 2.0!";
        else if (input.contains("joke"))
            return "Why do programmers prefer dark mode? Because light attracts bugs! 😂";
        else if (input.contains("java"))
            return "Java is a powerful, object-oriented programming language!";
        else if (input.contains("weather"))
            return "I cannot check the weather right now, but I hope it's nice outside!";
        else if (input.contains("your purpose"))
            return "My purpose is to practice Java and become smarter with you!";
        else if (input.contains("good morning"))
            return "Good morning! Have a productive day ahead! 🌞";
        else if (input.contains("good afternoon"))
            return "Good afternoon! Have a productive day ahead! 🌞";
        else if (input.contains("good night"))
            return "Good night! Sleep well and dream big! 🌙";
        else if (input.contains("bye"))
            return "Goodbye! Have a great day!";

        return "Sorry, I did not get that. Can you try again?";
    }
}

public class AIbotDemo extends JFrame implements ActionListener {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private Chatbot bot;

    public AIbotDemo() {

        bot = new Chatbot();

        setTitle("AI Chatbot - Java GUI");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 15));
        chatArea.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(chatArea);

        
        inputField = new JTextField("Type your message here...");
        inputField.setFont(new Font("Arial", Font.PLAIN, 16));
        inputField.setForeground(Color.GRAY);
        inputField.setPreferredSize(new Dimension(100, 40));

        
        inputField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (inputField.getText().equals("Type your message here...")) {
                    inputField.setText("");
                    inputField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (inputField.getText().isEmpty()) {
                    inputField.setForeground(Color.GRAY);
                    inputField.setText("Type your message here...");
                }
            }
        });

        
        sendButton = new JButton("Send");
        sendButton.setFont(new Font("Arial", Font.BOLD, 14));
        sendButton.setPreferredSize(new Dimension(100, 40));

       
        JPanel bottomPanel = new JPanel(new BorderLayout(10, 10));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(this);
        inputField.addActionListener(this);

        chatArea.append("Bot: Welcome to AI Chatbot! 😊\n");
        chatArea.append("Bot: Type your message below and press Enter or Send.\n\n");

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String userInput = inputField.getText().trim();

        if (userInput.isEmpty() || userInput.equals("Type your message here..."))
            return;

        chatArea.append("You: " + userInput + "\n");

        String response = bot.getResponse(userInput);
        chatArea.append("Bot: " + response + "\n\n");

        inputField.setText("");

        if (userInput.equalsIgnoreCase("bye")) {
            JOptionPane.showMessageDialog(this, "Chatbot is closing. Goodbye! 👋");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AIbotDemo());
    }
}
