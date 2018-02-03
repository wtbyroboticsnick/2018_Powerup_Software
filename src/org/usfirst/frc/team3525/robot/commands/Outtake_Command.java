package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 *This command is for the intake to push out the cube
 */
public class Outtake_Command extends Command {

    public Outtake_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section is to declare that the intake subsystem is required to be referenced//
    	requires(Robot.Intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    //This section tells the bot to push out the cube when signaled//
    protected void execute() {
    	Robot.Intake.outtake();
    	
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
    
    //This section is to tell the command to stop when another command interrupts it.
    protected void interrupted() {
    	Robot.Intake.stop();
    }
}
