package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 *This command is to set up tank drive 
 */
public class TankDrive_Command extends Command {

    public TankDrive_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section is to delcare that the drivetrain subsystem is required to be referenced//
    	requires(Robot.DriveTrain);
    }

    // Called just before this Command runs the first time
    
    protected void initialize() {
    	SmartDashboard.putString("Drive Mode", "Tank");
    }

    // Called repeatedly when this Command is scheduled to run
   /* protected void execute(){
    	Robot.DriveTrain.TankDrive(Robot.m_oi.Controller.getY(Hand.kRight),Robot.m_oi.Controller.getY(Hand.kLeft));
    	
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
