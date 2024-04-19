package utilities;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;

/**
 * The stylesheet of the different view classes.
 */
public class Stylesheet {
    /**
     * Primary UI color.
     */
    public final Color pickledBluewood = new Color(44,62,80);
    /**
     * Secondary UI color.
     */
    public final Color deepSkyBlue = new Color(66,110,153);
    /**
     * Tertiary UI color.
     */
    public final Color celadon = new Color(39,174,96);
    /**
     * Primary flat color.
     */
    public final Color white = new Color(255,255,255);
    /**
     * Secondary flat color.
     */
    public final Color gray = new Color(133,133,133);
    /**
     * Tertiary flat color.
     */
    public final Color lightGray = new Color(237,238,240);
    /**
     * Error color.
     */
    public final Color red = new Color(246,49,93);
    /**
     * Contrast color.
     */
    public final Color black = new Color(0,0,0);

    /**
     * The icon. (sample icon if used)
     */
    public final ImageIcon icon = new ImageIcon("res/icons/icon.png");

    /**
     * Default padding for panels.
     */
    public final EmptyBorder padding = new EmptyBorder(10, 20, 10, 20);

    /**
     * Font for the plate number
     */
    private Font plateFont;

    /**
     * Method to get the plate font. It loads the font if it hasn't been loaded yet.
     */
    private Font getPlateFont() {
        if (plateFont == null) {
            loadPlateFont();
        }
        return plateFont;
    }

    /**
     * Method to load the plate font.
     */
    private void loadPlateFont() {
        try {
            // Load the font file
            File fontFile = new File("res/fonts/FE-FONT.TTF");
            plateFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(Font.BOLD, 24);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            plateFont = new Font("Arial", Font.PLAIN, 24);

        }
    }

    /**
     * Creates a JLabel with the plate font.
     * @param text The text for the JLabel.
     * @param color The color for the JLabel.
     * @return The created JLabel.
     */
    public JLabel createLblPlate(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(getPlateFont());
        label.setForeground(color);
        return label;
    }


    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a heading (h1).
     *
     * @param text  The specified text.
     * @param color The specified foreground color.
     * @return JLabel with the specified text and color in an H1 format.
     */
    public JLabel createLblH1(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 26));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a heading (h2).
     *
     * @param text  The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in an H2 format.
     */
    public JLabel createLblH2(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 22));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a heading (h3).
     *
     * @param text  The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in an H3 format.
     */
    public JLabel createLblH3(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a heading (h4).
     *
     * @param text  The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in an H3 format.
     */
    public JLabel createLblH4(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 12));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a paragraph.
     *
     * @param text  The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in a paragraph format.
     */
    public JLabel createLblP(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is a paragraph.
     *
     * @param text  The specified text.
     * @param color The specified color.
     * @return JLabel with specified text and color in a paragraph format.
     */
    public JLabel createLblP2(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified text and color.
     * The JLabel is label for the calendar days.
     *
     * @param text  The specified text.
     * @param color The specified foreground color.
     * @return JLabel with the specified text and color.
     */
    public JLabel createLblCalendar(String text, Color color) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 36));
        label.setForeground(color);
        return label;
    }

    /**
     * Creates a new JLabel with a specified icon and size.
     *
     * @param icon   The specified icon URL.
     * @param width  The specified width.
     * @param height The specified height.
     * @return The JLabel with the specified icon.
     */
    public JLabel createLblIconOnly(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(scaledImg));
        return label;
    }

    /**
     * Creates a new JButton with a specified text and color.
     * The JButton will only contain text with no background color and no icon.
     *
     * @param text  The specified text.
     * @param color The specified foreground color.
     * @return The JButton with specified text and foreground color.
     */
    public JButton createBtnTxtOnly(String text, Color color) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 15));
        button.setForeground(color);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusable(false);
        return button;
    }

    /**
     * Creates a new JButton with a specified icon and size.
     *
     * @param icon   The specified icon URL.
     * @param width  The desired width of the icon.
     * @param height The desired height of the icon.
     * @return The JButton with a specified icon and size.
     */
    public JButton createBtnIconOnly(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        JButton button = new JButton();
        button.setIcon(new ImageIcon(scaledImg));
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusable(false);
        return button;
    }

    /**
     * Creates a new JButton with a specified text, background color, foreground color, and radius.
     *
     * @param text       The specified text.
     * @param background The specified background.
     * @param foreground The specified foreground.
     * @param radius     The specified radius.
     * @return The specified button.
     */
    public JButton createBtnRounded(String text, Color background, Color foreground, int radius) {
        JButton button = new JButton(text);
        button.setBackground(background);
        button.setForeground(foreground);
        button.setFont(new Font("Arial", Font.PLAIN, 15));
        button.setBorder(new RoundedBorder(radius));
        button.setVerticalTextPosition(SwingConstants.CENTER);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setBorderPainted(true);
        return button;
    }

    /**
     * Creates a new JComboBox with a specified background color, foreground color, and radius.
     *
     * @param background The specified background.
     * @param foreground The specified foreground.
     * @param radius     The specified radius.
     * @return The specified combo box.
     */
    public JComboBox<String> createCmbRounded(Color background, Color foreground, int radius) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        comboBox.setBackground(background);
        comboBox.setForeground(foreground);
        comboBox.setLightWeightPopupEnabled(true);
        comboBox.setBorder(new RoundedBorder(radius));
        return comboBox;
    }

    /**
     * Template for RoundedBorder object.
     */
    public static class RoundedBorder implements Border {
        /**
         * The radius of the rounded border.
         */
        private int radius;

        /**
         * Constructs a rounded border with a specified radius.
         *
         * @param radius The specified radius.
         */
        public RoundedBorder(int radius) {
            this.radius = radius;
        }

        /**
         * Retrieves the current insets of the rounded border.
         *
         * @param c the component for which this border insets value applies
         * @return The current insets of the rounded border.
         */
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 2, this.radius + 2, this.radius + 3, this.radius);
        }

        /**
         * Returns the current state of opacity of the rounded border.
         * Returns true if the border is opaque, false if otherwise.
         *
         * @return The current opacity of the rounded border.
         */
        public boolean isBorderOpaque() {
            return true;
        }

        /**
         * Paints the Border.
         *
         * @param c      the component for which this border is being painted
         * @param g      the paint graphics
         * @param x      the x position of the painted border
         * @param y      the y position of the painted border
         * @param width  the width of the painted border
         * @param height the height of the painted border
         */
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    /**
     * Creates a JTextField with rounded corners with a specified text, background color, foreground color, and columns.
     *
     * @param text       The specified text.
     * @param background The specified background color.
     * @param foreground The specified foreground color.
     * @param columns    The specified columns.
     * @return The new JTextField with rounded borders.
     */
    public JTextField createPlateFieldRounded(String text, Color background, Color foreground, int columns) {
        JTextField textField = new RoundJTextField(columns);
        textField.setText(text);
        textField.setBackground(background);
        textField.setForeground(foreground);
        textField.setFont(getPlateFont());
        return textField;
    }


    /**
     * Creates a JTextField with rounded corners with a specified text, background color, foreground color, and columns.
     *
     * @param text       The specified text.
     * @param background The specified background color.
     * @param foreground The specified foreground color.
     * @param columns    The specified columns.
     * @return The new JTextField with rounded borders.
     */
    public JTextField createTxtRounded(String text, Color background, Color foreground, int columns) {
        JTextField textField = new RoundJTextField(columns);
        textField.setText(text);
        textField.setBackground(background);
        textField.setForeground(foreground);
        textField.setFont(new Font("Arial", Font.PLAIN, 16));
        return textField;
    }

    /**
     * Creates a new JPanel with a specified width, height, foreground and background color.
     * The JPanel to be created will have rounded edges.
     *
     * @param width    The specified width.
     * @param height   The specified height.
     * @param pnlColor The specified foreground color.
     * @param bgColor  The specified background color. This color must be the same with another component's background
     *                 color for the foreground to have its rounded edges.
     * @return The JPanel with rounded edges with specified width, height, foreground and background color.
     */
    public JPanel createPnlRounded(int width, int height, Color pnlColor, Color bgColor) {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30, 30);
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


                //Draws the rounded panel with borders.
                graphics.setColor(pnlColor);
                graphics.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, arcs.width, arcs.height);
                graphics.setColor(bgColor);
            }
        };

        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }

    /**
     * Template for RoundedJTextField object.
     */
    static class RoundJTextField extends JTextField {
        /**
         * The shape of the RoundJTextField.
         */
        private Shape shape;

        /**
         * Constructs a RoundJTextField with a specified size.
         *
         * @param size The specified size.
         */
        public RoundJTextField(int size) {
            super(size);
            setOpaque(false); // As suggested by @AVD in comment.
        }

        /**
         * Paints the background of the RoundJTextField.
         *
         * @param g the <code>Graphics</code> object to protect
         */
        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            super.paintComponent(g);
        }

        /**
         * Paints the borders of the RoundJTextField.
         *
         * @param g the <code>Graphics</code> context in which to paint
         */
        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        }

        /**
         * Checks whether the shape is equal to the given bound coordinates.
         *
         * @param x the <i>x</i> coordinate of the point
         * @param y the <i>y</i> coordinate of the point
         * @return true / false
         */
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            }
            return shape.contains(x, y);
        }
    }

    /**
     * Creates a RoundJPasswordField with a specified background color, foreground color, and columns.
     *
     * @param background The specified background color.
     * @param foreground The specified foreground color.
     * @param columns    The specified columns.
     * @return The new RoundJPasswordField.
     */
    public JPasswordField createPwdRounded(Color background, Color foreground, int columns) {
        JPasswordField passwordField = new RoundJPasswordField(columns);
        passwordField.setBackground(background);
        passwordField.setForeground(foreground);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
        return passwordField;
    }

    /**
     * Template for RoundJPasswordField object.
     */
    static class RoundJPasswordField extends JPasswordField {
        /**
         * The shape of the RoundJPasswordField.
         */
        private Shape shape;

        /**
         * Constructs a RoundJPasswordField with a specified size.
         *
         * @param size The specified size.
         */
        public RoundJPasswordField(int size) {
            super(size);
            setOpaque(false);
        }

        /**
         * Paints the background of the RoundJTextField.
         *
         * @param g the <code>Graphics</code> object to protect
         */
        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            super.paintComponent(g);
        }

        /**
         * Paints the borders of the RoundJTextField.
         *
         * @param g the <code>Graphics</code> context in which to paint
         */
        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
        }

        /**
         * Checks whether the shape is equal to the given bound coordinates.
         *
         * @param x the <i>x</i> coordinate of the point
         * @param y the <i>y</i> coordinate of the point
         * @return The shape.
         */
        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
            }
            return shape.contains(x, y);
        }
    }
}
