/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3525.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;

//import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class RobotMap {
	
	//declaring & constructing the motor controllers and motor groups for the DriveTrain
	public static final WPI_TalonSRX LeftDriveTalon = new WPI_TalonSRX(13);
	public static final WPI_VictorSPX FrontLeftDriveVictor = new WPI_VictorSPX(1);
	public static final WPI_VictorSPX BackLeftDriveVictor = new WPI_VictorSPX(3);
	
	public static final WPI_TalonSRX RightDriveTalon = new WPI_TalonSRX(14);
	public static final WPI_VictorSPX FrontRightDriveVictor = new WPI_VictorSPX(2);
	public static final WPI_VictorSPX BackRightDriveVictor = new WPI_VictorSPX(4);
	
	
	//RobotMap.FrontRightDriveVictor.follow(RobotMap.LeftDriveTalon);
	//RobotMap.BackRightDriveVictor.follow(RobotMap.LeftDriveTalon);
	//RobotMap.FrontLeftDriveVictor.follow(RobotMap.LeftDriveTalon);
	//RobotMap.BackLeftDriveVictor.follow(RobotMap.LeftDriveTalon);
	
	//SpeedControllerGroup Driveleft = new SpeedControllerGroup(LeftDriveTalon, FrontLeftDriveVictor, BackLeftDriveVictor);
	
	//SpeedControllerGroup DriveRight = new SpeedControllerGroup(RightDriveTalon, FrontRightDriveVictor, BackRightDriveVictor);
	
	// declaring & constructing the motor controllers for the climber 
	public static final WPI_TalonSRX ClimbTalon = new WPI_TalonSRX(15);
	public static final WPI_VictorSPX ClimbToptLeftVictor = new WPI_VictorSPX(5);
	public static final WPI_VictorSPX ClimbBottomtLeftVictor = new WPI_VictorSPX(6);
	public static final WPI_VictorSPX ClimbBottomRightVictor = new WPI_VictorSPX(7);
	
	//RobotMap.ClimbToptLeftVictor.follow(RobotMap.ClimbTalon);
	//RobotMap.ClimbBottomtLeftVictor.follow(RobotMap.ClimbTalon);
	//RobotMap.ClimbBottomRightVictor.follow(RobotMap.ClimbTalon);
	
	// declaring & constructing the motor controller for the Forklift
	public static final TalonSRX ForkTalon = new TalonSRX(16);
	//VictorSPX VictorTalon = new Victor(10);

	public static final WPI_VictorSPX IntakeLeft = new WPI_VictorSPX(8);
	public static final WPI_VictorSPX IntakeRight = new WPI_VictorSPX(9);
	
	public static final ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	
	//RobotMap.IntakeLeft.follow(RobotMap.IntakeRight);
	
	public static void initfollowers () {
		 FrontLeftDriveVictor.follow(LeftDriveTalon);
		 BackLeftDriveVictor.follow(LeftDriveTalon);
		 FrontRightDriveVictor.follow(RightDriveTalon);
		 BackRightDriveVictor.follow(RightDriveTalon);
		
	}
}
