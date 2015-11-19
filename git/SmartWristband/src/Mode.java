import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class Mode extends JFrame{

	private int ledColour;
	private char mode;
	private boolean ledSecondaryOnOff;
	
	private ArrayList modeList = new ArrayList ();
	modeList.add('t'); modeList.add('a'); modeList.add('h'); modeList.add('d'); modeList.add('s');
	//t = TV, a = Alarm Clock, h = Thermostat, d = Door, s = Stove
	
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
		char currentMode = getMode();
		if (currentMode == Door)
		{
			wristbandDoor.lockDoor();
		}
		else if (currentMode == alarmClock)
		{
		}
		else if (currentMode == stove)
		{
			wristbandStove.preHeat();
		}
		else if (currentMode == TV)
		{
			wristbandTV.channelDown();
		}
		else if (currentMode == thermo)
		{
		}
		return;
	}
	
	public void buttonPlusPress()
	{
		char currentMode = getMode();
		if (currentMode == Door)
		{
		}
		else if (currentMode == alarmClock)
		{
		}
		else if (currentMode == stove)
		{
		}
		else if (currentMode == TV)
		{
			wristbandTV.volumeUp();
		}
		else if (currentMode == thermo)
		{
		}
		return;
	}
	
	public void buttonMinusPress()
	{
		char currentMode = getMode();
		if (currentMode == Door)
		{
		}
		else if (currentMode == alarmClock)
		{
		}
		else if (currentMode == stove)
		{
		}if (currentMode == Door)
		{
		}
		else if (currentMode == alarmClock)
		{
		}
		else if (currentMode == stove)
		{
		}
		else if (currentMode == TV)
		{
			wristbandTV.volumeDown();
		}
		else if (currentMode == thermo)
		{
		}
		else if (currentMode == TV)
		{
			wristbandTV.volumeDown();
		}
		else if (currentMode == thermo)
		{
		}
		return;
	}
	
	public void buttonModePress()
	{
		char currentMode = getMode();
		if (currentMode == 't')
		{
			currentMode = modeList.get(1);
			setMode(currentMode);
		}
		else if (currentMode == 'a')
		{
			currentMode = modeList.get(2);
			setMode(currentMode);
		}
		else if (currentMode == 'h')
		{
			currentMode = modeList.get(3);
			setMode(currentMode);
		}
		else if (currentMode == 'd')
		{
			currentMode = modeList.get(4);
			setMode(currentMode);
		}
		else if (currentMode == 's')
		{
			currentMode = modeList.get(0);
			setMode(currentMode);
		}
		return;
	}
	
}
