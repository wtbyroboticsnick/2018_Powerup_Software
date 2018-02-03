package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 *This command is for the intake to take in the cube
 */
public class Intake_Command extends Command {

    public Intake_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section declares that the intake subsystem is required to be referenced//
    	requires(Robot.Intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    //This section tells the intake to take in the cube when signaled//
    protected void execute() {
    	Robot.Intake.intake();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    
    //This section tells the command to stop when another command interupts it// 
    protected void interrupted() {
    	Robot.Intake.stop();
    }
}
