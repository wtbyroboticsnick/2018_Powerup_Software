package org.usfirst.frc.team3525.robot.subsystems;

import org.usfirst.frc.team3525.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
//starts all active code throughout the calling of the subsystem
public class Intake_Subsystem extends Subsystem {

    public void initDefaultCommand() {
    }
    
    public void intake() {
    	//motor spins at 90% power backwards  
    	RobotMap.IntakeRight.set(-.9);
    }
    public void score() {
    	//motor spins at 90% power forward 
    	RobotMap.IntakeRight.set(.9);
    }
    public void stop() {
    	//motor is stopped 
    	RobotMap.IntakeRight.set(0);
    }
}

