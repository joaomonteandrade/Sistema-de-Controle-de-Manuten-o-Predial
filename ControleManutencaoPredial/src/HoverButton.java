import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HoverButton extends JButton {
    private Color normalColor;
    private Color hoverColor;

    public HoverButton(String text, Color normalColor, Color hoverColor) {
        super(text);
        this.normalColor = normalColor;
        this.hoverColor = hoverColor;

        setFocusPainted(false);
        setOpaque(true);
        setBorderPainted(false);
        setBackground(normalColor);
        setForeground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(normalColor);
            }
        });
    }
}