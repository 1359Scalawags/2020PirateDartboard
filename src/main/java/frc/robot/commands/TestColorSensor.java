package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.Robot;
import frc.robot.Robot;
import frc.robot.subsystems.ColorSystem;

/**
 *
 */
public class TestColorSensor extends CommandBase {

    private String str;

    public TestColorSensor() {
        
        
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {
        // SmartDashboard.putNumber("Consistency:", Robot.colorSystem.getConsistency());
        // SmartDashboard.putString("Current Color:", Robot.colorSystem.getColor().toString().substring(37,45));
        // SmartDashboard.putString("Current RGB:", "R="+Robot.colorSystem.getRaw().red+" G="+Robot.colorSystem.getRaw().green+" B="+Robot.colorSystem.getRaw().blue);
        int phase = Robot.oi.phase;

        if(phase ==0){//yellow
            str = getResults();
        }
        else if(phase ==1){//red
            str = getResults();
        }
        else if(phase ==2){//green
            str = getResults();
        }
        else if(phase ==3){//blue
            str = getResults();
        }
        
        if(phase <=3){
            SmartDashboard.putString("phase "+phase, str);
        }

        Robot.oi.phase++;
    }

    public String getResults(){
        float[] resultsR = new float[100];
        float[] resultsG = new float[100];
        float[] resultsB = new float[100];

        float avrR =0;
        float avrG =0;
        float avrB =0;

        float avrDevR =0;
        float avrDevG =0;
        float avrDevB =0;
        
        int amt = 100;

        for(int i=0; i<amt; i++){
            resultsR[i] = (float)Robot.colorSystem.getRaw().red;
            resultsG[i] = (float)Robot.colorSystem.getRaw().green;
            resultsB[i] = (float)Robot.colorSystem.getRaw().blue;
            avrR+=resultsR[i];
            avrG+=resultsG[i];
            avrB+=resultsB[i];
        }
        avrR/=amt;
        avrG/=amt;
        avrB/=amt;

        for(int i=0; i<amt; i++){
            resultsR[i] = Math.abs(avrR - resultsR[i]);
            resultsG[i] = Math.abs(avrG - resultsG[i]);                
            resultsB[i] = Math.abs(avrB - resultsB[i]);
            avrDevR +=resultsR[i];
            avrDevG +=resultsG[i];
            avrDevB +=resultsB[i];
        }
        
        avrDevR/=amt;
        avrDevG/=amt;
        avrDevB/=amt;
        
        return "R:"+avrR+" d"+avrDevR +" G:"+avrG+"d "+avrDevG+" B:"+avrB+" d"+avrDevB;
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        SmartDashboard.putNumber("Consistency:", Robot.colorSystem.getConsistency());
        SmartDashboard.putString("Current Color:", Robot.colorSystem.getColor().toString());
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
