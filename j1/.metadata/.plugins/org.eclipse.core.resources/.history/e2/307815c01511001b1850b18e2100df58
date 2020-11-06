package br.ol.dq1.infra;

/**
 * Dialog class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Dialog {
    
    public static void open(Input i, Renderer r, Audio a, Miscellaneous m) {
        for (int x = 0; x < 14; x++) {
            r.fillBox(2, ' ', 15 - x, 20, 16 + x, 21);
            r.drawBoxBorder(2, 15 - x, 20, 16 + x, 21);
            m.sleep(20);
        }
        for (int y = 0; y < 5; y++) {
            r.fillBox(2, ' ', 2 + 1, 20 - y + 1, 29 - 1, 21 + y - 1);
            r.drawBoxBorder(2, 2, 20 - y, 29, 21 + y);
            m.sleep(40);
        }
    }
    
    public static void printSomethingTest(Input i, Renderer r, Audio a, Miscellaneous m) {

        String message = "HELLO THIS IS A MSG ..."; 
        for (int c = 0; c < message.length(); c++) {
            r.print(2, c + 4, 18, message.charAt(c));
            r.print(2, c + 4, 20, message.charAt(c));
            r.print(2, c + 4, 22, message.charAt(c));
            m.sleep(100);
        }
        
        for (int w = 0; w < 2; w++) {
            r.copy(2, 4, 17, 2, 4, 18, 29, 23);
            m.sleep(200);
        }

        message = "THIS IS NEW LINE ...";

        for (int c = 0; c < message.length(); c++) {
            r.print(2, c + 4, 22, message.charAt(c));
            m.sleep(100);
        }

        for (int w = 0; w < 2; w++) {
            r.copy(2, 4, 17, 2, 4, 18, 29, 23);
            m.sleep(200);
        }

        message = "THIS IS ANOTHER LINE ...";

        for (int c = 0; c < message.length(); c++) {
            r.print(2, c + 4, 22, message.charAt(c));
            m.sleep(100);
        }
        
    }
    
    public static void close(Input i, Renderer r, Audio a, Miscellaneous m) {
        for (int y = 4; y >= 0; y--) {
            r.drawBoxBorder(2, 2, 20 - y, 29, 21 + y);
            r.drawBox(2, (char) -1, 1, 20 - y - 1, 30, 21 + y + 1);
            m.sleep(40);
        }
        for (int x2 = 13; x2 >= -1; x2--) {
            r.drawBoxBorder(2, 15 - x2, 20, 16 + x2, 21);
            r.drawBox(2, (char) -1, 15 - x2 - 1, 20 - 1, 16 + x2 + 1, 21 + 1);
            m.sleep(20);
        }   
    }
    
}
