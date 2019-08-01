package com.yu.gof.structurepattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * -笔袋
 */
public class ColourPenFactory {

	private static Map<String, IColourPen> pens = new HashMap<>();
	
	public static IColourPen getColourPen(String color) {
		if (pens.containsKey(color)) {
			return pens.get(color);
		}
		
		ColourPen colourPen = new ColourPen(color);
		pens.put(color, colourPen);
		return colourPen;
	}
}
