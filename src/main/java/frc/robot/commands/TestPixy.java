package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

/**
 *
 */
public class TestPixy extends CommandBase {

    public TestPixy(){
        addRequirements(Robot.pixy);
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {
        Robot.pixy.init();
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        Robot.pixy.toggleLamp();
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
        
    }


}
