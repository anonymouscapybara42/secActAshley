import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatMain {
    public static void main(String[] args) {
        ChatSec frame1 = new ChatSec();
        ChatSec frame2 = new ChatSec();

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        frame1.setTitle("Paris");
        frame2.setTitle("negros");
=======
        frame1.setTitle("Ako");
        frame2.setTitle("Kamo");
>>>>>>> origin
=======
        frame1.setTitle("Ako//");
        frame2.setTitle("Kamo//");
>>>>>>> origin
=======
        frame1.setTitle("silay");
        frame2.setTitle("Kamo");
>>>>>>> origin
        frame1.setSize(400, 230);
        frame2.setSize(400, 230);

        frame1.sumbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chatbox = frame1.chatField.getText();
                if (!chatbox.isEmpty()) {
                    frame1.displayField.append("Carl 1: " + chatbox + "\n"); // Display in Chat 1
                    frame2.displayField.append("Kerl 1: " + chatbox + "\n"); // Display in Chat 2
                    frame1.chatField.setText(""); // Clear input field after sending
                }
            }
        });

        frame2.sumbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chatbox = frame2.chatField.getText();
                if (!chatbox.isEmpty()) {
                    frame2.displayField.append("Person 2: " + chatbox + "\n"); // Display in Chat 2
                    frame1.displayField.append("Person 2: " + chatbox + "\n"); // Display in Chat 1
                    frame2.chatField.setText(""); // Clear input field after sending
                }
            }
        });
    }
}
