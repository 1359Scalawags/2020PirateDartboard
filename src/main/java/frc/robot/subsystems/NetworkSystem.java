package frc.robot.subsystems;

import java.util.Set;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableType;
import edu.wpi.first.networktables.NetworkTableValue;
import edu.wpi.first.networktables.TableEntryListener;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class NetworkSystem extends SubsystemBase {
    // NetworkTableEntry xEntry;
    // NetworkTableEntry distance;
    // NetworkTableEntry angle;
    // float xPercentage;
    // float angleAtTarget;
    // double distanceFromTarget;
    NetworkTableInstance inst;
    NetworkTable Distance; 
    NetworkTableEntry Distancevalue;
    
    public NetworkSystem(){
        inst = NetworkTableInstance.getDefault(); //1735
        Distance = inst.getTable("DistanceTable");
        Distancevalue = Distance.getEntry("value");

        TableEntryListener listener = new TableEntryListener(){        
            @Override
            public void valueChanged(NetworkTable table, String key, NetworkTableEntry entry, NetworkTableValue value,
                    int flags) {
                    SmartDashboard.putString("distance", value.toString());
            }
        };
        
        
        // Object[] keys =  Distance.getKeys().toArray();
        // for(int i=0; i<keys.length; i++){
        //     keys[i];
        // }
    }
    
    @Override
    public void periodic() {

    }
}