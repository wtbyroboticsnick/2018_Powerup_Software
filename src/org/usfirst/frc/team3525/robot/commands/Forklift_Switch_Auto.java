package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;
import org.usfirst.frc.team3525.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Forklift_Switch_Auto extends Command {

	int Switch;
    public Forklift_Switch_Auto(int switchheight) {
    	requires(Robot.subsystemForklift);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	Switch = switchheight;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.subsystemForklift.SwitchScore(Switch);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("encoder value fifteen", RobotMap.ForkTalon.getSensorCollection().getPulseWidthPosition());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (RobotMap.ForkTalon.getSensorCollection().getPulseWidthPosition() <= Switch) {
    		return false;
    	}
    	else if (RobotMap.ForkTalon.getSensorCollection().getPulseWidthPosition() >= Switch){
    		return false;
    	}
    	else {
    		return true;
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
