import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;

public class Mode{

	private int ledColour;
	private String mode;
	private boolean ledSecondaryOnOff;
	
	//private ArrayList modeList = new ArrayList ();
	/*
	WristbandAlarm wristbandAlarm = new WristbandAlarm();
	WristbandDoor wristbandDoor = new WristbandDoor();
	WristbandStove wristbandStove = new WristbandStove();
	WristbandTV wristbandTV = new WristbandTV();
	WristbandThermostat wristbandThermostat = new WristbandThermostat();
	AppThermo appThermo = new AppThermo();
	*/
	//t = TV, a = Alarm Clock, h = Thermostat, d = Door, s = Stove
	
	 final JLabel label = new JLabel("Current Mode:            ");
	 final JLabel result = new JLabel("Current Action Results: ");
	
	public static void main(String args[])
	{
		new Mode();
		
	}
	
	public Mode()
	{
		
		JFrame frame = new JFrame("Wristband");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		final JButton upButton = new JButton("UP");
		final JButton downButton = new JButton("DOWN");
		final JButton plusButton = new JButton("PLUS");
		final JButton minusButton = new JButton("MINUS");
		final JButton modeButton = new JButton("MODE");
		
		 //result.setPreferredSize(new Dimension(175, 100));
		 result.setVisible(true);
		
		 //label.setPreferredSize(new Dimension(175, 100));
		 label.setVisible(true);
		
		
		 
		 JPanel panel = new JPanel();
		 
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
		
		
		frame.add(panel);
		
		panel.add(upButton);
		panel.add(downButton);
		panel.add(plusButton);
		panel.add(minusButton);
		panel.add(modeButton);
		panel.add(label);	
		panel.add(result);
	
		
		panel.setLayout(new FlowLayout());	
		
		frame.setTitle("Wristband");			//the top of the pane in the exe will say recordings

		
	    frame.pack();
		frame.setSize(200, 220);	
		frame.setVisible(true);	
		
	
		//modeList.add('t'); modeList.add('a'); modeList.add('h'); modeList.add('d'); modeList.add('s');
		
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
	
	public void setLedSecondaryOnOff(boolean onOffLed)
	{
		ledSecondaryOnOff = onOffLed;
		return;
	}
	
	public boolean getLedSecondaryOnOff()
	{
		return ledSecondaryOnOff;
	}
	
	public void setMode(String modeName)
	{
		mode = modeName;
		return;
	}
	public String getMode()
	{
		return mode;
	}
	
	public void changeMode(String modeName)
	{
		//t = TV, a = Alarm Clock, h = Thermostat, d = Door, s = Stove
		
		if (modeName == "thermo")
		{
			setMode("alarmClock");
		}
		else if (modeName == "alarmClock")
		{
			setMode("TV");
		}
		else if (modeName == "TV")
		{
			setMode("Door");
		}
		else if (modeName == "Door")
		{
			setMode("stove");
		}
		else if (modeName == "stove")
		{
			setMode("thermo");
		}
		else
			setMode("thermo");
		
		 label.setText("Current Mode: " + getMode());
		return;
	}
	
	public void ledChange(int colour)
	{
		return;
	}
	
	public void buttonUpPress()
	{
		String currentMode = getMode();
		 label.setText("Current Mode: " + currentMode);
		
		if (currentMode == "Door")
		{
			result.setText("Door Unlocked");
			//wristbandDoor.unlockDoor();
		}
		else if (currentMode == "alarmClock")
		{
			boolean on = true;
			result.setText("Alarm Set On");
			//wristbandAlarm.setAlarmOnOff(on);
		}
		else if (currentMode == "stove")
		{
			result.setText("Stove Turned Off");
			//wristbandStove.stoveOff();
		}
		else if (currentMode == "TV")
		{
			result.setText("TV Channel Up");
			//wristbandTV.channelUp();
		}
		else if (currentMode == "thermo")
		{
			result.setText("New Thermostat Temperature Calculated");
			//appThermo.calculateNewTemp();
		}
		
		return;
	}
	
	public void buttonDownPress()
	{
		String currentMode = getMode();
		
		if (currentMode == "Door")
		{
			result.setText("Door Locked");
			//wristbandDoor.lockDoor();
		}
		else if (currentMode == "alarmClock")
		{
		}
		else if (currentMode == "stove")
		{
			result.setText("Stove Preheated");
			//wristbandStove.preheat();
		}
		else if (currentMode == "TV")
		{
			result.setText("TV Channel Down");
			//wristbandTV.channelDown();
		}
		else if (currentMode == "thermo")
		{
		}
		
		return;
	}
	
	public void buttonPlusPress()
	{
		String currentMode = getMode();
		
		if (currentMode == "Door")
		{
		}
		else if (currentMode == "alarmClock")
		{
		}
		else if (currentMode == "stove")
		{
		}
		else if (currentMode == "TV")
		{
			result.setText("TV Volume Up");
			//wristbandTV.volumeUp();
		}
		else if (currentMode == "thermo")
		{
		}
		
		return;
	}
	
	
	public void buttonMinusPress()
	{
		String currentMode = getMode();
		
		if (currentMode == "Door")
		{
		}
		else if (currentMode == "alarmClock")
		{
		}
		else if (currentMode == "stove")
		{
		}
		else if (currentMode == "TV")
		{
			result.setText("TV Volume Down");
			//wristbandTV.volumeDown();
		}
		else if (currentMode == "thermo")
		{
		}
		
		return;
	}
	
	public void buttonModePress()
	{
		String currentMode = getMode();
		changeMode(currentMode);
		return;
	}
	
}
