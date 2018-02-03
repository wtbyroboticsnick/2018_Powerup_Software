 package org.usfirst.frc.team3525.robot.subsystems;

import org.usfirst.frc.team3525.robot.Robot;
import org.usfirst.frc.team3525.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.BaseMotorController;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

//starts all active code throughout the calling of the subsystem 
public class DriveTrain_Subsystem extends Subsystem {
	//method used to control drivetrain using master talons 
	public DifferentialDrive drivetrain = new DifferentialDrive(RobotMap.LeftDriveTalon, 
			RobotMap.RightDriveTalon);
	
	public DriveTrain_Subsystem() {
		//from the robotmap, it drags the master 
		RobotMap.initfollowers();
	}
    public void initDefaultCommand() {
	
    }
    public void Forward(double foredrive) {
    	//contruscting all the components for the encoders
    	//these map the encoder and the type of encoder to the talon they are wired to 
    	RobotMap.LeftDriveTalon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,
    			0, 10);
    	RobotMap.RightDriveTalon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,
    			0, 10);
    	//setting the sensor phase and direction and it's rate of acceleration 
    	RobotMap.LeftDriveTalon.setSensorPhase(false);
    	RobotMap.LeftDriveTalon.setInverted(true);
    	RobotMap.RightDriveTalon.setSensorPhase(false);
    	RobotMap.RightDriveTalon.setInverted(false);
    	RobotMap.RightDriveTalon.configOpenloopRamp(1.25, 1);
    	RobotMap.LeftDriveTalon.configOpenloopRamp(1.25, 1);
    	//limits the maximum and minimum output for the motorcontroller
    	RobotMap.RightDriveTalon.configNominalOutputForward(0, 1);
    	RobotMap.LeftDriveTalon.configNominalOutputForward(0, 1);
    	RobotMap.RightDriveTalon.configNominalOutputReverse(0, 1);
    	RobotMap.LeftDriveTalon.configNominalOutputReverse(0, 1);
    	RobotMap.RightDriveTalon.configPeakOutputForward(1, 1);
    	RobotMap.LeftDriveTalon.configPeakOutputForward(1, 1);
    	RobotMap.RightDriveTalon.configPeakOutputReverse(-1, 1);
    	RobotMap.LeftDriveTalon.configPeakOutputReverse(-1, 1);
    	//allowable error within an encoder command in clicks 
    	RobotMap.LeftDriveTalon.configAllowableClosedloopError(1024, 0, 0);
    	RobotMap.RightDriveTalon.configAllowableClosedloopError(1024, 0, 0);
    	//the reset and projected position for a given encoder command 
    	RobotMap.LeftDriveTalon.setSelectedSensorPosition(0, 0, 0);
    	RobotMap.RightDriveTalon.setSelectedSensorPosition(0, 0, 0);
    	RobotMap.LeftDriveTalon.set(ControlMode.Position , foredrive);
    	RobotMap.RightDriveTalon.set(ControlMode.Position, foredrive);
    }
    public void Backward(double backdrive) {
    	//contruscting all the components for the encoders
    	//these map the encoder and the type of encoder to the talon they are wired to
    	RobotMap.LeftDriveTalon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,
    			0, 10);
    	RobotMap.RightDriveTalon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,
    			0, 10);
    	//setting the encoder phase and direction and it's rate of acceleration 
    	RobotMap.LeftDriveTalon.setSensorPhase(false);
    	RobotMap.LeftDriveTalon.setInverted(true);
    	RobotMap.RightDriveTalon.setSensorPhase(false);
    	RobotMap.RightDriveTalon.setInverted(false);
    	RobotMap.RightDriveTalon.configOpenloopRamp(1.25, 10);
    	RobotMap.LeftDriveTalon.configOpenloopRamp(1.25, 10);
    	//limits the maximum and minimum output for the motorcontroller
    	RobotMap.RightDriveTalon.configNominalOutputForward(0, 10);
    	RobotMap.LeftDriveTalon.configNominalOutputForward(0, 10);
    	RobotMap.RightDriveTalon.configNominalOutputReverse(0, 10);
    	RobotMap.LeftDriveTalon.configNominalOutputReverse(0, 10);
    	RobotMap.RightDriveTalon.configPeakOutputForward(1, 10);
    	RobotMap.LeftDriveTalon.configPeakOutputForward(1, 10);
    	RobotMap.RightDriveTalon.configPeakOutputReverse(-1, 10);
    	RobotMap.LeftDriveTalon.configPeakOutputReverse(-1, 10);
    	//limits the maximum and minimum output for the motorcontroller
    	RobotMap.LeftDriveTalon.configAllowableClosedloopError(1024, 0, 0);
    	RobotMap.RightDriveTalon.configAllowableClosedloopError(1024, 0, 0);
    	//the reset and projected position for a given encoder command 
    	RobotMap.LeftDriveTalon.setSelectedSensorPosition(0, 0, 0);
    	RobotMap.RightDriveTalon.setSelectedSensorPosition(0, 0, 0);
    	RobotMap.LeftDriveTalon.set(ControlMode.Position , backdrive);
    	RobotMap.RightDriveTalon.set(ControlMode.Position, backdrive);
    }
    //this is the command branch for turning using the gyro 
    public void Turn_(double angle) {
    	if (angle <= 0 ) {
    		drivetrain.arcadeDrive(0, -.4);
    	}
    	else if (angle >= 0 ) {
    		drivetrain.arcadeDrive(0, .4);
    	}
    	else {
    		drivetrain.arcadeDrive(0, 0);
    		RobotMap.gyro.reset();
    	}
    }
    
    
}
