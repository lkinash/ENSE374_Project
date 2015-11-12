import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class Mode extends JFrame{

	private int ledColour;
	private char mode;
	private boolean ledSecondaryOnOff;
	
	public Mode()
	{
		final JButton upButton = new JButton("UP");
		final JButton downButton = new JButton("DOWN");
		final JButton plusButton = new JButton("PLUS");
		final JButton minusButton = new JButton("MINUS");
		final JButton modeButton = new JButton("MODE");
		
		upButton.setEnabled(true);
		downButton.setEnabled(true);
		plusButton.setEnabled(true);
		minusButton.setEnabled(true);
		modeButton.setEnabled(true);
		
		upButton.addActionListener(new ActionListener(){		
			
			public void actionPerformed(ActionEvent e){
			
				buttonUpPress();
			}
		} );
		
		downButton.addActionListener(new ActionListener(){		
			
			public void actionPerformed(ActionEvent e){
			
				buttonDownPress();
				}
			} );

		plusButton.addActionListener(new ActionListener(){		
	
			public void actionPerformed(ActionEvent e){
	
				buttonPlusPress();
				}
			} );
		
		minusButton.addActionListener(new ActionListener(){		
	
			public void actionPerformed(ActionEvent e){
	
				buttonMinusPress();
				}
			} );
		
		modeButton.addActionListener(new ActionListener(){		
			
			public void actionPerformed(ActionEvent e){
	
				buttonModePress();
				}
			} );
		
		getContentPane().add(upButton);
		getContentPane().add(downButton);
		getContentPane().add(plusButton);
		getContentPane().add(minusButton);
		getContentPane().add(modeButton);
	}
	
	public void setLedColour(int colour)
	{
		ledColour = colour;
		return;
	}
	
	public int getLedColour()
	{
		return ledColour;
	}
	
	public void set ledSecondaryOnOff(boolean onOffLed)
	{
		ledSecondaryOnOff = onOffLed;
		return;
	}
	
	public boolean getLedSecondaryOnOff()
	{
		return ledSecondaryOnOff;
	}
	
	public void setMode(char modeName)
	{
		mode = modeName;
		return;
	}
	public char getMode()
	{
		return mode;
	}
	
	public void changeMode(char modeName)
	{
		return;
	}
	
	public void ledChange(int colour)
	{
		return;
	}
	
	public void buttonUpPress()
	{
		char currentMode = getMode();
		if (currentMode == Door)
		{
			wristbandDoor.unlockDoor();
		}
		else if (currentMode == alarmClock)
		{
			boolean on = true;
			wristbandAlarm.setAlarmOnOff(on);
		}
		else if (currentMode == stove)
		{
			wristbandStove.stoveOff();
		}
		else if (currentMode == TV)
		{
			wristbandTV.channelUp();
		}
		else if (currentMode == thermo)
		{
			appThermo.calculateNewTemp();
		}
		return;
	}
	
	public void buttonDownPress()
	{
		return;
	}
	
	public void buttonPlusPress()
	{
		return;
	}
	
	public void buttonMinusPress()
	{
		return;
	}
	
	public void buttonModePress()
	{
		return;
	}
	
}
