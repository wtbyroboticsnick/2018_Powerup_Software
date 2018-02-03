package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 *This section declares the command for moving the forklift downwards
 */
public class ForkliftDown_Command extends Command {

    public ForkliftDown_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section declares that the Forklift subsystem is required to be referenced//
    	requires(Robot.Forklift);
    }

    // Called just before this Command runs the first time
   
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    //This section tells the forklift to go down when signaled//
    protected void execute() {
    	Robot.Forklift.down();
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
    
    //This command tells the forklift to stop when another command interrupts it//
    protected void interrupted() {
    	Robot.Forklift.stop();
    }
}
