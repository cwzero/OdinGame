package com.liquidforte.odin.game.api.core;

/*
 * A physical object can be observed and interacted with
 */
public interface Physical extends GameObject {
	String getKey();

	String getName();

	String getShortDescription();

	String getLongDescription();
}
