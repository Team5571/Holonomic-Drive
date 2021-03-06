// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5571.HolonomicDrive.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc5571.HolonomicDrive.Constants;
import org.usfirst.frc5571.HolonomicDrive.Robot;

import edu.wpi.first.wpilibj.Timer;

public class ChassisDriveStraight extends Command
{
	private Timer timer;
	private double driveDuration;
	private double drivePower;
	private double driveDirection;

	public ChassisDriveStraight()
	{
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

		// instantiate a timer
		timer = new Timer();

		// default test values when called from the SmartDashboard
		driveDuration  = 2.0;
		drivePower     = 0.5;
		driveDirection = 0.0;
	}

	public ChassisDriveStraight(double duration, double power, double direction)
	{
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

		// instantiate a timer
		timer = new Timer();

		// copy the parameters to the class variables
		driveDuration = duration;
		drivePower = power;
		driveDirection = direction;
	}

	// Called just before this Command runs the first time
	protected void initialize()
	{
		// Set the PID up for driving straight
		Robot.driveTrain.getAngleGyroController().setPID(
				Constants.DrivetrainAngleGyroControllerP,
				Constants.DrivetrainAngleGyroControllerI,
				Constants.DrivetrainAngleGyroControllerD);

		// Robot.drivetrain.resetGyro();
		Robot.driveTrain.getAngleGyroController().setSetpoint(
				Robot.driveTrain.getGyroValue());

		// update the PID direction and power
		Robot.driveTrain.setDirection(driveDirection);
		Robot.driveTrain.setMagnitude(drivePower);

		// enable the PID
		Robot.driveTrain.getAngleGyroController().enable();

		// reset and start the timer
		timer.reset();
		timer.start();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return (timer.get() > driveDuration);
	}

	// Called once after isFinished returns true
	protected void end()
	{
		// disable the PID and stop the robot
		Robot.driveTrain.getAngleGyroController().disable();
		Robot.driveTrain.holonomicDrive(0, 0, 0);
		timer.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		// call the end method
		this.end();
	}
}
