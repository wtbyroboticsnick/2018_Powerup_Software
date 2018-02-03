package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *This command is for the climber to unclimb
 */
public class UnClimber_Command extends Command {

    public UnClimber_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section declares that the command requires the Climber subsystem
    	requires(Robot.Climber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    // This section declares that the climber will unclimb when signaled 
    protected void execute() {
    	Robot.Climber.ButtonUnClimb();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    
    //this section declares that the Climber will stop when signaled
    protected void end() {
    	Robot.Climber.ButtonStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Climber.ButtonStop();
    }
}
