package com.cherish.mycrochetdesignplanner;

import javax.swing.*;
import java.awt.*;

public class TaskPanel extends JFrame {
    JTextField one = new JTextField();
    JTextField two = new JTextField();
    JButton noteOne = new JButton("(+) New Note");
    JButton submit = new JButton("Send note");
    JButton startNewTask ;
//    TextEditor startNewText = new TextEditor();

    GridBagConstraints gbc = new GridBagConstraints();
    GridBagLayout layout = new GridBagLayout();

    public TaskPanel(){
        setDefaultCloseOperation((EXIT_ON_CLOSE));
        setSize(850, 690);
        setLayout(layout);

        startNewTask = new JButton(" (+) New Task");


        this.add(noteOne,gbc);
        this.add(startNewTask,gbc);

        setVisible(true);



    }

    public JTextArea startNewNote(){
        JTextArea newNote = new JTextArea();

        return newNote;
    }

    public JTextArea startNewTask(){

        JTextArea newTask = new JTextArea();

            this.add(newTask);
        return newTask;
    }
    public static void main(String[] args) {
        TaskPanel newPanel = new TaskPanel();
    }
}
