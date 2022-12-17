package com.lilithsthrone.game.character.body.valueEnums;

import java.util.List;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.colours.Colour;
import com.lilithsthrone.utils.colours.PresetColour;

/**
 * @since 0.1.83
 * @version 0.3.2
 * @author Innoxia
 */
public enum LipSize {

	ZERO_THIN(0, Util.newArrayListOfValues("thin", "slim", "meager"), PresetColour.GENERIC_SIZE_ONE, false),
	ONE_AVERAGE(1, Util.newArrayListOfValues("average", "soft", "delicate"), PresetColour.GENERIC_SIZE_TWO, false),
	TWO_FULL(2, Util.newArrayListOfValues("full", "kissable"), PresetColour.GENERIC_SIZE_THREE, false),
	THREE_PLUMP(3, Util.newArrayListOfValues("large", "plump"), PresetColour.GENERIC_SIZE_FOUR, false),
	FOUR_HUGE(4, Util.newArrayListOfValues("thick", "huge", "pouty"), PresetColour.GENERIC_SIZE_FIVE, false),
	FIVE_MASSIVE(5, Util.newArrayListOfValues("pillowy", "plush"), PresetColour.GENERIC_SIZE_SIX, false),
	SIX_GIGANTIC(6, Util.newArrayListOfValues("massive", "fat") , PresetColour.GENERIC_SIZE_SEVEN, true),
	SEVEN_ABSURD(7, Util.newArrayListOfValues("gigantic"), PresetColour.GENERIC_SIZE_EIGHT, true);
	
	
	private int value;
	private List<String> names;
	private Colour colour;
	private boolean impedesSpeech;

	private LipSize(int value, List<String> names, Colour colour, boolean impedesSpeech) {
		this.value = value;
		this.names = names;
		this.colour = colour;
		this.impedesSpeech = impedesSpeech;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return Util.randomItemFrom(names);
	}
	
	public static LipSize getLipSizeFromInt(int index) {
		for(LipSize ls : LipSize.values()) {
			if(index == ls.getValue()) {
				return ls;
			}
		}
		return ZERO_THIN;
	}
	
	public static int getLargest() {
		int largest = ZERO_THIN.value;
		for(LipSize ls : LipSize.values()) {
			largest = Math.max(largest, ls.value);
		}
		return largest;
	}

	public Colour getColour() {
		return colour;
	}

	public boolean isImpedesSpeech() {
		return impedesSpeech;
	}
}
