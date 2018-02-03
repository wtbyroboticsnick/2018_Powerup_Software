package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;
import org.usfirst.frc.team3525.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Command_DriveTrain extends Command {
	double forwarddrive;
    public Command_DriveTrain(double driveforward) {
        requires(Robot.SubsystemDrive);
        forwarddrive = driveforward;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.SubsystemDrive.Forward(forwarddrive);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putNumber("encoder value Thirteen", 
    			RobotMap.LeftDriveTalon.getSensorCollection().getQuadraturePosition());
    	SmartDashboard.putNumber("encoder value Fourteen", 
    			RobotMap.RightDriveTalon.getSensorCollection().getQuadraturePosition());	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (RobotMap.LeftDriveTalon.getSensorCollection().getQuadraturePosition()>=forwarddrive) {
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
