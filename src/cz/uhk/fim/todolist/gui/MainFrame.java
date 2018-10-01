package cz.uhk.fim.todolist.gui;

import com.sun.deploy.panel.JavaPanel;
import sun.plugin.security.JDK11ClassFileTransformer;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        init();
    }

    private void init() {
        setTitle("Todo List App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,480);
        setLocationRelativeTo(null);

        initControlPanel();
    }

    //vytvorime dve metody (pro kazdy panel 1)
    private void initControlPanel() {
        JPanel controlPanel = new JPanel(new BorderLayout());//Grid layout pro vice veci v jedno, radku

        JPanel formPanel = new JPanel(new BorderLayout());
        JLabel lblAddTodo = new JLabel("Zadejte todo:");
        JTextField txtAddTodo = new JTextField();
        JButton btnAdd = new JButton("Pridat");

        formPanel.add(lblAddTodo, BorderLayout.WEST); //ctrl + D klonovani radku
        formPanel.add(txtAddTodo, BorderLayout.CENTER);
        formPanel.add(btnAdd, BorderLayout.EAST);

        controlPanel.add(formPanel, BorderLayout.NORTH);

        add(controlPanel);//du ToDoItem String title, bolean complete, string dateTime, getry a setry


    }
}
