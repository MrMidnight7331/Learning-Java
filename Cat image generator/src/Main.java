// Random Cat Image Generator
// By: MrMidnight

import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.*;
import java.io.*;

public class Main {
    public static String catApiUrl = "https://cataas.com/cat";
    public static String outputFileName = "cat.jpg";

    // Function to download the cat image via the cataas api
    public static void downloadCatImage(String imageUrl, String outputFilePath) throws IOException {
        URL catUrl = new URL(imageUrl);
        HttpURLConnection connection = (HttpURLConnection) catUrl.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream inputStream = connection.getInputStream();
            FileOutputStream outputStream = new FileOutputStream(outputFilePath);

            int bytesRead;
            byte[] buffer = new byte[4096];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();
        } else {
            throw new IOException("HTTP GET request failed with response code: " + responseCode);
        }
    }

    // Main function
    public static void main(String[] args) {

        // Downloads the image
        try {
            downloadCatImage(catApiUrl, outputFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Displaying the image
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Display JPG Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel imageLabel = new JLabel();
            ImageIcon imageIcon = new ImageIcon("cat.jpg"); // Specify the path to your JPG image file
            imageLabel.setIcon(imageIcon);

            frame.getContentPane().add(imageLabel);
            frame.pack();
            frame.setVisible(true);
        });

        // Save or delete the image
        File file = new File("cat.jpg");
        String[] buttons = { "No", "Yes" };
        int userimp = JOptionPane.showOptionDialog(null, "Save the fetched image?", "Cute Cat Image Generator", JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons);

        if (userimp == 0) {
            if(file.delete()){
                    JOptionPane.showMessageDialog(null, "Image has been deleted!", "Done!",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"No image to delete!", "nope!", JOptionPane.INFORMATION_MESSAGE);
                }

        } else if (userimp == 1) {
            JOptionPane.showMessageDialog(null,"Image saved as: " + System.getProperty("user.dir") + "/" + outputFileName);

        } else if (userimp == -1) {
            System.exit(0);
            file.delete();
        }

    }

}
