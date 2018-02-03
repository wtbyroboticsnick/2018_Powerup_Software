package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;
import org.usfirst.frc.team3525.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Sandwichscope_Command extends Command {
	double SandwichAngle;

    public Sandwichscope_Command(double A_SandwichAngle) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.SubsystemDrive);
    	SandwichAngle = A_SandwichAngle;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.gyro.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.SubsystemDrive.Turn_(SandwichAngle);
    	SmartDashboard.putNumber("angle", RobotMap.gyro.getAngle());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (SandwichAngle <= 0) {
    		if (RobotMap.gyro.getAngle() > SandwichAngle ) {
    			return false;
    		}
    		else{
    			return true;
    		}
    	}
    	else {
    		if (RobotMap.gyro.getAngle() >= SandwichAngle) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.SubsystemDrive.drivetrain.arcadeDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}