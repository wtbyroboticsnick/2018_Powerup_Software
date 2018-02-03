package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;
import org.usfirst.frc.team3525.robot.subsystems.Climber_Subsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 *This command tells the climber to climb up 
 */
public class Climber_Command extends Command {

    public Climber_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	//This section declares that the climber subsytem is needed for the command to reference// 
    	requires(Robot.Climber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    
    //This section tells the bot to climb when signaled//
    protected void execute() {
    	Robot.Climber.ButtonClimb();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    
    //This section tells the bot to stop climbing when signaled//
    protected void end() {
    	Robot.Climber.ButtonStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    
    //This section tells the bot to stop when another command interrupts this one//
    protected void interrupted() {
    	Robot.Climber.ButtonStop();
    }
}
