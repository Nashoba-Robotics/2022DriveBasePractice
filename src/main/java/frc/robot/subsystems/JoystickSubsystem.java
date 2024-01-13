package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class JoystickSubsystem extends SubsystemBase{

    Joystick moveSpeedJoystick;
    Joystick TurnJoystick;
    
    static public JoystickSubsystem instance;
    static public JoystickSubsystem getInstance(){
        if(instance == null){
            instance = new JoystickSubsystem();
        }
        return instance;
    }

    public JoystickSubsystem(){
    moveSpeedJoystick = new Joystick(0);
    TurnJoystick = new Joystick(1);
    }

    public double getmoveSpeedJoystick(){
        return -moveSpeedJoystick.getY();
    }

    public double getTurnJoystick(){
        return TurnJoystick.getX();
    }
}