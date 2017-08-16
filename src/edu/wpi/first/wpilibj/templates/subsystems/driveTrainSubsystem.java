
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 */
public class driveTrainSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotMap rmap = new RobotMap();
    OI oi = new OI();
    public Talon TalonLeft1 = new Talon(rmap.left1Port);
    public Talon TalonLeft2 = new Talon(rmap.left2Port);
    public Talon TalonRight1 = new Talon(rmap.right1Port);
    public Talon TalonRight2 = new Talon(rmap.right2Port);
    public RobotDrive m_chassis = new RobotDrive(TalonLeft1, TalonLeft2, TalonRight1, TalonRight2);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
    }
    public void driveControl() {
        m_chassis.tankDrive(-oi.gamepad.getRawAxis(2)*0.75, -oi.gamepad.getRawAxis(6)*0.75);
    }
    public void stop() {
        m_chassis.drive(0, 0);
    }
}

