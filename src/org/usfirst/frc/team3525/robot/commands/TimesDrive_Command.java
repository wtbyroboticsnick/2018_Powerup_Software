package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *This command is for timing for driving
 */
public class TimesDrive_Command extends Command {

	double timelimit;
	Timer TheTimer;
    public TimesDrive_Command(double atimelimit) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.DriveTrain);
    	timelimit=atimelimit;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	TheTimer=new Timer();
    	TheTimer.reset();
    	TheTimer.start();
  
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.DriveTrain.ArcadeDrive(-.5,0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(TheTimer.get()<timelimit){
        	return false;
        }else{
        	return true;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.DriveTrain.ArcadeDrive(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
