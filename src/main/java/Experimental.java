import javax.swing.*;

public class Experimental extends JFrame{
    private JPanel painel2;
    private JLabel lblMensagem;

    public Experimental(){
        this.lblMensagem = lblMensagem;
        this.painel2 = painel2;
        setContentPane(painel2);
        pack();
    }

    public static void main(String[] args) {
        new Experimental().setVisible(true);
    }
}

