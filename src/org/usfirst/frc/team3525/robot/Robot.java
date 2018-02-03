/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3525.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team3525.robot.commands.Command_DriveTrain;
//import org.usfirst.frc.team3525.robot.commands.Driving_forward_auto;
import org.usfirst.frc.team3525.robot.commands.Sandwichscope_Command;
//import org.usfirst.frc.team3525.robot.commands.ExampleCommand;
import org.usfirst.frc.team3525.robot.subsystems.DriveTrain_Subsystem;
//import org.usfirst.frc.team3525.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team3525.robot.subsystems.Forklift_Subsystem;
import org.usfirst.frc.team3525.robot.subsystems.Intake_Subsystem;

//starts all active called by the feild management system code throughout the match period of 
//the robot
public class Robot extends TimedRobot {
	//calls and names the subsystems used in the command
	public static final Forklift_Subsystem subsystemForklift 
		= new Forklift_Subsystem();
	public static final Intake_Subsystem subsystemIntake 
		= new Intake_Subsystem();
	public static final DriveTrain_Subsystem SubsystemDrive
		= new DriveTrain_Subsystem();
	//calls the driver and operator controls 
	public static OI m_oi;
	
	//calls the selected autonomous to be selected on the smart dashboard 
	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	//constructs components needed for the robot
	public void robotInit() {
		m_oi = new OI();
		//These are the commands that will show up on the smartdashboard
		m_chooser.addDefault("turn right 90", new Sandwichscope_Command(90.0));
		m_chooser.addObject("turning -90", new Sandwichscope_Command(-90.0));
		m_chooser.addObject("I'm turning 180", new Sandwichscope_Command(180));
		m_chooser.addObject("going to turn -215", new Sandwichscope_Command(-215));
		m_chooser.addObject("drive for five feet", new Command_DriveTrain(8692));
		m_chooser.addObject("drive for one rotation", new Command_DriveTrain(4096));
		m_chooser.addObject("drive for ten rotations", new Command_DriveTrain(40960));
		m_chooser.addObject("drive for ten feet", new Command_DriveTrain(17384));
		//The line of code to create the button to select the command 
		SmartDashboard.putData("Auto mode", m_chooser);
		System.out.println("I am begining to calibrate");
		//This is the gyroscope used for turning 
		RobotMap.gyro.calibrate();
		System.out.println("calibrate complete");
		
	}

	
	@Override
	public void disabledInit() {
		
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	
	@Override
	public void autonomousInit() {
		m_autonomousCommand = m_chooser.getSelected();
		

		if (m_autonomousCommand != null) {
			m_autonomousCommand.start();
		}
	}
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
