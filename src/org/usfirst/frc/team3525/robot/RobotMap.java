/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3525.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	
	//Lines 40-60 declare the motor controllers, and their custom names//
	
	//This section declares the motor controllers for the drivetrain//
	public static WPI_TalonSRX LeftDriveTalon13=new WPI_TalonSRX(13);
	public static WPI_VictorSPX FrontLeftDriveVictor1=new WPI_VictorSPX(1);
	public static WPI_VictorSPX BackLeftDriveVictor3=new WPI_VictorSPX(3);
	
	public static WPI_TalonSRX RightDriveTalon14=new WPI_TalonSRX(14);
	public static WPI_VictorSPX FrontRightDriveVictor2=new WPI_VictorSPX(2);
	public static WPI_VictorSPX BackRightDriveVictor4=new WPI_VictorSPX(4);
	
	//This section declares the motor controllers for the climber//
	public static WPI_TalonSRX ClimbTalon15=new WPI_TalonSRX(15);
	public static WPI_VictorSPX ClimbTopLeftVictor5=new WPI_VictorSPX(5);
	public static WPI_VictorSPX ClimbBottomLeftVictor6=new WPI_VictorSPX(6);
	public static WPI_VictorSPX ClimbBottomRightVictor7=new WPI_VictorSPX(7);
	
	//This declares the motor controller for the forklift//
	public static WPI_TalonSRX ForkTalon16=new WPI_TalonSRX(16);

	//This section declares the motor controllers for the Intake//
	public static WPI_VictorSPX IntakeLeft8=new WPI_VictorSPX(8);
	public static WPI_VictorSPX IntakeRight9=new WPI_VictorSPX(9);
	
	//This section declares the Talons as the master controllers//
	public static void setFollowers(){
		FrontLeftDriveVictor1.follow(LeftDriveTalon13);
		BackLeftDriveVictor3.follow(LeftDriveTalon13);
		FrontRightDriveVictor2.follow(RightDriveTalon14);
		BackRightDriveVictor4.follow(RightDriveTalon14);
		
		ClimbTopLeftVictor5.follow(ClimbTalon15);
		ClimbBottomLeftVictor6.follow(ClimbTalon15);
		ClimbBottomRightVictor7.follow(ClimbTalon15);
	}
	
	public static void smartupdate(){
		
		//This section shows the power drawn from the motors//
		SmartDashboard.putNumber("Left Drivetrain Talon Current",LeftDriveTalon13.getOutputCurrent());
		SmartDashboard.putNumber("Left DriveTrain Victor Current", FrontLeftDriveVictor1.getOutputCurrent());
		SmartDashboard.putNumber("Left DriveTrain Vitcor Current", BackLeftDriveVictor3.getOutputCurrent());
		SmartDashboard.putNumber("Right Drivetrain Talon Current", RightDriveTalon14.getOutputCurrent());
		SmartDashboard.putNumber("Right DriveTrain Victor Current", FrontRightDriveVictor2.getOutputCurrent());
		SmartDashboard.putNumber("Right DriveTrain Victor Current", BackRightDriveVictor4.getOutputCurrent());
		SmartDashboard.putNumber("Climber Talon Current", ClimbTalon15.getOutputCurrent());
		SmartDashboard.putNumber("Climber Victor Current", ClimbTopLeftVictor5.getOutputCurrent());
		SmartDashboard.putNumber("Climber Victor Current", ClimbBottomLeftVictor6.getOutputCurrent());
		SmartDashboard.putNumber("Climber Victor Current", ClimbBottomRightVictor7.getOutputCurrent());
		SmartDashboard.putNumber("Fork Talon", ForkTalon16.getOutputCurrent());
		SmartDashboard.putNumber("Intake Victor Current", IntakeLeft8.getOutputCurrent());
		SmartDashboard.putNumber("Intake Victor Current", IntakeRight9.getOutputCurrent());
		
		//This section shows the speed the motors are going//
		SmartDashboard.putNumber("Left DriveTrain Talon Current", LeftDriveTalon13.getMotorOutputPercent());
		SmartDashboard.putNumber("Left DriveTrain Victor Current 1", FrontLeftDriveVictor1.getMotorOutputPercent());
		SmartDashboard.putNumber("Left DriveTrain Vitcor Current 2", BackLeftDriveVictor3.getMotorOutputPercent());
		SmartDashboard.putNumber("Right Drivetrain Talon Current", RightDriveTalon14.getMotorOutputPercent());
		SmartDashboard.putNumber("Right DriveTrain Victor Current 1", FrontRightDriveVictor2.getMotorOutputPercent());
		SmartDashboard.putNumber("Right DriveTrain Victor Current 2", BackRightDriveVictor4.getMotorOutputPercent());
		SmartDashboard.putNumber("Climber Talon Current", ClimbTalon15.getMotorOutputPercent());
		SmartDashboard.putNumber("Climber Victor Current 1", ClimbTopLeftVictor5.getMotorOutputPercent());
		SmartDashboard.putNumber("Climber Victor Current 2", ClimbBottomLeftVictor6.getMotorOutputPercent());
		SmartDashboard.putNumber("Climber Victor Current 3", ClimbBottomRightVictor7.getMotorOutputPercent());
		SmartDashboard.putNumber("Fork Talon", ForkTalon16.getMotorOutputPercent());
		SmartDashboard.putNumber("Intake Victor Current 1", IntakeLeft8.getMotorOutputPercent());
		SmartDashboard.putNumber("Intake Victor Current 2", IntakeRight9.getMotorOutputPercent());
	}
	/*public static VictorSP victorLeftTop = new VictorSP (5);
	public static Spark sparkLeftFront = new Spark(4);
	public static VictorSP victorRearLeft= new VictorSP (3);
	public static VictorSP victorTopRight = new VictorSP (2);
	public static VictorSP victorFrontRight = new VictorSP(1);
	public static VictorSP victorRearRight = new VictorSP (0);
	public static WPI_TalonSRX ClimberTalonSRX = new WPI_TalonSRX (1);

	public static SpeedControllerGroup LeftDriveTalon13=new SpeedControllerGroup(victorLeftTop,sparkLeftFront,victorRearLeft);	
	public static SpeedControllerGroup RightDriveTalon14=new SpeedControllerGroup(victorFrontRight,victorTopRight,victorRearRight);*/
	
}

		
		
		
	
	
