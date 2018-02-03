package org.usfirst.frc.team3525.robot.commands;

import org.usfirst.frc.team3525.robot.Robot;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class GTA_CurvatureDrive_Command extends Command {
	boolean turnquick;
    public GTA_CurvatureDrive_Command(boolean quickturn) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.DriveTrain);
    	turnquick=quickturn;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	SmartDashboard.putString("Drive Mode", "GTA Curvature turn quick: "+turnquick);
    }

    // Called repeatedly when this Command is scheduled to run
    /*protected void execute() 
    	Robot.DriveTrain.CurvatureDrive(Robot.m_oi.Controller.getTriggerAxis(Hand.kRight)
    			-Robot.m_oi.Controller.getTriggerAxis(Hand.kLeft),
    			Robot.m_oi.Controller.getX(Hand.kLeft),
    			turnquick);
    			*/
    

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
