import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileImportExportGUI extends JFrame{
    private JTextArea textArea;
    private JButton importButton;
    private JButton uppercaseButton;
    private JButton lowercaseButton;
    private JButton capitalizeButton;
    private JButton exportButton;

    public FileImportExportGUI(){
        setTitle("File Import Export GUI");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        importButton = new JButton("Import");
        importButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                importFile();
            }
        });

        uppercaseButton = new JButton("UPPERCASE");
        uppercaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                processText("uppercase");
            }
        });

        lowercaseButton = new JButton("lowercase");
        lowercaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                processText("lowercase");
            }
        });

        capitalizeButton = new JButton("Capitalize");
        capitalizeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                processText("capitalize");
            }
        });

        exportButton = new JButton("Export");
        exportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                exportFile();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(importButton);
        buttonPanel.add(uppercaseButton);
        buttonPanel.add(lowercaseButton);
        buttonPanel.add(capitalizeButton);
        buttonPanel.add(exportButton);

        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    private void importFile(){
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            if(!file.getName().endsWith(".txt")){
                JOptionPane.showMessageDialog(this, "Please import a text file (.txt) only.", "File Format Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try(BufferedReader reader = new BufferedReader(new FileReader(file))){
                String line;
                StringBuilder content = new StringBuilder();
                while((line = reader.readLine()) != null){
                    content.append(line).append("\n");
                }
                textArea.setText(content.toString());
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    private void processText(String action){
        String text = textArea.getText();
        String processedText = "";
        switch(action){
            case "uppercase":
                processedText = text.toUpperCase();
                break;
            case "lowercase":
                processedText = text.toLowerCase();
                break;
            case "capitalize":
                processedText = capitalizeEachWord(text);
                break;
        }
        textArea.setText(processedText);
    }

    private String capitalizeEachWord(String text){
        StringBuilder result = new StringBuilder(text.length());
        String[] words = text.split("\\s");
        for(String word:words){
            if(!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    private void exportFile(){
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                writer.write(textArea.getText());
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new FileImportExportGUI().setVisible(true);
            }
        });
            
    }
}