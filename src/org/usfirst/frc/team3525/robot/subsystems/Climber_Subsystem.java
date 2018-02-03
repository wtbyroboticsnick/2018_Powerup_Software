package org.usfirst.frc.team3525.robot.subsystems;

import org.usfirst.frc.team3525.robot.RobotMap;
import org.usfirst.frc.team3525.robot.commands.StickClimb_Command;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *This section is for the climber
 */
public class Climber_Subsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	/*WPI_TalonSRX Climber=RobotMap.ClimberTalonSRX;*/
	WPI_TalonSRX Climber=RobotMap.ClimbTalon15;
    public void initDefaultCommand() {
    	setDefaultCommand(new StickClimb_Command());
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	//setDefaultCommand(new StickClimb_Command());
    	
    }
    public void StickClimb (double speed){
    	Climber.set(speed);
    }
    public void ButtonClimb (){
    	Climber.set(.5);
    }
    public void ButtonStop (){
    	Climber.set(0);
    }
    public void ButtonUnClimb (){
    	Climber.set(-.5);
    }
    
}

