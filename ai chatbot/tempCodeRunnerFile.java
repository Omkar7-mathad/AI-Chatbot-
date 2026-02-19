import java.util.Scanner;

class Chatbot {

    String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I assist you today?\n";
        }
        else if (input.contains("your name")) {
            return "I am your friendly chatbot!\n";
        }
        else if (input.contains("how are you")) {
            return "I am just code, but I am functioning well!\n";
        }
        else if (input.contains("thank")) {
            return "You're welcome! 😊\n";
        }
        else if (input.contains("what can you do")) {
            return "I can greet you, answer simple questions, and chat with you!\n";
        }
        else if (input.contains("who created you")) {
            return "I was created by a Java developer like you! 😎\n";
        }
        else if (input.contains("time")) {
            return "Sorry, I cannot tell the time yet, but I am learning!\n";
        }
        else if (input.contains("date")) {
            return "I cannot access the current date now, but maybe in version 2.0!\n";
        }
        else if (input.contains("joke")) {
            return "Why do programmers prefer dark mode? Because light attracts bugs! 😂\n";
        }
        else if (input.contains("java")) {
            return "Java is a powerful, object-oriented programming language!\n";
        }
        else if (input.contains("weather")) {
            return "I cannot check the weather right now, but I hope it's nice outside!\n";
        }
        else if (input.contains("your purpose")) {
            return "My purpose is to practice Java and become smarter with you!\n";
        }
        else if (input.contains("good morning")) {
            return "Good morning! Have a productive day ahead! 🌞\n";
        }
        else if (input.contains("good night")) {
            return "Good night! Sleep well and dream big! 🌙\n";
        }
        else if (input.contains("bye")) {
            return "Goodbye! Have a great day!\n";
        }

        // Default response
        return "Sorry, I did not get that. Can you try again?\n";
    }
}

public class AIbotDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Chatbot bot = new Chatbot();

        System.out.println("Welcome to AI Chatbot (type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            String userInput = input.nextLine();

            String response = bot.getResponse(userInput);
            System.out.print("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        input.close();
    }
}
