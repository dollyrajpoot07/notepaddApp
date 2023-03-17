import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class notepadApp extends JFrame implements ActionListener {

    JMenuBar menubar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu format = new JMenu("Format");
    JMenu view = new JMenu("View");
    JMenu help = new JMenu("Help");

    JMenuItem newFile = new JMenuItem("New");
    JMenuItem newWindowFile = new JMenuItem("New Window");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem saveAs = new JMenuItem("Save As");
    JMenuItem pageSettings = new JMenuItem("Page Settings");
    JMenuItem print = new JMenuItem("Print");
    JMenuItem exit = new JMenuItem("Exit");

    JMenuItem undo = new JMenuItem("Undo");
    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");
    JMenuItem delete = new JMenuItem("Delete");
    JMenuItem searchWithBing = new JMenuItem("Search with Bing");
    JMenuItem find = new JMenuItem("Find");
    JMenuItem findNext = new JMenuItem("Find Next");
    JMenuItem findPrevious = new JMenuItem("Find Previous");
    JMenuItem replace = new JMenuItem("Replace");
    JMenuItem goTo = new JMenuItem("Go To");
    JMenuItem selectAll = new JMenuItem("Select All");
    JMenuItem time_date = new JMenuItem("Time/Date");

    JMenuItem wordWrap = new JMenuItem("Word Wrap");
    JMenuItem font = new JMenuItem("Font");

    JMenuItem zoom = new JMenuItem("Zoom");
    JMenuItem statusBar = new JMenuItem("Status bar");

    JMenuItem viewHelp = new JMenuItem("View Help");
    JMenuItem sendFeedback = new JMenuItem("Send Feedback");
    JMenuItem aboutNotepad = new JMenuItem("About Notepad");

    JTextArea textArea = new JTextArea();

    notepadApp() {
        setTitle("Notepad App");
        setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("notepadIcon.png"));
        setIconImage(icon.getImage());

        setJMenuBar(menubar);
        menubar.add(file);
        menubar.add(edit);
        menubar.add(format);
        menubar.add(view);
        menubar.add(help);

        file.add(newFile);
        file.add(newWindowFile);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(pageSettings);
        file.add(print);
        file.add(exit);

        edit.add(undo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);
        edit.add(searchWithBing);
        edit.add(find);
        edit.add(findNext);
        edit.add(findPrevious);
        edit.add(replace);
        edit.add(goTo);
        edit.add(selectAll);
        edit.add(time_date);

        format.add(wordWrap);
        format.add(font);

        view.add(zoom);
        view.add(statusBar);

        help.add(viewHelp);
        help.add(sendFeedback);
        help.add(aboutNotepad);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        textArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        newFile.addActionListener(this);
        newWindowFile.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        saveAs.addActionListener(this);
        pageSettings.addActionListener(this);
        print.addActionListener(this);
        exit.addActionListener(this);

        undo.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        delete.addActionListener(this);
        searchWithBing.addActionListener(this);
        find.addActionListener(this);
        findNext.addActionListener(this);
        findPrevious.addActionListener(this);
        replace.addActionListener(this);
        goTo.addActionListener(this);
        selectAll.addActionListener(this);
        time_date.addActionListener(this);

        wordWrap.addActionListener(this);
        font.addActionListener(this);

        zoom.addActionListener(this);
        statusBar.addActionListener(this);
        
        viewHelp.addActionListener(this);
        sendFeedback.addActionListener(this);
        aboutNotepad.addActionListener(this);
    }

    public static void main(String[] args) {
        new notepadApp().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("New File")) {}
        else if(e.getActionCommand().equalsIgnoreCase("open"))
    }
}
