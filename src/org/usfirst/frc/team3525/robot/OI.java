/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3525.robot;

import org.usfirst.frc.team3525.robot.commands.ArcadeDrive_Command;
import org.usfirst.frc.team3525.robot.commands.Climber_Command;
import org.usfirst.frc.team3525.robot.commands.ForkliftDown_Command;
import org.usfirst.frc.team3525.robot.commands.ForkliftUp_Command;
import org.usfirst.frc.team3525.robot.commands.GTA_Command;
import org.usfirst.frc.team3525.robot.commands.GTA_CurvatureDrive_Command;
import org.usfirst.frc.team3525.robot.commands.HaloDrive_Command;
import org.usfirst.frc.team3525.robot.commands.Intake_Command;
import org.usfirst.frc.team3525.robot.commands.Nintendo_Command;
import org.usfirst.frc.team3525.robot.commands.Outtake_Command;
import org.usfirst.frc.team3525.robot.commands.TankDrive_Command;
import org.usfirst.frc.team3525.robot.commands.TimesDrive_Command;
import org.usfirst.frc.team3525.robot.commands.UnClimber_Command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	//This section declares the xbox controller, and the button, trigger, and joysticks on it//
	public XboxController Controller=new XboxController(0);
	Button aButton=new JoystickButton(Controller,1);
	Button bButton=new JoystickButton(Controller,2);
	Button xButton=new JoystickButton(Controller,3);
	Button yButton=new JoystickButton(Controller,4);
	Button BumperLeft=new JoystickButton(Controller,5);
	Button BumperRight=new JoystickButton(Controller,6);
	Button BackButton=new JoystickButton(Controller,7);
	Button StartButton=new JoystickButton(Controller,8);
	
	
	//This section declares the operator station, and it's buttons, and joysticks//
	public Joystick Stick= new Joystick(0);
	Button ForkliftUpButton=new JoystickButton(Stick,3);
	Button ForkliftDownButton=new JoystickButton(Stick,4);
	Button CurvatureWithQuickTurn=new JoystickButton(Stick,5);
	Button CurvatureWithoutQuickturn=new JoystickButton(Stick,6);

	public Joystick wheel = new Joystick(1);
	
	public Joystick nintendostick=new Joystick(2);
	public Button abutton = new JoystickButton(nintendostick,2);
	public Button bbutton = new JoystickButton(nintendostick,1);
	public Button Startbutton = new JoystickButton(nintendostick,10);
	public Button Backbutton = new JoystickButton(nintendostick,9);
	
	
	public OI(){
		//This section declares the commands each button, trigger, or joystick follows//
		aButton.toggleWhenPressed(new TankDrive_Command());
		bButton.toggleWhenPressed(new HaloDrive_Command());
		xButton.toggleWhenPressed(new GTA_Command());
		yButton.toggleWhenPressed(new ArcadeDrive_Command());
		BumperLeft.whileHeld(new Intake_Command());
		BumperRight.whileHeld(new Outtake_Command());
		BackButton.whenPressed(new TimesDrive_Command(5));
		StartButton.whenPressed(new TimesDrive_Command(8));
		
		Startbutton.whenPressed(new Nintendo_Command());
		Backbutton.whenPressed(new ArcadeDrive_Command());
		
		ForkliftDownButton.whenPressed(new ForkliftDown_Command());
		ForkliftUpButton.whenPressed(new ForkliftUp_Command());
		CurvatureWithQuickTurn.toggleWhenPressed(new GTA_CurvatureDrive_Command(true));
		CurvatureWithoutQuickturn.toggleWhenPressed(new GTA_CurvatureDrive_Command(false));
		
				 
		
		
		
		
		
		
		
		
		
		
			
	}
}
 
	
