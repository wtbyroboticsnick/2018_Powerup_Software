package org.usfirst.frc.team3525.robot.commands;



import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class OutTake_Command extends TimedCommand {
	
    public OutTake_Command(double timeout) {
    	   	super(timeout);
    	   	requires(Robot.subsystemIntake);
    	    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.subsystemIntake.score();
    }

    // Called once after timeout
    protected void end() {
    	Robot.subsystemIntake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.subsystemIntake.stop();
    }
}
