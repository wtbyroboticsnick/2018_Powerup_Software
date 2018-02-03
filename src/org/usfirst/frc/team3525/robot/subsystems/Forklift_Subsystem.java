package org.usfirst.frc.team3525.robot.subsystems;

import org.usfirst.frc.team3525.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.Subsystem;

//starts all active code throughout the calling of the subsystem 
public class Forklift_Subsystem extends Subsystem {
    
    public void initDefaultCommand() {

    }
    
    public void SwitchScore(double switchheight) {
    	//contruscting all the components for the encoders
    	//these map the encoder and the type of encoder to the talon they are wired to 
    	RobotMap.ForkTalon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute,
    			0, 10);
    	//setting the encoder phase and direction and it's rate of acceleration 
    	RobotMap.ForkTalon.setInverted(false);
    	RobotMap.ForkTalon.setSensorPhase(false);
    	//limits the maximum and minimum output for the motorcontroller
    	RobotMap.ForkTalon.configNominalOutputForward(0, 1);
    	RobotMap.ForkTalon.configPeakOutputForward(1, 1);
    	RobotMap.ForkTalon.configNominalOutputReverse(0, 1);
    	RobotMap.ForkTalon.configPeakOutputReverse(-1, 1);
    	//allowable error within an encoder command in clicks 
    	RobotMap.ForkTalon.configAllowableClosedloopError(1024, 0, 0);
    	//the reset and projected position for a given encoder command 
    	RobotMap.ForkTalon.set(ControlMode.Position, switchheight);
    	RobotMap.ForkTalon.setSelectedSensorPosition(0, 0, 0);
    } 
    public void ScaleScore(double scaleheight) {
    	//contruscting all the components for the encoders
    	//these map the encoder and the type of encoder to the talon they are wired to 
    	RobotMap.ForkTalon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute,
    			0, 10);
    	//setting the sensor phase and direction and it's rate of acceleration 
    	RobotMap.ForkTalon.setInverted(false);
    	RobotMap.ForkTalon.setSensorPhase(false);
    	//limits the maximum and minimum output for the motorcontroller
    	RobotMap.ForkTalon.configNominalOutputForward(0, 1);
    	RobotMap.ForkTalon.configPeakOutputForward(1, 0);
    	//allowable error within an encoder command in clicks 
    	RobotMap.ForkTalon.configAllowableClosedloopError(1024, 0, 0);
    	//the reset and projected position for a given encoder command 
    	RobotMap.ForkTalon.set(ControlMode.Position, scaleheight);
    	RobotMap.ForkTalon.setSelectedSensorPosition(0, 0, 0);
    }
    public void IntakeLevel(double floorheight) {
    	//contruscting all the components for the encoders
    	//these map the encoder and the type of encoder to the talon they are wired to 
    	RobotMap.ForkTalon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute,
    			0, 10);
    	//setting the sensor phase and direction and it's rate of acceleration 
    	RobotMap.ForkTalon.setInverted(true);    	
    	RobotMap.ForkTalon.setSensorPhase(false);
    	//limits the maximum and minimum output for the motorcontroller
    	RobotMap.ForkTalon.configNominalOutputForward(0, 1);
    	RobotMap.ForkTalon.configPeakOutputForward(1, 0);
    	//allowable error within an encoder command in clicks 
    	RobotMap.ForkTalon.configAllowableClosedloopError(1024, 0, 0);
    	//the reset and projected position for a given encoder command 
    	RobotMap.ForkTalon.set(ControlMode.Position, floorheight);
    	RobotMap.ForkTalon.setSelectedSensorPosition(0, 0, 0);
    }
}

