import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame{
    private JLabel lblMensagem;
    private JPanel painel;

    public HelloWorld(){
        this.lblMensagem = lblMensagem;
        this.painel = painel;
        setContentPane(painel);
        pack();
    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
