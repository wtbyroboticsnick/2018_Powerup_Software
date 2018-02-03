package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;
import org.usfirst.frc.team3525.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Forklift_Down_Auto extends Command {
	int Floor;
    public Forklift_Down_Auto(int Floorheight) {
    	requires(Robot.subsystemForklift);
        
    	Floor = Floorheight;
    	}

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.subsystemForklift.IntakeLevel(Floor);
    	}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("encoder value fifteen", RobotMap.ForkTalon.getSensorCollection().getPulseWidthPosition());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (RobotMap.ForkTalon.getSensorCollection().getPulseWidthPosition() == Floor) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    	
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
