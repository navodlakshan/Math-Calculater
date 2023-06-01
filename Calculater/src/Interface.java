import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame{

    private double total1 =0.0;
    private double total2 =0.0;
    private char math_operator;
    private JPanel CalInterface;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button8;
    private JButton Button17;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JTextField TextField;
    private JButton Button7;
    private JButton Button9;
    private JButton Button16;
    private JButton Button10;
    private JButton Button11;
    private JButton Button12;
    private JButton Button13;
    private JButton Button14;
    private JButton Button15;

    private void getoperator (String ButtonText){
        math_operator = ButtonText.charAt(0);
        total1 =total1 + Double.parseDouble(TextField.getText());
        TextField.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MATHS CALCULATOR");
        frame.setSize(new Dimension(600,300));
        frame.setContentPane(new Interface().CalInterface);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Interface() {

            /*setContentPane(CalInterface);
            setTitle("Calculator");
            setSize(300,325);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);
            pack();*/

        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String Button5Text = TextField.getText()+Button5.getText();
//                TextField.setText(Button5Text);

                String Button5Text = TextField.getText()+Button5.getText();
                TextField.setText(Button5Text);
            }
        });

        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button3Text = TextField.getText()+Button3.getText();
                TextField.setText(Button3Text);
            }
        });

        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button1Text = TextField.getText()+Button1.getText();
                TextField.setText(Button1Text);
            }
        });

        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button4Text = TextField.getText()+Button4.getText();
                TextField.setText(Button4Text);
            }
        });

        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button2Text = TextField.getText()+Button2.getText();
                TextField.setText(Button2Text);
            }
        });

        Button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button13Text = TextField.getText()+Button13.getText();
                TextField.setText(Button13Text);
            }
        });

        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button6Text = TextField.getText()+Button6.getText();
                TextField.setText(Button6Text);
            }
        });

        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button9Text = TextField.getText()+Button9.getText();
                TextField.setText(Button9Text);
            }
        });

        Button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button14Text = TextField.getText()+Button14.getText();
                TextField.setText(Button14Text);
            }
        });

        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button7Text = TextField.getText()+Button7.getText();
                TextField.setText(Button7Text);
            }
        });

        Button8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextField.getText().equals("")) {
                    TextField.setText("0.");
                }
                else if (TextField.getText().contains(".")){
                    Button8.setEnabled(false);
                }
                else
                {
                    String Button8Text = TextField.getText() + Button8.getText();
                        TextField.setText(Button8Text);
                }
                Button8.setEnabled(true);
            }
        });

        Button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Buttontext = Button10.getText();
                getoperator(Buttontext);
            }
        });

        Button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(TextField.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(TextField.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(TextField.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(TextField.getText());
                        break;
                }
                TextField.setText(Double.toString(total2));
                total1 =0;
            }
        });

        Button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                TextField.setText("");
            }
        });

        Button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Buttontext = Button11.getText();
                getoperator(Buttontext);
            }
        });

        Button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Buttontext = Button12.getText();
                getoperator(Buttontext);
            }
        });

        Button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Buttontext = Button17.getText();
                getoperator(Buttontext);
            }
        });


    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
