package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 *This command is to set up halo drive
 */
public class HaloDrive_Command extends Command {

    public HaloDrive_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section declares that the DriveTrain Subsystem is required to be referenced//
    	requires(Robot.DriveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putString("Drive Mode", "Halo");
    }

    // Called repeatedly when this Command is scheduled to run
    
    //This section declares that the left stick controls the y axis, and the right stick sontrols the x axis//
    /*protected void execute(){
    	Robot.DriveTrain.ArcadeDrive(Robot.m_oi.Controller.getY(Hand.kLeft),Robot.m_oi.Controller.getX(Hand.kRight));
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
