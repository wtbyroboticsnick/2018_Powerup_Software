package org.usfirst.frc.team3525.robot.subsystems;

import org.usfirst.frc.team3525.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *This subsystem is for the forklift
 */
public class Forklift_Subsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void up(){
    	RobotMap.ForkTalon16.set(.5);
    }
    public void down(){
    	RobotMap.ForkTalon16.set(.5);
    }
    public void stop(){
    	RobotMap.ForkTalon16.set(0);
    }
}

