package algorithm辅助;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class jiejian extends  JPanel
{
  private static final long serialVersionUID = -5214441555967215113L;

  protected void makebutton(String name, GridBagLayout gridbag,
                            GridBagConstraints c)
  {
    Button button = new Button(name);
    gridbag.setConstraints(button, c);
    add(button);
  }

  public void init()
  {
    GridBagLayout gridbag = new GridBagLayout();
    GridBagConstraints c = new GridBagConstraints();

    setFont(new Font("SansSerif", Font.PLAIN, 14));
    setLayout(gridbag);

    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    makebutton("Button1", gridbag, c);
    makebutton("Button2", gridbag, c);
    makebutton("Button3", gridbag, c);

    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    makebutton("Button4", gridbag, c);

    c.weightx = 0.0; //reset to the default
    makebutton("Button5", gridbag, c); //another row

    c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last in row
    makebutton("Button6", gridbag, c);

    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    makebutton("Button7", gridbag, c);

    c.gridwidth = 1; //reset to the default
    c.gridheight = 2;
    c.weighty = 1.0;
    makebutton("Button8", gridbag, c);

    c.weighty = 0.0; //reset to the default
    c.gridwidth = GridBagConstraints.REMAINDER; //end row
    c.gridheight = 1; //reset to the default
    makebutton("Button9", gridbag, c);
    makebutton("Button10", gridbag, c);

    setSize(300, 100);
  }

  public static void main(String args[])
  {
    JFrame f = new JFrame("GridBag Layout Example");
    f.setLocation(400, 200);
//    GridBagEx2 ex1 = new GridBagEx2();
//
//    ex1.init();
//
//    f.add("Center", ex1);
    f.pack();
    f.setSize(f.getPreferredSize());
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter()
    {

      @Override
      public void windowClosing(WindowEvent e)
      {
        System.exit(0);
      }

    });
  }

}