package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

/**
 *This command sets up stickclimb 
 */
public class StickClimb_Command extends Command {

    public StickClimb_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section declares that the climber subsystem is required to be referenced//
    	requires(Robot.Climber);
    }

    // Called just before this Command runs the first time//
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    //This section declares that the stick on the operator board controls the y axis//
    /*protected void execute() {
    	Robot.Climber.StickClimb(Robot.m_oi.Stick.getY(Hand.kLeft));
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
