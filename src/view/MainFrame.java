package view;

import view.course.AddCourseFrame;
import view.student.AddStudentFrame;
import view.student.AddStudentPanel;
import view.student.StudentListPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static AddStudentFrame addStudentFrame = new AddStudentFrame();
    public static AddCourseFrame addCourseFrame = new AddCourseFrame();

    public MainFrame() {
        setTitle("LMS");
//      устанавливаем размер
        setSize(500, 500);
//        устанавливаем локацию
        setLocation(300, 300);
        setLayout(new FlowLayout());
        setJMenuBar(new MainMenuBar());
        add(new StudentListPanel());

        setVisible(true);
    }
}

// blin blinskiy
//// git@github.com:EduardGatiatullin/28.01.git
////@g00dnevvs