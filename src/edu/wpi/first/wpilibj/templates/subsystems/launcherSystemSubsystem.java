/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Team862-8
 */
public class launcherSystemSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    OI oi = new OI();
    RobotMap rmap = new RobotMap();
    double checkLoader = 0.0;
    Talon loader = new Talon(rmap.loaderPort);
    Talon launcher1 = new Talon(rmap.launcher1Port);
    Talon launcher2 = new Talon(rmap.launcher2Port);
    final float LAUNCH_POWER = 0.5f;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void launcherOperate() {
        if(oi.launcherButton.get() == true) {
            launcher1.set(-LAUNCH_POWER);
            launcher2.set(LAUNCH_POWER);
        }
        else {
            launcher1.set(0);
            launcher2.set(0);
        }
    }
    public void loaderOperate() {
        checkLoader = oi.gamepad.getRawAxis(4);
        if(!(checkLoader >= 0.5 && oi.loaderForwardButton.get() == true)) {
            if(checkLoader >= 0.5) {
                loader.set(-1);
            }
            else if(oi.loaderForwardButton.get() == true) {
                loader.set(1);
            }
            else {
                loader.set(0);
            }
        }
    }
}
