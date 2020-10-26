import GUI.Window;


public class Runner {
    public static void main(String[] args) {
        Window dialog = new Window();
        dialog.pack();
        dialog.setSize(dialog.getWidth() * 2, dialog.getHeight() * 2);
        dialog.setVisible(true);
        System.exit(0);
    }
}
