package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RingLight extends SubsystemBase{
    Relay relay;
    public RingLight(){
        relay = new Relay(0); //Constructor
    }

    public void open(){
        relay.set(Relay.Value.kForward); //Power flows Positive to Negative, light green
    }
    public void close(){
        relay.set(Relay.Value.kOff); //No power flows, light orange
    }
}