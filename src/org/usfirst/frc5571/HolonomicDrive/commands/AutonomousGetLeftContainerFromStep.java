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

import org.usfirst.frc5571.HolonomicDrive.Constants;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousGetLeftContainerFromStep extends CommandGroup
{
	public AutonomousGetLeftContainerFromStep()
	{
		//collect from step; mechanism pending
		
		//backing up
		addSequential(new ChassisDriveStraight(Constants.AUTONOMOUS_CONTAINER_DRIVE_TIME, Constants.AUTONOMOUS_CONTAINER_DRIVER_POWER, Constants.AUTONOMOUS_CONTAINER_DRIVE_REVERSE_DIRECTION));
				
		//deposit container
		addSequential(new ChassisTurnAngle(-90, 0.0));
		addSequential(new ChassisDriveStraight(0.75, Constants.AUTONOMOUS_AUTOZONE_DRIVER_POWER, Constants.AUTONOMOUS_CONTAINER_DRIVE_REVERSE_DIRECTION));
	}
}