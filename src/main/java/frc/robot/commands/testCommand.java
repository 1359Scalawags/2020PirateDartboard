package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

/**
 *
 */
public class testCommand extends CommandBase {

	public testCommand() {
        
        
	}

	// Called just before this Command runs the first time
	public void initialize() {
        
	}

    // Called repeatedly when this Command is scheduled to run
    
	public void execute() {

	}

    // Make this return true when this Command no longer needs to run execute()
    @Override
	public boolean isFinished() {
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