package org.usfirst.frc.team3525.robot.subsystems;

import org.usfirst.frc.team3525.robot.RobotMap;
import org.usfirst.frc.team3525.robot.commands.ArcadeDrive_Command;
import org.usfirst.frc.team3525.robot.commands.Nintendo_Command;
import org.usfirst.frc.team3525.robot.commands.SteeringWheel_Command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *This subsystem is for the different methods of method
 */
public class DriveTrain_Subsystem extends Subsystem {

//This section declares that the drivetrain will use differential drive.
	//DifferentialDrive DriveSystem=new DifferentialDrive(RobotMap.LeftDrive,RobotMap.RightDrive);
	DifferentialDrive DriveSystem=new DifferentialDrive(RobotMap.LeftDriveTalon13,RobotMap.RightDriveTalon14);
	public DriveTrain_Subsystem(){
		//RobotMap.setFollowers();
	}
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new ArcadeDrive_Command());
    	setDefaultCommand(new SteeringWheel_Command());
    	setDefaultCommand(new Nintendo_Command());
    	
    }
   //This section declares arcade drive 
    public void ArcadeDrive (double speed, double turn){
    	DriveSystem.arcadeDrive(speed,turn);
    }
    //This section declares tank drive
    public void TankDrive (double leftspeed, double rightspeed){
    	DriveSystem.tankDrive(leftspeed,rightspeed);
    }
    //This section declares curvature drive
    public void CurvatureDrive (double speed, double rotation, boolean quickturn){
    	DriveSystem.curvatureDrive(speed, rotation, quickturn);
    	
    }
	public void AracdeDrive(double d) {
		// TODO Auto-generated method stub	
	}
}

