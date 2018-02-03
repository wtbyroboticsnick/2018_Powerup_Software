package org.usfirst.frc.team3525.robot.subsystems;

import org.usfirst.frc.team3525.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *This subsystem is for the intake
 */
public class Intake_Subsystem extends Subsystem {
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    public void intake(){
    	RobotMap.IntakeLeft8.set(.5);
    	RobotMap.IntakeRight9.set(-.5);
    }
    public void outtake(){
    	RobotMap.IntakeLeft8.set(-.5);
    	RobotMap.IntakeRight9.set(.5);
    }
    public void stop(){
    	RobotMap.IntakeLeft8.set(0);
    	RobotMap.IntakeRight9.set(0);
		
	}
}

