package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 *This section is to set up arcade drive
 */
public class ArcadeDrive_Command extends Command {

    public ArcadeDrive_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section declares that the DriveTrain subsystem is needed for the command to reference//
    	requires(Robot.DriveTrain);
    }

    // Called just before this Command runs the first time//
    
    protected void initialize() {
    	SmartDashboard.putString("Drive Mode", "Arcade");
    }

    // Called repeatedly when this Command is scheduled to run
    
    //This section declares that the right controller controls both the x and y axis//
    /*protected void execute() {
    	Robot.DriveTrain.ArcadeDrive(Robot.m_oi.Controller.getY(Hand.kRight),Robot.m_oi.Controller.getX(Hand.kRight));
    	//Robot.DriveTrain.AracdeDrive(Robot.m_oi.Stick.getY());
    }*/

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
