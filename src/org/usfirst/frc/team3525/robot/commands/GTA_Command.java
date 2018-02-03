package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 *This command is to set up GTA drive
 */
public class GTA_Command extends Command {

    public GTA_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.DriveTrain);
    }

    // Called just before this Command runs the first time
    
    protected void initialize() {
    	SmartDashboard.putString("Drive Mode", "GTA");
    }

    // Called repeatedly when this Command is scheduled to run
    
    //This section declares that The left and right trigger control the y axis//
    /*protected void execute() 
    	Robot.DriveTrain.ArcadeDrive(Robot.m_oi.Controller.getTriggerAxis(Hand.kRight)
    			-Robot.m_oi.Controller.getTriggerAxis(Hand.kLeft),
    			Robot.m_oi.Controller.getX(Hand.kLeft));
    			*/
    	
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
