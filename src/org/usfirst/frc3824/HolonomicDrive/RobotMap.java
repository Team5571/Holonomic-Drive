// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3824.HolonomicDrive;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
//import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.interfaces.Gyro;;


/*
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
{
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftFront;
    public static SpeedController driveTrainLeftRear;
    public static SpeedController driveTrainRightFront;
    public static SpeedController driveTrainRightRear;
    public static RobotDrive driveTrainHolonomicDrive;
    public static AnalogGyro driveTrainGyro;
    public static SpeedController forkliftMotor;
    public static Encoder forkliftEncoder;
    public static SpeedController toteCaptureLeftWheel;
    public static SpeedController toteCaptureRightWheel;
    public static SpeedController containerCaptureMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	public static PowerDistributionPanel powerDistributionPanel;
    
	public static void init()
	{
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFront = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "Left Front", (Talon) driveTrainLeftFront);
        
        driveTrainLeftRear = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "Left Rear", (Talon) driveTrainLeftRear);
        
        driveTrainRightFront = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "Right Front", (Talon) driveTrainRightFront);
        
        driveTrainRightRear = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "Right Rear", (Talon) driveTrainRightRear);
        
        driveTrainHolonomicDrive = new RobotDrive(driveTrainLeftFront, driveTrainLeftRear,
              driveTrainRightFront, driveTrainRightRear);
        
        driveTrainHolonomicDrive.setSafetyEnabled(false);
        driveTrainHolonomicDrive.setExpiration(0.1);
        driveTrainHolonomicDrive.setSensitivity(0.5);
        driveTrainHolonomicDrive.setMaxOutput(1.0);

        driveTrainHolonomicDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveTrainHolonomicDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveTrainGyro = new AnalogGyro(0);
        LiveWindow.addSensor("DriveTrain", "Gyro", driveTrainGyro);
        driveTrainGyro.setSensitivity(0.007);
        forkliftMotor = new Talon(4);
        LiveWindow.addActuator("Forklift", "Motor", (Talon) forkliftMotor);
        
        forkliftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Forklift", "Encoder", forkliftEncoder);
        forkliftEncoder.setDistancePerPulse(0.012);
        forkliftEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
        toteCaptureLeftWheel = new Talon(8);
        LiveWindow.addActuator("Tote Capture", "Left Wheel", (Talon) toteCaptureLeftWheel);
        
        toteCaptureRightWheel = new Talon(9);
        LiveWindow.addActuator("Tote Capture", "Right Wheel", (Talon) toteCaptureRightWheel);
        
        containerCaptureMotor = new Talon(10);
        LiveWindow.addActuator("Container Capture", "Motor", (Talon) containerCaptureMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        powerDistributionPanel = new PowerDistributionPanel();
		}
}
