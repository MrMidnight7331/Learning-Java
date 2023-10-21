// Random Cat Image Generator
// By: MrMidnight

import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static String catApiUrl = "https://cataas.com/cat";
    public static File file = null;
    public static JFrame frame = null;

    public static void downloadCatImage(String imageUrl) {
        try {
            URL catUrl = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) catUrl.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                String timeStamp = dateFormat.format(new Date());
                String outputFilePath = "cat_" + timeStamp + ".jpg"; // Create a new file name
                file = new File(outputFilePath); // Update the File object

                try (InputStream inputStream = connection.getInputStream();
                     FileOutputStream outputStream = new FileOutputStream(file)) {
                    int bytesRead;
                    byte[] buffer = new byte[4096];
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                }
            } else {
                throw new IOException("HTTP GET request failed with response code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void displayImage() {
        if (frame != null) {
            frame.dispose(); // Dispose of the old frame
        }

        frame = new JFrame("Displaying " + file);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(file.getAbsolutePath());
        imageLabel.setIcon(imageIcon);

        frame.getContentPane().add(imageLabel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        downloadCatImage(catApiUrl);
        displayImage();

        String[] buttons = { "No, exit please", "Yes please!" };
        int userChoice;

        while (true) {
            userChoice = JOptionPane.showOptionDialog(null, "Fetch another & Save?", "Cute Cat Image Generator",
                    JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons);

            if (userChoice == 1) {
                downloadCatImage(catApiUrl);
                displayImage();
            } else if (userChoice == 0 || userChoice == -1 ) {
                if (file != null) {
                    if (file.exists()) {
                        if (file.delete()) {
                            System.exit(0);
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to delete...", "Error: ", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }
}